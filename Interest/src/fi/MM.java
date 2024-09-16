package fi;

public class MM {
	
	public double m1(int x,int y) {
		return Math.pow(x, y);
	}
	public void m2(String s) {
		int n=s.length();
		String str="";
		
		for(int i=0 ; i<n ; i++) {
			
			str=str.concat(s.charAt(i)+" ");
			
		}
		
		System.out.println(str);
	}
	
	public boolean m3(String s1,String s2) {
	
			if(s1.equals("Panshul") && s2.equals("Admin"))
				return true;
			else 
				return false;
		}
	
	public int m4(int x) {
		int ans=1;
		for(int i=1 ; i<=x ; i++) {
			ans=ans*i;
		}
		return ans;
	
	}

}
