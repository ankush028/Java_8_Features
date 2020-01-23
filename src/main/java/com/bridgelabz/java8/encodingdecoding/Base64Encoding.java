package com.bridgelabz.java8.encodingdecoding;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Encoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
    final String textDate = "Java8 base 64 encoding - decoding ";

        String encodedText = Base64.getEncoder().encodeToString(textDate.getBytes("UTF-8"));
        System.out.println("Encoded Text "+encodedText);

        byte[] decodeArr = Base64.getDecoder().decode(encodedText);
        String decodeText = new String(decodeArr,"UTF-8");
        System.out.println("Decoded Text -> "+decodeText);
    }
}
