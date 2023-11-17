package aishaMonitor;

public class AishaMonitor {

    private ChildrenRow childrenRow;
    private Blackboard blackboard = new Blackboard();

    public AishaMonitor(){
        this.childrenRow = new ChildrenRow();
    }

    public void addChildrenInQueue(String message){
        childrenRow.addChildrenRow(message);
    }

    public String firstChildRow(){
        return childrenRow.getFirstChildRow();
    }

    public void removeChildInRow(){
        childrenRow.removeChildFromRow();
    }

    public int childrenInRow(){
        return childrenRow.size();
    }

    private String clearBlackboardAisha(){
        return this.blackboard.clearBlackboard();
    }


    private String deformMessage(String originalMessage) {
        char[] messageArray = originalMessage.toCharArray();
        int length = messageArray.length;

        for (int i = 0; i < 2; i++) {
            int indexToChange = (int) (Math.random() * length);
            char newChar = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
            messageArray[indexToChange] = newChar;
        }

        return new String(messageArray);
    }

    private void showPizarrinToFirstChild(String originalMessage) {
        String deformedMessage = deformMessage(originalMessage);
        System.out.println("Aisha: Muestro mi pizarrín al primer niño: " + deformedMessage);
        childrenRow.updateFirstChildRow(deformedMessage);
    }

    private String messageFirstChild(){
        return this.childrenRow.getFirstChildRow();
    }


    public void startGame(){

        System.out.println("Aisha: Escribo un mensaje de 10 letras en mi pizarrín.");
        System.out.println("Aisha: Escribo un mensaje de 10 letras en mi pizarrín.");

        String message = this.clearBlackboardAisha();
        showPizarrinToFirstChild(message);


        if(childrenInRow() >= 0){
            String messageChild = messageFirstChild();
            System.out.println("Mensaje del primer niño: " + messageChild);
            removeChildInRow();
        }

    }

}
