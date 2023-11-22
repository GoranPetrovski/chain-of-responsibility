package com.patterns;

import com.patterns.chan.responsibility.leave.chain.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatternsApplicationTests {

    @Test
    void chainOfResponsibility_withoutComponent() {
        TeamLeader teamLeader = new TeamLeader();
        ProjectLeader projectLeader = new ProjectLeader();
        HR hr = new HR();
        Manager manager = new Manager();

        teamLeader.setSuperVisor(projectLeader);
        projectLeader.setSuperVisor(hr);
        hr.setSuperVisor(manager);

        Leave leave1 = new Leave(5, ReasonType.REGULAR, false);
        System.out.println(teamLeader.applyLeave(leave1));

        Leave leave3 = new Leave(12, ReasonType.REGULAR, false);
        System.out.println(teamLeader.applyLeave(leave3));

        Leave leave4 = new Leave(18, ReasonType.REGULAR, false);
        System.out.println(teamLeader.applyLeave(leave4));

        Leave leave6 = new Leave(30, ReasonType.SPECIAL, false);
        System.out.println(teamLeader.applyLeave(leave6));
    }

}
