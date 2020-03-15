/*this program has the user type in a name and a birthday 10 times.  then the user can type in any name and if it was one of
names original entered then the program will tell them the birthday.*/
import java.util.*;

public class BirthDays {
    public static void main(String[] args) {
        String names[] = new String[10];
        String birthdays[] = new String[10];
        Scanner userInput = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print("Enter a name: ");
            String name = userInput.nextLine();
            if (name.equals("ZZZ")) {
            break;
            }
            System.out.print("Enter a birthday: ");
            String birthday = userInput.nextLine();
            names[count] = name;
            birthdays[count] = birthday;
            count++;
            if (count == 10) {
                break;
            }
        }

        System.out.println("Total number of names entered: "+count);
        System.out.println();

        for (int i=0;i<count;i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        while (true) {
            System.out.print("Enter a name: ");
            String name = userInput.nextLine();
            if (name.equals("ZZZ")) {
                break;
            }
            boolean searchFlag = false;
            for (int i=0;i<count;i++) {
                if (names[i].equals(name)){
                    System.out.println("Birth Date: "+birthdays[i]);
                    searchFlag = true;
                    break;
                }
            }
            if (!searchFlag) {
                System.out.println("Sorry, no entry for " + name);
            }
        }
        userInput.close();
    }
}
