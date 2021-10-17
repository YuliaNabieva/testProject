package DAO;

import entity.Assignment;

import java.util.List;

public interface AssignmentDAO extends CRUDDAO<Assignment> {
    List<Assignment> findAllByEmployee(Long id);
}
