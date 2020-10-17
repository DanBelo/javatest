package dao;

import metier.Account;

public interface Dao {
    public void makeDeposit(float sum);
    public float makeWidraw(float sum);
    public int openAccount(Account acc);
    public Account getAccount(int id);
    public int deleteAccount(Account acc);
    public int editAccount(Account acc);
}
