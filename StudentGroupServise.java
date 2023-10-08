
public class StudentGroupServise{

    private StudentsGroup studentsGroup;
    private Integer count; 
    public StudentGroupServise(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public void RemoveTheStudent (String firstName, String lastName ){
        this.count = 0;
        for (Student item: this.studentsGroup)
            if ((item.getFirstName().toLowerCase().equals(firstName.toLowerCase()))&&
                (item.getLastName().toLowerCase().equals(lastName.toLowerCase())))
                    {   studentsGroup.iterator().previous();
                        studentsGroup.iterator().remove();
                        this.count++;}
            if (count==0) System.out.println("Student " + 
            firstName + " " + lastName + " not found");    
}
    
    public void Sort (){
        this.studentsGroup.getListOfStudent().sort(null);
    }

    public void SortByName (){
        UserComparator<Student> studentComparator = new UserComparator<Student>();
        this.studentsGroup.getListOfStudent().sort(studentComparator);
    }
}