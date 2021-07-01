import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
	Demo d= new Demo();	
	int con;
	Scanner sc=new Scanner(System.in);
	d.login();
	System.out.println("Welcome to HDFC Bank....");
	System.out.println();
	do {
		
	System.out.println("Enter Choice");
	System.out.println("1.Show Balance\n2.Transfer Money\n3.Receive Money\n4:Exit");
	int ch=sc.nextInt();
	
	switch(ch) {
	case 1:d.showBalance();
			break;
	case 2:d.Transfer();
			break;
	case 3:d.Receive();
			break;
	case 4:System.exit(0);
	}
	System.out.println("To continue enter 1");
	 con=sc.nextInt();
	}
	while(con==1);
	}

	

}
