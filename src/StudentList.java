import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentList {
	//Wasn't sure how to avoid nullpoint exception without creating a new arraylist here
	//Tried to create the new arraylist in the default constructor with no luck 
	ArrayList<Student> list = new ArrayList<Student>();

	public StudentList() {

	}

	public StudentList(ArrayList<Student> list) {
		super();
		this.list = list;
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	public void readFile(String fileName) {
		try {
			File f = new File(fileName);
			BufferedReader b = new BufferedReader(new FileReader(f));
			String readLine = "";
			int index = 0;
			String[] arr;
			while ((readLine = b.readLine()) != null) {
				if (index != 0) {

					arr = readLine.split(",");
					Student tempStud = new Student();
					tempStud.setFn(arr[0]);
					tempStud.setLn(arr[1]);
					tempStud.setAge(Integer.parseInt(arr[2]));
					tempStud.setHeight(Double.parseDouble(arr[3]));
					tempStud.setTuition(Integer.parseInt(arr[4]));
					tempStud.setDate(arr[5]);
					tempStud.setPhone(Integer.parseInt(arr[6]));
					tempStud.setConduct("Good");
					this.list.add(tempStud);
				}
				index++;
			}
			b.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void changeConduct(String sur, String cond) {
		int marker = 0;
		for (Student st : list) {
			if (st.getLn().equalsIgnoreCase(sur)) {
				st.setConduct(cond);
				marker = 1;
				System.out.println("Conduct changed succesfully for student: " + st.getLn());
			}

		}
		if (marker == 0) {
			System.out.println("The surname you entered was not found in the list");
		}
	}
}
