public class LidiaMonitor {
    private ChildrenRow childrenRowInLidia;
    private AishaMonitor aishaMonitor;

    public LidiaMonitor(AishaMonitor aishaMonitor){
        this.childrenRowInLidia = new ChildrenRow();
        this.aishaMonitor = aishaMonitor;
    }

    public void addChildrenInQueueLidia(){
        if(!aishaMonitor.isAishaPlaying()){
            aishaMonitor.addChildrenInRowAisha();
        } else {
            childrenRowInLidia.addChildrenToQueue();
        }
    }

    public int childrenInQueueLidia(){
        return childrenRowInLidia.size();
    }
}
