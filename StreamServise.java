import java.util.ArrayList;

public class StreamServise extends StreamComparator{
    private ArrayList<StreamOfGroup> streamOfGroupList;

    public StreamServise(ArrayList<StreamOfGroup> streamOfGroupList) {
        this.streamOfGroupList = streamOfGroupList;
    }
    public void AddStream(StreamOfGroup streamOfGroup){
        this.streamOfGroupList.add(streamOfGroup);
    }
    public void StreamSort (){
        this.streamOfGroupList.sort(new StreamComparator());
    } 

    @Override
    public String toString() {
        return "{" +
            " streamOfGroupList='" + getStreamOfGroupList() + "'" +
            "}";
    }
    private ArrayList<StreamOfGroup> getStreamOfGroupList() {
        return this.streamOfGroupList;
    }

}
