package com.hrapp;

// BITS ID: 2024SL70046
public class LeaveCalculator {

    public int getRemainingLeave(int totalLeave, int usedLeave) {
        return totalLeave - usedLeave;
    }

    public double getLeaveEncashment(int unusedLeaves, double dailySalary) {
        return unusedLeaves * dailySalary;
    }
}
