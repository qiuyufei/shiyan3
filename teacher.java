package shiyan3;

public class teacher extends human{
	String w;
	public teacher(int Num, String Sex, String Name){
		super(Num, Sex, Name);
	}
	public void showx(){
		System.out.println("老师选课课程为"+w);
	}
}
