package szkolenie;

public class Test2 {
public void changeValue(String val) {
val = "pies";
}
public static void main(String[] args) {
Test2 t = new Test2();
String msg = "kot";
t.changeValue(msg);
System.out.println(msg); // ?
}
}