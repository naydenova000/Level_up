package org.levelup.lesson3;

public class UserApp {
    public static void main(String[] args){
        User firsUser = new User();
        firsUser.lastName = "Pyshka";
        firsUser.firstName = "Mary";
        firsUser.age = "15";


        User secondUser = new User();
        secondUser.lastName = "Pilka";
        secondUser.firstName = "Oly";
        secondUser.age = "34";

        User therdUser = new User();
        therdUser.lastName = "Ewyt";
        therdUser.firstName = "Andrey";
        therdUser.age = "30";

        firsUser.User();
        secondUser.User();
        therdUser.User();




        User[] userList = new User[3];
        userList[0] = firsUser;
        userList[1]= secondUser;
        userList[2] = therdUser;

        //  НЕ ПОНИМАЮ ЧТО НЕ ТАК
        //  Я думала что userList = значениям выше и с помощью цикла выйдет вывести все,
        //  но мне возвращается название пакета org.levelup.lesson3.User@279f2327
        //  Не понимаю
        for (int i=0; i < userList.length; i++){
            System.out.println(userList[i]);
        }





    }




}
