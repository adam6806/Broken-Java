public class User {
    String n;
    List<BankAccount> uAcnts;

    public User(String nm) {
        n = nm;
        uAcnts = new ArrayList<>();
    }

    public void addAcnt(BankAccount acnt) {
        uAcnts.add(acnt);
    }

    public List<BankAccount> gUsrAcnts() {
        return uAcnts;
    }
}
