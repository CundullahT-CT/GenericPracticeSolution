package genericpracticesolutions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    private Integer id;
    private String projectCode;
    private String description;
    private User assignedManager;

    @Override
    public String toString() {
        return "{" + id + ", " + projectCode + ", " + description + ", " + assignedManager.getFirstName() + " " + assignedManager.getLastName() + "}";
    }

}
