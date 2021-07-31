package enumAndException.login;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            login();
        } catch (enumAndException.login.WrongLoginException e) {
            e.printStackTrace();
        }
    }

    public static void login() throws WrongLoginException {
        String login;
        String password = null;
        String confirmPassword = null;

        Scanner scan = null;
        login = scan.nextLine();
        if (login.matches("^.*[^a-zA-Z ]{9}.*$") == true) {
            System.out.println("Login should contains only letters," +
                    " numbers and lower lines");
        }

        int i = Integer.parseInt(login);
        if (i >= 0 && i <= 20) {
            System.out.println("Login has correct long");
        } else {
            System.out.println("test1");
        }

        int j = Integer.parseInt(password);
        if (i >= 0 && i <= 20) {
            System.out.println("Password has correct long");
        } else {
            System.out.println("test1");
        }

        assert confirmPassword != null;
        int k = Integer.parseInt(confirmPassword);

        if (j != k) {
            System.out.println("test2");
        }

    }
}
