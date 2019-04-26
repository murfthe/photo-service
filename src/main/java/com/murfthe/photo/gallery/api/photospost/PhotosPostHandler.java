package com.murfthe.photo.gallery.api.photospost;

import com.mongodb.client.result.DeleteResult;
import com.murfthe.photo.gallery.model.photospost.PhotosPost;
import com.murfthe.photo.gallery.service.photospost.PhotosPostService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhotosPostHandler {

    @Autowired
    private PhotosPostService postService;

    public PhotosPost save(PhotosPost post) {
        return postService.save(post);
    }

    public DeleteResult delete(ObjectId id) {
        return postService.delete(id);
    }

    public PhotosPost get(ObjectId id) {
        return postService.get(id);
    }

    public List<PhotosPost> getAll() {
        return postService.all();
    }
}

