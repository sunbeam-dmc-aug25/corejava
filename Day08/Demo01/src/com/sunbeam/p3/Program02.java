package com.sunbeam.p3;

import java.util.StringTokenizer;

public class Program02 {
    public static void main(String[] args) {
        String s = "www.sunbeaminfo.com";
        StringTokenizer stk = new StringTokenizer(s, ".");
        while (stk.hasMoreTokens()) {
            System.out.println(stk.nextToken());
        }
    }
}
