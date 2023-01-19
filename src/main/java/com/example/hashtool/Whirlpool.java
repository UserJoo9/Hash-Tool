package com.example.hashtool;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

public class Whirlpool {
    public String hash_Whirlpool(String input){

        Security.addProvider(new BouncyCastleProvider());
        MessageDigest crypt = null;
        try {
            crypt = MessageDigest.getInstance("Whirlpool");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        crypt.update(input.getBytes(StandardCharsets.UTF_8));
        return  Hex.toHexString(crypt.digest());

    }
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        Whirlpool wp =new Whirlpool();
        System.out.println(wp.hash_Whirlpool("hello"));
    }
}