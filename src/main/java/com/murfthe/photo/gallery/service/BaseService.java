package com.murfthe.photo.gallery.service;

import com.mongodb.client.result.DeleteResult;
import com.murfthe.photo.gallery.model.BaseModel;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Date;
import java.util.List;

public abstract class BaseService<T extends BaseModel> {

    @Autowired
    private MongoTemplate mongoTemplate;

    protected abstract Class<T> getEntityClass();

    public T save(T entity) {
        entity.setCreated(new Date());
        entity.setUpdated(new Date());
        entity.setDeleted(false);
        return mongoTemplate.save(entity);
    }

    public DeleteResult delete(ObjectId id) {
        final Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.remove(query, getEntityClass());
    }

    public T get(ObjectId id) {
        return mongoTemplate.findById(id, getEntityClass());
    }

    public List<T> all() {
        Query query = new Query(Criteria.where("deleted").is(false));
        return mongoTemplate.find(query, getEntityClass());
    }
}
