public class TeacherController implements UserController<Teacher> {
    TeacherServise teacherServise;

    public TeacherController(TeacherServise teacherServise) {
        this.teacherServise = teacherServise;
    }
    public void EditTeachers(String firstName, String lastName, 
                    String newLastName){
        int count = 0;
        Teacher item;
        for (int i=0;i<this.teacherServise.getTeachers().size();i++){
            item = this.teacherServise.getTeachers().get(i);
            if ((item.getFirstName().equalsIgnoreCase(firstName))&&
            (item.getLastName().equalsIgnoreCase(lastName))) {
                item.setLastName(newLastName);
                System.out.println("Teacher "+ item.getFirstName() + 
                " " + item.getLastName() + " edit LastName to "+ 
                item.getLastName());
            count++;}}
        if (count==0) System.out.println("Teacher " + firstName + " " + lastName +
                    " not found\");");
    }

    public void SendAllTeacher(){
        new TeacherView().sendOnConsole(this.teacherServise.getTeachers());
    }

    @Override
    public void create(Teacher t) {
        this.teacherServise.AddTeacher(t);
    }
    
}
