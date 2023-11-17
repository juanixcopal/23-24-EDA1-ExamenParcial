import java.util.Scanner;

public class ToyLibrary {
    private int minute = 1;
    private int openingTime = 9 * 60;
    private int closingTime = 11 * 60;
    public boolean withinTheSchedule(){
        int minutesNight = closingTime - openingTime;

        return this.minute <= minutesNight;
    }

    public void startToyLibrary() {

        Blackboard playroomBlackboard = new Blackboard();

        AishaMonitor aishaMonitor = new AishaMonitor();
        LidiaMonitor lidiaMonitor = new LidiaMonitor(aishaMonitor);


        Scanner scanner = new Scanner(System.in);

        while (withinTheSchedule()){
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Minuto " + minute + " - ");

            //Probabilidad de llega de un niño
            double childArrivalProbability = Math.random() * 100;
            if (childArrivalProbability <= 60) {
                lidiaMonitor.addChildrenInQueueLidia();
                System.out.println("Llega 1 niño - ");
            } else {
                System.out.println("No llega nadie - ");
            }

            if(aishaMonitor.childrenInRowAisha() > 5){
                //empieza juego
                aishaMonitor.startGame(playroomBlackboard);
            }

            System.out.println("Niños en cola con lidia: " + lidiaMonitor.childrenInQueueLidia());
            System.out.println("Niños con aisha: " + aishaMonitor.childrenInRowAisha());


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
