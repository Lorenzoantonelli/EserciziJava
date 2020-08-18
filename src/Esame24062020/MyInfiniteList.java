package Esame24062020;
import java.util.function.Function;

public class MyInfiniteList<T> implements InfiniteList<T> {

    private final Function<Integer,T> function;

    public MyInfiniteList(Function<Integer,T> function) {
        this.function = function;
    }

    @Override
    //ritorna function(index)
    public T get(Integer index) {
        return function.apply(index);
    }

    @Override
    //Il metodo fmap dei funtori, ritorna un nuovo oggetto di tipo MyInfiniteList che avrà come funzione f(function(x))
    public <R> InfiniteList<R> map(Function<T, R> f) {
        return new MyInfiniteList<R>(function.andThen(f));
    }
}
