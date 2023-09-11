package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.DataOutputStream;
import java.io.BufferedReader;

import java.io.InputStreamReader;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        for (int arr : ar) {
            sum = sum + arr;
        }
        System.out.println("Sum of elements: " + sum);
        int add = 0;
        Iterator<Integer> iterator1 = ar.iterator();
        while (iterator1.hasNext()) {
            int current = iterator1.next();
            add += current;
        }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int sum1 = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            sum1 += current;
        }
        System.out.println("Sum of elements: " + sum);
        System.out.println("Sum of elements: " + add);
        System.out.println("Sum of elements: " + sum1);
    }
}


//        if (System.out.printf("10") == null){
//
//        }
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String inputString = scanner.nextLine();
//
//        System.out.println("You entered: " + inputString);
//        System.out.print("Enter a  second string: ");
//        String inputString1 = scanner.nextLine();
//        System.out.println("You entered: " + inputString1);
//        if(inputString.length()<inputString1.length()){ // 5<6
//            System.out.println(inputString+inputString1+inputString);
//        }else{
//            System.out.println(inputString1+inputString+inputString1);
//        }


//        List<BigDecimal> premiumAmountList = new ArrayList<BigDecimal>();
//        BigDecimal amount1 = new BigDecimal("10.0");
//        BigDecimal amount2 = new BigDecimal("11.11");
//        BigDecimal amount3 = new BigDecimal("20.0");
//        BigDecimal amount = BigDecimal.ZERO; // Initialize amount to zero
//        premiumAmountList.add(amount1);
//        premiumAmountList.add(amount2);
//        premiumAmountList.add(amount3);
//        System.out.println(premiumAmountList);
//        for (BigDecimal prem : premiumAmountList) {
//            amount = amount.add(prem); // Fix: Use add method to update amount
//        }
//        System.out.println("amount: " + amount.toString());
//    }
//}


