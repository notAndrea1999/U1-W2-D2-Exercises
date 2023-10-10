import exercise3.Rubrica;

import java.util.HashMap;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        HashMap<String, Integer> rubrica = new HashMap();
        Rubrica utente1 = new Rubrica("Stefano", 333222111);
        Rubrica utente2 = new Rubrica("Gianluca", 333444111);
        Rubrica utente3 = new Rubrica("Luca", 333555111);

        inserimentoCoppie(rubrica, utente1);
        inserimentoCoppie(rubrica, utente2);
        inserimentoCoppie(rubrica, utente3);
        System.out.println("Stato della rubrica dopo l'inserimento delle coppie: " + rubrica); // inserimento di coppie

        rimozioneCoppia(rubrica, utente1); // rimozione partendo dal nome
        System.out.println("Nuovo stato della rubrica dopo il remove: " + rubrica);

        ricercaPersonaTramiteNumero(rubrica, utente3); // ricerca persona sapendo il numero

        ricercaNumeroTramiteNome(rubrica, utente2); // ricerca numero sapendo nome

    }

    public static void inserimentoCoppie(HashMap<String, Integer> rubrica, Rubrica utente) {
        rubrica.put(utente.getName(), utente.getTelephonenumber());
    }

    public static void rimozioneCoppia(HashMap<String, Integer> rubrica, Rubrica utente) {
        rubrica.remove(utente.getName());
    }

    public static void ricercaPersonaTramiteNumero(HashMap<String, Integer> rubrica, Rubrica utente) {
        Set<String> keys = rubrica.keySet();
        for (String key : keys) {

            Integer result = rubrica.get(key);
            if (result == utente.getTelephonenumber()) {
                System.out.println("Il numero appertiene a: " + key);
                break;
            }
        }
    }

    public static void ricercaNumeroTramiteNome(HashMap<String, Integer> rubrica, Rubrica utente) {
        System.out.println("La persona di nome " + utente.getName() + " ha il numero: " + rubrica.get(utente.getName()));
    }

}
