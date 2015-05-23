
package visitamuseo;

import java.util.Random;

public class Visitatore extends Thread {
    
    private String id;
    private Random r;
    
    public Visitatore (String id) {
        this.id = id;
        this.r = new Random();
    }
    
    @Override
    public void run () {
        try {
            boolean visitato = false;
            while (!visitato) {

                Thread.sleep((long) ((r.nextFloat() * r.nextFloat() + 1) * 1000));
                visitato = Museo.visita(id);

                if (visitato) {
                    Thread.sleep((long) ((r.nextFloat() * r.nextFloat() + 1) * 2000));
                    Museo.esci(id);
                }

            }
            System.out.printf("%2d e' uscito!\tPresenti: %s\n" , Integer.valueOf(id), Museo.listaVisitatori.toString());
        }
        catch (InterruptedException IE) {
            //
        }
        
    }
    
}
