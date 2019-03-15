
public class operations {

	public static double balance = 50000;                  /****************************** INITIAL BALANCE *****************************/

	public static double withdraw(double amount) {
		if (amount <= balance)
			balance = balance - amount;
		else
			System.out.println("error!");
		return balance;
	}

	public static double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public static double getBalance() {
		return balance;
	}

	public static double main(double pin) {
		double z = withdraw(pin);
		return z;
	}

	public static double main2(double pin) {
		double x = deposit(pin);
		return x;
	}

	public static double main3() {
		double y = getBalance();
		return y;
	}

}
