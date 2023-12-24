package question1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class projectSerial {
	
		ArrayList<Employee> elist1=new ArrayList<Employee>();
		ArrayList<Employee> elist2=new ArrayList<Employee>();
		ArrayList<Employee> elist3=new ArrayList<Employee>();
		
		Map<Project,ArrayList<Employee>> projectm1=new HashMap<>();
		
		void SerialProjectData(Map<Project,ArrayList<Employee>> projectData) {
			
			try {
				FileOutputStream f1=new FileOutputStream("projectData.txt");
				ObjectOutputStream o1=new ObjectOutputStream(f1);
				
				o1.writeObject(projectData);
				o1.close();
				f1.close();
								
				System.out.println("Serialized Map of Project sucessfully");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public static void main(String[] args) {
			Project project1 = new Project("P1","Music Synthesizer",23);
			Project project2 = new Project("P2","Vehicle Movement Tracker",13);
			Project project3 = new Project("P3","Liquid Viscosity Finder",15);

			Employee e1 = new Employee("E001","Harsha","9383993933","RTNagar",1000);
			Employee e2 = new Employee("E002","Harish","9354693933","Jayanagar",2000);
			Employee e3 = new Employee("E003","Meenal","9383976833","Malleswaram",1500);
			
			
			projectSerial projectSerial=new projectSerial(); 

			projectSerial.elist1.add(e1);
			projectSerial.elist1.add(e2);
			projectSerial.elist1.add(e3);


			Employee e4 = new Employee("E004","Sundar","9334593933","Vijayanagar",3000);
			Employee e5 = new Employee("E005","Suman","9383678933","Indiranagar",2000);
			Employee e6 = new Employee("E006","Suma","9385493933","KRPuram",1750);

			projectSerial.elist2.add(e4);
			projectSerial.elist2.add(e5);
			projectSerial.elist2.add(e6);


			Employee e7 = new Employee("E007","Chitra","9383978933","Koramangala",4000);
			Employee e8 = new Employee("E008","Suraj","9383992133","Malleswaram",3000);
			Employee e9 = new Employee("E009","Manu","9345193933","RTNagar",2000);

			projectSerial.elist3.add(e7);
			projectSerial.elist3.add(e8);
			projectSerial.elist3.add(e9);


			projectSerial.projectm1.put(project1, projectSerial.elist1);
			projectSerial.projectm1.put(project2, projectSerial.elist2);
			projectSerial.projectm1.put(project3, projectSerial.elist3);


			projectSerial.SerialProjectData(projectSerial.projectm1);

		}
		
	}
	
	
