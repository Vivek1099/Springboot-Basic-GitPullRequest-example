package Springboot_Basic_GitPullRequest_example.Controller;

import Springboot_Basic_GitPullRequest_example.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
    @Autowired
    StudentRepository srepo;
    @RequestMapping ("/test")
    public String test()
    {
        return " this is tania test";
    }
}
