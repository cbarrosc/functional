package cl.projects.cbarros.funcional.v5_flujo;

import cl.projects.cbarros.funcional.v5_flujo.interfaces.*;

import java.util.Random;

public class  Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        Integer total = Flujo.proveer(10, new Proveedor<Integer>() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        }).filtrar(new Predicado<>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        }).transformar(new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor*valor;
            }
        }).actuar(new Consumidor<>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        }).reducir (0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1+valor2;
            }
        });

        System.out.println("Reduccion : "+ total);


    }
}
