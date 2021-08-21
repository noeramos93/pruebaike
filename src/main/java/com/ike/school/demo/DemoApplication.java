package com.ike.school.demo;

import com.ike.school.demo.entity.Subject;
import com.ike.school.demo.repository.SubjectRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Log LOGGER = LogFactory.getLog(DemoApplication.class);
	private SubjectRepository subjectRepository;

	public DemoApplication(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		loadCatSubject();
	}

	private void loadCatSubject(){
		LOGGER.info("Cargando catalogo de Materias");
		Subject sub1 = new Subject("español");
		Subject sub2 = new Subject("matemáticas");
		Subject sub3 = new Subject("química");
		if(subjectRepository.findAll().isEmpty()){
			LOGGER.info("Cargando.....");
			List<Subject> list = Arrays.asList(sub1, sub2, sub3);
			list.stream().forEach(subjectRepository::save);
		}else{
			LOGGER.info("ya hay materias cargadas en la DB");
		}

	}
}
