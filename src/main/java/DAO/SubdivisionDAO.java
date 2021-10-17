package DAO;

import entity.Subdivision;

import java.sql.SQLException;
import java.util.List;

public interface SubdivisionDAO {
    void add(Subdivision subdivision) throws SQLException;

    List<Subdivision> getAll() throws SQLException;

    Subdivision getBySubdivisionId(Long subdivisionId) throws SQLException;

    void update(Subdivision subdivision) throws SQLException;


    void remove(Subdivision subdivision) throws SQLException;
}
