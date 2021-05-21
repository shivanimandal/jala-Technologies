//4.Call argument constructor of current class using this()

class Account {

    String name;
    int balance;

    Account(String n) {
        name = n;
        System.out.println("This is a constructor with single parameter");
    }

    Account(String n, int b) {
        this(n);
        balance = b;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Balance: " + balance);
    }
}

class TestArgConstructor {

    public static void main(String[] args) {
        Account obj = new Account("Aarthi", 5000);
        obj.printInfo();
    }
}