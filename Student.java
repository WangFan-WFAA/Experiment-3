package pack1;

public class Student extends People{
	Course information;
	public Student(String num, String name, String sex, Course information){
		super(num, name, sex);
		this.information = information;
	}
	public String toString() {
		return "ѧ��-���:"+num+" ����:"+name+"   �Ա�:"+sex+"\n"+"�γ���Ϣ:"+information;
	}
}