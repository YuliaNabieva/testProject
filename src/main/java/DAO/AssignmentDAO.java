package DAO;

import entity.Assignment;

import java.sql.SQLException;
import java.util.List;

public interface AssignmentDAO {

    void add(Assignment assignment) throws SQLException;

    List<Assignment> getAll() throws SQLException;

    Assignment getByAssignmentId(Long assignmentId) throws SQLException;

    void update(Assignment assignment) throws SQLException;


    void remove(Assignment assignment) throws SQLException;

}
