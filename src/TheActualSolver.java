import java.util.Scanner;
import trig.*;
public class TheActualSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Trig solver=new Trig();
		System.out.println("Welcome to the triangle solver.");
		System.out.println("Finding your angles and lengths for you.");
		System.out.println("If you do not have the values just plug-in 0");
		double A = 0;
		double a = 0;
		double B = 0;
		double b = 0;
		double C = 0;
		double c = 0;
		System.out.println("Tell me the value of A");
		A=in.nextDouble();
		System.out.println("Tell me the value of a");
		a=in.nextDouble();
		System.out.println("Tell me the value of B");
		B=in.nextDouble();
		System.out.println("Tell me the value of b");
		b=in.nextDouble();
		System.out.println("Tell me the value of C");
		C=in.nextDouble();
		System.out.println("Tell me the value of c");
		c=in.nextDouble();
		
		if (A==0 && B>0){
			A = B;
			B = 0;
			
		}
		if (B==0 && C>0){
			B = C;
			C=0;
		}
		if (a==0 && b>0){
			a = b;
			b=0;
		}
		if (b==0 && c>0){
			b=c;
			c=0;
		}
		
		
		if (b==0 && C==0 && c==0 ){
			b=solver.sinLawSide(A, a, B);
			
			//After, must fine C and c
		}
		if (B==0 && C==0 && c==0){
			B=solver.sinLawAngle(A, a, b);
			
			//After, must find C and c
		}
		if (a==0 && B==0 && C==0){
			a=solver.cosLawSide(A, b, c);
			
			
			//After, must find B and C
		}
		if (A==0 && B==0 && C==0){
			A=solver.cosLawAngle(a, b, c);
			A=Math.round(A);
			B=Math.acos((Math.pow(c, 2)-Math.pow(a, 2) - Math.pow(b, 2))/(-2*c*a));
			B=Math.round(B);
			C=180-A-B;
			//After, must find B and C

		}
		if (a==0 && b==0 && c==0){
			System.out.println("Must need at least 1 angle to solve.");
		}
		
		System.out.println("The sides are "+a+","+b+","+c);
		System.out.println("The angles are "+A+","+B+","+C);	
		}

}
