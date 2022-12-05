public class UserInfo {

    public UserInfo(String name, String surName, double balance, String password) {
        this.name = name;
        this.surName = surName;
        this.balance = balance;
        this.password = password;

    }

    private String name;
    private String surName;
    private double balance;
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains(".")){
            System.out.println("you can not add a symbol when creating a name");
        }else {
            this.name = name;
        }

    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }




    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
