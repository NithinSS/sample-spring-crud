package me.nithin.springboothibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.nithin.springboothibernate.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}