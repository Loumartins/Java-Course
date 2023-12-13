package Cap25.LambdasExpressions.domain;

@FunctionalInterface
public interface Filtro <T>  {
   boolean avaliar(T objeto);
}
