package com.kyznec14.messenger.Server;


import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

public class User {
    private String name;
    private String id;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    User(String name, String id, String password){
    this.name=name;
    this.id=id;
    this.password=password;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public void changePassword(String oldPassword,String newPassword) throws LoginException
    {
        if (this.password==oldPassword){
            this.password=newPassword;
        }
        else {
            throw new FailedLoginException("WRONG PASSWORD");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!name.equals(user.name)) return false;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        /*int result = name.hashCode();
        result = 31 * result + id.hashCode();
        return result;*/
        return super.hashCode();
    }
}
