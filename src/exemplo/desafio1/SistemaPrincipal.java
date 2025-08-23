package exemplo.desafio1;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println("=== Cachorro ===");
        cachorro.emitirSom();
        cachorro.mover();

        System.out.println("\n=== Gato ===");
        gato.emitirSom();
        gato.mover();
    }
}
