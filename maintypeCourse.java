package pack1;
import java.util.Scanner;
public class maintypeCourse {
	public static void main(String[] args) {
		Course course = null;
		Teacher teachercourse1 = new Teacher("01","赵老师","男","高数" );
		Teacher teachercourse2 = new Teacher("02","王老师","女","英语" );
		Teacher teachercourse3 = new Teacher("03","张老师","女","物理" );
		Teacher teachercourse4 = new Teacher("04","李老师","男","程序设计" );
		 Course course1 = new Course("1", "高数", "教201", "9:40", teachercourse1);//对Course进行实例化
		 Course course2 = new Course("2", "英语", "教202", "10:10", teachercourse2);
		 Course course3 = new Course("3", "物理", "教203", "12:30", teachercourse3);
		 Course course4 = new Course("4", "程序设计", "教300", "16:00", teachercourse4);
		 System.out.println("请输入课程编号（1 2 3 4）:");//打印语句
		 Scanner input = new Scanner(System.in);//实例化类
		 int i = input.nextInt();//输入一个整数
		 switch(i) {
		 case 1:
			 course = course1;
			 break;
		 case 2:
			 course = course2;
			 break;
		 case 3:
			 course = course3;
			 break;
		 case 4:
			 course = course4;
			 break;
		 default:
			 System.out.println("选课失败");
	}
		 System.out.println("选课信息：");
		 Student Studentcourse1 = new Student("010", "王帆", "女", course);
		 System.out.println(Studentcourse1);
		 System.out.println("是否退课?是：1  否：2");
		 Scanner input1 = new Scanner(System.in);
		 int k = input1.nextInt();
		 if(k==1) {
			 course = null;
			 Student Studentcourse2 = new Student("010", "王帆", "女", course);
			 System.out.println("退课成功" +"  "+Studentcourse2+"\n"+"选课结束");
		 }
		 else {
			 System.out.println("选课结束");
		 } 
				 }

}