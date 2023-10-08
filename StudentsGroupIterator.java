import java.util.ArrayList;
import java.util.Iterator;

public class StudentsGroupIterator implements Iterator<Student>
 {
    private ArrayList<Student> students;
    private static int index = 0;


    public StudentsGroupIterator(StudentsGroup studentsGroup) {
        this.students = studentsGroup.getListOfStudent();
    }

    @Override
    public boolean hasNext() {
        if (index>=this.students.size()) {
            index = 0;
            return false;
        }
        return index<this.students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()){ 
            index = 0;
            return null;}
        return this.students.get(index++);            
    }

    public Student previous() {
        if (index==0) {
            index = this.students.size()-1;
            return this.students.get(index);}
        return this.students.get(--index);            
    }
    @Override
    public void remove() {
        if (hasNext()) this.students.remove(index);
        else { index = 0;
            this.students.remove(0);}
    }

}
