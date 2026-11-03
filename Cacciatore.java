public class Cacciatore {
    private String nome;

    public Cacciatore(String nome) {
        this.nome = nome;
    }

    public void colpisciDrago(Thread drago) {
        System.out.println(nome + " colpisce il drago!");
        drago.interrupt();
    }
}
