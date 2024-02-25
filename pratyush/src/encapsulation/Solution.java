package encapsulation;



public class Solution  extends Empd{

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.getEmpid());
		System.out.println(s.getEmpname());
		System.out.println(s.getEmpmob());
		System.out.println(s.getAcountno());
		
		s.setEmpid(2); 
		s.setEmpname("isha");
		s.setEmpmob(567834);
		s.setAcountno(234);
		
		System.out.println(s.getEmpid());
		System.out.println(s.getEmpname());
		System.out.println(s.getEmpmob());
		System.out.println(s.getAcountno());
	}

}
