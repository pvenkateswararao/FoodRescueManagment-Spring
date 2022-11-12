package com.trinadh.kiran.starter.FoodRescueManagement.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trinadh.kiran.starter.FoodRescueManagement.Entity.Posts;
import com.trinadh.kiran.starter.FoodRescueManagement.Entity.SocialWorker;
import com.trinadh.kiran.starter.FoodRescueManagement.Service.IPostService;
import com.trinadh.kiran.starter.FoodRescueManagement.Service.iSocialWorkerService;

@RestController
@RequestMapping("/socialWorker/api")
public class SocialWorkerController {

	@Autowired
	IPostService postService;
	
	@Autowired
	iSocialWorkerService socialWorkerService;
	
	@GetMapping("/test")
	public String test() {
		return "Test Page";
	}
	
	
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@Valid @RequestBody SocialWorker obj){
		try{
			socialWorkerService.save(obj);
			return new ResponseEntity<String>("Registration Successful", HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e, HttpStatus.OK);
		}
	}
	
	@GetMapping("/getAllSocialWorkers")
	public ResponseEntity<List<SocialWorker>> getAllSocialWorkers(){
		List<SocialWorker> ls=socialWorkerService.getAll();
		return new ResponseEntity<>(ls,HttpStatus.OK); 
	}
	
	
	@PostMapping("/post")
	public ResponseEntity<?> postMessage(@Valid @RequestBody Posts post){
		try{
			postService.save(post);
			return new ResponseEntity<String>("Message Posted Successfull", HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("Error occured, Enter all mandatory fields and try again", HttpStatus.OK);
		}
	}
	
	@GetMapping("/getAllPosts")
	public ResponseEntity<List<Posts>> getAllPosts(){
		List<Posts> ls=postService.getAll();
		return new ResponseEntity<>(ls,HttpStatus.OK); 
	}
	
}
