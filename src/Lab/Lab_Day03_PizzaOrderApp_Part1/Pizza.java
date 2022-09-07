package Lab.Lab_Day03_PizzaOrderApp_Part1;

import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

        //note: return stops the method. in this case for example it exits the main method

        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please login before placing the order");

        //create 3 variables name, email(string), account number(int), password and assign values
        String email = "mike@gmail.com";
        int accountNumber = 123; // account number can be between >100 and <1000
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your login type. Email:1, Account Number:2");
        int loginType = scanner.nextInt();

        for (int i = 3; i > 0; ) {
            switch (loginType) {
                case 1:

                    //enter your email
                    System.out.println("Enter your email");
                    String givenEmail = scanner.next();

                    //check if the email address is valid: if @ . available , and   @ is before .
                    int firstSignOfIndex = givenEmail.indexOf('@'); // if @ does mot exist indexOf will return -1
                    int secondSignOfIndex = givenEmail.indexOf('.');
                    boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;

                    if (checkEmail) {
                        System.out.println("Invalid email address");
                        continue;
                    }

                    String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf("."));
                    boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

                    if (!checkDomain) {
                        System.out.println("Invalid domain");
                        continue;
                    }

                    System.out.println("Enter your password: ");
                    String givenPassword = scanner.next();

                    //check if login successful
                    if (email.equals(givenEmail) && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in with email");
                        break;
                    } else { //invalid checking

                        if (i!=1){ //ask again

                        }else{
                            System.out.println("Your account is locked - try again tomorrow");
                            System.exit(2); //close the execution of JVM
                        }

                    }

                case 2:
                    System.out.println("Account number login choosen");
                    break;
            }
            break; // to stop for loop

        }
    }
}
