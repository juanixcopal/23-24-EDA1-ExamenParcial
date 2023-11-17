public class AishaMonitor {
    private ChildrenRow childrenRowInAisha;
    private boolean aishaIsPlaying = false;
    public AishaMonitor(){
        this.childrenRowInAisha = new ChildrenRow();
    }

    public void addChildrenInRowAisha(){
        childrenRowInAisha.addChildrenToRow();
    }

    public int childrenInRowAisha(){
        return childrenRowInAisha.size();
    }

    public boolean isAishaPlaying(){
        return this.aishaIsPlaying;
    }

    public void startGame(Blackboard playroomBlackboard){
        System.out.println("Aisha limpia la pizarra del salón");
        this.aishaIsPlaying = true;
        playroomBlackboard.clearBlackboard();
    }
}
