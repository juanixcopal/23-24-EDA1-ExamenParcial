package lidiaMonitor;

public class ChildNode {
    private String message;
    private ChildNode next;

    public ChildNode(String message) {
        setMessage(message);
    }

    public String getMessage(){
        return this.message;
    }

    public ChildNode getNextChild(){
        return next;
    }
    public void setMessage(String message){
        this.message = message;
    }

    public void setNextChild(ChildNode next) {
        this.next = next;
    }
}
