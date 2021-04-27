package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This will provide a CRUD database operations for the Employee entity.

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
//To use paging and sorting APIs provided by Spring Data JPA, your repository
// interface must extend the PagingAndSortingRepository interface
//JpaRepository interface extends PagingAndSortingRepository