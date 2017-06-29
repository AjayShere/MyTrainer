package com.cognizant.dao;


import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TrainingShedule;
@Component
public class ViewTrainerDao {
@PersistenceContext
private EntityManager em;


@Transactional
	public List<TrainingShedule> retrieveTrainerSchedule(Date date) {
		// TODO Auto-generated method stub
		
		//TrainingShedule retriev=em.find(TrainingShedule.class, date);
		
		Query query=em.createQuery(" from TrainingShedule t where t.startDate=?");
		
		query.setParameter(1, date);
		
		List<TrainingShedule> list=query.getResultList();
		
		System.out.println(list);
		
		return list;
		
		/*System.out.println(retriev.getDuration() );
		System.out.println(retriev.getStartDate());
		 
		System.out.println(retriev.getTrainerDetails());*/
		
		
		
		
	}

}
