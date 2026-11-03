public class Drago implements Runnable {
    private String nome;
    int numBattiti;

    public Drago(int numBattiti, String nome) {
        this.numBattiti = numBattiti;
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < numBattiti; i++) {

            if (Thread.currentThread().isInterrupted()) {
                System.out.println(nome + " è stato colpito! Il drago muore.");
                return;
            }

            System.out.println(nome + " si libera nell'aria! Battito " + (i + 1));
        }

        System.out.println(nome + " ha terminato i suoi battiti.");
    }
}
