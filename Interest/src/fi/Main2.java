package fi;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ICalculate obj=(x,y)->(Math.pow(x, y));
		
		double cc=obj.cal(2,5);
		System.out.println(cc);
		System.out.println("--------------");
		System.out.println("--------------");
		
		
		ICalculate2 iobj2=(s)->{
			int n=s.length();
			String str="";
			
			for(int i=0 ; i<n ; i++) {
				
				str=str.concat(s.charAt(i)+" ");
				
			}
			
			System.out.println(str);
		};
		iobj2.cal2("PANSHUL SAXENA");
		
		System.out.println("--------------");
		System.out.println("--------------");
		
		ICalculate3 iobj3=(s1,s2)->{
			if(s1.equals("Panshul") && s2.equals("Admin"))
				return true;
			else 
				return false;
		};
		
		if(iobj3.cal3("Panshul", "Admin"))
			System.out.println("Accepted");
		else
			System.out.println("Invalid Credentials");
		
		System.out.println("--------------");
		System.out.println("--------------");
		
		ICalculate4 iobj4=(x)->{
			int ans=1;
			for(int i=1 ; i<=x ; i++) {
				ans=ans*i;
			}
			return ans;
		};
		int op=iobj4.cal4(5);
		System.out.println("Factorial - "+op);

	}

}
