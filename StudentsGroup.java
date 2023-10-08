import java.util.ArrayList;

public class StudentsGroup implements Iterable<Student>  {
    private Integer groupId, numberOfGroup;
    private ArrayList <Student> listOfStudent;
    private Teacher teacher;
    private static Integer id =0;

    private Integer GenerateId(){
        this.groupId=this.id+1;
        this.id=this.groupId;
        return this.groupId;
    }

    public StudentsGroup(Integer numberOfGroup, Teacher teacher) {
        this.groupId = GenerateId();
        this.numberOfGroup = numberOfGroup;
        this.listOfStudent = new ArrayList<>();
        this.teacher = teacher;}
    
    public StudentsGroup(Integer numberOfGroup, Teacher teacher, 
                                    ArrayList <Student> listOfStudent) {
        this(numberOfGroup, teacher);
        this.listOfStudent = new ArrayList<>(listOfStudent);}
    
    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getNumberOfGroup() {
        return this.numberOfGroup;
    }

    public void setNumberOfGroup(Integer numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public ArrayList<Student> getListOfStudent() {
        return this.listOfStudent;
    }

    public void setListOfStudent(ArrayList<Student> listOfStudent) {
        this.listOfStudent = listOfStudent;
    }
    
    public void AddStudent(Student student){
        this.listOfStudent.add(student);
        student.setNumberOfGroup(this.getNumberOfGroup());
    }

    public Teacher GetTeacher(){
        return this.teacher;
    }

    public void SetTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public void UpdateGroup (ArrayList<Student> studentsList){
        this.listOfStudent = studentsList;
    }
    @Override
    public String toString() {
        return "{" +
            " groupId='" + getGroupId() + "'" + " Teacher= " + GetTeacher().getFirstName() + 
            " " + GetTeacher().getLastName() + ", numberOfGroup='" + getNumberOfGroup() + "'" +
            ", number of student ='" + this.listOfStudent.size() + "'" +
            "}";
    }

    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator(this);
    }

}
