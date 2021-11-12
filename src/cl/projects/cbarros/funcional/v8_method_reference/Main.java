package cl.projects.cbarros.funcional.v8_method_reference;

import java.util.Random;

public class  Main {

    public static void main(String[] args) {
        new Main();
    }
    Random random = new Random();
    public Main() {
        Integer total = Flujo.proveer(10, this::randomInt)
                .filtrar(NumberUtils::esPrimo)
                .transformar(NumberUtils::elevarAlCuadrado)
                .actuar(System.out::println)
                .reducir (0, Integer::sum);

        System.out.println("Reduccion : "+ total);
    }

    private int randomInt(){
        return random.nextInt(10);
    }

}
