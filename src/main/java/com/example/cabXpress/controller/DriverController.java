package com.example.cabXpress.controller;

import com.example.cabXpress.model.Driver;
import com.example.cabXpress.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/driver")
public class DriverController {

@Autowired
DriverService driverService;
   @PostMapping
   public Driver addDriver(@RequestBody Driver driver){
            return driverService.addDriver(driver);
    }
}
