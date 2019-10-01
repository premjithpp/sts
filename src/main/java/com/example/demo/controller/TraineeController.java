package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.pojo.TraineeDetails;
import com.example.demo.pojo.TrainerDetails;
import com.example.demo.repo.TraineeRepo;
import com.example.demo.repo.TrainerRepo;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class TraineeController {
	@Autowired
	  TraineeRepo repository;
	@Autowired
	TrainerRepo repotrainer;
	
	@RequestMapping(method = RequestMethod.POST,value = "/trainee/signup")
	  public void postTrainee(@RequestBody TraineeDetails trainee) {
	 
	    repository.save(trainee);
	    
	  }
	
	@RequestMapping(method = RequestMethod.POST,value = "/trainer/signup")
	  public void postTrainer(@RequestBody TrainerDetails trainer) {
	 
	    repotrainer.save(trainer);
	    
	  }

}
