public class Student implements Person
{
    protected String lastName;
    protected String firstName;
    protected int id;
    protected double gpa;
    
    public Student(String lname, String fname, int id)
    {
        lastName = lname;
        firstName = fname;
        this.id = id;
        gpa = 0;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public int getID()
    {
        return id;
    }
    
    public double getGPA()
    {
        return gpa;
    }
       
    public void setLastName(String lname)
    {
        lastName = lname;
    }
    
    public void setFirstName(String fname)
    {
        firstName = fname;
    }
    
    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }
    
    public String toString()
    {
        return "Last Name: " + lastName
               + "\nFirst Name: " + firstName
               + "\nID:\t" + id
               + "\nGPA:\t" + gpa;
    }
     
    public void calculateGPA(double average)
    {
        gpa = (double)(average/100) * 4;
    }
}