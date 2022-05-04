import java.util.Date;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hiredYear;
    int bonus;
    double raisedSalary = 0.0;
    double totalSalary;

    public Employee(String name, double salary, int workHours, int hiredYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hiredYear = hiredYear;
    }

    public void calculate() {
        this.totalSalary = this.salary + raiseSalary() + bonus() - tax();
        System.out.println(toString());
    }

    public double tax() {
        if (this.salary >= 1000) {

            return this.salary * 0.3;
        } else {
            System.out.println("Salary is less than 1000TL, no tax will be applied");
        }
        return 0;
    }

    public double bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours > 0) {

            while (extraHours > 0) {
                bonus += 30;
                extraHours--;
            }

        }
        return bonus;
    }

    public double raiseSalary() {
        Date d = new Date();
        int year = d.getYear();
        int currentYear = 1900 + year;
        if ((currentYear - this.hiredYear) < 10) {
            this.raisedSalary = this.salary * 0.5;

        } else if ((currentYear - this.hiredYear) > 9 && (year - this.hiredYear) < 20) {
            this.raisedSalary += this.salary * 0.5;

        } else if ((currentYear - this.hiredYear) > 19) {
            this.raisedSalary = this.salary * 0.5;

        }

        return raisedSalary;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nSalary : " + salary + "\nWork-hours : " + workHours + "\nYear hired : " + hiredYear + "\nBonus from extra hours : " + bonus + "\nSalary Raised by: " + raisedSalary + "\nTotal salary : " + this.totalSalary;
    }
}
