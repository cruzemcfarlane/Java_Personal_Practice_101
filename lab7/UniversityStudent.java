public class UniversityStudent extends Student
{
    protected int credit;
    protected int courses;
    
    public UniversityStudent(String lname, String fname, int id, int credit, int courses)
    {
        super(lname, fname, id);
        this.credit = credit;
        this.courses = courses;
    }
    
    public int getCredit()
    {
        return credit;
    }
    
    public int getCourses()
    {
        return courses;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    public void setCourses(int courses)
    {
        this.courses = courses;
    }
    
    public String toString()
    {
         return super.toString() 
                +"\nCredit:\t" + credit
                + "\nCourse:\t" + courses;
    }
    
    public void calculateGPA()
    {
        gpa = (double)(credit / courses);
    }    
}