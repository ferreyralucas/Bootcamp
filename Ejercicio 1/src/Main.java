import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String args[])
    {
        //Creo los objetos

        Padre_A a=new Padre_A();
        Hija_B b=new Hija_B();
        Hija_C c=new Hija_C();
        Hija_D d=new Hija_D();

        //Creo un ArrayList  y le agrego los objetos creados

        ArrayList <Padre_A>ListaClases=new ArrayList<Padre_A>();

        ListaClases.add(a);
        ListaClases.add(b);
        ListaClases.add(c);
        ListaClases.add(d);
        ListaClases.trimToSize();

        System.out.println("Hola");

        //Con un foreach recorro el ArrayList

        for (Object i:ListaClases) {
            if (i instanceof Padre_A) {
                System.out.println(((Padre_A) i).WhoIAm());

            }
        }
    }
}
