package com.patterns.chan.responsibility.leave.chain.components;

import com.patterns.chan.responsibility.leave.chain.Leave;
import com.patterns.chan.responsibility.leave.chain.ReasonType;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class Manager extends LeaveHandler {

    @Override
    public void applyLeave(Leave leave) {

        //Only Manager has the authority to approve more than 21 days
        if (!leave.isApproved() && leave.getNumberOfDays() > 21) {
            //reason type should be "Special" to get approved
            if (leave.getReason().equals(ReasonType.SPECIAL)) {
                System.out.println("Your leave days has been APPROVED by Manager");
                leave.setApproved(true);
            } else {
                System.out.println("Your leave request has been DENIED by Manager");
            }
        }
    }
}
