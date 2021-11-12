package cl.projects.cbarros.funcional.v6_lambda;

import cl.projects.cbarros.funcional.v6_lambda.interfaces.*;

import java.util.Random;

public class  Main {

    public static void main(String[] args) {
        new Main();
    }
    Random random = new Random();
    public Main() {
        Integer total = Flujo.proveer(10, () -> random.nextInt(10))
                .filtrar(valor -> valor % 2 == 0)
                .transformar(valor -> valor*valor)
                .actuar(valor -> System.out.println(valor))
                .reducir (0, (valor1, valor2) -> valor1+valor2);

        System.out.println("Reduccion : "+ total);


    }
}
