package com.patterns;

import com.patterns.chan.responsibility.leave.chain.Leave;
import com.patterns.chan.responsibility.leave.chain.ReasonType;
import com.patterns.chan.responsibility.leave.chain.components.LeaveService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatternsApplicationComponentBasedTests {

    @Autowired
    private LeaveService leaveService;

    @Test
    void chainfResponsibility_componentBased() {
        Leave leave1 = new Leave(5, ReasonType.REGULAR, false);
        leaveService.handleRequest(leave1);
        System.out.println("================");

        Leave leave3 = new Leave(12, ReasonType.REGULAR, false);
        leaveService.handleRequest(leave3);
        System.out.println("================");

        Leave leave4 = new Leave(18, ReasonType.REGULAR, false);
        leaveService.handleRequest(leave4);
        System.out.println("================");

        Leave leave6 = new Leave(30, ReasonType.SPECIAL, false);
        leaveService.handleRequest(leave6);

    }

}
