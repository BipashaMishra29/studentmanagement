package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student st1 = new Student("pooja", "p@gmail.com");
		Student st2 = new Student("dooja", "d@gmail.com");
		Student st3 = new Student("vooja", "v@gmail.com");
		Student st4 = new Student("kooja", "k@gmail.com");
		studentRepository.save(st1);
		studentRepository.save(st2);
		studentRepository.save(st3);
		studentRepository.save(st4);

		System.out.println("------------------------------------all saved------------------------------");

	}

}
