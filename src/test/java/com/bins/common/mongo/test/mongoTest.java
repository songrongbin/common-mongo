package com.bins.common.mongo.test;

import com.bins.common.mongo.dao.UserDao;
import com.bins.common.mongo.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class mongoTest {  
  
    @Autowired
    private UserDao userDao;
  
    /** 
     * 查询测试 
     *  
     * @author：tuzongxun 
     * @Title: monFindTest 
     * @param 
     * @return void 
     * @date May 13, 2016 3:27:51 PM 
     * @throws 
     */  
    @Test
    public void monFindTest() {  
        List<UserModel> userModels = userDao.findAll();
        if (userModels != null && userModels.size() > 0) {  
            for (UserModel user : userModels) {  
                System.out.println(user.getUserName() + ":"  
                        + user.getPassword());  
            }  
        }  
    }  
  
    /** 
     * 插入数据测试 
     *  
     * @author：tuzongxun 
     * @Title: monInsertTest 
     * @param 
     * @return void 
     * @date May 13, 2016 3:27:38 PM 
     * @throws 
     */  
    @Test  
    public void monInsertTest() {  
        UserModel user = new UserModel("test111", "123456");  
        userDao.insertUser(user);  
        this.monFindTest();  
    }  
  
    /** 
     * 删除测试 
     *  
     * @author：tuzongxun 
     * @Title: monRemoveTest 
     * @param 
     * @return void 
     * @date May 13, 2016 3:28:06 PM 
     * @throws 
     */  
    @Test  
    public void monRemoveTest() {  
        String userName = "test111";  
        userDao.removeUser(userName);  
        this.monFindTest();  
    }  
  
    /** 
     * 测试修改 
     *  
     * @author：tuzongxun 
     * @Title: monUpdateTest 
     * @param 
     * @return void 
     * @date May 13, 2016 3:50:08 PM 
     * @throws 
     */  
    @Test  
    public void monUpdateTest() {  
        UserModel user = new UserModel("test111", "test");  
        userDao.updateUser(user);  
        this.monFindTest();  
    }  
  
    /** 
     * 按条件查询 
     *  
     * @author：tuzongxun 
     * @Title: monFindForRuq 
     * @param 
     * @return void 
     * @date May 13, 2016 4:10:53 PM 
     * @throws 
     */  
    @Test  
    public void monFindForRuq() {  
        String userName = "test111";  
        List<UserModel> userModels = userDao.findForRequery(userName);  
        if (userModels != null && userModels.size() > 0) {  
            for (UserModel user : userModels) {  
                System.out.println(user.getUserName() + ":"  
                        + user.getPassword());  
            }  
        }  
    }  
  
} 