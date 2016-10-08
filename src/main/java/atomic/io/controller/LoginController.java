package atomic.io.controller;

import atomic.io.models.LoginRequest;
import atomic.io.models.LoginResponse;
import atomic.io.repository.LoginResponseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nazhirjackson on 10/7/16.
 */
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    LoginResponseRepository loginResponseRepository;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public ResponseEntity<LoginResponse> requestDataPost(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        loginResponseRepository.save(loginResponse);
        return new ResponseEntity<>(loginResponse, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/Login", method = RequestMethod.GET)
    public ResponseEntity<Iterable<LoginResponse>> requestDataGet(){
        Iterable<LoginResponse> reponses = loginResponseRepository.findAll();
        return new ResponseEntity<>(reponses, HttpStatus.OK);
    }

}
