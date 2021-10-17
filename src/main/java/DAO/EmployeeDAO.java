package DAO;

import entity.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void add(Employee employee) throws SQLException;

    List<Employee> getAll() throws SQLException;

    Employee getByEmployeeId(Long employeeId) throws SQLException;

    void update(Employee employee) throws SQLException;


    void remove(Employee employee) throws SQLException;

}

