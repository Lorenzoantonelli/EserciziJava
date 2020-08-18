package Esame24062020;
import java.util.function.Function;

/**
 * Created by pietrocenciarelli on 23/06/20.
 */
public interface InfiniteList <T> {
    /*
    Una InfiniteList<T> F rappresenta una funzione dagli interi a T, e può essere vista come
    una lista infinita il cui i-esimo elemento è F(i). Il metodo get consente di accedere agli
    elementi della lista: F.get(i) esprime in Java quello che matematicamente abbiamo indicato
    con F(i). Una InfiniteList fornisce anche in metodo map che, data una funzione f: T -> U,
    restituisce una InfiniteList<U>, ovvero una funzione G = this.map(f) dagli interi a U tale
    che G(i) = f(F(i)), dove F è la funzione rappresentata da this. Per chi ha familiarità con
    i funtori, InfiniteList ne è un esempio, e il suo map è analogo a quello di altri funtori,
    come Optional ecc.
    Ad esempio, se this è la InfiniteList<Boolean> che mappa i numeri pari in true e i dispari
    in false, allora questa lista può essere "complementata" passando alla sua map la funzione
    not: Boolean -> Boolean, per cui, ad esempio (this.map(not)).get(42) == false.
     */
    T get (Integer index);
    <U> InfiniteList <U> map (Function <T, U> f);
}
