package com.bins.common.mongo.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(rollbackFor=Exception.class) 
public class BaseMongoDaoImpl<T>{  

    /*@Resource
    MongoTemplate mongoTemplate;
    public List<T> find(Query query, Class<T> clazz) {  
        return (List<T>) mongoTemplate.find(query, clazz);  
    }*/
    
    @Resource
    private MongoTemplate mongoTemplate;
    public List<T> find(Query query, Class<T> clazz) {  
        System.out.println(mongoTemplate);
        return (List<T>) mongoTemplate.find(query, clazz);  
    }
      
     /** 
     * spring mongodb　集成操作类　 
     */  
    /*@Autowired private MongoTemplate mongoTemplate;  
    
    public List<T> find(Query query, Class<T> clazz) {  
        return (List<T>) mongoTemplate.find(query, clazz);  
    } */
  
    /*public T findOne(Query query, Class<T> clazz) {  
        return (T) mongoTemplate.findOne(query, clazz);  
    } 
  
    public void update(Query query, Update update, Class<T> clazz) {  
        mongoTemplate.findAndModify(query, update, clazz);  
    } 
    
    //批量更新
    public void updatemulti(Query query, Update update, Class<T> clazz) {  
        mongoTemplate.updateMulti(query, update, clazz);  
    } 
   
    public void save(T entity) {  
        mongoTemplate.insert(entity);  
    }  
  
    public T findById(String id, Class<T> clazz) {  
        return (T) mongoTemplate.findById(id, clazz);  
    }  
  
      
    public long count(Query query, Class<T> clazz){  
        return mongoTemplate.count(query, clazz);  
    }  
      
    public void remove(Query query, Class<T> clazz){  
         mongoTemplate.remove(query,  clazz);  
    } 
*/
} 