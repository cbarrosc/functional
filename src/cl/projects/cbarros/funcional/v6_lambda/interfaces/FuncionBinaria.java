package cl.projects.cbarros.funcional.v6_lambda.interfaces;

@FunctionalInterface
public interface FuncionBinaria<T,U,R> {

    R aplicar(T valor1, U valor2);

}
