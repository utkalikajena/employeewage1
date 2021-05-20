package com.bridgelabz;

import java.net.StandardSocketOptions;

class EmpWageBuilder {
    private static final int IS_FULL_TIME = 2;
    private static final int IS_PART_TIME = 1;
    private static final int EMP_RATE_PER_HOUR = 20;
    private static final int NUM_OF_WORKING_DAYS = 2;
    public static void main(String[] args){

        int empHR = 0 , empWage = 0 ,totalEmpWage = 0 ;

        for(int day = 1 ; day <= 20 ; day ++) {
            int empCheck = (int) Math.floor((Math.random() * 10)) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHR = 8;
                    break;
                case IS_PART_TIME:
                    empHR = 4;
                    break;
                default:
                    empHR = 0;
                    break;
            }
            empWage = empHR * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee wage: " + empWage);
        }
        System.out.println("Total Employee wage: " + totalEmpWage);
    }
}
