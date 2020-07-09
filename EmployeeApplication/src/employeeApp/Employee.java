package employeeApp;

public class Employee
{
    //fields - things that the class knows
    private int id;
    private String fname; //String is a class
    private String lname;
    private double salary;
    private boolean has401k
    private int companyId;
    private int healthPlanId;

    //methods - behaviors
    //Getters and Setters

    public int getId()
    {
        return id;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String, fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public boolean getHas401k()
    {
        return has401k;
    }
    
    public void setHas401k(boolean has401k)
    {
        this.has401k = has401k;
    }

    public int getCompanyId()
    {
        return companyId;
    }


}