
package visitamuseo;

import java.util.ArrayList;

public class Museo {
    
    public static int visitatori;
    public static ArrayList<String> listaVisitatori = new ArrayList<>();
    
    public static boolean visita (String id) {
        if (Museo.visitatori < 5) {
            Museo.visitatori ++;
            Museo.listaVisitatori.add(id);
            System.out.printf("%2d e' entrato!\tPresenti: %s\n" , Integer.valueOf(id), Museo.listaVisitatori.toString());
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void esci (String id) {
        Museo.visitatori --;
        Museo.listaVisitatori.remove(id);
    }
}
