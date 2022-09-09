package opg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TimeTest {

	public static void main(String[] args) {

		MyTime m1 = new MyTime();
		m1.increase();
		m1.increase();
		m1.increase();

		System.out.println(m1);

		try {
			FileOutputStream f_out = new FileOutputStream("mytime.ser");
			ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
			obj_out.writeObject(m1);
			System.out.println("MyTimeSaved:" + m1);
			obj_out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream f_in = new FileInputStream("mytime.ser")) {
			try (ObjectInputStream obj_in = new ObjectInputStream(f_in)) {
				Object obj = obj_in.readObject();
				if (obj instanceof Integer) {
					m1 = (MyTime) obj;
					System.out.println(m1);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		m1.increase();
		m1.increase();

		try (FileOutputStream f_out = new FileOutputStream("mytime.ser")) {
			try (ObjectOutputStream obj_out = new ObjectOutputStream(f_out)) {
				obj_out.writeObject(m1);
				System.out.println("mytime er gemt: " + m1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
