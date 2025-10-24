package repository;

import entity.User;
import service.SignupService;

import java.util.Arrays;
import java.util.Objects;

public class UserRepository {
    private User[] users;
    private int autoIncrementId ;


    private static UserRepository instance;

    private UserRepository() {
        users = new User[0];
        autoIncrementId = 1;
    }

    public void insert(User user) {
        User [] temp = Arrays.copyOf(users,users.length+1);
        user.setId(autoIncrementId++);
        temp[temp.length-1] = user;
        users = temp;
    }


    public static UserRepository getInstance() {
        if(Objects.isNull(instance)) {
            instance = new UserRepository();
        }
        return instance;
    }
    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }//인스턴스 메소드

    private int generateId(){
        return users[users.length].getId() + 1;

    }
    public String toString (){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User 배열:[");
        for(int i = 0; i <users.length; i++){
            stringBuilder.append(users[i]);
            if(i != users.length - 1){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}
