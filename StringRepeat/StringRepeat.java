import java.util.Scanner;
public class StringRepeat {
    public static void main(String[] args) {

        //Def. scanner object.
        Scanner sc = new Scanner(System.in);

        //Küsi kasjutajalt int sisestust.

        System.out.print("Enter an integer:");
        int n = sc.nextInt();

        // nextLine. Selgitus hiljem!

        sc.nextLine(); //


        System.out.print("Enter a string:");
        String s = sc.nextLine();


        //Deklareerime repatedStringi main'is
        String repeatedString = repeatString(n, s);
        // Me kasutame all deklareeritud repeatString methodi  et genereerida String repeatedString.
        // P.S Methodi repeatString saaks printida ka otse System.out.println(repeatString(n, S);
        // Seega repeatString(n, S) on toimiv eraldiseisev method call;
        System.out.println(repeatedString);

    }

    public static String repeatString(int n, String s) {
        // StringBuilder is a predefined imported class
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }

        return sb.toString();
        }


    }
