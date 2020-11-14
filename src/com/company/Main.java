package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String S = "loveleetcode";
        char C = 'e';
        char[] ss=S.toCharArray();
        int start=0;
        int end=0;
        int t=0;
        int []r= new int[S.length()];

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i <S.length() ; i++) {
            if (ss[i] == C) {
                l.add(i);
            }
        }
        for (int i = 0; i <l.size() ; i++) {
            start = l.get(i);
            if (i == l.size() - 1) {
                end = start;
                for (int j = start; j <S.length() ; j++) {
                    r[j]=j-start;
                }
            } else {
                end = l.get(i + 1);
                for (int j = start; j <end ; j++) {
                    r[j]= Math.min(j-start, end-j);
                }
            }

            if (i == 0) {
                for (int j = 0; j < start; j++) {
                    r[j]=start-j;
                }
            }

        }

        for (int i = 0; i <r.length ; i++) {
            System.out.println(r[i]);
        }
    }
}
