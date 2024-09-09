package Springboot_Basic_GitPullRequest_example.Controller;

import java.util.Optional;

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
public class StudentController 
{
	@Autowired
	StudentRepository srepo;
	
	
	
	@RequestMapping("/test")
	public String test()
	{
		return "Hello Developers";
	}
	@GetMapping("/all")
	public Student allData()
	{
		return srepo.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Student> byId(@PathVariable int id)
	{
		return srepo.findById(id);
	}
	@PutMapping("/upd/{id}")
	public String update(@RequestBody Student stu,@PathVariable int id)
	{
		Student s=srepo.findById(id).get();
		srepo.update(s);
		return "Data is updated";
	}
}
