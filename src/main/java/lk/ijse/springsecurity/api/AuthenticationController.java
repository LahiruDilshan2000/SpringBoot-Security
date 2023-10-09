package lk.ijse.springsecurity.api;

import lk.ijse.springsecurity.dto.AuthenticateRequest;
import lk.ijse.springsecurity.dto.AuthenticationResponse;
import lk.ijse.springsecurity.dto.RegisterRequest;
import lk.ijse.springsecurity.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lahiru Dilshan
 * @created Thu 2:29 PM on 10/5/2023
 * @project springsecurity
 **/
@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping(value = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){

        System.out.println(request.toString());
        return ResponseEntity.ok(authenticationService.register(request));
        //return ResponseEntity.ok("hello register");
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticateRequest request){

        System.out.println(request.toString());
        return ResponseEntity.ok(authenticationService.authenticate(request));
        //return ResponseEntity.ok("Hello authentication");
    }

    @PostMapping("/getting")
    public ResponseEntity<String> getting(@RequestBody AuthenticateRequest request){

        //return ResponseEntity.ok(authenticationService.authenticate(request));
        return ResponseEntity.ok("Hello getting");
    }
}
