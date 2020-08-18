public class Day3Main {

    public static void main(String[] args) {
        //ternary operator

//        String brand="HP";
//        String laptopBrand=brand.equalsIgnoreCase("hp")?"hp laptop":"other manufacturer";
//        System.out.println(laptopBrand);

        //base salary-30,000 hourly rate-200,extra hour-5(needed when employee works extra hours)
        //some employee only works extra hours
        //hourly rate not need for employee not working extra hours
        // 30,000+(200*5)=31,000

        //classname objrefname=new classname;
        Employee employee = new Employee(30_000,200);
        System.out.println("Employee Wage:"+employee.calculateWage(5));
        //create employee 1
        Employee employee1=new Employee(30_000);
        System.out.println("Employee1 Wage:"+employee1.calculateWage());

        Employee.getNumberofEmployees();

    }


}
