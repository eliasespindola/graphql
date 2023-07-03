package br.com.me.graphql;

import br.com.me.graphql.entity.Category;
import br.com.me.graphql.entity.Course;
import br.com.me.graphql.repository.CategoryRepository;
import br.com.me.graphql.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication implements ApplicationRunner {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Category category = categoryRepository.save(new Category("Java", "Java"));
		courseRepository.save(new Course("Jpa","Aprende Jpa", category));
	}
}
