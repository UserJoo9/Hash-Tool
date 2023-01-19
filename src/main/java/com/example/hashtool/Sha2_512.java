package com.example.hashtool;



import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha2_512 {


    public String Hash_sha2_512(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);

            String hashtext;
            for(hashtext = no.toString(16); hashtext.length() < 32; hashtext = "0" + hashtext) {
            }
            return hashtext;
        } catch (NoSuchAlgorithmException var5) {
            throw new RuntimeException(var5);
        }
    }

    public static void main(String[] args) {
        Sha2_512 hash=new Sha2_512();
        System.out.println(hash.Hash_sha2_512("hello"));
    }
}
