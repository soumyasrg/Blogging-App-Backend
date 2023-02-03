package com.soumya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
