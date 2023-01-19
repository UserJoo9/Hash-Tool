package com.example.hashtool;

/*
***************************************************************************************************************************
سيبتلك الكومنتات عشان لو حبيت تعرف لازمة كل سطر شيلهم لو مش عاوزهم
___________________________________________________________________________________________________________________________
ال class كان ستاتك عشان تشغل الميثودث علي طول بس خليتهولك instance عشان ميعملكش مشاكل
___________________________________________________________________________________________________________________________
بص علي ال main هتفهم وش ازاي تستخدمه
***************************************************************************************************************************
*/


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Java program to calculate MD5 hash value
public class MD5 {
    public  String Encrypt_MD5(String input) {
        try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    // how to use
   public static void main(String args[]) throws NoSuchAlgorithmException
   {
       MD5 md5=new MD5();
       String s = "hi joo";
       System.out.println(md5.Encrypt_MD5(s));
   }
}
