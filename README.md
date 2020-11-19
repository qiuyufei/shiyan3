# 计G202 2020322099 邱煜斐
# 实验3

## 实验内容：
    ·业务要求：说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
      对象示例：人员（编号、姓名、性别）
     		教师（编号、姓名、性别、所授课程）
		学生（编号、姓名、性别、所选课程）
		课程（编号、课程名称、上课地点、时间、授课教师）可选择性自行扩展
    ·实验要求
      1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
      2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师）；模拟学生退课操作，再打印课程信息。
      3.编写实验报告。
      
## 实验目的：
    ·初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
    ·掌握面向对象的类设计方法（属性、方法）；
    ·掌握类的继承用法，通过构造方法实例化对象；
    ·学会使用super()，用于实例化子类；
    ·掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 实验过程：
    ·首先在Students.java中创建Personner父类，并赋予其子类可能用到的元素，然后将学生还有老师的类继承（extends）父类并添加特定元素和属性，从而完成Students.java。
    ·然后在LIst.java中使用set方法写入相应信息，在使用get方法调用相应的信息，然后调用并输出输出相应结果，从而达到测试主类，模拟选课，模拟退课，展示信息的操作。
    ·其他具体详情见核心代码环节
## 核心代码：
    ·1，定义父类，继承代码展示：
    ···
    class personner
    public class Students extends Personner{}
    class Teacher extends Personne{}
    ···
    ·2，这里我们需要用到java.text.SimpleDateFormat类的format方法,其中可以指定年月日时分秒的模式字符串格式。
    ···
    import java.text.SimpleDateFormat;
    import java.util.Date;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    ···
    ·3，使用set写入，get调用输出。
## 输出结果：
![](https://github.com/qiuyufei/shiyan3/blob/main/1.png)

## 实验感想：
    ·首先明确了java代码的大框架，明确了子类父类的关系可以使用继承，一个子类只能有一个父类。
    ·其次目前可以比较熟练的使用set和get方法，来达成自己的目的。
    ·然后此次代码的完成在没有思路时完成的很困难，去同学哪里取了不少经，以后会匀出时间去钻研研究。
