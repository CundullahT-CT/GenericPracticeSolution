package genericpracticesolutions;

import genericpracticesolutions.model.Project;
import genericpracticesolutions.model.Role;
import genericpracticesolutions.model.Task;
import genericpracticesolutions.model.User;
import genericpracticesolutions.service.GenericService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ApplicationRunner {

    GenericService<Role> roleService;
    GenericService<User> userService;
    GenericService<Project> projectService;
    GenericService<Task> taskService;

    public ApplicationRunner(GenericService<Role> roleService, GenericService<User> userService,
                             GenericService<Project> projectService, GenericService<Task> taskService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
        this.taskService = taskService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runPractices() throws Exception {

        System.out.println(roleService.readAll());
        System.out.println(userService.readAll());
        System.out.println(projectService.readAll());
        System.out.println(taskService.readAll());

    }

}
