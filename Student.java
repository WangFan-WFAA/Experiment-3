package pack1;

public class Student extends People{
	Course information;
	public Student(String num, String name, String sex, Course information){
		super(num, name, sex);
		this.information = information;
	}
	public String toString() {
		return "学生-编号:"+num+" 姓名:"+name+"   性别:"+sex+"\n"+"课程信息:"+information;
	}
}