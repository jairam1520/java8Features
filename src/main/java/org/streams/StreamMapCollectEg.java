package org.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectEg {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Ramesh","ramesh","ramesh@gmail.com"));
        userList.add(new User(2,"Suresh","suresh","suresh@gmail.com"));
        userList.add(new User(3,"Lokesh","lokesh","lokesh@gmail.com"));
        userList.add(new User(4,"Mangesh","mangesh","mangesh@gmail.com"));
        userList.add(new User(5,"Akash","akash","akash@gmail.com"));

        //mapping User to UserDto using map function of strema API

//        userList.stream().map(new Function<User, UserDto>() {
//            @Override
//            public UserDto apply(User user) {
//                return new UserDto(user.getId(),user.getUserName(),user.getEmail());
//            }
//        }).collect(Collectors.toList());

        userList.stream().map( (User user)-> new UserDto(user.getId(),user.getUserName(),user.getEmail()))
                .forEach(userDto -> System.out.println(userDto));


    }
}
class UserDto{
    private int id;
    private String userName;
    private String email;

    public UserDto(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }
    public UserDto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}