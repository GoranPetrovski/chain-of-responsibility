package com.patterns.chan.responsibility.leave.chain.components;

import com.patterns.chan.responsibility.leave.chain.Leave;
import com.patterns.chan.responsibility.leave.chain.ReasonType;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class HR extends LeaveHandler {

    @Override
    public void applyLeave(Leave leave) {

        //HR can approve up to 21 days, otherwise it will pass to the Manager
        if (!leave.isApproved() && leave.getNumberOfDays() <= 21) {
            //reason type should not be "Regular" to get approved
            if (!leave.getReason().equals(ReasonType.REGULAR)) {
                System.out.println("Your leave days has been APPROVED by HR");
                leave.setApproved(true);
            } else {
                System.out.println("Your leave request has been DENIED by HR");
            }
        }
    }
}
