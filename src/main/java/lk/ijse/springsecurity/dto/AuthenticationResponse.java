package lk.ijse.springsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lahiru Dilshan
 * @created Thu 2:34 PM on 10/5/2023
 * @project springsecurity
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthenticationResponse {

    private String token;
}
