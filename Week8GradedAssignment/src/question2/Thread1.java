package question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Thread1  {
	private HashMap<Project, ArrayList<Employee>> projectMap;

	public Thread1(HashMap<Project, ArrayList<Employee>> projectMap) {
		this.projectMap = projectMap;
	}

	public void serializeProjectDetails() throws Exception {
		try {
			FileOutputStream f1=new FileOutputStream("data.txt");
			ObjectOutputStream o1=new ObjectOutputStream(f1);

			o1.writeObject(projectMap);
			System.out.println("Serialized Data :");
			projectMap.forEach((project, employees) -> {
				System.out.print( project + "=");
				System.out.println(employees);
			});
			o1.close();
			f1.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deserializeProjectDetails() throws Exception {
		try {
			FileInputStream f1=new FileInputStream("data.txt");
			ObjectInputStream o1=new ObjectInputStream(f1);

			Map<Project,ArrayList<Employee>> deserializedMap=(Map<Project,ArrayList<Employee>>) o1.readObject();

			System.out.println("DeSerialized Data :");
			deserializedMap.forEach((project, employees) -> {
				System.out.print( project + "=");
				System.out.println(employees);
			});
			o1.close();
			f1.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
