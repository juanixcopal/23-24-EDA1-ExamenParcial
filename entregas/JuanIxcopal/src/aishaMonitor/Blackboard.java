package aishaMonitor;

import java.util.Random;

public class Blackboard {
    private String message;

    public Blackboard(){
        clearBlackboard();
    }

    public String getMessage(){
        return message;
    }

    public String clearBlackboard(){
        message = generateMessage();
        return message;
        //System.out.println("Se ha limpiado la pizarra. Nuevo mensaje: " + message);
    }

    private String generateMessage(){
        StringBuilder mensaje = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            mensaje.append(generateRandomLetter());
        }
        return mensaje.toString();
    }

    private char generateRandomLetter(){
        Random random = new Random();
        return (char) ('A' + random.nextInt(26));
    }

    public void writeMessageOnBlackboard(String newMessage) {
        // Lógica para escribir un mensaje en la pizarra del salón
        if (newMessage != null) {
            this.message = newMessage;
            System.out.println("Mensaje en la pizarra del salón: " + this.message);
        }
    }
}
