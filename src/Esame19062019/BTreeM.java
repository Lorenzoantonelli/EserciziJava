package Esame19062019;

import java.util.function.Function;

public class BTreeM <T>{

    T head;
    BTreeM<T> left;
    BTreeM<T> right;

    public BTreeM(T head, BTreeM<T> left, BTreeM<T> right) throws Exception {
        this.head=head;
        //Xor, grazie Matteo,Tommaso,Andrea,Gorla,Indianini su youtube
        if (left==null && right!=null || left!=null && right==null) throw new Exception("Bad Tree!");
        this.left=left;
        this.right=right;
    }

    public void stampa() {
        System.out.print(head+" ");
        if (left!=null) left.stampaUtil();
        if (right!=null) right.stampaUtil();
        System.out.println();
    }

    public void stampaUtil(){
        System.out.print(head+" ");
        if (left!=null) left.stampaUtil();
        if (right!=null) right.stampaUtil();
    }

    public <R> BTreeM<R> fmap(Function<T,R> f) throws Exception {
        return new BTreeM<>(f.apply(head),(left==null)?null:left.fmap(f),(right==null)?null:right.fmap(f));
    }
}
