package br.com.me.graphql.controller;

import br.com.me.graphql.dto.NewCourse;
import br.com.me.graphql.entity.Category;
import br.com.me.graphql.entity.Course;
import br.com.me.graphql.repository.CategoryRepository;
import br.com.me.graphql.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @QueryMapping
    public List<Course> courses() {
        return courseRepository.findAll();
    }

    @MutationMapping
    public Course createCourse(@Argument("input") NewCourse newCourse){
        //Codigo só para retornar exception msm
        Category category = categoryRepository.findById(newCourse.getCategoryId()).orElseThrow(() -> new IllegalArgumentException("Not found"));
        return courseRepository.save(new Course(newCourse.getName(), newCourse.getDescription(), category));
    }
}
