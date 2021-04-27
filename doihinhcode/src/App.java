import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();
        team.getAllPlayer();
        team.buildTeam();

        boolean check = true;
        while (check) {
            System.out.println("Do you want to see another option? Type Y or N");
            String option = scanner.nextLine();
            if(option.toUpperCase().equals("Y")){
                check = true;
            }else{
                check = false;
                System.exit(0);
            }
            System.out.println("Lua chon doi hinh: ");
            System.out.println(
                    "Nhap 1 de chon doi hinh 4-3-3 \nNhap 2 de chon doi hinh 4-4-2 \nNhap 3 de chon doi hinh 3-5-2 \n");
            int n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
            case 1:
                team.buildTeam(4, 3, 3);
                break;
            case 2:
                team.buildTeam(4, 4, 2);
                break;
            case 3:
                team.buildTeam(3, 5, 2);
                break;
            default:
                System.out.println("Khong co lua chon nay");
                break;
            }
        }
    }
}
