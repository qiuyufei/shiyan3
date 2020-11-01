package shiyan3;


import java.text.SimpleDateFormat;
import java.util.Date;

public class List {
public void show() {
	Students a=new Students();
	 Teacher b=new Teacher();
	 Course c=new Course("高等数学");
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式，需谨记。
	 a.setNumber("2020322099");	
		a.setName("邱煜斐");
		a.setSex("男");
		b.setNumber("1");
		b.setName("刘");
		b.setInstruction("高数授课老师");
		c.setNumber("101");
		c.setPalce("教学1-106号楼");
		c.setTeacher("刘伟明");
	 String mName = a.getName();
	 String mNumber = a.getNumber();
	String mSex = a.getSex();
	mName = a.getName();
	mNumber = a.getNumber();
	mSex = a.getSex();
	
	String teachernumber=b.getNumber();
	String teachername = b.getName();
	String teacherclass =b.getInstruction();
	teachername = b.getName();
	teachernumber=b.getNumber();
	teacherclass=b.getInstruction();
	String coursenumber =c.getNumber();
 
	String courseplace =c.getPalce();
	String courseteacher=c.getTeacher();
	coursenumber =c.getNumber();
	courseplace =c.getPalce();
	courseteacher=c.getTeacher();
	  System.out.println("学生选课系统");
	  System.out.println("学号: " + mNumber);
	  System.out.println("姓名: " + mName);
	  System.out.println("性别: " + mSex);
	  a.setClasss("高等数学");
	  String mClass = a.getClasss();
	    System.out.println("选修课为 :" + mClass);
		System.out.println("讲师代码为 :"+teachernumber);
		System.out.println("讲师为 ："+teachername);
		System.out.println("地点位置 :"+teacherclass);
		System.out.println("课程编号 :"+coursenumber);
        System.out.println("课程名为 :"+c);
		System.out.println("课程地点 :"+courseplace);
		System.out.println("上课时间 :"+df.format(new Date()));
		System.out.println("讲师名字为 :"+courseteacher);
        System.out.println("------------------------------------------");
        c.xuanke(a.name);
        System.out.println("------------------------------------------");
	    c.duike(a.name);
    
}
}
