package com.bridgelabz;

import java.net.StandardSocketOptions;

class EmpWageBuilder {
    private static final int IS_PRESENT = 1;
    private static final int IS_ABSENT = 0;
    public static void main(String[] args){

        int empCheck =(int) Math.floor((Math.random() * 10)) % 2;

        if(empCheck == IS_PRESENT){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
