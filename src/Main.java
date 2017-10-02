import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String str;
                char a, b;
                str = in.next();
                a = in.next().charAt(0);
                b = in.next().charAt(0);
                System.out.println(str.replace(a, b));
            }
        }