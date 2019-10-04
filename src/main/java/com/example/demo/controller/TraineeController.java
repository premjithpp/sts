package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import com.example.demo.pojo.AdminCredentials;
import com.example.demo.pojo.TraineeDetails;
import com.example.demo.pojo.TrainerDetails;
import com.example.demo.repo.TraineeRepo;
import com.example.demo.repo.TrainerRepo;
import com.example.demo.service.AdminService;
import com.example.demo.service.TraineeService;
import com.example.demo.service.TrainerService;
@EnableEurekaClient
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TraineeController {
	@Autowired
	 TraineeService service;
	@Autowired
	TrainerService trainerService;
	@Autowired
	AdminService adminService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/trainee-signup")
	  public void postTrainee(@RequestBody TraineeDetails trainee) {
	    service.postTrainee(trainee);
	  }
	
	@RequestMapping(method = RequestMethod.POST,value = "/trainer-signup")
	  public void postTrainer(@RequestBody TrainerDetails trainer) {
	    trainerService.postTrainer(trainer);
	    
	  }

	
	@RequestMapping("/userName/{userName}")
    public TraineeDetails getPersonUserName(@PathVariable String userName){
        return service.getUsersUserName(userName);
    }
	
	@RequestMapping("/admin/{userName}")
    public AdminCredentials adminName(@PathVariable String userName){
        return adminService.adminName(userName);
    }
	
	
}
