package DAO;

import entity.Organization;

import java.sql.SQLException;
import java.util.List;

public interface OrganizationDAO {
    void add(Organization organization) throws SQLException;

    List<Organization> getAll() throws SQLException;

    Organization getByOrganizationId(Long organizationId) throws SQLException;

    void update(Organization organization) throws SQLException;


    void remove(Organization organization) throws SQLException;

}
