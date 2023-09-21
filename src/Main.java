import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        System.out.println("list a");
        for (int i = 0; i < 5; i++) {
            String list= scanner.nextLine();
            listA.add(list);
        }
        System.out.println("list b");
        for (int i = 0; i < 5; i++) {
            String list2 =scanner.nextLine();
            listB.add(list2);
        }
        System.out.println(listA);
        System.out.println(listB);
        Collections.reverse(listB);
        System.out.println(listB);

        int a = 1;
        for (int i = 0; i < listA.size(); i++) {
            listC.addAll(i,Collections.singleton(listA.get(i)));
        }
        for (int j = 0; j < listB.size(); j++) {
            listC.addAll(a,Collections.singleton(listB.get(j)));
            a+=2;

        }
        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);

    }
}
