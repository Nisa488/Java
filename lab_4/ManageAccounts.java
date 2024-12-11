package lab_4;

public class ManageAccounts {

	public static void main(String[] args) {
		        // Hesap1: Sally için $1000 ile oluşturuluyor
		        Account acct1 = new Account(1000, "Sally", 1111);

		        // Hesap2: Joe için $500 ile oluşturuluyor
		        Account acct2 = new Account(500, "Joe", 2222);

		        // Joe'nun hesabına $100 yatırılıyor
		        acct2.deposit(100);

		        // Joe'nun yeni bakiyesi yazdırılıyor (getBalance() kullanılarak)
		        System.out.println("Joe's balance after deposit: $" + acct2.getBalance());

		        // Sally'nin hesabından $50 çekiliyor
		        acct1.withdraw(50);

		        // Sally'nin yeni bakiyesi yazdırılıyor (getBalance() kullanılarak)
		        System.out.println("Sally's balance after withdrawal: $" + acct1.getBalance());

		        // Her iki hesaba da ücret kesiliyor
		        acct1.chargeFee();
		        acct2.chargeFee();

		        // Ücret kesildikten sonra her iki hesabın bakiyeleri yazdırılıyor
		        System.out.println("Sally's balance after fee: $" + acct1.getBalance());
		        System.out.println("Joe's balance after fee: $" + acct2.getBalance());

		        // Joe'nun hesabının adı Joseph olarak değiştiriliyor
		        acct2.changeName("Joseph");

		        // Her iki hesabın da özet bilgileri yazdırılıyor
		        System.out.println("\nAccount Summary:");
		        System.out.println(acct1.toString());
		        System.out.println(acct2.toString());
	}

}
