package exemplo.desafio1;

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Cachorro: Au Au!");
    }

    @Override
    public void mover() {
        System.out.println("Cachorro está correndo.");
    }
}