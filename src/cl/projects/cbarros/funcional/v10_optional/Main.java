package cl.projects.cbarros.funcional.v10_optional;

import java.util.Comparator;
import java.util.Random;

public class  Main {

    public static void main(String[] args) {
        new Main();
    }
    Random random = new Random();
    public Main() {
        Flujo.proveer(10, this::randomInt)
                .filtrar(valor -> valor >= 0)
                .ordenar(Integer::compareTo)
                .transformar(NumberUtils::elevarAlCuadrado)
                .transformar(Descripcion::new)
                .actuar(System.out::println)
                .transformar(Descripcion::getValue)
//                .reducir (0, Integer::sum);
                .max(Comparator.naturalOrder()).ifPresentOrElse(
                        valor -> System.out.println("Máximo : "+ valor.doubleValue()),
                        () -> System.out.println("No hay máximo porque el flujo está vacio")
                );
    }


    private int randomInt(){
        return random.nextInt(10);
    }

}
