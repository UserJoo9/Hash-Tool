package com.example.hashtool;



import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha3_224 {
    public String Hash_sha3_224(String input){

        MessageDigest crypt = null;
        try {
            crypt = MessageDigest.getInstance("SHA3-224");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        crypt.update(input.getBytes(StandardCharsets.UTF_8));

        byte[] bytes = crypt.digest();
        BigInteger bi = new BigInteger(1, bytes);
        String digest = String.format("%0" + (bytes.length << 1) + "x", bi);

        return digest;
    }
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        Sha3_224 h3=new Sha3_224();
        System.out.println(h3.Hash_sha3_224("hello"));
    }
}

