package chikup;

public class student {
int id;
student(int id){
	this .id=id;
	
}
@Override
public String toString() {
	return"student id id"+id;
}
public static void main(String[] args) {

	student s=new student(1);
	student s1=new student(2);
	student s2=new student(3);
	student s3=new student(4);
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
}
	
}



