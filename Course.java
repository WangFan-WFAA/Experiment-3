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
		return "�γ̱��:"+num+" �γ�����:"+name+"   ����:"+room+"\n"+"ʱ��:"+time+"\n"+"��ʦ"+tname+"\n";
	}
}