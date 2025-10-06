public class Employee {
   private int employeeNumber;
   private double payRate;
   private double hoursWorked;

   public static final int MAX_EMP_NUM = 9999;
   public static final double MAX_RATE = 60.00;
   public static final double OVERTIME_MULTIPLIER = 1.5;

   public Employee(int empNum, double rate, double hours) {
      employeeNumber = empNum;
      payRate = rate;
      hoursWorked = hours;
   }

   public double getRegularPay() {
      double regularHours = Math.min(40, hoursWorked);
      return regularHours * payRate;
   }

   public double getOvertimePay() {
      double overtimeHours = Math.max(0, hoursWorked - 40);
      return overtimeHours * payRate * OVERTIME_MULTIPLIER;
   }
}
