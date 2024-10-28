package org.msc.users;

public class Main {
    public static void main(String[] args) {

        User user1 = new User ("Mònica", "Simó");
        User user2 = new User ("Sergi", "Virgili");
        User user3 = new User("Antonio", "López");

        //Utilizando un bucle, imprimir desde fuera 3 nombres de usuarios

        User [] users = {user1, user2, user3};

        for (User user : users){
            System.out.println(user.fullName());
        }
    }
}
