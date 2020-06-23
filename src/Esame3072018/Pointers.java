package Esame3072018;
/**
 * Created by pietrocenciarelli on 03/07/18.
 */
public class Pointers {

    private static class MyPoint {
        public Object val;
        public MyPoint (Object v){
            val = v;
        }
    }

    public static void main(String[] args) {
        Object obj = new Object();
        MyPoint P = new MyPoint(obj);
        System.out.println(obj.equals(P.val));
        PointerUtils.change(P);
        System.out.println(obj.equals(P.val));
    }
}