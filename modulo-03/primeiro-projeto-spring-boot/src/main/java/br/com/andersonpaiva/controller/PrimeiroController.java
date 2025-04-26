package br.com.andersonpaiva.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/primeiro-controller")
public class PrimeiroController {

    @GetMapping("/path-params/{id}")
    public String methodWithPathParams(@PathVariable String id) {
        return "O parâmetro com pathParams é : " + id;
    }

    @GetMapping("/query-params")
    public String methodWithQueryParams(@RequestParam String id) {
        return "O parâmetro com queryParams é : " + id;
    }

    @GetMapping("/many-query-params")
    public String methodWithManyQueryParams(@RequestParam Map<String, String> allParams) {
        return "O parâmetro com n queryParams é : " + allParams.entrySet();
    }

    @PostMapping("/body-params")
    public String methodWithBodyParam(@RequestBody User user) {
        return "User: " + user;
    }

    @GetMapping("/header-params")
    public String methodWithHeaderParams(@RequestHeader("name") String name) {
        return "O parâmetro do header é : " + name;
    }

    @GetMapping("/many-header-params")
    public String methodWithManyHeaderParams(@RequestHeader Map<String, String> allHeaderParams) {
        return "Os parâmetros do header é : " + allHeaderParams.entrySet();
    }

    @GetMapping("/response-entity")
    public ResponseEntity<Object> methodResponseEntity() {
        return ResponseEntity.status(HttpStatus.OK).body(
                new User("andersonpaiva", "Aslap#1998")
        );
    }
}

record User(String username, String password){}
