package metier;

public interface Bank {
    public Account getAccount(int id);
    public void openAccount(Account acc);
    public void deleteAccount(Account acc);
}

