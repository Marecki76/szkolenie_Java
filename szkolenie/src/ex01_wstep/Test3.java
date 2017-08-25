package ex01_wstep;
public class Test3 {
public void changeValue(Date val) {
val.day = 10;
}
public static void main(String[] args) {
Test3 t = new Test3();
Date date = new Date(2017, 1, 24);
t.changeValue(date);
System.out.println(date.day);
}
}