package com.practice.springreactmysql.dao;

import java.util.List;
import com.practice.springreactmysql.modal.Employee;

public interface EmployeeDAO {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}