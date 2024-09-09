package Springboot_Basic_GitPullRequest_example.Repository;

import Springboot_Basic_GitPullRequest_example.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
