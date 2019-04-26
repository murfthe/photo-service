package com.murfthe.photo.gallery.api.photospost;

import com.mongodb.client.result.DeleteResult;
import com.murfthe.photo.gallery.model.PhotosPost;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

public interface PhotosPostApi {

    @PostMapping(value = "/photosPost", consumes = "application/json")
    @ResponseBody
    PhotosPost save(@RequestBody PhotosPost post);

    @DeleteMapping(value = "/photosPost/{id}", consumes = "application/json")
    @ResponseBody
    DeleteResult delete(@PathVariable("id") ObjectId id);
}
