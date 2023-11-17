package aishaMonitor;

public class ChildNodeA {
    private String message;
    private ChildNodeA next;

    public ChildNodeA(String message) {
        setMessage(message);
    }

    public String getMessage(){
        return this.message;
    }

    public ChildNodeA getNextChild(){
        return next;
    }
    public void setMessage(String message){
        this.message = message;
    }

    public void setNextChild(ChildNodeA next) {
        this.next = next;
    }
}
