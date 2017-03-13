package com.bins.common.mongo.dao;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

public interface BaseMongoDao {
    
    public <T> List<T> find(Class<T> clazz);
  
    public <T> T findOne(Query query, Class<T> clazz);
    
    public <T> void update(Query query, Update update, Class<T> T);
    
    //批量更新
    public <T> void updatemulti(Query query, Update update, Class<T> clazz);
   
    public <T> void save(T entity);
  
    public <T> T findById(String id, Class<T> clazz);
      
    public <T> long count(Query query, Class<T> clazz);
      
    public <T> void remove(Query query, Class<T> clazz);
}