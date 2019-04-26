package com.murfthe.photo.gallery.service.photospost;

import com.murfthe.photo.gallery.model.PhotosPost;
import com.murfthe.photo.gallery.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PhotosPostService extends BaseService<PhotosPost> {
    @Override
    protected Class<PhotosPost> getEntityClass() {
        return PhotosPost.class;
    }
}
