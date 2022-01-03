package genericpracticesolutions.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    private Integer id;
    private String roleName;

    @Override
    public String toString() {
        return "{" + id + ", " + roleName + "}";
    }

}
