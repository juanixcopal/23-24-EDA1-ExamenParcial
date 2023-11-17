package lidiaMonitor;
public class ChildrenQueue {
    private int size = 0;
    private ChildNode first = null;

    public int size(){
        return this.size;
    }

    public void addChildrenQueue(String message){
        ChildNode newChild = new ChildNode(message);
        if (this.first == null) {
            this.first = newChild;
        } else {
            ChildNode iterator = this.first;
            while (iterator.getNextChild() != null) {
                iterator = iterator.getNextChild();
            }
            iterator.setNextChild(newChild);
        }
        this.size++;
    }

    public String getFirstChild(){
        if(this.first != null){
            return this.first.getMessage();
        }
        return null;
    }

    public void removeChildFromQueue(){
        if(this.first != null){
            this.first = this.first.getNextChild();
            this.size--;
        }
    }
}
