package org.example.exercise_2;

public class ReturnOnDeposit {

    public static void main(String[] args) {
        float deposit = 1000.00f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;

        float returnOnDepositBeforeTax = deposit * (interestRate / daysInYear) * numDays;
        float returnOnDepositAfterTax = returnOnDepositBeforeTax * (1 - tax);

        System.out.println("Return on deposit before tax: " + returnOnDepositBeforeTax);
        System.out.println("Return on deposit after tax: " + returnOnDepositAfterTax);
    }

}
