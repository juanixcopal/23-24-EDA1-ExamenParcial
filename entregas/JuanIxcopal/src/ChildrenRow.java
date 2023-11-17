public class ChildrenRow {
    private int size = 0;
    private ChildNode first = null;

    public int size(){
        return this.size;
    }

    //Agregar niño en la cola (Lidia y Aisha)
    public void addChildrenToQueue(){
        ChildNode newChild = new ChildNode();
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

    public void addChildrenToRow(){
        ChildNode newChild = new ChildNode();
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

    //Obtener primer niño en la cola (Lidia y Aisha)
    public String getFirstChildQueue(){
        if(this.first != null){
            return this.first.toString();
        }
        return null;
    }

    //Remover primer niño en cola (Lidia)
    public void removeChildFromQueue(){
        if(this.first != null){
            this.first = this.first.getNextChild();
            this.size--;
        }
    }

}
