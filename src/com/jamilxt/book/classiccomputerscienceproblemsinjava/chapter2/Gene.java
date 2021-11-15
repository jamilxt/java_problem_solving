package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author jamilxt
 * @created 10 Nov, 2021
 */
public class Gene {

    public enum Nucleotide {
        A, C, G, T
    }

    public static class Codon implements Comparable<Codon> {
        public final Nucleotide first, second, third;

        private final Comparator<Codon> comparator = Comparator
                .comparing((Codon c) -> c.first)
                .thenComparing((Codon c) -> c.second)
                .thenComparing((Codon c) -> c.third);

        public Codon(String codonStr) {
            first = Nucleotide.valueOf(codonStr.substring(0, 1));
            second = Nucleotide.valueOf(codonStr.substring(1, 2));
            third = Nucleotide.valueOf(codonStr.substring(2, 3));
        }

        @Override
        public int compareTo(Codon other) {
            // first is compared first, then second, etc.
            // IOW first takes precedence over second
            // and second over third
            return comparator.compare(this, other);
        }
    }

    private ArrayList<Codon> codons = new ArrayList<>();

    public Gene(String geneStr) {
        for (int i = 0; i < geneStr.length() - 3; i += 3) {
            codons.add(new Codon(geneStr.substring(i, i + 3)));
        }
    }

    // Linear Search:
    // In the worst case,
    // a linear search will require going through every element in a data structure,
    // so it is of O(n) complexity,
    // where n is the number of elements in the structure.
    public boolean linearContains(Codon key) {
        for (Codon codon : codons) {
            if (codon.compareTo(key) == 0) {
                return true; // found a match
            }
        }
        return false;
    }

    /*
    # Binary search only works on sorted collections

    Once again, like with linear search,
    you would never need to implement binary search yourself because there’s an implementation in the Java standard library.
    Collections.binarySearch() can search any sorted Collection (like a sorted ArrayList).
     */
    public boolean binaryContains(Codon key) {
        ArrayList<Codon> sortedCodons = new ArrayList<>(codons);
        Collections.sort(sortedCodons);
        int low = 0;
        int high = sortedCodons.size() - 1;
        while (low <= high) {               // while there is still a search space
            int middle = (low + high) / 2;
            int comparison = sortedCodons.get(middle).compareTo(key);

            if (comparison < 0) {           // middle codon is less than key
                low = middle + 1;
            } else if (comparison > 0) {    // middle codon is greater than key
                high = middle - 1;
            } else {                        // middle codon is equal to key
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String geneStr = "ACGTGGCTCTCTAACGTACGTACGTACGGGGTTTATATATACCCTAGGACTCCCTTT";
        Gene myGene = new Gene(geneStr);
        Codon acg = new Codon("ACG");
        Codon gat = new Codon("GAT");

        // Linear Search
        System.out.println(myGene.linearContains(acg)); // true
        System.out.println(myGene.linearContains(gat)); // false
//        System.out.println(myGene.codons.contains(acg));
//        System.out.println(myGene.codons.contains(gat));

        // Binary Search
        System.out.println(myGene.binaryContains(acg)); // true
        System.out.println(myGene.binaryContains(gat)); // false
//        System.out.println(Collections.binarySearch(myGene.codons, acg));
//        System.out.println(Collections.binarySearch(myGene.codons, gat));
    }
}
