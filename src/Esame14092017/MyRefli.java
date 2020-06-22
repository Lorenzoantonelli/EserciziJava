package Esame14092017;

public class MyRefli implements Refli {

    @Override
    public Object echoType(Object x) {
        Class<?> xClass = x.getClass();
        try {
            Object newObj = xClass.newInstance();
            return newObj;
        } catch (IllegalAccessException e) {}
        catch (InstantiationException e) {
            System.out.println("La classe "+xClass.getSimpleName()+" non ha un costruttore di default!");
        }
        return null;
    }
}
