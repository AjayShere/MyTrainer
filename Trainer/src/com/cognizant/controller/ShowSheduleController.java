package com.cognizant.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.dao.ViewTrainerDao;
import com.cognizant.entity.TrainingShedule;


@Controller
public class ShowSheduleController {
	
	@Autowired
	 ViewTrainerDao dao;
	List<TrainingShedule> list=new ArrayList<TrainingShedule>();
	
	/*@RequestMapping(value="/showShedule1" ,method = RequestMethod.GET)
	public String showShedule2(Model model){
		
		
		
		return "show";
	}
	*/
	
@RequestMapping(value="/showShedule2" ,method = RequestMethod.GET)
public String showShedule(Model model/*,@RequestParam("Date") Date date*/){
	
	//model.addAttribute("Date",date);
	
	return "showShedule";
}

@RequestMapping(value="/showShedule3" , method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody List<TrainingShedule> showShedule1(Model model,@RequestParam("startDate") Date date){
	
	
	list=dao.retrieveTrainerSchedule(date);
	System.out.println(list);
	return list;
}

}