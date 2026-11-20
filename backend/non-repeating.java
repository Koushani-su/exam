
import java.util.Scanner;

class NonRepeating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[65536];

        
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                freq[ch]++;
            }
        }

        
        System.out.println("\nCharacter frequencies:");

        boolean[] displayed = new boolean[65536];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ' && !displayed[ch]) {

                System.out.println(ch + " = " + freq[ch]);

                displayed[ch] = true;
            }
        }

        
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ' && freq[ch] == 1) {

                System.out.println(
                    "\nFirst non-repeating character: " + ch
                );

                found = true;
                break;
            }
        }

        
        if (!found) {
            System.out.println(
                "\nAll characters are repeated or no characters found."
            );
        }

        sc.close();
    }
}
