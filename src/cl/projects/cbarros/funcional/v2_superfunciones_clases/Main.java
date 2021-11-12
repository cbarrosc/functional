package cl.projects.cbarros.funcional.v2_superfunciones_clases;

import cl.projects.cbarros.funcional.v2_superfunciones_clases.clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //Crear lista de enteros
        List<Integer> numeros = Superfunciones.proveer(10, new Aleatorio());
        System.out.println(numeros);
        //Quedarme solo con los pares, en el segundo parametros pasamos el tipo de filtro, pares o impares
        List<Integer> filtrados = Superfunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
        //Obtener el cuadrado de cada numero
        List<Integer> transformados = Superfunciones.transformar(filtrados, new AlCubo());
        //Mostrar cada transformado y retornar lista
        List<Integer> actuados = Superfunciones.actuar(transformados, new Impresor());
        //Mostrar resultado por pantalla y no retornar
        Superfunciones.consumir(transformados, new Impresor());

        //Obtener la suma de los cuadrados
        int total = Superfunciones.reducir(actuados, 1, new Multiplicador());
        System.out.println("Reduccion : "+ total);


    }
}
