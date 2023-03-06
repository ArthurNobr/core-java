package javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1658435971122L);// long 1000000
        date.setTime(date.getTime());
        System.out.println(date);
    }
}
