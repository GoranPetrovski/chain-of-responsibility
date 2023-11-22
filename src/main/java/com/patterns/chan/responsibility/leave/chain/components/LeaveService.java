package com.patterns.chan.responsibility.leave.chain.components;

import com.patterns.chan.responsibility.leave.chain.Leave;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LeaveService {
    private List<LeaveHandler> leaveHandlers;

    public void handleRequest(Leave leave) {
        leaveHandlers.forEach(leaveHandler -> {
            leaveHandler.applyLeave(leave);
        });
    }
}
