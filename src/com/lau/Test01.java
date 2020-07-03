package com.lau;

import jdk.jshell.SourceCodeAnalysis;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Willy Lau
 * @create 7/2/2020 10:39 PM
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        String[] names = {"a", "b", "c"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[i] = " + names[i]);
        }
        System.out.println("=========================");
        for (String name : names) {
            System.out.println("name = " + name);
        }

        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        for (Integer integer : list) {
            
        }


    }
}
