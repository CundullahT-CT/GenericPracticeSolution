package genericpracticesolutions.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private Role role;

    @Override
    public String toString() {
        return "{" + id + ", " + firstName + ", " + lastName + ", " + role.getRoleName() + "}";
    }

}
