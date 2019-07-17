package uk.co.xyz.reportAPI.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.co.xyz.reportAPI.models.Employee;
import uk.co.xyz.reportAPI.repositories.EmployeeRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Employee> getAllPets(){
        return repository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Employee createPet(@Valid @RequestBody Employee employee) {
        employee.set_id(ObjectId.get());

        String firstName = employee.getFirstName();

        if (firstName.length() <2 || firstName.length() > 21){

        }



        repository.save(employee);
        return employee;
    }
}
