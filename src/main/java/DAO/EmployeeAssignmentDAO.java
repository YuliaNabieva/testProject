package DAO;

import entity.EmployeeAssignment;

import java.util.List;

public interface EmployeeAssignmentDAO {
    void add(EmployeeAssignment employeeAssignment);

    List<EmployeeAssignment> getAll();

    EmployeeAssignment getByEmployeeIdAndAssignmentId(Long employeeId, Long AssignmentId);

    void update(EmployeeAssignment employeeAssignment);

    void remove(EmployeeAssignment employeeAssignment);

    EmployeeAssignment findbyId(long id);
}
