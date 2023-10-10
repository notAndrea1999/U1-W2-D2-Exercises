import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        while (true) {
            try {
                System.out.println("Inserisci un numero intero che rappresenta il numero di elementi da inserire");
                int number = Integer.parseInt(input.nextLine());
                for (int i = 0; i < number; i++) {
                    System.out.println("Inserisci delle parole");
                    String word = input.nextLine();
                    words.add(word);
                }
                break;
            } catch (Exception ex) {
                System.err.println(ex);
            }
        }
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Il set ha " + words.size() + " elementi");

        input.close();
    }
}