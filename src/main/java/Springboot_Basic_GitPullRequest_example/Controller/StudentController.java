package Springboot_Basic_GitPullRequest_example.Controller;

import Springboot_Basic_GitPullRequest_example.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/test")
    public String test(){
        return "This Is Koushal test";
    }
}
