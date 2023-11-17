package lidiaMonitor;
public class LidiaMonitor {

    private ChildrenQueue childrenQueue;

    public LidiaMonitor(){
        this.childrenQueue = new ChildrenQueue();
    }

    public void addChildrenInQueue(String message){
        childrenQueue.addChildrenQueue(message);
    }

    public String firstChild(){
        return childrenQueue.getFirstChild();
    }

    public void removeChildInQueue(){
        childrenQueue.removeChildFromQueue();
    }

    public int childrenInQueue(){
        return childrenQueue.size();
    }

}
