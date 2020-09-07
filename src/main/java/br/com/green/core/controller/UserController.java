package br.com.green.core.controller;

import br.com.green.core.domain.model.GreenUser;
import br.com.green.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping
    public ResponseEntity<?> getUsers(@RequestBody @Valid GreenUser user){
        return ResponseEntity.ok(userService.saveUser(user));
    }

}
