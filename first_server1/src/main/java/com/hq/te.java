package com.hq;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class te {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("hq1");
        a.add("hq2");
//        System.out.println(a.remove("hq1"));
        List<String> yy = a.stream().filter(z -> z.indexOf("2")>=0).collect(Collectors.toList());
        a.removeIf(z -> z.indexOf("2")>=0);
        System.out.println(a);
        System.out.println(yy);
    }

}
