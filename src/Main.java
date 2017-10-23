import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// first subtask
        String a;
        System.out.println("Enter a few words:");
        Scanner scn = new Scanner(System.in);
        a = scn.nextLine();
        System.out.println(a);
        System.out.println();
        String b = new StringBuffer(a).reverse().toString();
        System.out.println("New string: " + b);
        System.out.println();

// second subtask
        System.out.println("Splitted string:");
        for (String retval : a.split(" ")) {
            System.out.println(retval);
            System.out.println();
        }

// third subtask
        System.out.println("* instead space:");
        System.out.println(a.replace(" " , "*"));
        System.out.println();

// 4th subtask
        System.out.println("To uppercase:");
        System.out.println(a.toUpperCase());
    }
}
