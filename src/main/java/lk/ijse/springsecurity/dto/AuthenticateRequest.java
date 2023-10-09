package lk.ijse.springsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lahiru Dilshan
 * @created Thu 2:37 PM on 10/5/2023
 * @project springsecurity
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthenticateRequest {

    private String email;

    private String password;
}
