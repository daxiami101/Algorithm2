import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:/360Downloads/passwd.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String name = input.next();
            String account = input.next();
            String loginPasswd = input.next();
            String paymentCode = input.next();
            System.out.println(name + " " + account + " " + loginPasswd + " " + paymentCode);
        }

        input.close();
    }
}
