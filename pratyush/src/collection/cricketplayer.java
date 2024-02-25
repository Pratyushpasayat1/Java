package collection;

import java.util.ArrayList;

public class cricketplayer {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add("kohli");
	l.add("dhoni");
	l.add("rohit");
	l.add("rahul");
	l.add("rahane");
	l.add("siraj");
	l.add("sami");
	l.add("bumrah");
	l.add("bharat");
	l.add("chahal");
	for(int i=l.size()-1;i>=0;i--){
		System.out.println(l.get(i));
		
	}
	for(int j=0;j<=l.size();j++) {
		System.out.println(l.get(j));
	}
	
}
}
