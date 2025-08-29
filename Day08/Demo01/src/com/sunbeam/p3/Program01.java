package com.sunbeam.p3;

import java.util.StringTokenizer;

public class Program01 {
    public static void main(String[] args) {
        String s = "sunbeam infotech pune";
        StringTokenizer stk = new StringTokenizer(s);
        while (stk.hasMoreTokens()) {
            System.out.println(stk.nextToken());
        }
    }
}
