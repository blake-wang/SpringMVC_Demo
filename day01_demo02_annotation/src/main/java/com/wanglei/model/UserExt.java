package com.wanglei.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: WangL
 * @Date: 2019/5/25 16:30
 */
public class UserExt {
    private User user;
    private List<User> userList = new ArrayList<User>();
    private Map<String, Object> userMap = new HashMap<>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, Object> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, Object> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "UserExt{" +
                "user=" + user +
                ", userList=" + userList +
                ", userMap=" + userMap +
                '}';
    }
}
