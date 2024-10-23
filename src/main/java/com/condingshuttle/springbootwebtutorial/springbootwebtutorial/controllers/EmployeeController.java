package com.condingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;

import com.condingshuttle.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")//parent route all bellow routes will be mounted here
public class EmployeeController {
    //path is basically the route
    @GetMapping(path = "/{employeeId}")//pathvariable is mandatory to pass
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id){//this pathvariable annotation will basically inject that okay employee comes from path
        return new EmployeeDTO("prianshu" , "prianshu@gmail.com"  , id , true , 27 , LocalDate.of(2024 , 1 , 1));
    }
    @GetMapping//things which are not compulsory to show in webpage , meaning we can still run our application those are passed as request param
    public String getAge(@RequestParam(required = false) Integer age , @RequestParam(required = false) String sortBy){
        return "hi "+age+sortBy;
    }

    @PostMapping
    public EmployeeDTO postEmployee(@RequestBody EmployeeDTO newEmployee){
        newEmployee.setId(100L);
        return newEmployee;
    }
    @PutMapping
    public String putEmployee(){
        return "hi this is from put";
    }
}
