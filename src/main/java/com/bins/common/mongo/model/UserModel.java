package com.bins.common.mongo.model;

import java.io.Serializable;
  
public class UserModel implements Serializable {  
  
    private static final long serialVersionUID = 1L;  
    private String userName;  
    private String password;  
  
    public UserModel(String userName, String password) {  
        super();  
        this.userName = userName;  
        this.password = password;  
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
  
}  