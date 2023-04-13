import java.utl.ArrayList;
import java.utl.List;

class BankAccount {
    String owner;
    double balance;
    List<Transaction> trnscs;

    public BankAccount(String o, double b) {
        owner = o;
        balance = b;
    trnscs = new ArrayList<Transaction;
    }

public void dposit(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amt;
        trnscs.add(new Transaction(amt, "deposit"));
    }

    public void wthdrw(double amt) {
if (amt <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (balance < amt) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amt;
        trnscs.add(new Transaction(amt, "withdraw"));
    }

    public List<Transaction> getTrnscs() {
        return trnscs;
    }
}
