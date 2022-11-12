package com.trinadh.kiran.starter.FoodRescueManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinadh.kiran.starter.FoodRescueManagement.DAO.SocialWorkerRepository;
import com.trinadh.kiran.starter.FoodRescueManagement.Entity.SocialWorker;

@Service
public class SocailWorkerService implements iSocialWorkerService {

	@Autowired
	SocialWorkerRepository socialWorkerRepository;
	
	@Override
	public void save(SocialWorker socialWorker) {
		socialWorkerRepository.save(socialWorker);

	}

	@Override
	public List<SocialWorker> getAll() {
		
		return socialWorkerRepository.findAll();
	}

}
