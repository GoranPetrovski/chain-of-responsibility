package com.patterns.chan.responsibility.leave.chain.components;

import com.patterns.chan.responsibility.leave.chain.Leave;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProjectLeader extends LeaveHandler {

    @Override
    public void applyLeave(Leave leave) {

        //"reasonType" is not going to be consider under TeamLeader & ProjectLeader
        //Project Leader can approve up to 14 days, otherwise it will pass to the HR
        if(!leave.isApproved() && leave.getNumberOfDays() <= 14){
            System.out.println("Your leave days has been APPROVED by Project Leader");
            leave.setApproved(true);
        }
    }
}
