package com.kyznec14.messenger.Server;

/**
 * Created by kyznec14 on 5/5/17.
 */
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

    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
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
