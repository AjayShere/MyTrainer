package test.java;


import java.sql.Date;
import java.text.SimpleDateFormat;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.ViewTrainerDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestViewTrainer {
	
	@Autowired
	ViewTrainerDao  viewTrainerDao;
	
	
	@Test
	public void viewTrainerSchedule()
	{
		Date date=new Date(02-06-2017);
	/*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-DD");
	String strDate=sdf.format(date);*/
		viewTrainerDao.retrieveTrainerSchedule(date);
		
	}

}
