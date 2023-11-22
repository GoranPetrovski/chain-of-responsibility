package com.patterns.chan.responsibility.leave.chain.components;

import com.patterns.chan.responsibility.leave.chain.Leave;

public abstract class LeaveHandler {
    public abstract void applyLeave(Leave leave);
}
