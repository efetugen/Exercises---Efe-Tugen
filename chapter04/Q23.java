package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = payRate * hours;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: $" + payRate);
        System.out.println("Gross pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("  Federal withholding: $" + federalWithholding);
        System.out.println("  State withholding: $" + stateWithholding);
        System.out.println("  Total deduction: $" + totalDeduction);
        System.out.println("Net pay: $" + netPay);
    }
}
