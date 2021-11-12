package cl.projects.cbarros.funcional.v9_method_reference_avanzado;

import java.util.Random;

public class  Main {

    public static void main(String[] args) {
        new Main();
    }
    Random random = new Random();
    public Main() {
        Integer total = Flujo.proveer(10, this::randomInt)
                .filtrar(NumberUtils::esPrimo)
                .ordenar(Integer::compareTo)
                .transformar(NumberUtils::elevarAlCuadrado)
                .transformar(Descripcion::new)
                .actuar(System.out::println)
                .transformar(Descripcion::getValue)
                .reducir (0, Integer::sum);

        System.out.println("Reduccion : "+ total);
    }

    private int randomInt(){
        return random.nextInt(10);
    }

}
