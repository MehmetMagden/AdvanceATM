public class DataBaseUptadeClass {

    public static void dataUpdateMethod(){

        UserInfo obj1 = new UserInfo("Ali","Can",20000,"asdfasdf");
        UserInfo obj2 = new UserInfo("Ali1","Can1",10000,"asdfasdf1");
        UserInfo obj3 = new UserInfo("Ali2","Can2",1000,"asdfasdf2");
        UserInfo obj4 = new UserInfo("Ali3","Can3",2000,"asdfasdf3");



        DataBase.userDataMap.put(12341234,obj1);
        DataBase.userDataMap.put(23452345,obj2);
        DataBase.userDataMap.put(34563456,obj3);
        DataBase.userDataMap.put(45674567,obj4);



    }





}
