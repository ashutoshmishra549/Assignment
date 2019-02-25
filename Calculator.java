import java.util.*;
public class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Calculator obj=new Calculator();
		int nextoperation=1,flag=1;
		char operator;
		obj.calculate();
		while(flag==1){
			System.out.println("Enter 0 to terminate\nEnter 1 to do next calculation");
			nextoperation = sc.nextInt();
			switch(nextoperation){
				case 0:
				flag=0;
				break;
				case 1:
				obj.calculate();
				break;
				default:
				System.out.println("Wrong Input");
			}
		}
		
	}
	public void calculate(){
		float num1,num2,result;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the operation to perform");
		operator=sc.next().charAt(0);
		System.out.println("Enter the Second number");
		num2=sc.nextInt();
		switch(operator){
			case '+':
			result = num1+num2;
			System.out.printf("result: %.2f\n",result);
			break;
			case '-':
			result = num1-num2;
			System.out.printf("result: %.2f\n",result);
			break;
			case '*':
			result = num1*num2;
			System.out.printf("result: %.2f\n",result);
			break;
			case '/':
			if(num2!=0){
			result = num1/num2;
			System.out.printf("result: %.2f\n",result);
			}
			else
				System.out.println("Can't devide by zero");
			break;
			default:
			System.out.println("Invalid Operator");
		}
	}
}