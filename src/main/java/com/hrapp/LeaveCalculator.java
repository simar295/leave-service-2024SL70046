package com.hrapp;

public class LeaveCalculator {

    public int getRemainingLeave(int totalLeave, int usedLeave) {
        return totalLeave - usedLeave;
    }

    public double getLeaveEncashment(int unusedLeaves, double dailySalary) {
        return unusedLeaves * dailySalary;
    }
}
