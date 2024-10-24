package com.condingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;

import com.condingshuttle.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import com.condingshuttle.springbootwebtutorial.springbootwebtutorial.entities.EmployeeEntity;
import com.condingshuttle.springbootwebtutorial.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")//parent route all bellow routes will be mounted here
public class EmployeeController {

    //not recommended
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    //path is basically the route
    @GetMapping(path = "/{employeeId}")//pathvariable is mandatory to pass
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeId") Long id){//this pathvariable annotation will basically inject that okay employee comes from path
        return employeeRepository.findById(id).orElse(null);
    }
    @GetMapping//things which are not compulsory to show in webpage , meaning we can still run our application those are passed as request param
    public List<EmployeeEntity> getAge(@RequestParam(required = false) Integer age , @RequestParam(required = false) String sortBy){
        return employeeRepository.findAll();
    }

    @PostMapping
    public EmployeeEntity postEmployee(@RequestBody EmployeeEntity newEmployee){

        return employeeRepository.save(newEmployee);
    }
    @PutMapping
    public String putEmployee(){
        return "hi this is from put";
    }
}
