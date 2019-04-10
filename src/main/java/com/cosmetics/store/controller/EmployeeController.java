package com.cosmetics.store.controller;


import com.cosmetics.store.Exception.ResourceNotFoundException;
import com.cosmetics.store.Model.Employee;
import com.cosmetics.store.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

@RestController
@CrossOrigin(origins = {"*"}, allowCredentials = "false")
@ResponseStatus(HttpStatus.OK)

@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(()
                -> new ResourceNotFoundException ("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }
    @CrossOrigin
    @PostMapping("employee")
    public  Employee createEmployee(@Valid @RequestBody Employee employee){

        return employeeRepository.save(employee);
    }
    @CrossOrigin
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Employee employeeDetails)
    throws ResourceNotFoundException{Employee employee = employeeRepository.findById(employeeId)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

    employee.setFirstName(employeeDetails.getFirstName());
    employee.setLastName(employeeDetails.getLastName());
    employee.setEmailId(employeeDetails.getEmailId());
    final Employee updatedEmployee  = employeeRepository.save((employee));
    return ResponseEntity.ok(updatedEmployee);

    }
    @CrossOrigin
    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);

        return response;
    }

}
