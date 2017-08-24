package ex08;
import java.util.*;

public class SystemVariables {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		//p.list(System.out);
		System.out.println(p.getProperty("user.dir"));
		System.out.println(System.getProperty("user.dir"));
	}
}

