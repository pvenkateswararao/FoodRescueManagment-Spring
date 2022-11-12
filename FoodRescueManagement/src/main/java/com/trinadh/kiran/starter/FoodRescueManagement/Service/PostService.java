package com.trinadh.kiran.starter.FoodRescueManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.trinadh.kiran.starter.FoodRescueManagement.DAO.PostRepository;
import com.trinadh.kiran.starter.FoodRescueManagement.Entity.Posts;

@Service
public class PostService implements IPostService {

	@Autowired
	PostRepository postRepository;
	
	@Override
	public void save(Posts post) {
		postRepository.save(post);

	}

	@Override
	public List<Posts> getAll() {
		return postRepository.findAll(Sort.by(Direction.DESC, "datetime"));
	}

}
