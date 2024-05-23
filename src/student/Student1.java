package student;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.roll=1;
		s.name="John";
		s.course="CS";
		s.m1=70;
		s.m2=80;
		s.m3=65;
		
		System.out.println("Total :"+s.total());
		System.out.println("Average :"+s.average());
		
		System.out.println("Details:\n "+s.details());
	}

}
