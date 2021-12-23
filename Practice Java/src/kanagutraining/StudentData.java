package kanagutraining;

public class StudentData {
	
	public static String Studentname(String name)
	{
		return name;
		
	}
	public static int Studentrollno(int num)
	{
		return num;
		
	}
	public static double returnmarks(int eng,double tamil,int maths,int science) 
	{
		double Marks=eng+tamil+maths+science;
		double avg=Marks/4;
		return avg;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student name is "+Studentname("Arun"));
		System.out.println("Student rollno is "+Studentrollno(143));
		System.out.println("Average mark is "+returnmarks(80,78.3,65,70));
		
		

	}

}
