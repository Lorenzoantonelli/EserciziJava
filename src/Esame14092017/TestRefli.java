package Esame14092017;

/**
 * Created by pietrocenciarelli on 14/09/17.
 */

public class TestRefli {

    static class UnaClasse {
        public UnaClasse (int n) {
        }
    }

    public static void main(String[] args) {
        Refli R = new MyRefli();

        String S = "UnaStringa";
        UnaClasse U = new UnaClasse(7);

        Object result1 = R.echoType(S);

        if (result1 != null) {
            System.out.println(S == result1);
            System.out.println(S.getClass() == result1.getClass());
        }

        Object result2 = R.echoType(U);

        if (result2 != null) {
            System.out.println(U == result2);
            System.out.println(U.getClass() == result2.getClass());
        }

        /*
        Stampa:
        false
        true
        La classe UnaClasse non ha costruttore di default!
         */
    }
}