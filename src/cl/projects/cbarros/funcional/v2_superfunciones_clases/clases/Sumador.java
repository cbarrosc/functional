package cl.projects.cbarros.funcional.v2_superfunciones_clases.clases;

import cl.projects.cbarros.funcional.v2_superfunciones_clases.interfaces.FuncionBinaria;

public class Sumador implements FuncionBinaria {

    @Override
    public Integer aplicar(Integer valor1, Integer valor2) {
        return valor1+valor2;
    }
}
