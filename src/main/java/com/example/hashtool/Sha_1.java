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

public class Sha_1 {
    public  String Encrypt_sha_1 (String input)
    {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);

            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            // return the HashText
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // Driver code
    public static void main(String args[]) throws
            NoSuchAlgorithmException
    {
        Sha_1 sh1=new Sha_1();
        String s2 = "hello world";
        System.out.println(sh1.Encrypt_sha_1(s2));
    }
}
