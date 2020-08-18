package Esame3072018;

import java.lang.reflect.Field;

public class PointerUtils {

    public static void change(Object p) {
        Class<?> pClass=p.getClass();
        try {
            Field val = pClass.getDeclaredField("val");
            val.set(p,new Object());
        }
        catch (NoSuchFieldException | IllegalAccessException ignored) {}
    }

}
