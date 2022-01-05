package genericpracticesolutions.bootstrap;

import genericpracticesolutions.model.Project;
import genericpracticesolutions.model.Role;
import genericpracticesolutions.model.Task;
import genericpracticesolutions.model.User;
import genericpracticesolutions.service.IGenericService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    IGenericService<Role> roleService;
    IGenericService<User> userService;
    IGenericService<Project> projectService;
    IGenericService<Task> taskService;

    public DataGenerator(IGenericService<Role> roleService, IGenericService<User> userService,
                         IGenericService<Project> projectService, IGenericService<Task> taskService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
        this.taskService = taskService;
    }

    @Override
    public void run(String... args) throws Exception {

        Role admin = new Role(1, "Admin");
        Role manager = new Role(2, "Manager");
        Role employee = new Role(3, "Employee");

        List<Role> roleList = new ArrayList<>(Arrays.asList(admin, manager, employee));
        roleList.forEach(role -> roleService.create(role));

        User adminUser = new User(1, "Mike", "Smith", admin);

        User managerUser1 = new User(6, "Diane", "Owen", manager);
        User managerUser2 = new User(2, "Adan", "Hurley", manager);
        User managerUser3 = new User(3, "Bennie", "Randolph", manager);
        User managerUser4 = new User(4, "Sheena", "Oneal", manager);
        User managerUser5 = new User(5, "Maryann", "Bonilla", manager);

        User employeeUser1 = new User(7, "Curtis", "Ellison", employee);
        User employeeUser2 = new User(8, "Leslie", "Walters", employee);
        User employeeUser3 = new User(9, "Amy", "Diaz", employee);
        User employeeUser4 = new User(10, "Arturo", "Andrews", employee);
        User employeeUser5 = new User(11, "Barbra", "Barajas", employee);
        User employeeUser6 = new User(12, "Emile", "Morales", employee);
        User employeeUser7 = new User(13, "Natalia", "Werner", employee);
        User employeeUser8 = new User(14, "Gale", "Pacheco", employee);
        User employeeUser9 = new User(15, "Truman", "Franklin", employee);
        User employeeUser10 = new User(16, "Theresa", "Spears", employee);

        List<User> userList = new ArrayList<>(Arrays.asList(adminUser, managerUser1, managerUser2, managerUser3,
                managerUser4, managerUser5, employeeUser1, employeeUser2, employeeUser3, employeeUser4, employeeUser5,
                employeeUser6, employeeUser7, employeeUser8, employeeUser9, employeeUser10));

        userList.forEach(user -> userService.create(user));

        Project project1 = new Project(1, "PC-001", "Project-1", managerUser1);
        Project project2 = new Project(2, "PC-002", "Project-2", managerUser2);
        Project project3 = new Project(3, "PC-003", "Project-3", managerUser3);
        Project project4 = new Project(4, "PC-004", "Project-4", managerUser4);
        Project project5 = new Project(5, "PC-005", "Project-5", managerUser5);

        List<Project> projectList = new ArrayList<>(Arrays.asList(project1, project2, project3, project4, project5));

        projectList.forEach(project -> projectService.create(project));

        Task task1 = new Task(1, "TC-001", "Task-1 of Project-1", project1, employeeUser1);
        Task task2 = new Task(2, "TC-002", "Task-2 of Project-1", project1, employeeUser2);
        Task task3 = new Task(3, "TC-003", "Task-1 of Project-2", project2, employeeUser3);
        Task task4 = new Task(4, "TC-004", "Task-2 of Project-2", project2, employeeUser4);
        Task task5 = new Task(5, "TC-005", "Task-1 of Project-3", project3, employeeUser5);
        Task task6 = new Task(6, "TC-006", "Task-2 of Project-3", project3, employeeUser6);
        Task task7 = new Task(7, "TC-007", "Task-1 of Project-4", project4, employeeUser7);
        Task task8 = new Task(8, "TC-008", "Task-2 of Project-4", project4, employeeUser8);
        Task task9 = new Task(9, "TC-009", "Task-1 of Project-5", project5, employeeUser9);
        Task task10 = new Task(10, "TC-010", "Task-2 of Project-5", project5, employeeUser10);

        List<Task> taskList = new ArrayList<>(Arrays.asList(task1, task2, task3, task4, task5, task6, task7, task8, task9, task10));

        taskList.forEach(task -> taskService.create(task));

    }

}
