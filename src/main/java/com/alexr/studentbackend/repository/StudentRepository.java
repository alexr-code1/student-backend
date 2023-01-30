/*JPA Implementation*/
/*API to connect to relational DB (MySQL, Postgres, Oracle)*/

package com.alexr.studentbackend.repository;

import com.alexr.studentbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
