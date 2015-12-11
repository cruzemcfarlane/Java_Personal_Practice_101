public class StudentTest implements Comparable
{
    public static void main(String[] args)    {
        Student student;
        UniversityStudent uniStudent;
        String other;
        
        student = new Student("McFarlane", "Cruze", 620040546);
        uniStudent = new UniversityStudent("McFarlane", "Cruze", 620040546, 15, 5);
        System.out.println(student.toString());
        System.out.println(uniStudent.toString());
        
        System.out.println("\n");
        
        student.calculateGPA(90);
        uniStudent.calculateGPA();
        
        System.out.println(student.toString());
        System.out.println(uniStudent.toString());
        
        if((student.getFirstName()).equalsIgnoreCase((uniStudent.getFirstName())))
            System.out.println(true);
    }
    
    public int compareTo(Object other)
    {
        return 0;
    }
}