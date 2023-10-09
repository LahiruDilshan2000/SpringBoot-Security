package lk.ijse.springsecurity.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lahiru Dilshan
 * @created Thu 2:58 PM on 10/5/2023
 * @project springsecurity
 **/
@RestController
@RequestMapping("/api/v1/test")
@CrossOrigin
public class TestController {

    @GetMapping("/get")
    public ResponseEntity<String > test(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
