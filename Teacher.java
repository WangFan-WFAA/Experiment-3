package pack1;

public class Teacher extends People{
	String teachercourse;
	public Teacher (String num,String name,String sex,String teachercourse) {
		super(num,name,sex);
		this.teachercourse = teachercourse;
	}
	public String toString() {
		return "��ʦ-���:"+num+" ����:"+name+"   �Ա�:"+sex+"\n"+"�γ���Ϣ:"+teachercourse;
	}
}