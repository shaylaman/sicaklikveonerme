import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        int heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz.");
            } else {
                System.out.println("Piknik Yapmaya Gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}