import aishaMonitor.AishaMonitor;
import lidiaMonitor.LidiaMonitor;

import java.util.Scanner;

public class ToyLibrary {

    private int minute = 1;
    private int openingTime = 9 * 60;
    private int closingTime = 11 * 60;
    private boolean gameStarted = false;

    public boolean withinTheSchedule(){
        int minutesNight = closingTime - openingTime;

        return this.minute <= minutesNight;
    }

    public void startToyLibrary() {

        LidiaMonitor lidiaMonitor = new LidiaMonitor();
        AishaMonitor aishaMonitor = new AishaMonitor();

        Scanner scanner = new Scanner(System.in);


        while (withinTheSchedule()){

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Minuto " + minute + " - ");


            //Probabilidad de llegada niño a lidia
            double childArrivalProbability = Math.random() * 100;
            if (childArrivalProbability <= 60) {
                lidiaMonitor.addChildrenInQueue("");
                System.out.print("Llega 1 niño - ");
            } else {
                System.out.print("No llega nadie - ");
            }



            //Verificar si aisha tiene menos de 5 niños
            //Si tiene menos de 5 agrega el niño de lidia a aisha
            if(aishaMonitor.childrenInRow() < 5){
                String childInLidiaMonitor = lidiaMonitor.firstChild();
                if(childInLidiaMonitor != null){
                    aishaMonitor.addChildrenInQueue(childInLidiaMonitor);
                    lidiaMonitor.removeChildInQueue();
                }
            }


            System.out.println("Niños con lidia: " + lidiaMonitor.childrenInQueue());

            System.out.println("Niños con aisha: " + aishaMonitor.childrenInRow());


            if(aishaMonitor.childrenInRow() >= 5 && !gameStarted){
                aishaMonitor.startGame();
                gameStarted = true;
            }




            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Enter para siguiente minuto, 'e' para salir:");

            String input = scanner.nextLine();
            if ("q".equalsIgnoreCase(input)){
                break;
            }
            minute++;

        }
    }

}
