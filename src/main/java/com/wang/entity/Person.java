package com.wang.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/6 0006.
 */
public class Person {
    private String name;
    private int age;
    private List<String> favorites;
    private Map<Integer,String> friends;
    public Person(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<String>getFavorites() {
        return favorites;
    }
    public void setFavorites(List<String>favorites) {
        this.favorites = favorites;
    }
    public Map<Integer, String>getFriends() {
        return friends;
    }
    public void setFriends(Map<Integer, String>friends) {
        this.friends = friends;
    }
}
