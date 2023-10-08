import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> user) {
        for (Teacher item:user){
            System.out.println(item);
        }
    }
    
}
