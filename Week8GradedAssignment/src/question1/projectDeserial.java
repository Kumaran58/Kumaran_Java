package question1;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;

public class projectDeserial {

	void DeSerialProjectData() {
		try {
			FileInputStream f1=new FileInputStream("projectData.txt");
			ObjectInputStream o1=new ObjectInputStream(f1);

			Map<Project,ArrayList<Employee>> deserializedMap=(Map<Project,ArrayList<Employee>>) o1.readObject();

			
			deserializedMap.forEach((project, employees) -> {
				System.out.println("DeSerialized Data :");
				System.out.println("The Project \n" +project+ " Has the following Employees");
				System.out.println("Employees .............");
				System.out.println(employees);
			});

		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		projectDeserial deSerial =new projectDeserial();
		deSerial.DeSerialProjectData();

	}

}
