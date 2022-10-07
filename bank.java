class Account {
    String name;
    int accNo;
    String accType;
    int balance;
    void display() {
        System.out.println("Acc Name: " + name + "\nAcc No: " + accNo +
            "\nAccType : " + accType +
            "\nAccBalance : " + balance);
    }
    Account() {
        name = null;
        accNo = 0;
        accType = null;
        balance = 0;
    }
    Account(String n, int no, String type, int bal) {
        name = n;
        accNo = no;
        accType = type;
        balance = bal;
    }
    void deposit(int amt) {
        System.out.println("Deposting Rs." + amt);
        balance = balance + amt;
        System.out.println("New Balance");
        showBalance();
    }
    void withdraw(int amt) {
        System.out.println("Withdrawing Rs." + amt);
        if (balance < amt) {
            System.out.println("Not Enough Money");
        } else {
            balance = balance - amt;
            System.out.println("New Balance");
            showBalance();
        }
    }
    void showBalance() {
        System.out.println("AccName : " + name + "\nAccBalance : " + balance);
    }
}
