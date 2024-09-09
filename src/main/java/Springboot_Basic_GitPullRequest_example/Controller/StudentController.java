package Springboot_Basic_GitPullRequest_example.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class StudentController
{
	@RequestMapping("/test")
	public String test()
	{
		return "this is Prashant's test";
	}
	
}