package Springboot_Basic_GitPullRequest_example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Springboot_Basic_GitPullRequest_example.Entity.Student;
import Springboot_Basic_GitPullRequest_example.Repository.StudentRepository;

@RestController

public class StudentController {
	@Autowired
	StudentRepository srepo;
	@RequestMapping("/test")
	public String test() {
		return"test from Roshan";	
	}

@PostMapping("/save")
public String saveData(@RequestBody Student s)
{
	srepo.save(s);
	return"data is saved into database";
}
}

