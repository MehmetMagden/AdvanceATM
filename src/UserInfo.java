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
