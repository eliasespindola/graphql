package br.com.me.graphql.controller;

import br.com.me.graphql.dto.NewCategory;
import br.com.me.graphql.entity.Category;
import br.com.me.graphql.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @QueryMapping
    public List<Category> categories() {
        return categoryRepository.findAll();
    }

    @QueryMapping
    public Category categoryById(@Argument Long id){
        return categoryRepository.findById(id).get();
    }

    @MutationMapping
    public Category createCategory(@Argument("input") NewCategory newCategory){
        Category category = new Category(newCategory.getName(), newCategory.getDescription());
        return categoryRepository.save(category);
    }
}
