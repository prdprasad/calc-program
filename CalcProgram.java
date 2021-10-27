import java.util.*;
class CalcProgram{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("--choose below Options for calucations:--");
		System.out.println("1--Sum of two numbers:");
		System.out.println("2--Sum of three numbers:");
		System.out.println("3--mul of two numbers:");
		System.out.println("4--mul of three numbers:");
		System.out.print("choose function:");
		int num=sc.nextInt();
		
		if(num==1){
			System.out.print("enter first number:");
			int sum1=sc.nextInt();
			System.out.print("enter second number:");
			int sum2=sc.nextInt();
			int sum=sum1+sum2;
			System.out.println("sum of two numbers "+sum1+" and "+sum2+" is="+sum);
		}
		else if(num==2){
			System.out.print("enter first number:");
			int sum3=sc.nextInt();
			System.out.print("enter second number:");
			int sum4=sc.nextInt();
			System.out.print("enter third number:");
			int sum5=sc.nextInt();
			int sum6=sum3+sum4+sum5;
			System.out.println("sum of three numbers "+sum3+" ,"+sum4+" ,"+sum5+" is="+sum6);
		}
	    else if(num==3){
		    System.out.print("enter first number:");
			int mul1=sc.nextInt();
			System.out.print("enter second number:");
			int mul2=sc.nextInt();
			int mul=mul1*mul2;
			System.out.println("Multiplication of two numbers "+mul1+" and "+mul2+" is="+mul);
	    }
	    else if(num==4){
		    System.out.print("enter first number:");
			int mul3=sc.nextInt();
			System.out.print("enter second number:");
			int mul4=sc.nextInt();
			System.out.print("enter third number:");
			int mul5=sc.nextInt();
			int mul6=mul3*mul4*mul5;
			System.out.println("Multiplication of two numbers "+mul3+" ,"+mul4+" ,"+mul5+" is="+mul6);
	    }
	    else{
		System.out.println("**wrong input--please choose given options**");
	   }
	}
}