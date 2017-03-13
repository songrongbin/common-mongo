package com.bins.common.mongo.test;

import java.util.List;

import com.bins.common.mongo.model.Person;
import com.bins.common.mongo.service.impl.AbstractRepository;
import com.bins.common.mongo.service.impl.PersonRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
  
  
/** 
 * TODO 
 * @author cuiran 
 * @version TODO 
 */  
public class MongoPersonTest {
  
    private static Log log = LogFactory.getLog(MongoPersonTest.class.getName());
      
    private AbstractRepository pr=null;
      
    /** 
     *  
     *<b>function:</b> 
     * @author cuiran 
     * @createDate 2012-12-12 16:08:02 
     */  
    public void init(){  
         log.debug("开始启动");  
         ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
          pr= (PersonRepository)ctx.getBean("personRepository");
           
          
          
    }  
    /** 
     *  
     *<b>function:</b>添加 
     * @author cuiran 
     * @createDate 2012-12-12 16:11:01 
     */  
    public void insert(){  
          
        Person p=new Person("cuiran",27);
         pr.insert(p);  
         log.debug("添加成功");  
    }  
    /** 
     *  
     *<b>function:</b>根据输入的ID查找对象 
     * @author cuiran 
     * @createDate 2012-12-12 16:24:10 
     */  
    public void findOne(){  
        String id="50c83cb552c2ceb0463177d6";  
        Person p= pr.findOne(id);  
        log.debug(p);  
    }  
      
      
    /** 
     *  
     *<b>function:</b>查询所有 
     * @author cuiran 
     * @createDate 2012-12-12 16:08:54 
     */  
    public void listAll(){  
          
        List<Person> list=pr.findAll();  
        log.debug("查询结果如下:");  
        for (Person p:list){  
            log.debug(p.toString());  
        }  
          
          
    }  
      
    /** 
     *  
     *<b>function:</b>测试方法 
     * @author cuiran 
     * @createDate 2012-12-12 16:11:37 
     */  
    public void start(){  
        init();  
          
        insert();
        //listAll();  
          
        findOne();  
    }  
      
    /** 
     *<b>function:</b>main函数 
     * @author cuiran 
     * @createDate 2012-12-12 11:54:30 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        MongoPersonTest t=new MongoPersonTest();
        t.start();  
    }  
  
}  