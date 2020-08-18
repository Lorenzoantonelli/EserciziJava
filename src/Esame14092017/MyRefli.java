package Esame14092017;

public class MyRefli implements Refli {

    @Override
    public Object echoType(Object x) {
        Class<?> xClass = x.getClass();
        try {
            return xClass.newInstance();
        } catch (IllegalAccessException ignored) {}
        catch (InstantiationException e) {
            System.out.println("La classe "+xClass.getSimpleName()+" non ha un costruttore di default!");
        }
        return null;
    }
}
