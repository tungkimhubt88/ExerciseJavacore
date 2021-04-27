import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void getBarCa() throws FileNotFoundException {
        File file = new File("Barca.txt");
        Scanner sc = new Scanner(file);
        List<BarCa> list;
        list = new ArrayList<>();
        System.out.println("Danh sach cau thu : ");
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);


            String str[] = s.split(" - ");
            int id = Integer.parseInt(str[0].trim());
            String name = str[1];
            String p = str[2];
            Position position = Position.valueOf(p);


            list.add(new BarCa(name, id, position));
        }

        list.forEach(System.out::println);

        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        getBarCa();
    }
}
