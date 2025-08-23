package exemplo.desafio2;

public class SustemaPrincipal {
    public static void main(String[] args) {
            OperacoesMatematicas calc = new Calculadora();

            System.out.println("Somar: " + calc.somar(10, 5));
            System.out.println("Subtrair: " + calc.subtrair(10, 5));
            System.out.println("Multiplicar: " + calc.multiplicar(10, 5));
            System.out.println("Dividir: " + calc.dividir(10, 5));

            System.out.println("Valor de PI: " + OperacoesMatematicas.PI);
            System.out.println("Valor de E: " + OperacoesMatematicas.E);
    }
}
