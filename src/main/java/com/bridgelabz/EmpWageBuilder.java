package com.bridgelabz;

import java.net.StandardSocketOptions;

class EmpWageBuilder {
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int MAX_HR = 100;
    private static final int WAGE_PER_HR = 20;
    private static final int MAX_DAY = 20;
    public static void main(String[] args){

        int empHR = 0 , empWage = 0 , totalWorkingHr = 0 ,day = 0 ;
        System.out.println(IS_FULL_TIME);
        while(totalWorkingHr < MAX_HR && day < MAX_DAY) {
            day ++;
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
            empWage = empHR + (WAGE_PER_HR * empHR);
            day ++;
            totalWorkingHr = totalWorkingHr + empHR;
        }
        System.out.println("Employee wage: " + empWage);
    }
}
