package com.example.hashtool;





/*
***************************************************************************************************************************
سيبتلك الكومنتات عشان لو حبيت تعرف لازمة كل سطر شيلهم لو مش عاوزهم
___________________________________________________________________________________________________________________________

___________________________________________________________________________________________________________________________
بص علي ال main هتفهم وش ازاي تستخدمه
***************************************************************************************************************************
*/



import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha2_224 {


    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-224");

        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);

        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));

        // Pad with leading zeros
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }

    public String Hash_sha2_224(String input)  {
        String v="";
        try {
             v= toHexString(getSHA(input));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return v;
    }

    public static void main(String args[])
    {

        Sha2_224 h=new Sha2_224();
        System.out.println(h.Hash_sha2_224("hambola"));

    }
}
