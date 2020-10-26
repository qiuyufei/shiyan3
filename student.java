package shiyan3;

public class student extends human{
	String q;
	public student(int Num, String Sex, String Name){
		super(Num, Sex, Name);
	}
	public void showx(){
		System.out.println("学生选课课程为"+q);
	}
}
