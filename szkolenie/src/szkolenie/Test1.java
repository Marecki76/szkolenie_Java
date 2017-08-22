package szkolenie;

public class Test1 {
public void changeValue(int val) {
val = 10;
}
public static void main(String[] args) {
Test1 t = new Test1();

int a = 5;
t.changeValue(a);
System.out.println(a);



// ?
}
}