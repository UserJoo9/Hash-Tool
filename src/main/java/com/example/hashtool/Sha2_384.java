package com.example.hashtool;



import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha2_384 {

    public static byte[] getSHA(String input)
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-384");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

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

    public String Hash_sha2_384(String input)  {

        return toHexString(getSHA(input));
    }

    public static void main(String args[]) throws NoSuchAlgorithmException {

        Sha2_384 h=new Sha2_384();
        System.out.println(h.Hash_sha2_384("hambola"));

    }
}
