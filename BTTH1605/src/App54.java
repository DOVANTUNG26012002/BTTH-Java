import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    String name;
    HashSet<String> hashSetString = new HashSet<>(); {

    hashSetString.add("Wilson");
    hashSetString.add("Nike");
    hashSetString.add("Volo");
    hashSetString.add("Kia");
    hashSetString.add("Lenovo");
    hashSetString.add("Lenovo");

    System.out.println("Các phần tử trong hashSetString: ");
    System.out.println("hashSetString");
    System.out.println("Nhập phần tử cần xóa: ");
    name = scanner.nextLine();

    if (hashSetString.contains(name)) {
        hashSetString.remove(name);
        System.out.println("Xóa thành công!");
        System.out.println("Các phần tử còn lại trong hashSetString: ");
        System.out.println(hashSetString);
    }  esle {
        System.out.println("Xóa không thành công!");
    }
  }
}