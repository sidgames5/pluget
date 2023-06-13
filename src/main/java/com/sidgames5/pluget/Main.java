package com.sidgames5.pluget;

import com.sidgames5.pluget.commands.instance.Add;
import com.sidgames5.pluget.commands.instance.Remove;

public class Main {
    public static String[] args;
    public static void main(String[] args) {
        Main.args = args;

        switch (args[0]) {
            case "instance":
                switch (args[1]) {
                    case "add" -> Add.execute(args);
                    case "remove" -> Remove.execute(args);
                }
            case "install":
            case "remove":
            case "update":
            case "version":
                System.out.println("PluGet version: " + SharedConstants.VERSION.getFormattedName());
                System.out.println("Java version:   " + Runtime.version().toString());
            case "help":
                System.out.println("PluGet version: " + SharedConstants.VERSION.getFormattedName());
                System.out.println("Java version:   " + Runtime.version().toString());
                System.out.println(
                        "\nType 'pluget help <command>' to get details about a specific command\n" +
                        "pluget instance <add | remove> [params]\n"
                );
        }
    }
}
