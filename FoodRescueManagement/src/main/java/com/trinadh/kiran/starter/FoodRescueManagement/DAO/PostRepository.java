package com.trinadh.kiran.starter.FoodRescueManagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trinadh.kiran.starter.FoodRescueManagement.Entity.Posts;

@Repository
public interface PostRepository extends JpaRepository<Posts, String> {

}
