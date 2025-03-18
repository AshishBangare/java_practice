package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigfile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigfile.class);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
<<<<<<< HEAD
		System.out.println("Hi");
=======
		askjfslkj
>>>>>>> bd2cec8628107897f3856b62ceb6efa010c215bd
		
	}

}
