package com.trinadh.kiran.starter.FoodRescueManagement.Service;

import java.util.List;

import com.trinadh.kiran.starter.FoodRescueManagement.Entity.Posts;

public interface IPostService {

	public void save(Posts post);
	public List<Posts> getAll();
}
