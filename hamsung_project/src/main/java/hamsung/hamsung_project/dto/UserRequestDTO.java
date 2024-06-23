package hamsung.hamsung_project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
    private String username;

    private String email;

    private String password;

    private int image_num;

}
