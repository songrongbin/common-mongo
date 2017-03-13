package com.bins.common.mongo.dao;

import com.bins.common.mongo.model.UserModel;

import java.util.List;

public interface UserDao {
    /** 
     * 查询数据 
     *  
     * @author：tuzongxun 
     * @Title: findAll 
     * @param @return 
     * @return List<UserModel> 
     * @date May 13, 2016 3:07:39 PM 
     * @throws 
     */  
    public List<UserModel> findAll();
  
    /** 
     * 新增数据 
     *  
     * @author：tuzongxun 
     * @Title: insertUser 
     * @param @param user 
     * @return void 
     * @date May 13, 2016 3:09:45 PM 
     * @throws 
     */  
    public void insertUser(UserModel user);  
  
    /** 
     * 删除数据 
     *  
     * @author：tuzongxun 
     * @Title: removeUser 
     * @param @param userName 
     * @return void 
     * @date May 13, 2016 3:09:55 PM 
     * @throws 
     */  
    public void removeUser(String userName);  
  
    /** 
     * 修改数据 
     *  
     * @author：tuzongxun 
     * @Title: updateUser 
     * @param @param user 
     * @return void 
     * @date May 13, 2016 3:10:06 PM 
     * @throws 
     */  
    public void updateUser(UserModel user);  
  
    /** 
     * 按条件查询 
     *  
     * @author：tuzongxun 
     * @Title: findForRequery 
     * @param 
     * @return void 
     * @date May 13, 2016 3:23:37 PM 
     * @throws 
     */  
    public List<UserModel> findForRequery(String userName);  
  
}  