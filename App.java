import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start **************");
        Seminar4HW();
        }
       /*  public static void Seminar4(){
            StudentsGroup studentsGroup1 = new StudentsGroup(111);
        StudentsGroup studentsGroup2 = new StudentsGroup(222);
        StudentsGroup studentsGroup3 = new StudentsGroup(333);
        StudentsGroup studentsGroup4 = new StudentsGroup(444);
        StudentsGroup studentsGroup5 = new StudentsGroup(555);
        List<StudentsGroup> groups = new ArrayList<>(Arrays.asList(studentsGroup1,studentsGroup2,
        studentsGroup3,studentsGroup4,studentsGroup5));
        StudentController studentController = new StudentController();
        studentController.setGroups(groups);
        int count=1;
        for (int i=1;i<6;i++){
            for (int j=1;j<(8-i);j++){
                Student student = new Student("Name" + count, "LastName"+ count, 111*i);
                studentController.create(student);
                count++;}}
        studentController.SendAllStudent();
        System.out.println("************************");
        StudentView studentView = new StudentView();
        studentView.sendOnConsole(studentController.getStudents());
        //studentView.sendOnConsole(studentsGroup2.getListOfStudent());
        System.out.println("************************");
        /* StreamOfGroup stream1 = new StreamOfGroup(studentsGroupsList);
        StreamOfGroup stream2 = new StreamOfGroup(studentsGroupsList2);
        ArrayList<StreamOfGroup> streamOfGroupsList = new ArrayList<>();
        streamOfGroupsList.add(stream1);
        streamOfGroupsList.add(stream2);
        StreamServise streamServise = new StreamServise(streamOfGroupsList);
        System.out.println(streamServise);
        //streamOfGroupsList.sort(new StreamComparator());
        //System.out.println(streamOfGroupsList);
        //streamServise.StreamSort();
        Controller controller = new Controller(streamServise);
        controller.SortStreamOfGroupServise();
        System.out.println(streamServise);
         
        }*/
   
        public static void Seminar4HW(){
        Teacher temp;
        List<StudentsGroup> groups = new ArrayList<>();
        StudentController studentController = new StudentController();
        studentController.setGroups(groups);
        int count=1;
        ArrayList<Teacher> teachers = new ArrayList<>();
        TeacherServise teacherServise = new TeacherServise(teachers);
        TeacherController teacherController = new TeacherController(teacherServise);
        for (int i=1;i<6;i++){
            temp = new Teacher("TeachName" + i,"TeachLastName"+i, 111*i);
            teacherController.create(temp);
            studentController.AddGroup(new StudentsGroup(111*i,
             temp));
            for (int j=1;j<(8-i);j++){
                Student student = new Student("Name" + count, "LastName"+ count, 111*i);
                studentController.create(student);
                count++;}}
        teacherController.SendAllTeacher();
        System.out.println("---------------------");
        //studentController.SendAllStudent();
       //System.out.println("***********************");
        System.out.println(studentController.getGroups());
        System.out.println(teacherServise.getTeachers().size());
        teacherController.EditTeachers("TeachName2","TeachLastName2","TeachLastName7");
        System.out.println("***********************");
        System.out.println(studentController.getGroups());
            }

    }
