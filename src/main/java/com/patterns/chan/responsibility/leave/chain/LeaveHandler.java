package com.patterns.chan.responsibility.leave.chain;

public abstract class LeaveHandler {

    protected LeaveHandler superVisor;

    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    public abstract String applyLeave(Leave leave);
}
