package genericpracticesolutions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    private Integer id;
    private String taskCode;
    private String description;
    private Project relatedProject;
    private User assignedEmployee;

    @Override
    public String toString() {
        return "{" + id + ", " + taskCode + ", " + description + ", " + relatedProject.getDescription() + ", " + assignedEmployee.getFirstName() + " " + assignedEmployee.getLastName() + "}";
    }

}
