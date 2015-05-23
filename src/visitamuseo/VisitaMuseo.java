
package visitamuseo;

public class VisitaMuseo {
    
    //@author Pinardi Giacomo
    
    public static void main(String[] args) {
        
        /*
        L'applicazione simula il funzionamento del museo ed e' pertinente con la consegna.
        
        Ma non sono stati utilizzati Monitor di alcun tipo, costrutto synchronized o
        " gestione dei vincoli sulla mutua esclusione e sugli accessi limitati ", perche'
        non sono stato informato del loro funzionamento.
        
        */
        
        for (int i = 1; i < 51; i++) {
            Visitatore v = new Visitatore(String.valueOf(i));
            v.start();
        }
        
    }
    
}
