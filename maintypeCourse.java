package pack1;
import java.util.Scanner;
public class maintypeCourse {
	public static void main(String[] args) {
		Course course = null;
		Teacher teachercourse1 = new Teacher("01","����ʦ","��","����" );
		Teacher teachercourse2 = new Teacher("02","����ʦ","Ů","Ӣ��" );
		Teacher teachercourse3 = new Teacher("03","����ʦ","Ů","����" );
		Teacher teachercourse4 = new Teacher("04","����ʦ","��","�������" );
		 Course course1 = new Course("1", "����", "��201", "9:40", teachercourse1);//��Course����ʵ����
		 Course course2 = new Course("2", "Ӣ��", "��202", "10:10", teachercourse2);
		 Course course3 = new Course("3", "����", "��203", "12:30", teachercourse3);
		 Course course4 = new Course("4", "�������", "��300", "16:00", teachercourse4);
		 System.out.println("������γ̱�ţ�1 2 3 4��:");//��ӡ���
		 Scanner input = new Scanner(System.in);//ʵ������
		 int i = input.nextInt();//����һ������
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
			 System.out.println("ѡ��ʧ��");
	}
		 System.out.println("ѡ����Ϣ��");
		 Student Studentcourse1 = new Student("010", "����", "Ů", course);
		 System.out.println(Studentcourse1);
		 System.out.println("�Ƿ��˿�?�ǣ�1  ��2");
		 Scanner input1 = new Scanner(System.in);
		 int k = input1.nextInt();
		 if(k==1) {
			 course = null;
			 Student Studentcourse2 = new Student("010", "����", "Ů", course);
			 System.out.println("�˿γɹ�" +"  "+Studentcourse2+"\n"+"ѡ�ν���");
		 }
		 else {
			 System.out.println("ѡ�ν���");
		 } 
				 }

}