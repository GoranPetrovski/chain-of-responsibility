package com.patterns.chan.responsibility.leave.chain.components;

import com.patterns.chan.responsibility.leave.chain.Leave;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class TeamLeader extends LeaveHandler {

    @Override
    public void applyLeave(Leave leave) {

        //"reasonType" is not going to be consider under TeamLeader & ProjectLeader
        //Team Leader can approve up to 7 days, otherwise it will pass to the Project Leader
        if(leave.getNumberOfDays() <= 7) {
            System.out.println("Your leave days has been APPROVED by TeamLeader");
            leave.setApproved(true);
        }
    }
}
