package ru.gasanov.tm;

import static ru.gasanov.tm.constant.TerminalConst.*;

public class App {

    public static void main(final String[] args) {
        run(args);
        displayWelcome();
    }

    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length <1) return;
        final String param = args[0];

        switch (param) {
            case CMD_HELP: displayHelp();
            case CMD_ABOUT: displayAbout();
            case CMD_VERSION: displayVersion();
            default: displayError();
        }
    }

    private static void displayWelcome() {
        System.out.println("* WELCOME TO TASK MANAGER *");
    }


    private static void  displayAbout() {
        System.out.println("Gasanov Asiman");
        System.out.println("gasanov_ad@nlmk.com");
        System.exit(0);
    }

    private static  void displayError() {
        System.out.println("ERROR! You passed wrong parameters ");
        System.exit(-1);
    }

    private static void  displayHelp() {
        System.out.println("version - Display program version.");
        System.out.println("about - Display programm info.");
        System.out.println("help - Display list of terminal commands.");
        System.exit(0);
    }

    private static void  displayVersion() {
        System.out.println("1.0.0");
        System.exit(0);
    }

}
