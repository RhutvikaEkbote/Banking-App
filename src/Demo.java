import java.util.Scanner;

public class Demo {

	Scanner sc = new Scanner(System.in);

	int balance =1000;
	public void login() {
		int count = 3;

		for (int i = 0; i < 3; i++) {
			System.out.println("enter username:");
			String username = sc.next();
			System.out.println("enter password:");
			String password = sc.next();
			if (username.equals("Rhutu") && password.equals("1234")) {
				break;
			} else {
				System.out.println("sorry..Something is Wrong");
				count--;
				if (count == 0) {
					break;
				}
			}
		}
	
	}

	
	
	public void showBalance() {
		
		System.out.println("Your balance is : "+balance);
		
	}
	
	public void Transfer() {
		
		System.out.println("enter amount you have to transfer");
		int amount=sc.nextInt();
		if(balance<amount) {
		System.out.println("Sorry .. you dont have enough money to transfer");	
		}
		else {
		balance=balance-amount;
		System.out.println("amount transfered successfully..");
		System.out.println("your Updated balance is :"+balance);
		}
	}
	
	public void Receive() {
		System.out.println("enter amount you have to transfer");
		int amount=sc.nextInt();	
		balance = balance + amount;
		System.out.println("Your Updated balance is : "+balance);
		
		
	}
	
	
		
  }