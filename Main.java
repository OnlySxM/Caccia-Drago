import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);

        System.out.println("Inserisci il numero di battiti di ali: ");
        int count = inTastiera.nextInt();

        Thread argo = new Thread(new Drago(count, "Argo"));
        argo.start();

        for (int i = 0; i < count; i++) {
            System.out.println("Main sta osservando il drago... battito " + (i + 1));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main interrotto");
                Thread.currentThread().interrupt();
                break;
            }
        }

        Cacciatore cacciatore = new Cacciatore("Giorgio");
        cacciatore.colpisciDrago(argo);

        try {
            argo.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        inTastiera.close();
    }
}
