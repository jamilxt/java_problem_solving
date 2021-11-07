package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1.unbreakableencryption;

/**
 * @author jamilxt
 * @created 07 Nov, 2021
 */
public class KeyPair {
    public final byte[] key1;
    public final byte[] key2;

    public KeyPair(byte[] key1, byte[] key2) {
        this.key1 = key1;
        this.key2 = key2;
    }
}
