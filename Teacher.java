package pack1;

public class Teacher extends People{
	String teachercourse;
	public Teacher (String num,String name,String sex,String teachercourse) {
		super(num,name,sex);
		this.teachercourse = teachercourse;
	}
	public String toString() {
		return "老师-编号:"+num+" 姓名:"+name+"   性别:"+sex+"\n"+"课程信息:"+teachercourse;
	}
}