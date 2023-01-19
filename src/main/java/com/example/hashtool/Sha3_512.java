package com.example.hashtool;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class Sha3_512 {
    public String Hash_sha3_512(String input){

        MessageDigest crypt = null;
        try {
            crypt = MessageDigest.getInstance("SHA3-512");
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
        Sha3_512 h3=new Sha3_512();
        System.out.println(h3.Hash_sha3_512("hello"));
    }
}
