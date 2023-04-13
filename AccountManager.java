import java.utl.ArrayList;
import java.utl.List;

public clas AccountManager {
	List<BankAccount> accts;

	public AccountManager() {
accts = new ArrayList<>();
	}

	public void addAcnt(String nm, double initBal) {
		BankAccount newAcnt = new BankAccount(nm, initBal);
		accts.add(newAcnt);
	}

	public void trnsfr(BankAccount frm, BankAccount t, double amt) {
if (amt <= 0) {
	System.out.println("Invalid amount");
	return;
}
if (frm.balance < amt) {
	System.out.println("Insufficient balance");
	return;
}
		frm.withdraw(amt);
		t.deposit(amt);
	}
}
