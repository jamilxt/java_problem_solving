package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1;

import java.util.Stack;

/**
 * @author jamilxt
 * @created 09 Nov, 2021
 */
/*
The "Tower of Hanoi" is a mathematical game or puzzle consisting of three rods/towers and a number of disks of various diameters,
which can slide onto any rod/tower.
The puzzle begins with the disks stacked on one rod in order of decreasing size,
the smallest at the top, thus approximating a conical shape.

Constraints:
1. Only one disc can be moved at a time.
2. The topmost disc of any tower is the only one available for moving.
3. A wider disc can never be atop a narrower disc.
 */
public class Hanoi {
    private final int numberOfDiscs;
    public final Stack<Integer> firstTower = new Stack<>();
    public final Stack<Integer> middleTower = new Stack<>();
    public final Stack<Integer> lastTower = new Stack<>();

    public Hanoi(int numberOfDiscs) {
        this.numberOfDiscs = numberOfDiscs;
        
        // insert all the disc in "firstTower"
        for (int i = 0; i < numberOfDiscs; i++) {
            firstTower.push(i);
        }
    }

    private void move(Stack<Integer> first, Stack<Integer> middle, Stack<Integer> last, int totalDisc) {
        if (totalDisc <= 0) {
            throw new RuntimeException("No disc to move!");
        } else if (totalDisc == 1) {
            // Base Case:
            // 1. moving a single disc to the "last" tower
            middle.push(first.pop());
        } else {
            // Recursive Case:
            // 1. Move the "upper (totalDisc-1) discs" from "first" to "middle" tower,
            // using "last" tower as the step in between
            move(first, last, middle, totalDisc - 1);

            // 2. Move the "single lowest disc" from "first" to "last" tower
            move(first, middle, last, 1);

            // 3. Move the "(n-1) disc" from "middle" to "last" tower,
            // using "first" tower as the step in between
            move(last, middle, first, totalDisc - 1);
        }
    }

    public void solve() {
        move(firstTower, lastTower, middleTower, numberOfDiscs);
    }

    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(3);
        hanoi.solve();
        System.out.println(hanoi.firstTower);    // []
        System.out.println(hanoi.middleTower);   // []
        System.out.println(hanoi.lastTower);     // [0, 1, 2]
    }
}
