import java.util.TreeSet;
import java.util.Set;
import jva.util.Scanner;

public class TreeSetExp1;
   public static void main(String[] args) {
       int number;
       TreeSet<Integer> treeSetInteger = new TreeSet<>();
       Scanner scanner = new Scanner(Syterm.in);

       treeSetInteger.add(0);
       treeSetInteger.add(3);
       treeSetInteger.add(1);
       treeSetInteger.add(4);
       treeSetInteger.add(2);
       treeSetInteger.add(8);

       System.out.println("Các phânf tử trong treeSetInteger: ");
       System.out.println(treeSetInteger);
       System.out.printl("Nhập phần tử cần thêm: ");
       number = scanner.nextInt();

       if (!treeSetInteger.contains(number))
   }