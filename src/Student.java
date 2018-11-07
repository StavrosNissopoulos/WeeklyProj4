import java.util.Comparator;

public class Student implements Comparable<Student> {

	private String fn;
	private String ln;
	private int age;
	private double height;
	private int tuition;
	private String date;
	private int phone;
	private String conduct;

	public Student() {

	}

	public Student(String fn, String ln, int age, double height, int tuition, String date, int phone, String conduct) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.age = age;
		this.height = height;
		this.tuition = tuition;
		this.date = date;
		this.phone = phone;
		this.conduct = conduct;

	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getTuition() {
		return tuition;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getConduct() {
		return conduct;
	}

	public void setConduct(String conduct) {
		this.conduct = conduct;
	}

	@Override
	public String toString() {
		return "Student [First name=" + fn + ", Last name=" + ln + ", Age=" + age + ", Height=" + height + ", Tuition="
				+ tuition + ", Date=" + date + ", Phone=" + phone + ", Conduct=" + conduct + "]";
	}

	// Using Comparable interface to sort by age
	public int compareTo(Student std) {
		return (this.age) - std.getAge();
	}

}
//Using Comparator interface to sort by phone
class SortbyPhone implements Comparator<Student> {

	public int compare(Student a, Student b) {

		return a.getPhone() - b.getPhone();
	}
}
//Using Comparator interface to sort by surname
class SortbySurname implements Comparator<Student> {

	public int compare(Student a, Student b) {
		return (a.getLn().compareTo(b.getLn()));
	}
}
