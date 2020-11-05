package ru.gasanov.tm;


import java.util.Scanner;
import static ru.gasanov.tm.constant.TerminalConst.*;

public class App {

    public static void main(final String[] args) {
        run(args);
        displayWelcome();
        final Scanner scanner = new Scanner(System.in);
        String command  = "";
        while (!CMD_EXIT.equals(command)){
            command = scanner.nextLine();
            run(command);
        }
    }

    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        final int result = run(param);
        System.exit(result);
    }

    private static int run(final String param) {
        if (param == null) return -1;
        switch (param) {
            case CMD_HELP: return displayHelp();
            case CMD_ABOUT: return displayAbout();
            case CMD_VERSION: return displayVersion();
            case CMD_EXIT: return displayExit();
            default: return displayError();
        }
    }

    private static void displayWelcome() {
        System.out.println("* WELCOME TO TASK MANAGER *");
    }

    public static int displayExit() {
        System.out.println(" Terminate programm");
        return 0;
    }

    private static int  displayAbout() {
        System.out.println("Gasanov Asiman");
        System.out.println("gasanov_ad@nlmk.com");
        return 0;
    }

    private static  int displayError() {
        System.out.println("ERROR! You passed wrong parameters ");
        return -1;
    }

    private static int  displayHelp() {
        System.out.println("version - Display program version.");
        System.out.println("about - Display programm info.");
        System.out.println("help - Display list of terminal commands.");
        return 0;
    }

    private static int  displayVersion() {
        System.out.println("1.0.0");
        return 0;
    }

}
