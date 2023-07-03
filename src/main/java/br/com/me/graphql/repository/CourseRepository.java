package br.com.me.graphql.repository;

import br.com.me.graphql.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
