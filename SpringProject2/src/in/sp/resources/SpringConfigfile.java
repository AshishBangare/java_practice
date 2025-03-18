package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigfile {
	
	@Bean
	public Student stdId() {
		
		Student std = new Student();
		
		std.setName("Ashish");
		std.setRollno(101);
		std.setEmail("ashish@gmail.com");
		
		return std;
	}

}
