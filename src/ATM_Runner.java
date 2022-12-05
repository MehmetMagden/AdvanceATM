import java.util.Scanner;

public class ATM_Runner {

    public static void main(String[] args) {

        DataBaseUptadeClass.dataUpdateMethod();
        System.out.println(DataBase.userDataMap);

        Scanner scan = new Scanner(System.in);
        int enteredCardNo = 0;
        String enteredPassword = "";

        do {
            System.out.println("Please enter your Card Number");
            enteredCardNo = scan.nextInt();

            System.out.println("Please enter your password");
            enteredPassword = scan.next();

            if (DataBase.userDataMap.containsKey(enteredCardNo) && enteredPassword.equals(DataBase.userDataMap.get(enteredCardNo).password)) {
                ATM_Menu(enteredCardNo);
            }

        } while (!DataBase.userDataMap.containsKey(enteredCardNo) || !enteredPassword.equals(DataBase.userDataMap.get(enteredCardNo).password));

    }

    public static void ATM_Menu(int enteredCardNo) {
        Scanner scan = new Scanner(System.in);
        int swtcr = 0;
        System.out.println(DataBase.userDataMap.get(enteredCardNo).name + " " + DataBase.userDataMap.get(enteredCardNo).surName);

        System.out.println("1)Info\n2)Deposit\n3)Withdraw\n4)Send Money\n5)Quit");
        System.out.println("Please Select");
        swtcr = scan.nextInt();
        int money = 0;
        int cardNumberToSend = 0;

        switch (swtcr) {

            case 1:
                System.out.println("Your balance is : " + DataBase.userDataMap.get(enteredCardNo).balance);
                ATM_Menu(enteredCardNo);
                break;

            case 2:
                System.out.println("Your balance is : " + DataBase.userDataMap.get(enteredCardNo).balance);
                System.out.println("Please enter the amount of money you want to deposit");
                money = scan.nextInt();
                DataBase.userDataMap.get(enteredCardNo).balance += money;
                System.out.println("Your balance is : " + DataBase.userDataMap.get(enteredCardNo).balance);
                ATM_Menu(enteredCardNo);
                break;

            case 3:
                System.out.println("Your balance is : " + DataBase.userDataMap.get(enteredCardNo).balance);
                System.out.println("Please enter the amount of money you want to withdraw");
                money = scan.nextInt();

                if (DataBase.userDataMap.get(enteredCardNo).balance >= money) {
                    DataBase.userDataMap.get(enteredCardNo).balance -= money;
                    System.out.println("Your balance is : " + DataBase.userDataMap.get(enteredCardNo).balance);
                } else {
                    System.out.println("You don't have enough money");
                }

                ATM_Menu(enteredCardNo);
                break;

            case 4:
                System.out.println("Your balance is : " + DataBase.userDataMap.get(enteredCardNo).balance);
                System.out.println("Please enter the amount of money you want to send");
                money = scan.nextInt();
                System.out.println("Please enter the receiver's card Number");
                cardNumberToSend = scan.nextInt();

                if (DataBase.userDataMap.get(enteredCardNo).balance >= money) {

                    if (DataBase.userDataMap.containsKey(cardNumberToSend)) {

                        DataBase.userDataMap.get(enteredCardNo).balance -= money;
                        System.out.println("Your balance is : " + DataBase.userDataMap.get(enteredCardNo).balance);

                        DataBase.userDataMap.get(cardNumberToSend).balance += money;

                    } else {
                        System.out.println("wrong card no, we can not send it.");
                    }

                } else {
                    System.out.println("You don't have enough money");
                }

                ATM_Menu(enteredCardNo);
                break;

            case 5:
                System.exit(0);

            case 6:
                System.out.println("Admin Mode on");
                System.out.println(DataBase.userDataMap);
                ATM_Menu(enteredCardNo);
                break;

            default:
                System.out.println("Plese select something from the menu");
                ATM_Menu(enteredCardNo);
                break;
        }

    }

}
