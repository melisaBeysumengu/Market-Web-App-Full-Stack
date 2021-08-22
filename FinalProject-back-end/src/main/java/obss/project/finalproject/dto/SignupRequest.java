package obss.project.finalproject.dto;

import lombok.Getter;
import lombok.Setter;
import obss.project.finalproject.model.Role;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class SignupRequest {

    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<Role> roles;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
}
