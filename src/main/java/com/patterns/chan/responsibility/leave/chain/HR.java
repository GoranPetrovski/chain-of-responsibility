package com.patterns.chan.responsibility.leave.chain;

public class HR extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {

        //HR can approve up to 21 days, otherwise it will pass to the Manager
        if(leave.getNumberOfDays() <= 21){
            //reason type should not be "Regular" to get approved
            if(!leave.getReason().equals(ReasonType.REGULAR)){
                return "Your leave days has been APPROVED by HR";
            }else{
                return "Your leave request has been DENIED by HR";
            }
        }else{
            return superVisor.applyLeave(leave);
        }
    }
}
