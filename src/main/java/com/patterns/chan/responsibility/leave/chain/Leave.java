package com.patterns.chan.responsibility.leave.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Leave {

    private int numberOfDays;
    private ReasonType reason;
    private boolean approved;
}
