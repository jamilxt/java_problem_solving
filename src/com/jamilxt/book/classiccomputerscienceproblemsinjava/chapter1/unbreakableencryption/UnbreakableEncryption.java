package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1.unbreakableencryption;

import java.util.Random;

/**
 * @author jamilxt
 * @created 07 Nov, 2021
 */
public class UnbreakableEncryption {
    // Generate *lenght* random bytes
    private static byte[] randomKey(int length) {
        byte[] randomKey = new byte[length];
        Random random = new Random();
        random.nextBytes(randomKey);
        return randomKey;
    }

    public static KeyPair encrypt(String original) {
        byte[] originalBytes = original.getBytes();
        byte[] dummyKey = randomKey(originalBytes.length);
        byte[] encryptedKey = new byte[originalBytes.length];
        for (int i = 0; i < originalBytes.length; i++) {
            // XOR every byte
            encryptedKey[i] = (byte) (originalBytes[i] ^ dummyKey[i]);
        }
        return new KeyPair(dummyKey, encryptedKey);
    }

    public static String decrypt(KeyPair keyPair) {
        byte[] decrypted = new byte[keyPair.key1.length];
        for (int i = 0; i < keyPair.key1.length; i++) {
            // XOR every byte
            decrypted[i] = (byte) (keyPair.key1[i] ^ keyPair.key2[i]);
        }
        return new String(decrypted);
    }

    public static void main(String[] args) {
        KeyPair keyPair = encrypt("Jamilur Rahman");
        String result = decrypt(keyPair);
        System.out.println(result);
    }
}
