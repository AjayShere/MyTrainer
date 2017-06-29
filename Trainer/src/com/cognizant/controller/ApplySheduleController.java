package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.dao.AddSheduleDao;
import com.cognizant.entity.TrainerDetails;
import com.cognizant.entity.TrainingShedule;

@Controller
public class ApplySheduleController {
	
	@Autowired
	AddSheduleDao dao;
	List<TrainingShedule> list=new ArrayList<TrainingShedule>();
	
	@RequestMapping(value="/applyshedule",method = RequestMethod.GET)
	public String applyShedule(Model model){
		
		model.addAttribute("TrainingShedule",new TrainingShedule());
		model.addAttribute("TrainerDetails",new TrainerDetails());
		
		return "addShedule";
		
	}
	
	@RequestMapping(value="/applyShedule", method = RequestMethod.POST)
		public String  initAddShedule(@ModelAttribute("TrainingShedule") @Valid TrainingShedule TrainingShedule,Model model){
			
		TrainerDetails obj=TrainingShedule.getTrainerDetails();
		
		System.out.println(obj);
		list.add(TrainingShedule);
			
		obj.setList(list);
		 
		dao.addShedule(obj);
		
			return "Success";
			
		}
		
		
	}
	


