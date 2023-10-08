import java.util.ArrayList;

public class TeacherServise {
    private ArrayList<Teacher> teachers;


    public TeacherServise(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    public TeacherServise(){
        this.teachers = new ArrayList<>();
    }

    public ArrayList<Teacher> getTeachers() {
        return this.teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void AddTeacher (Teacher teacher){
        this.teachers.add(teacher);
    }
    
    public void RemoveTheTeacher(String firstName, String lastName){
        int count=0;
        for (Teacher item: teachers){
            if ((item.getFirstName().equalsIgnoreCase(firstName))&&
                (item.getLastName().equalsIgnoreCase(lastName))){
                this.teachers.remove(item);
                count++;}
            if (count==0) System.out.println("Teacher " + firstName + " " + lastName +
                    " not found\");");

        } 
    }

    public void TeachersSortByName(){
        this.teachers.sort(new UserComparator<Teacher>());
    }


}
