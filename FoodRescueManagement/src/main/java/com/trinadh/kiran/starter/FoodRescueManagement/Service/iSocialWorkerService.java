package com.trinadh.kiran.starter.FoodRescueManagement.Service;

import java.util.List;

import com.trinadh.kiran.starter.FoodRescueManagement.Entity.SocialWorker;

public interface iSocialWorkerService {

	public void save(SocialWorker socialWorker);
	public List<SocialWorker> getAll();

	
}

