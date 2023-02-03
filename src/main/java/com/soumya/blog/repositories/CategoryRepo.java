package com.soumya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
