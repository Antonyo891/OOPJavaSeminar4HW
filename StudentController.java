import java.util.ArrayList;
import java.util.List;

public class StudentController implements UserController<Student> {
    private StudentGroupServise studentGroupServise;
    private StreamServise streamServise;
    private List <Student> students;
    private List <StudentsGroup> groups;
    private StudentView studentView;


    public StudentController() {
        this.students = new ArrayList<>(0);
        this.groups = new ArrayList<>();
    }

    public StudentController(StudentGroupServise studentGroupServise) {
        this.studentGroupServise = studentGroupServise;}

    public StudentController(StreamServise streamServise) {
        this.streamServise = streamServise;
    }
    
    public void RemoveTheStudent (String firstName, String lastName){
        this.studentGroupServise.RemoveTheStudent(firstName, lastName);
    }

    public void SortStudentGroup (){
        this.studentGroupServise.Sort();
    }

    public void SortStudentGroupByName (){
        this.studentGroupServise.SortByName();
    }
    
    public void SortStreamOfGroupServise (){
        this.streamServise.StreamSort();
    }
   
    public List<Student> SelectByNumberOfGroup(Integer numberOfGroup){
        List<Student> result = new ArrayList<>();
        for (Student items:this.students)
            if (items.getNumberOfGroup()==numberOfGroup)
                result.add(items);
        return result;
    }
   
    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<StudentsGroup> getGroups() {
        return this.groups;
    }

    public void setGroups(List<StudentsGroup> groups) {
        this.groups = groups;
    }

    public void AddGroup(StudentsGroup studentsGroup){
        this.groups.add(studentsGroup);
    }

    public void SendAllStudent(){
        studentView = new StudentView();
        studentView.sendOnConsole(students);
    }

    @Override
    public void create(Student student) {
        int count =0;
        for (StudentsGroup group : this.groups)
            if (group.getNumberOfGroup().equals(student.getNumberOfGroup())){
                group.AddStudent(student);
                this.students.add(student);
                count++;}
        if (count==0) {
            StudentsGroup studentsGroup = new StudentsGroup(student.getNumberOfGroup(),null);
            studentsGroup.AddStudent(student);
            this.students.add(student);
            this.groups.add(studentsGroup);}
    }
}
