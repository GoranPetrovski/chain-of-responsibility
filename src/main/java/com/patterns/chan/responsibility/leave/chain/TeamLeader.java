package com.patterns.chan.responsibility.leave.chain;

public class TeamLeader extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {

        //"reasonType" is not going to be consider under TeamLeader & ProjectLeader
        //Team Leader can approve up to 7 days, otherwise it will pass to the Project Leader
        if (leave.getNumberOfDays() <= 7) {
            return "Your leave days has been APPROVED by TeamLeader";
        } else {
            return superVisor.applyLeave(leave);
        }
    }
}
