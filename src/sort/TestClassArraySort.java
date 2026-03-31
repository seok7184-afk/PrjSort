package sort;

import java.util.Arrays;

class Student implements Comparable<Student>{
	private  int  sno;

	public Student(int sno) {
		super();
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + "]";
	}
	@Override
	public int compareTo(Student s) {
		return this.sno - s.sno;
	}
	
}

public class TestClassArraySort {

	public static void main(String[] args) {
		Student [] studArr = new Student[] {
			new Student(15), new Student(7), new Student(3), 
			new Student(5), new Student(9), new Student(6), 
			new Student(27), new Student(15), new Student(23), 
		};
		
		dispArr(studArr);
		Arrays.sort(studArr);
		dispArr(studArr);

	}

	private static void dispArr(Student[] studArr) {
		for (Student student : studArr) {
			System.out.print(student + " ");
		}
		System.out.println();
	}

}





