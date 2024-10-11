package com.example.hospitalManagementSystem.repository;

import com.example.hospitalManagementSystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,String> {
}
//public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
////    //@Query("SELECT employee from Employee employee where employee.empCity=:empCity")
////    @Query(value = "SELECT * from employee as emp where emp.emp_city=:empCity",nativeQuery = true)
////    public List<Employee> getEmployeeByCity(String empCity);
////    @Modifying
////    //@Query("DELETE from Employee employee where employee.empCity=:empCity")
////    @Query(value = "DELETE from employee as emp where emp.emp_city=:empCity" ,nativeQuery = true)
////    public void deleteEmpByCity(String empCity);
//
//    public List<Employee> findByempCity(String empCity);
//    public List<Employee> findByempCityAndEmpName(String empCity,String empName);
//}