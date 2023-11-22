package com.patterns.chan.responsibility.leave.chain;

public class ProjectLeader extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {

        //"reasonType" is not going to be consider under TeamLeader & ProjectLeader
        //Project Leader can approve up to 14 days, otherwise it will pass to the HR
        if(leave.getNumberOfDays() <= 14){
            return "Your leave days has been APPROVED by Project Leader";
        }else{
            return superVisor.applyLeave(leave);
        }
    }
}
