package org.example;

import java.util.regex.*;

public class Task2 {
    public static void main(String[] args) {
        //Part 1: Find and return true or false if String contains orderUUID
        String input1 = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";

        boolean result = input1.matches(".*orderUUID.*");

        System.out.println(result);

        // Part 2: Find and return orderUUID substring from string
        String input2 = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";

        Pattern pattern = Pattern.compile("orderUUID=([\\S]+)");
        Matcher matcher = pattern.matcher(input2);

        if (matcher.find()) {
            String orderUUID = matcher.group();
            System.out.println(orderUUID);
        }

        // Part 3: Find and return user email from string
        String input3 = "test 2667843 (test_email@griddynamics.com) test 67483 some string";

        Pattern pattern2 = Pattern.compile("\\(([\\S]+@[\\S]+)\\)");
        Matcher matcher2 = pattern2.matcher(input3);

        if (matcher2.find()) {
            String email = matcher2.group(1);
            System.out.println(email);
        }

        // Part 4: Find and return how many orders were created from this string
        String input4 = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]";

        Pattern pattern3 = Pattern.compile("[\\d]");
        Matcher matcher3 = pattern3.matcher(input4);

        if(matcher3.find()) {
            String orderNumber = matcher3.group();
            System.out.println(orderNumber);
        }

    }
}
