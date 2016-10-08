package atomic.io.controller;

import atomic.io.models.LoginRequest;
import atomic.io.models.LoginResponse;
import atomic.io.repository.LoginResponseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nazhirjackson on 10/7/16.
 */
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    LoginResponseRepository loginResponseRepository;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping
    public ResponseEntity<LoginResponse> requestDataPost(@RequestBody LoginRequest loginRequest){

    }
}
