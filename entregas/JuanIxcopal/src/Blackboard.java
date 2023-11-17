public class Blackboard {
    private String message;

    //Limpiar pizarra
    public void clearBlackboard(){
        this.message = "";
    }

    //Escribir en la pizarra
    public void WriteOnTheBoard(String message){
        this.message = message;
    }
}
