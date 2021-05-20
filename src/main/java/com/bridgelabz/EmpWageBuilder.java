package com.bridgelabz;

import java.net.StandardSocketOptions;

class EmpWageBuilder {
    private static final int IS_FULL_TIME = 1;
    private static final int WAGE_PER_HR = 20;
    private static final int  IS_PART_TIME = 2;
    public static void main(String[] args){
        int empHR = 0;
        double empCheck = Math.floor((Math.random() * 10)) % 3;
        System.out.println(IS_FULL_TIME);
        if(empCheck == IS_FULL_TIME) {
            empHR = 8;
        }
        if(empCheck == IS_PART_TIME){
            empHR = 4;
        }
        int empWage = WAGE_PER_HR * empHR;
        System.out.println("Employee wage: "+empWage);
    }
}
