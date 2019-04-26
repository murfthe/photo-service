package com.murfthe.photo.gallery.api.photospost;

import com.mongodb.client.result.DeleteResult;
import com.murfthe.photo.gallery.model.PhotosPost;
import com.murfthe.photo.gallery.service.photospost.PhotosPostService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
