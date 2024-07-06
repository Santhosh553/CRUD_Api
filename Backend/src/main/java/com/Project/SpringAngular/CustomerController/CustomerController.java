package com.Project.SpringAngular.CustomerController;


import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.DTO.CustomerUpdateDTO;
import com.Project.SpringAngular.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RestController // using restApis
@CrossOrigin// using external for frontend
@RequestMapping("api/v1/customer")   // API working path

public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllCustomer")
    public List<CustomerDTO> getCustomer(){
        List<CustomerDTO> allCustomers = customerService.getAllCustomer();
        return allCustomers;
    }

    @PutMapping(path = "/updateCustomer")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
        String id = customerService.updateCustomer(customerUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int id){

        boolean deletecustomer = customerService.deleteCustomer(id);
        return "deleted";
    }


}
