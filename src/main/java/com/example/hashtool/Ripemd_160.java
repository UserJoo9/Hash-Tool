package com.example.hashtool;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.util.encoders.Hex;

import java.io.UnsupportedEncodingException;

public class Ripemd_160
{
    public String Hash_Ripemd_160(String input){
        byte[] r = new byte[0];
        try {
            r = input.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        RIPEMD160Digest d = new RIPEMD160Digest();
        d.update (r, 0, r.length);
        byte[] o = new byte[d.getDigestSize()];
        d.doFinal (o, 0);
        return Hex.toHexString(o);
    }
    public static void main (String[] argv) throws Exception
    {
        Ripemd_160 rip =new Ripemd_160();
        System.out.println(rip.Hash_Ripemd_160("hello"));

    }
}
