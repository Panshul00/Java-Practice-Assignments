package fi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MM obj=new MM();
		ICalculate iobj=obj::m1;
		
		double cc=iobj.cal(2,5);
		System.out.println(cc);
		System.out.println("--------------");
		System.out.println("--------------");
		ICalculate2 iobj2=obj::m2;
		
		iobj2.cal2("PANSHUL");
		System.out.println("--------------");
		System.out.println("--------------");
		
		ICalculate3 iobj3=obj::m3;
		
		if(iobj3.cal3("Panshul", "Admin"))
			System.out.println("Accepted");
		else
			System.out.println("Invalid Credentials");
		
		System.out.println("--------------");
		System.out.println("--------------");
		
		ICalculate4 iobj4=obj::m4;
		
		int op=iobj4.cal4(7);
		System.out.println("Factorial - "+op);
		
		
		
		

	}

}
