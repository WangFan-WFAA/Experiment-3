package pack1;

public class Course{
	String num;
	String name;
	String room;
	String time;
	Teacher tname;
	public Course(String num, String name, String room, String time, Teacher tname) {
		this.num = num;
		this.name = name;
		this.room = room;
		this.time = time;
		this.tname = tname;
	}
	public String toString() {
		return "课程编号:"+num+" 课程名称:"+name+"   教室:"+room+"\n"+"时间:"+time+"\n"+"教师"+tname+"\n";
	}
}