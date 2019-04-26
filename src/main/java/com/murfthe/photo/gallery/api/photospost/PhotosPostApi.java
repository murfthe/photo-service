package com.murfthe.photo.gallery.api.photospost;

import com.mongodb.client.result.DeleteResult;
import com.murfthe.photo.gallery.model.photospost.PhotosPost;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface PhotosPostApi {

    @PostMapping(value = "/photosPost", consumes = "application/json")
    @ResponseBody
    PhotosPost save(@RequestBody PhotosPost post);

    @DeleteMapping(value = "/photosPost/{id}", consumes = "application/json")
    @ResponseBody
    DeleteResult delete(@PathVariable("id") ObjectId id);

    @GetMapping(value = "/photosPost/{id}", consumes = "application/json")
    @ResponseBody
    PhotosPost get(@PathVariable("id") ObjectId id);

    @GetMapping(value = "/photosPost/all", consumes = "application/json")
    @ResponseBody
    List<PhotosPost> getAll();
}
