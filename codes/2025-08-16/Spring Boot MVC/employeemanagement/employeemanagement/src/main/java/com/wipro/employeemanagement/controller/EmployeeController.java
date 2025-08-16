package com.wipro.employeemanagement.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.wipro.employeemanagement.entity.Address;
import com.wipro.employeemanagement.entity.Employee;
import com.wipro.employeemanagement.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    
    @GetMapping("/emp")
    public String index(@RequestParam(value = "disp", required = false) String disp, Model model) {
        List<Employee> data = (disp == null || disp.isBlank()) ? service.findAll() : service.searchByName(disp);
        model.addAttribute("employees", data);
        return "index";
    }

   
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("emp", service.findById(id));
        return "edit";
    }

  
    @PostMapping({"/add", "/update/{id}"})
    public String saveOrUpdate(@PathVariable(required = false) Long id,
                               @RequestParam String name,
                               @RequestParam String type,
                               @RequestParam(required = false, name="dept") String departmentName,
                               @RequestParam(required = false) String street,
                               @RequestParam(required = false) String city,
                               @RequestParam(required = false) String state,
                               @RequestParam(required = false) String zip) {

        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setZip(zip);

        if (id == null) {
            service.create(name, type, departmentName, address);
        } else {
            service.update(id, name, type, departmentName, address);
        }
        return "redirect:/employees/";
    }

   
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/employees/";
    }

    @GetMapping("/api/{id}")
    @ResponseBody
    public ResponseEntity<Employee> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    
    @GetMapping("/api/search")
    @ResponseBody
    public ResponseEntity<List<Employee>> search(@RequestParam String name) {
        return ResponseEntity.ok(service.searchByName(name));
    }
}