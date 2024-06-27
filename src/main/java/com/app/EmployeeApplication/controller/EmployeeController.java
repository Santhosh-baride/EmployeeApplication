package com.app.EmployeeApplication.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/api/employee")
    public ResponseEntity<String> employeeDetails(){
        return new ResponseEntity<>("Employee Details", HttpStatus.OK);
    }
}
