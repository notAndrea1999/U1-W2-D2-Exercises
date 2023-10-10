import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int number = Integer.parseInt(input.nextLine());
        List<Integer> integerList = funzione1(number);
        System.out.println(integerList);
        evenOdd(integerList, true);
        System.out.println(funzione2(integerList));
    }

    public static List<Integer> funzione1(int number) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Random rndm = new Random();
            intList.add(rndm.nextInt(0, 100));
        }
        Collections.sort(intList);
        return intList;
    }

    public static List<Integer> funzione2(List<Integer> integerList) {
        List<Integer> list2 = new ArrayList<>(integerList);
        Collections.sort(list2, Collections.reverseOrder());
        return list2;
    }

    public static void evenOdd(List<Integer> list, boolean bool) {
        int start;
        if (bool) {
            start = 0;
        } else {
            start = 1;
        }

        for (int i = start; i < list.size(); i = i + 2) {
            System.out.println(list.get(i));
        }
    }

}
