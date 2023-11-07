package org.functionalprogramming;

public class CalculatorMain {

	public static void main(String[] args) {
		//logic->for addition functional+lamda expression
		Calculator addition=(num1,num2)->num1+num2;
		Calculator subtraction=(num1,num2)->num1-num2;
		Calculator multiplication=(num1,num2)->num1*num2;
		
		//division->lambda expression/anonymous function(nameless function)
		Calculator division=(num1,num2)->{
			if(num2!=0) {
				return num1/num2;
			}else {
				throw new IllegalArgumentException("Can not divide by zero");
			}
		};	

		//pass the data 
		int sum=addition.calculate(10, 5);
		System.out.println("Addition is: "+sum);
		
		
		int sub=subtraction.calculate(10, 5);
		System.out.println("Subtraction is :"+sub);
		
		int multip=multiplication.calculate(10, 5);
		System.out.println("Multiplication  is :"+multip);
		
		
		try {
			//risky
			int qutoient=division.calculate(10, 0);
			System.out.println("Division is "+qutoient);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
