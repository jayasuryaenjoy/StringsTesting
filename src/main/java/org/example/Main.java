package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            String message = "This is a multi-line string.\n" +
                             "It spans multiple lines\n" +
                             "without the need for \\n escape sequence.\n";
            String emailBody = "Body";
            String respUrl = "URL";
            String str = emailBody + " We hope you're doing well.\n" +
                         "\n" +
                         "  We haven't been able to get moving on your proposal, because you still have to complete your KYC verification. This is compulsory as per IRDAI rules.\n" +
                         "\n" +
                         "  To get your KYC done right away, just Click " + respUrl + "\n" +
                         "\n" +
                         "  Anytime you need us, simply call us on our Toll-Free number 180012000 or Landline number 02242312000 (call charges applicable) or write to us at support@hizuno.com.\n" +
                         "\n" +
                         "  Warm regards,\n" +
                         "\n" +
                         "  Team Zuno (Formally known as Edelweiss GI Co. Ltd)\n";
            System.out.println(str);
            System.out.println(message);

            String dateTimeString = "2023-07-17 00:00:00.0";


            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, inputFormatter);

            String outputDateString = dateTime.format(outputFormatter).replace("-", "");

            System.out.println("Input Date-Time: " + dateTimeString);
            System.out.println("Output Date: " + outputDateString);

        }
    }
}