package com.example.CrudOperation;

import com.example.CrudOperation.dao.StudentDAO;
import com.example.CrudOperation.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationApplication.class, args);
	}
     @Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return  runner->{
			createStudent(studentDAO);
		};
	}



	public  void  createStudent(StudentDAO studentDAO){

		System.out.println("Create Student");

		Student student=new Student("Alvi","Ahmed","alvi@gmail.com");

		System.out.println("Save Student");
		studentDAO.save(student);

		System.out.println("Save Student id .Generated id : "+student.getId());

	}

}
