package employeeApp;

public class Main
{
    private static void workWithData()
    {
        System.out.println("Welcome to Lambda School's Java!!!");
        //private meaning only the class can see it.
        //Static meaning we're not going to create an object
        //Every method in java returns a datatype
        //Void means we're not returning anything
        //println is a method which is the equivalent of console.log
        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");

        Company c1 = new Company("Company A", 100);
        //The company class has 2 parameters
        Company c2 = new Company("Company B", 200);

        //Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId)
        Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());
        Employee emp3 = new Employee("John", "Jones", 80000, false, c2.id, h1.getId());

        System.out.println(c1);

        emp1.setSalary(emp1.getSalary() + 500);
        System.out.println(emp1.getFname() + " " + emp1.getSalary());

        System.out.println(c1.debt / 7); //int
        System.out.println(c1.debt % 7); //int
        System.out.println(c1.debt / 7.0); //double

        double result = (double) c1.debt /14;
    }

    public static void main(String[] args) 
    {
        workWithData();
        //public meaning anything outside of the class can access it.
    }
} 
    
