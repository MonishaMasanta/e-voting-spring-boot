package com.voting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.voting.entity.ElectionEntity;
import com.voting.entity.ScheduleEntity;
import com.voting.exception.ElectionNotFoundException;
import com.voting.exception.ScheduleNotFoundException;
import com.voting.service.ElectionService;
import com.voting.service.ScheduleService;



@SpringBootTest
class EVotingSystem1ApplicationTests {
	@Autowired
	private ElectionService electionService;
	
	@Autowired
	private ScheduleService scheduleService;
	

	@Test
	void addElectionTest() throws ElectionNotFoundException {
        ElectionEntity electionentity = new ElectionEntity(46,"CMElection", "Nagpur","Maharashtra");
        ElectionEntity testElectionEntity = this.electionService.addElection(electionentity);
        //assertNotNull(electionentity);   
     }
	private void assertNotNull(ElectionEntity testElectionEntity){
        // TODO Auto-generated method stub            
    }
	
	@Test
	void updateElectionTest() {
		ElectionEntity electionentity = new ElectionEntity(46, "PMElection", null, "Telangana");
	}
	
	@Test
	void addScheduleTest() throws ScheduleNotFoundException {
		ScheduleEntity scheduleentity = new ScheduleEntity(42,"CMElection,","2023-08-09");
	    //ScheduleEntity testScheduleEntity = this.scheduleService.addSchedule(testScheduleEntity);
	    assertNotNull(scheduleentity);
	}
	private void assertNotNull(ScheduleEntity testScheduleEntity) {
	       // TODO Auto-generated method stub                    
	}
	
	@Test
	void updateScheduleTest() {
		ScheduleEntity scheduleentity = new ScheduleEntity(46, "PMElection", null);
	}

}
