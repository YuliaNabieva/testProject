package repository;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "SELECT * FROM Employee WHERE firstName=?1 and lastName=?2", nativeQuery = true)
    Employee findByFirstNameAndLastName(String firstName, String lastName);

    Employee findByLastName(String lastName);
}
