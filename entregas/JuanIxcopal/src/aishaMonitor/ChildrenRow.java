package aishaMonitor;
public class ChildrenRow {
    private int size = 0;

    private ChildNodeA first = null;

    public int size(){
        return this.size;
    }

    public void addChildrenRow(String message){
        ChildNodeA newChild = new ChildNodeA(message);
        if (this.first == null) {
            this.first = newChild;
        } else {
            ChildNodeA iterator = this.first;
            while (iterator.getNextChild() != null) {
                iterator = iterator.getNextChild();
            }
            iterator.setNextChild(newChild);
        }
        this.size++;
    }

    public String getFirstChildRow(){
        if(this.first != null){
            return this.first.getMessage();
        }
        return null;
    }

    public void removeChildFromRow(){
        if(this.first != null){
            this.first = this.first.getNextChild();
            this.size--;
        }
    }

    public void updateFirstChildRow(String newMessage) {
        if (this.first != null) {
            this.first.setMessage(newMessage);
        }
    }

}
