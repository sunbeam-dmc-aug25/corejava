package com.sunbeam.p3;

import java.util.StringTokenizer;

public class Program04 {
    public static void main(String[] args) {
        String s = "www.sunbeaminfo.com/placements";
        StringTokenizer stk = new StringTokenizer(s, "./", true);
        while (stk.hasMoreTokens()) {
            System.out.println(stk.nextToken());
        }
    }
}
