package cl.projects.cbarros.funcional.v11_streams;

import java.util.Random;
import java.util.stream.Stream;

public class  Main {

    public static void main(String[] args) {
        new Main();
    }
    Random random = new Random();
    public Main() {

        random.ints(10, 1, 11)
                .boxed()
                .filter(valor -> valor >= 5)
                .sorted(Integer::compareTo)
                .map(NumberUtils::elevarAlCuadrado)
                .map(Descripcion::new)
//                .peek(System.out::println)
                .map(Descripcion::getValue)
                /* .max(Comparator.naturalOrder())
                 .ifPresentOrElse(
                 valor -> System.out.println("Máximo : "+ valor.doubleValue()),
                 () -> System.out.println("No hay máximo porque el flujo está vacio"))*/
               /* .mapToInt(Integer::intValue)
                .sum();*/
//                .reduce(0, Integer::sum);
                .forEach(valor -> System.out.print(valor + " "));

        ;
    }

    public Stream<Integer> getRandomNumbers(Integer size){
        return random.ints(size,0,10).boxed();
    }

    private int randomInt(){
        return random.nextInt(10);
    }

}
