package Day3;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private static int numberofEmployees;

    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberofEmployees++;
    }

    public Employee(int baseSalary){
        this(baseSalary,0);
        //this(); calls default constructor
        //this(x,y);calls  constructor with two parameter
    }

    public int calculateWage(int extraHours) {
        return baseSalary+(hourlyRate*extraHours);
    }
    public int calculateWage() {
        return baseSalary;
    }

    public static void getNumberofEmployees(){
        System.out.println(numberofEmployees);
    }
    private void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("Base Salary Cannot be 0 or negative");
        this.baseSalary=baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate<0)
            throw new IllegalArgumentException("Hourly Rate Cannot be negative");
        this.hourlyRate=hourlyRate;
    }


}
