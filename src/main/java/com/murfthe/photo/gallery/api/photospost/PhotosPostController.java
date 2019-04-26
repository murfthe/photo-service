package com.murfthe.photo.gallery.api.photospost;

import com.mongodb.client.result.DeleteResult;
import com.murfthe.photo.gallery.model.photospost.PhotosPost;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class PhotosPostController implements PhotosPostApi {

    @Autowired
    private PhotosPostHandler postHandler;

    @Override
    public PhotosPost save(@RequestBody PhotosPost post) {
        return postHandler.save(post);
    }

    @Override
    public DeleteResult delete(@PathVariable("id") ObjectId id) {
        return postHandler.delete(id);
    }

    @Override
    public PhotosPost get(@PathVariable("id") ObjectId id) {
        return postHandler.get(id);
    }

    @Override
    public List<PhotosPost> getAll() {
        return postHandler.getAll();
    }
}