//        try {
//            String jsonString = "{\"IM_ASYNC_MODE\":\"\",\"IM_UNDERWRITER_REF\":{\"PARTICIPATION\":\"5.000000\"},\"IM_HEADER_DATA\":{\"BOOKING_DATE\":\"TueMar2111:34:02GST2023\",\"USER_ID\":\"FAISALP\",\"END_DATE\":\"2023-02-28\",\"SALES_OFFICE\":\"D\",\"DEAL_EXT\":\"\",\"PARTICIPATION_ID\":4116965,\"DEAL_TYPE\":\"001\",\"POLICY_TYPE\":\"AL\",\"GROSS_AMOUNT\":\"25000.00\",\"BROKER\":\"1100000100\",\"STATUS\":\"AC\",\"LLOYDS_RISK_CD\":\"H2\",\"PAYMENT_TERMS\":\"\",\"COMPANY_CODE\":\"DX01\",\"INCEPTION_DATE\":\"2022-03-01\",\"HEADER_DATA_DED\":[{\"DEDUCTION_TYPE\":\"BROK\",\"DEDUCTION_BASIS\":\"GP\",\"DESCRIPTION\":\"Brokerage\",\"PPD_DUE_DATE\":\"\",\"DEDUCTION\":\"5.000000000000\",\"DEDUCTION_AMOUNT\":\"1250.00\"},{\"DEDUCTION_TYPE\":\"IPTA\",\"DEDUCTION_BASIS\":\"GP\",\"DESCRIPTION\":\"InsurancePremiumTax-AviationProductLiability;GeneralLiability\",\"PPD_DUE_DATE\":\"\",\"DEDUCTION\":\"9.000000000000\",\"DEDUCTION_AMOUNT\":\"2250.00\"},{\"DEDUCTION_TYPE\":\"TER\",\"DEDUCTION_BASIS\":\"GP\",\"DESCRIPTION\":\"Fundforthevictimsofterrorism\",\"PPD_DUE_DATE\":\"\",\"DEDUCTION\":\"2.000000000000\",\"DEDUCTION_AMOUNT\":\"500.00\"}],\"LOB\":\"AVIATION\",\"REINSURED\":\"\",\"CURRENCY\":\"USD\",\"EMPLOYEE\":\"1300000000\",\"NET_AMOUNT\":\"23750.00\",\"PAYMENT_METHOD\":\"\",\"INSURED\":\"1100003023\",\"EXT_REF\":\"11000030234116972\",\"HEADER_DATA_INT\":[{\"END_DATE\":\"2023-02-28\",\"START_DATE\":\"2022-03-01\",\"TAX_CODE\":\"\",\"INT_REF\":\"11000030234116972-001\",\"SPLIT_PERCENTAGE\":\"50.000000000000\",\"ELSECO_RISK_CODE\":\"HullAirline\"},{\"END_DATE\":\"2023-02-28\",\"START_DATE\":\"2022-03-01\",\"TAX_CODE\":\"\",\"INT_REF\":\"11000030234116972-002\",\"SPLIT_PERCENTAGE\":\"50.000000000000\",\"ELSECO_RISK_CODE\":\"SparesAirline\"}],\"DEAL\":\"CompassDemo\",\"PAYER\":\"1100000100\",\"POOL\":\"B\",\"RISK_LOCATION_CD\":\"DE\"},\"IT_STAMP\":[{\"ATYPE\":\"BINDER\",\"MEMBER_IPT\":\"\",\"CONTRACTUAL_AMT\":\"6000000.0\",\"ADMIN_PAYABLE\":\"\",\"FRONTER\":\"\",\"STAMP_MEMBER_ID\":\"701613\",\"CLAIMCOLLECTEDFROM_BPID\":\"1100000564\",\"CONTRACTUAL_VL\":\"50.000\",\"INT_REF\":\"11000030234116972-001\",\"MEMBER\":\"1100000081\",\"CLAIMCOLLECTIONTYPE\":\"CLAIMFUND\",\"OWN_VL\":\"50.000\",\"AGREEMENT_ID\":\"189247\",\"PERC_UNDERWRITING\":\"100.0000\",\"FRONTING_AGREEMENT_ID\":\"0\",\"PREMIUMRECEIVER_BPID\":\"1100000564\",\"OWN_AMT\":\"6000000.0\",\"EXPOSED_AMT\":\"6000000.0\",\"STAMP_COMMISION\":[{\"PAY_TO\":\"\",\"FEE\":\"6\",\"ID\":\"ELSECO\",\"BASIS\":\"NP\"},{\"PAY_TO\":\"1100000564\",\"FEE\":\"2\",\"ID\":\"PB\",\"BASIS\":\"ANP\"}],\"UWAY\":\"PB22\",\"EXPOSED_VL\":\"50.000\",\"PERC_CLAIMS\":\"0.0000\"},{\"ATYPE\":\"BINDER\",\"MEMBER_IPT\":\"\",\"CONTRACTUAL_AMT\":\"6000000.0\",\"ADMIN_PAYABLE\":\"\",\"FRONTER\":\"\",\"STAMP_MEMBER_ID\":\"701627\",\"CLAIMCOLLECTEDFROM_BPID\":\"1100000564\",\"CONTRACTUAL_VL\":\"50.000\",\"INT_REF\":\"11000030234116972-001\",\"MEMBER\":\"1100013853\",\"CLAIMCOLLECTIONTYPE\":\"CLAIMFUND\",\"OWN_VL\":\"50.000\",\"AGREEMENT_ID\":\"189247\",\"PERC_UNDERWRITING\":\"100.0000\",\"FRONTING_AGREEMENT_ID\":\"0\",\"PREMIUMRECEIVER_BPID\":\"1100000564\",\"OWN_AMT\":\"6000000.0\",\"EXPOSED_AMT\":\"6000000.0\",\"STAMP_COMMISION\":[{\"PAY_TO\":\"\",\"FEE\":\"6\",\"ID\":\"ELSECO\",\"BASIS\":\"NP\"},{\"PAY_TO\":\"1100000564\",\"FEE\":\"2\",\"ID\":\"PB\",\"BASIS\":\"ANP\"}],\"UWAY\":\"PB22\",\"EXPOSED_VL\":\"50.000\",\"PERC_CLAIMS\":\"0.0000\"},{\"ATYPE\":\"BINDER\",\"MEMBER_IPT\":\"\",\"CONTRACTUAL_AMT\":\"6000000.0\",\"ADMIN_PAYABLE\":\"\",\"FRONTER\":\"\",\"STAMP_MEMBER_ID\":\"701614\",\"CLAIMCOLLECTEDFROM_BPID\":\"1100000564\",\"CONTRACTUAL_VL\":\"50.000\",\"INT_REF\":\"11000030234116972-002\",\"MEMBER\":\"1100000081\",\"CLAIMCOLLECTIONTYPE\":\"CLAIMFUND\",\"OWN_VL\":\"50.000\",\"AGREEMENT_ID\":\"189247\",\"PERC_UNDERWRITING\":\"100.0000\",\"FRONTING_AGREEMENT_ID\":\"0\",\"PREMIUMRECEIVER_BPID\":\"1100000564\",\"OWN_AMT\":\"6000000.0\",\"EXPOSED_AMT\":\"6000000.0\",\"STAMP_COMMISION\":[{\"PAY_TO\":\"\",\"FEE\":\"6\",\"ID\":\"ELSECO\",\"BASIS\":\"NP\"},{\"PAY_TO\":\"1100000564\",\"FEE\":\"2\",\"ID\":\"PB\",\"BASIS\":\"ANP\"}],\"UWAY\":\"PB22\",\"EXPOSED_VL\":\"50.000\",\"PERC_CLAIMS\":\"0.0000\"},{\"ATYPE\":\"BINDER\",\"MEMBER_IPT\":\"\",\"CONTRACTUAL_AMT\":\"6000000.0\",\"ADMIN_PAYABLE\":\"\",\"FRONTER\":\"\",\"STAMP_MEMBER_ID\":\"701628\",\"CLAIMCOLLECTEDFROM_BPID\":\"1100000564\",\"CONTRACTUAL_VL\":\"50.000\",\"INT_REF\":\"11000030234116972-002\",\"MEMBER\":\"1100013853\",\"CLAIMCOLLECTIONTYPE\":\"CLAIMFUND\",\"OWN_VL\":\"50.000\",\"AGREEMENT_ID\":\"189247\",\"PERC_UNDERWRITING\":\"100.0000\",\"FRONTING_AGREEMENT_ID\":\"0\",\"PREMIUMRECEIVER_BPID\":\"1100000564\",\"OWN_AMT\":\"6000000.0\",\"EXPOSED_AMT\":\"6000000.0\",\"STAMP_COMMISION\":[{\"PAY_TO\":\"\",\"FEE\":\"6\",\"ID\":\"ELSECO\",\"BASIS\":\"NP\"},{\"PAY_TO\":\"1100000564\",\"FEE\":\"2\",\"ID\":\"PB\",\"BASIS\":\"ANP\"}],\"UWAY\":\"PB22\",\"EXPOSED_VL\":\"50.000\",\"PERC_CLAIMS\":\"0.0000\"}],\"IT_PREMIUM_PAYMENT_PLAN\":[{\"PREMIUM_ID\":4116978,\"FXED_ER\":\"0\",\"PREMFREQ_START_DT\":\"2022-03-31\",\"PREMIUM_TYPE_CD\":\"DP\",\"STATUS\":\"RE\",\"PREMIUM_DETAILS\":[{\"PREMIUM_ID\":\"4116978\",\"PREMIUM_TYPE_CD\":\"DP\",\"POSTING_DATE\":\"2022-03-01\",\"PAYMENT_DUE_DT\":\"2022-03-31\",\"NET_PREMIUM_AM\":\"11875.00\",\"INSTALLMENT_NO_AM\":\"1\",\"GROSS_PREMIUM_AM\":\"12500.00\",\"PREMIUM_SPLIT\":[{\"ELSECO_RISK_CD\":\"HullAirline\",\"PREMIUM_SPLIT_VL\":\"50.000000000000\",\"PREMIUM_TYPE_CD\":\"DP\",\"PREMIUM_TAXES\":[{\"TAX_RATE_VL\":\"9.000000000000\",\"TAX_AMOUNT\":\"562.50\",\"TAX_PAYABLE_BY_CD\":\"IC\",\"TAX_DEDUCTED\":\"N\",\"APPLICABLE_TAX_CD\":\"IPTA\",\"TAX_BASE_CD\":\"GP\",\"TAX_JURISDICTION_CD\":\"FR\",\"AMT_TAXABLE_PRM\":\"12500.00\",\"ADMINISTERED_BY_CD\":\"MR\"},{\"TAX_RATE_VL\":\"2.000000000000\",\"TAX_AMOUNT\":\"125.00\",\"TAX_PAYABLE_BY_CD\":\"IC\",\"TAX_DEDUCTED\":\"N\",\"APPLICABLE_TAX_CD\":\"TER\",\"TAX_BASE_CD\":\"GP\",\"TAX_JURISDICTION_CD\":\"FR\",\"AMT_TAXABLE_PRM\":\"12500.00\",\"ADMINISTERED_BY_CD\":\"MR\"}],\"INSTALLMENT_NO_AM\":\"1\",\"INTERNAL_REFERENCE_NO\":\"11000030234116972-001\"},{\"ELSECO_RISK_CD\":\"SparesAirline\",\"PREMIUM_SPLIT_VL\":\"50.000000000000\",\"PREMIUM_TYPE_CD\":\"DP\",\"PREMIUM_TAXES\":[{\"TAX_RATE_VL\":\"9.000000000000\",\"TAX_AMOUNT\":\"562.50\",\"TAX_PAYABLE_BY_CD\":\"IC\",\"TAX_DEDUCTED\":\"N\",\"APPLICABLE_TAX_CD\":\"IPTA\",\"TAX_BASE_CD\":\"GP\",\"TAX_JURISDICTION_CD\":\"FR\",\"AMT_TAXABLE_PRM\":\"12500.00\",\"ADMINISTERED_BY_CD\":\"MR\"},{\"TAX_RATE_VL\":\"2.000000000000\",\"TAX_AMOUNT\":\"125.00\",\"TAX_PAYABLE_BY_CD\":\"IC\",\"TAX_DEDUCTED\":\"N\",\"APPLICABLE_TAX_CD\":\"TER\",\"TAX_BASE_CD\":\"GP\",\"TAX_JURISDICTION_CD\":\"FR\",\"AMT_TAXABLE_PRM\":\"12500.00\",\"ADMINISTERED_BY_CD\":\"MR\"}],\"INSTALLMENT_NO_AM\":\"1\",\"INTERNAL_REFERENCE_NO\":\"11000030234116972-002\"}]},{\"PREMIUM_ID\":\"4116978\",\"PREMIUM_TYPE_CD\":\"DP\",\"POSTING_DATE\":\"2022-03-01\",\"PAYMENT_DUE_DT\":\"2022-10-01\",\"NET_PREMIUM_AM\":\"11875.00\",\"INSTALLMENT_NO_AM\":\"2\",\"GROSS_PREMIUM_AM\":\"12500.00\",\"PREMIUM_SPLIT\":[{\"ELSECO_RISK_CD\":\"HullAirline\",\"PREMIUM_SPLIT_VL\":\"50.000000000000\",\"PREMIUM_TYPE_CD\":\"DP\",\"PREMIUM_TAXES\":[{\"TAX_RATE_VL\":\"9.000000000000\",\"TAX_AMOUNT\":\"562.50\",\"TAX_PAYABLE_BY_CD\":\"IC\",\"TAX_DEDUCTED\":\"N\",\"APPLICABLE_TAX_CD\":\"IPTA\",\"TAX_BASE_CD\":\"GP\",\"TAX_JURISDICTION_CD\":\"FR\",\"AMT_TAXABLE_PRM\":\"12500.00\",\"ADMINISTERED_BY_CD\":\"MR\"},{\"TAX_RATE_VL\":\"2.000000000000\",\"TAX_AMOUNT\":\"125.00\",\"TAX_PAYABLE_BY_CD\":\"IC\",\"TAX_DEDUCTED\":\"N\",\"APPLICABLE_TAX_CD\":\"TER\",\"TAX_BASE_CD\":\"GP\",\"TAX_JURISDICTION_CD\":\"FR\",\"AMT_TAXABLE_PRM\":\"12500.00\",\"ADMINISTERED_BY_CD\":\"MR\"}],\"INSTALLMENT_NO_AM\":\"2\",\"INTERNAL_REFERENCE_NO\":\"11000030234116972-001\"},{\"ELSECO_RISK_CD\":\"SparesAirline\",\"PREMIUM_SPLIT_VL\":\"50.000000000000\",\"PREMIUM_TYPE_CD\":\"DP\",\"PREMIUM_TAXES\":[{\"TAX_RATE_VL\":\"9.000000000000\",\"TAX_AMOUNT\":\"562.50\",\"TAX_PAYABLE_BY_CD\":\"IC\",\"TAX_DEDUCTED\":\"N\",\"APPLICABLE_TAX_CD\":\"IPTA\",\"TAX_BASE_CD\":\"GP\",\"TAX_JURISDICTION_CD\":\"FR\",\"AMT_TAXABLE_PRM\":\"12500.00\",\"ADMINISTERED_BY_CD\":\"MR\"},{\"TAX_RATE_VL\":\"2.000000000000\",\"TAX_AMOUNT\":\"125.00\",\"TAX_PAYABLE_BY_CD\":\"IC\",\"TAX_DEDUCTED\":\"N\",\"APPLICABLE_TAX_CD\":\"TER\",\"TAX_BASE_CD\":\"GP\",\"TAX_JURISDICTION_CD\":\"FR\",\"AMT_TAXABLE_PRM\":\"12500.00\",\"ADMINISTERED_BY_CD\":\"MR\"}],\"INSTALLMENT_NO_AM\":\"2\",\"INTERNAL_REFERENCE_NO\":\"11000030234116972-002\"}]}],\"PREMIUM_AM\":\"23750.00\",\"ENDORSEMENT_REF\":\"\",\"ORIGINAL_CURR\":\"USD\",\"SETTLE_CURR\":\"USD\",\"PRMFREQUENCY_CD\":\"2\",\"PREMIUM_DEDUCTIONS\":[{\"DEDUCTION_TYPE\":\"BROK\",\"PREMIUM_ID\":\"4116978\",\"PREMIUM_TYPE_CD\":\"DP\",\"DEDUCTION_BASIS\":\"GP\",\"DESCRIPTION\":\"Brokerage\",\"NET_PREMIUM_CALC\":\"Y\",\"PPD_DUE_DATE\":\"\",\"ENDORSEMENT_REF\":\"\",\"INSTALLMENT_NO_AM\":\"1\",\"DEDUCTION\":\"50.000000000000\",\"DEDUCTION_AMOUNT\":\"312.50\",\"INTERNAL_REFERENCE_NO\":\"11000030234116972-001\"},{\"DEDUCTION_TYPE\":\"BROK\",\"PREMIUM_ID\":\"4116978\",\"PREMIUM_TYPE_CD\":\"DP\",\"DEDUCTION_BASIS\":\"GP\",\"DESCRIPTION\":\"Brokerage\",\"NET_PREMIUM_CALC\":\"Y\",\"PPD_DUE_DATE\":\"\",\"ENDORSEMENT_REF\":\"\",\"INSTALLMENT_NO_AM\":\"2\",\"DEDUCTION\":\"50.000000000000\",\"DEDUCTION_AMOUNT\":\"312.50\",\"INTERNAL_REFERENCE_NO\":\"11000030234116972-001\"},{\"DEDUCTION_TYPE\":\"BROK\",\"PREMIUM_ID\":\"4116978\",\"PREMIUM_TYPE_CD\":\"DP\",\"DEDUCTION_BASIS\":\"GP\",\"DESCRIPTION\":\"Brokerage\",\"NET_PREMIUM_CALC\":\"Y\",\"PPD_DUE_DATE\":\"\",\"ENDORSEMENT_REF\":\"\",\"INSTALLMENT_NO_AM\":\"1\",\"DEDUCTION\":\"50.000000000000\",\"DEDUCTION_AMOUNT\":\"312.50\",\"INTERNAL_REFERENCE_NO\":\"11000030234116972-002\"},{\"DEDUCTION_TYPE\":\"BROK\",\"PREMIUM_ID\":\"4116978\",\"PREMIUM_TYPE_CD\":\"DP\",\"DEDUCTION_BASIS\":\"GP\",\"DESCRIPTION\":\"Brokerage\",\"NET_PREMIUM_CALC\":\"Y\",\"PPD_DUE_DATE\":\"\",\"ENDORSEMENT_REF\":\"\",\"INSTALLMENT_NO_AM\":\"2\",\"DEDUCTION\":\"50.000000000000\",\"DEDUCTION_AMOUNT\":\"312.50\",\"INTERNAL_REFERENCE_NO\":\"11000030234116972-002\"}]}]}";
//
//            String apiUrl = "https://bbsv8m19t2.execute-api.eu-central-1.amazonaws.com/dev/yel-fm-pqmdeal";
//
//            String apiKey = "QCAO10cgZW4sdqCcb2weR5aAeQAOj8SDa0bXk4GJ";
//
//
//
//            ObjectMapper objectMapper = new ObjectMapper();
//	            Map<String, Object> rfcInput = objectMapper.readValue(jsonString, Map.class);
//            System.out.println("rfcInput after converting the json to map for test:"+rfcInput);
//            String jsonInput =objectMapper.writeValueAsString(rfcInput);
//            System.out.println("json after converting the map to json string :"+jsonInput);
//            URL url = new URL(apiUrl);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("PUT");
//            conn.setRequestProperty("Content-Type", "application/json");
//            conn.setRequestProperty("Authorization", "API Key" + apiKey);
//            conn.setDoOutput(true);
//            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
//                wr.writeBytes(jsonInput);
//            }
//            int responseCode = conn.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            String inputLine;
//            StringBuilder response = new StringBuilder();
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();
//            System.out.println("Response Code: " + responseCode);
//            System.out.println("Response Body: " + response.toString());
//
//            // Close the connection
//            conn.disconnect();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//        String status = "y";
//        String ZZGRACE_CD = "y";
//        String ZZRENEW_CD = "y";
//        String ZZTYPEBUS_CD = "RENEWAL";
//        System.out.println("RENEWAL_FG status from abdapolicy:" + status);
//        System.out.println("ZZGRACE_CD status from abdapolicy:" + ZZGRACE_CD);
//        System.out.println("ZZRENEW_CD status from abdapolicy:" + ZZRENEW_CD);
//        System.out.println("ZZTYPEBUS_CD status from abdapolicy:" + ZZTYPEBUS_CD);
//        Boolean b = false;
//        Boolean c = false;
//        Boolean d = false;
//        Boolean e = false;
//        if (status != null) {
//            if (status.equalsIgnoreCase("Y")) {
//                System.out.println("enter the status block:" + status);
//                b = true;
//            }
//        }
//        if (ZZTYPEBUS_CD != null) {
//            if (ZZTYPEBUS_CD.equalsIgnoreCase("RENEWAL")) {
//                System.out.println("enter the ZZTYPEBUS_CD block:" + ZZTYPEBUS_CD);
//                c = true;
//            }
//        }
//        if (ZZGRACE_CD != null) {
//            if (ZZGRACE_CD.equalsIgnoreCase("Y")) {
//                System.out.println("enter the ZZGRACE_CD block:" + ZZGRACE_CD);
//                d = true;
//            }
//        }
//        if (ZZRENEW_CD != null) {
//            if (ZZRENEW_CD.equalsIgnoreCase("Y")) {
//                System.out.println("enter the ZZRENEW_CD block:" + ZZRENEW_CD);
//                e = true;
//            }
//        }
//        if (b && c && d && e) {
//            System.out.println("IN side the if condation i.e not RENEWAL_FG,ZZGRACE_CD,ZZRENEW_CD,ZZRENEW_CD ");
//
//        }
//
//
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//            String message = "This is a multi-line string.\n" +
//                    "It spans multiple lines\n" +
//                    "without the need for \\n escape sequence.\n";
//            String emailBody = "Body";
//            String respUrl = "URL";
//            String str = emailBody + " We hope you're doing well.\n" +
//                    "\n" +
//                    "  We haven't been able to get moving on your proposal, because you still have to complete your KYC verification. This is compulsory as per IRDAI rules.\n" +
//                    "\n" +
//                    "  To get your KYC done right away, just Click " + respUrl + "\n" +
//                    "\n" +
//                    "  Anytime you need us, simply call us on our Toll-Free number 180012000 or Landline number 02242312000 (call charges applicable) or write to us at support@hizuno.com.\n" +
//                    "\n" +
//                    "  Warm regards,\n" +
//                    "\n" +
//                    "  Team Zuno (Formally known as Edelweiss GI Co. Ltd)\n";
//            System.out.println(str);
//            System.out.println("message:" + message);
//
//            String dateTimeString = "2023-07-17 00:00:00.0";
//
//
//            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
//            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//
//            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, inputFormatter);
//            dateTime.compareTo();
//            String outputDateString = dateTime.format(outputFormatter).replace("-", "");
//
//            System.out.println("Input Date-Time: " + dateTimeString);
//            System.out.println("Output Date: " + outputDateString);
//
//            // Create the Map<String, Object> to store the data
//            Map<String, Object> dataMap = new HashMap<>();
//
//            // Populate the map with the provided data
//            dataMap.put("ET_SETTLE", "");
//            dataMap.put("ET_COINSS", new Object[0]);
//            dataMap.put("ET_COINCO", new Object[0]);
//
//            // Populate the list for ET_SBADR
//            Map<String, Object> etSbadrData = new HashMap<>();
//            etSbadrData.put("COUNTRY", "MY");
//            etSbadrData.put("ZZGECODELOG_TT", "");
//            etSbadrData.put("PM_ID", "EGIASP000000");
//            etSbadrData.put("SUBJECT_ID", 1);
//            etSbadrData.put("ZZSTATE_TT", "");
//            etSbadrData.put("ZZGECODELAT_TT", "");
//            etSbadrData.put("POLICYPRODUCT_ID", 1);
//            etSbadrData.put("ADR_CD", "0000050402");
//            etSbadrData.put("PRODC_NAME", "Project Site");
//            etSbadrData.put("ZZCOUNTRY_CD", "");
//            etSbadrData.put("ZZPOST_CODE1", "");
//            etSbadrData.put("PRODC_M_NAME", "Project Site");
//            etSbadrData.put("COVERAGE_ID", 0);
//            etSbadrData.put("ZZSTATE_CD", "");
//            etSbadrData.put("ZZBLDNGNUM_TT", "");
//            dataMap.put("ET_SBADR", etSbadrData);
//
//            dataMap.put("ET_RESDEPC", new Object[0]);
//            dataMap.put("ET_TRANSFER", new Object[0]);
//            dataMap.put("ET_AGENT", new Object[0]);
//            dataMap.put("ET_EXTENSIONOUT", new Object[0]);
//            dataMap.put("ET_DEDCTBL", new Object[0]);
//
//            // Print the dataMap to see the contents (optional)
//            System.out.println(dataMap);
//            Object arr_cd123 = null;
//            if (dataMap.containsKey("ET_SBADR")) {
//                Map<String, Object> etSbadr = (Map<String, Object>) dataMap.get("ET_SBADR");
//                if (!etSbadr.isEmpty())
//                    System.out.println("ET_SBADR if condition :");
//                arr_cd123 = etSbadr.get("ADR_CD");
//            } else {
//                System.out.println("ET_SBADR not found.");
//            }
//            System.out.println(" in string formate arr_cd:" + arr_cd123.toString());
//
//
//        }
//
//    }
//}
