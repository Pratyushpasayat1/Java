package chikup;

public class emp {
String name;
int id;
int sal;
int mob;
emp(String name,int id,int sal,int mob)
{
	this.name=name;
	this.id=id;
	this.sal=sal;
	this.mob=mob;
}
@Override
public String toString() {
return"emp name"+name+"emp id"+id+"emp sal"	+sal+"emp mob"+mob;
}
public static void main(String[] args) {
	emp e=new emp("chiku" ,01, 4000, 635478594);
	emp e1=new emp("liku" ,02, 4001, 635478546);
	emp e2=new emp("siku" ,03, 4002, 635478545);
	emp e3=new emp("piku" ,04, 4003, 635478542);
	System.out.println(e);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
}
}
