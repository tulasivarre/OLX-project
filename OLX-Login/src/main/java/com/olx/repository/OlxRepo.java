package com.olx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olx.entity.UserEntity;

public interface OlxRepo extends JpaRepository<UserEntity, Integer>{

}
