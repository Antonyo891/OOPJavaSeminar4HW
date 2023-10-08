import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T>  {
     @Override
    public int compare(T T1,T T2) {
        int resultOfComparing = (T1.getFirstName().toLowerCase().compareTo(T2.getFirstName().toLowerCase()
        ));
        if (resultOfComparing==0)
        resultOfComparing = (T1.getLastName().toLowerCase().compareTo(T2.getLastName().toLowerCase()
        ));
        return resultOfComparing;}

    
}
