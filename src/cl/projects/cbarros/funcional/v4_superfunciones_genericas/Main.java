package cl.projects.cbarros.funcional.v4_superfunciones_genericas;

import cl.projects.cbarros.funcional.v4_superfunciones_genericas.interfaces.*;

import java.util.List;
import java.util.Random;

public class  Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //Crear lista de enteros
        List<Integer> numeros = Superfunciones.proveer(10, new Proveedor<>() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        });
        System.out.println(numeros);
        //Quedarme solo con los pares, en el segundo parametros pasamos el tipo de filtro, pares o impares
        List<Integer> filtrados = Superfunciones.filtrar(numeros, new Predicado<>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(filtrados);
        //Obtener el cuadrado de cada numero
        List<Integer> transformados = Superfunciones.transformar(filtrados, new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor*valor;
            }
        });

        Consumidor<Integer> impresor = new Consumidor<>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };

        //Obtener cada numero convertido en cadena
        List<String> convertidosEnCadena=Superfunciones.transformar(filtrados, new Funcion<Integer, String>() {
            @Override
            public String aplicar(Integer valor) {
                return "Valor : "+valor;
            }
        });
        System.out.println(convertidosEnCadena);

        //Mostrar cada transformado y retornar lista
        List<Integer> actuados = Superfunciones.actuar(transformados, impresor);
        //Mostrar resultado por pantalla y no retornar
        Superfunciones.consumir(transformados, impresor);

        //Obtener la suma de los cuadrados
        Integer  total = Superfunciones.reducir (actuados, 0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1+valor2;
            }
        });
        System.out.println("Reduccion : "+ total);


    }
}
