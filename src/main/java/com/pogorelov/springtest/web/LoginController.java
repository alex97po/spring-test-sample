package com.pogorelov.springtest.web;

import com.pogorelov.springtest.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {

    private Map<Integer, Employee> database = new HashMap<>();

    public LoginController() {
        loadDummyData();
    }

    private void loadDummyData() {
        Employee john = new Employee();
        john.setId(1L);
        john.setName("John");
        john.setSalary(BigDecimal.valueOf(100));
        Employee karen = new Employee();
        karen.setId(2L);
        karen.setName("Karen");
        karen.setSalary(BigDecimal.valueOf(200));
        database.put(1, john);
        database.put(2, karen);
    }

    @GetMapping("/employees/{id}")
    public Employee retrieve(@PathVariable int id) {

        return database.get(id);
    }

    @GetMapping("/employees")
    public List<Employee> retrieveAll() {
        return new ArrayList<>(database.values());
    }
}
