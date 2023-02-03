package com.soumya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
