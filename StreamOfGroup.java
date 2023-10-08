import java.util.ArrayList;
import java.util.Iterator;

public class StreamOfGroup implements Iterator<StudentsGroup> {
    private ArrayList<StudentsGroup> streamOfGroup;
    private int index=0;

    public StreamOfGroup(ArrayList<StudentsGroup> streamOfGroup) {
        this.streamOfGroup = streamOfGroup;
    }

    public int getStreamOfGroupSize() {
        return this.streamOfGroup.size();
    }

    public ArrayList<StudentsGroup> getStreamOfGroup() {
        return this.streamOfGroup;
    }

    public void setStreamOfGroup(ArrayList<StudentsGroup> streamOfGroup) {
        this.streamOfGroup = streamOfGroup;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        if (index>=this.streamOfGroup.size()){
            index=0;
            return false;
        } return index<streamOfGroup.size();
    }

    @Override
    public StudentsGroup next() {
    if (!hasNext()) {
        index=0;
        return null;
    }    return this.streamOfGroup.get(index++);
    }

    public StudentsGroup previous() {
        if (index==0) {
            index = this.streamOfGroup.size()-1;
            return this.streamOfGroup.get(index);}
        return this.streamOfGroup.get(--index);            
    }


    @Override
    public String toString() {
        return "{" +
            " streamOfGroup='" + getStreamOfGroup() + "'" +
            ", index='" + getIndex() + "'" +
            "}";
    }

}
