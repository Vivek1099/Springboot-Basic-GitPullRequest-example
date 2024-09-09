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
	
	@RequestMapping("/all")
	public List<Student> allData()
	{
		return srepo.findAll();
	}
	@RequestMapping("/{id}")
	public Optional<Student> byId(@PathVariable int id)
	{
		return srepo.findById(id);
		
	}
	@RequestMapping("/upd/{id}")
	public String update(@RequestBody Student stu,@PathVariable int id)
	{
		Student s=srepo.findById(id).get();
		srepo.update(s);
		return "Data is updated";
	}
	
}
}

