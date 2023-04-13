public class Main {
	public static void main(String[] args) {
    AccountManager mgr=new AccountManager();
 mgr.addAcnt("Alice", 1000);
 mgr.addAcnt("Bob", 500);

		BankAccount aAcnt=mgr.accounts.get(0);
 BankAccount bAcnt=mgr.accounts.get(1);

 mgr.trnsfr(aAcnt, bAcnt, 200);
  System.out.println("Alice's balance: " + aAcnt.balance);
 System.out.println("Bob's balance: " + bAcnt.balance);
}
}
