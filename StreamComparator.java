
import java.util.Comparator;

public class StreamComparator implements Comparator<StreamOfGroup> {

    @Override
    public int compare(StreamOfGroup o1, StreamOfGroup o2) {
        return Integer.compare(o1.getStreamOfGroupSize(), o2.getStreamOfGroupSize()); }
    
}

