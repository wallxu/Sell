package com.le.isell.controller;

import com.le.isell.entity.CustomerModel;
import com.le.isell.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/5/3 0003.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "getByCustomerId/{customerId}", method = RequestMethod.GET)
    public String getByCustomerId(@PathVariable String customerId){
        CustomerModel customerModel = customerService.getByCustomerId(customerId);
        System.out.println(customerModel);
        return "show";
    }
}

