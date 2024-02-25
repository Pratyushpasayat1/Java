package oops;

public class College extends University {
	
		String cname ="abit";
		void fest() {
			System.out.println("Celebration.");
		}
		public static void main(String[] args) {
			College d=new College();
			System.out.println(d.uname);
			System.out.println(d.cname);
			d.conductexam();
			d.fest();
		}
}
