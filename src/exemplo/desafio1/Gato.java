package exemplo.desafio1;

public class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("🐱 Gato: Miau!");
    }

    @Override
    public void mover() {
        System.out.println("🐱 Gato está andando silenciosamente.");
    }
}
