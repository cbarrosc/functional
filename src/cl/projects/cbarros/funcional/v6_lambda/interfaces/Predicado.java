package cl.projects.cbarros.funcional.v6_lambda.interfaces;

@FunctionalInterface
public interface Predicado<T> {

    boolean test(T valor);
}
