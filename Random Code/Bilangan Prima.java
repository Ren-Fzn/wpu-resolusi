import java.util.*;
public class ForLoop_6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Bulat : ");
        int n = sc.nextInt();

        boolean prima = true;

        if (n <= 1) {
            prima = false;
        } else {

            for(int i = 2; i < n; i++) {
                if (n %i == 0) {
                    prima = false;
                    break;
                }
            }

        }

        if (prima) {
            System.out.println(n + " Merupakan Bilangan Prima");
        } else {
            System.out.println(n + " Bukan Bilangan Prima");
        }

    }
}
