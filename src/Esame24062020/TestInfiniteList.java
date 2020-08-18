package Esame24062020;
/**
 * Created by pietrocenciarelli on 23/06/20.
 */
public class TestInfiniteList {
    public static void main(String[] args) {
        InfiniteList <Boolean> lista = new MyInfiniteList<>(i -> (i%2 == 0));
        System.out.println(lista.map(b -> !b).get(42));
        System.out.println(lista.map(b -> !b).get(41));
    }
}
