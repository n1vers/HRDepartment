package ee.ivkhkdev.HRDepartment.repositories;

import ee.ivkhkdev.HRDepartment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
//    Optional<Employee> findByLastname(String lastname);
}