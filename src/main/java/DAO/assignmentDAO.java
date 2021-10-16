package DAO;

import entity.assignment;

import java.util.List;

public interface assignmentDAO extends CRUDDAO<assignment> {
    List<assignment> findAllByEmployee(Long id);
}
