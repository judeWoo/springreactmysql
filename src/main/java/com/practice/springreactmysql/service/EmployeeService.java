package com.practice.springreactmysql.service;

import java.util.List;

import com.practice.springreactmysql.modal.Employee;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
