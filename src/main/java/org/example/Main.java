package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String status = "n";
        String ZZGRACE_CD = "N";
        String ZZRENEW_CD = "y";
        String ZZTYPEBUS_CD = "RENEWAL";
        System.out.println("RENEWAL_FG status from abdapolicy:" + status);
        System.out.println("ZZGRACE_CD status from abdapolicy:" + ZZGRACE_CD);
        System.out.println("ZZRENEW_CD status from abdapolicy:" + ZZRENEW_CD);
        System.out.println("ZZTYPEBUS_CD status from abdapolicy:" + ZZTYPEBUS_CD);
        Boolean b = false;
        Boolean c = false;
        Boolean d = false;
        Boolean e = false;
        if (status != null) {
            if (status.equalsIgnoreCase("Y")) {
                System.out.println("enter the status block:"+status);
                b = true;
            }
        }
        if (ZZTYPEBUS_CD != null) {
            if (ZZTYPEBUS_CD.equalsIgnoreCase("RENEWAL")) {
                System.out.println("enter the ZZTYPEBUS_CD block:"+ZZTYPEBUS_CD);
                c = true;
            }
        }
        if (ZZGRACE_CD != null) {
            if (ZZGRACE_CD.equalsIgnoreCase("Y")) {
                System.out.println("enter the ZZGRACE_CD block:"+ZZGRACE_CD);
                d = true;
            }
        }
        if (ZZRENEW_CD != null) {
            if (ZZRENEW_CD.equalsIgnoreCase("Y")) {
                System.out.println("enter the ZZRENEW_CD block:"+ZZRENEW_CD);
                e = true;
            }
        }
        if (b == true && c == true && d == true && e == true) {
            System.out.println("IN side the if condation i.e not RENEWAL_FG,ZZGRACE_CD,ZZRENEW_CD,ZZRENEW_CD ");

        }



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
            System.out.println("message:" + message);

            String dateTimeString = "2023-07-17 00:00:00.0";


            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, inputFormatter);

            String outputDateString = dateTime.format(outputFormatter).replace("-", "");

            System.out.println("Input Date-Time: " + dateTimeString);
            System.out.println("Output Date: " + outputDateString);

            // Create the Map<String, Object> to store the data
            Map<String, Object> dataMap = new HashMap<>();

            // Populate the map with the provided data
            dataMap.put("ET_SETTLE", "");
            dataMap.put("ET_COINSS", new Object[0]);
            dataMap.put("ET_COINCO", new Object[0]);

            // Populate the list for ET_SBADR
            Map<String, Object> etSbadrData = new HashMap<>();
            etSbadrData.put("COUNTRY", "MY");
            etSbadrData.put("ZZGECODELOG_TT", "");
            etSbadrData.put("PM_ID", "EGIASP000000");
            etSbadrData.put("SUBJECT_ID", 1);
            etSbadrData.put("ZZSTATE_TT", "");
            etSbadrData.put("ZZGECODELAT_TT", "");
            etSbadrData.put("POLICYPRODUCT_ID", 1);
            etSbadrData.put("ADR_CD", "0000050402");
            etSbadrData.put("PRODC_NAME", "Project Site");
            etSbadrData.put("ZZCOUNTRY_CD", "");
            etSbadrData.put("ZZPOST_CODE1", "");
            etSbadrData.put("PRODC_M_NAME", "Project Site");
            etSbadrData.put("COVERAGE_ID", 0);
            etSbadrData.put("ZZSTATE_CD", "");
            etSbadrData.put("ZZBLDNGNUM_TT", "");
            dataMap.put("ET_SBADR", etSbadrData);

            dataMap.put("ET_RESDEPC", new Object[0]);
            dataMap.put("ET_TRANSFER", new Object[0]);
            dataMap.put("ET_AGENT", new Object[0]);
            dataMap.put("ET_EXTENSIONOUT", new Object[0]);
            dataMap.put("ET_DEDCTBL", new Object[0]);

            // Print the dataMap to see the contents (optional)
            System.out.println(dataMap);
            Object arr_cd123 = null;
            if (dataMap.containsKey("ET_SBADR")) {
                Map<String, Object> etSbadr = (Map<String, Object>) dataMap.get("ET_SBADR");
                arr_cd123 = etSbadr.get("ADR_CD");
            } else {
                System.out.println("ET_SBADR not found.");
            }
            System.out.println(" in string formate arr_cd:" + arr_cd123.toString());


        }

    }
}
