package p170;

import p171.Student;

public class StudentMain {
	public static void main(String[] args) {

		Student stu = new Student("홍길동", 4, "소프트웨어공학");

		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);

		Student stu2 = new Student("이순신", 4, "디자인");

		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);

		Student stu0 = new Student();

	}

}
