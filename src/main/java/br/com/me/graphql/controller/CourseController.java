package br.com.me.graphql.controller;

import br.com.me.graphql.entity.Course;
import br.com.me.graphql.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    @QueryMapping
    public List<Course> courses() {
        return courseRepository.findAll();
    }
}
