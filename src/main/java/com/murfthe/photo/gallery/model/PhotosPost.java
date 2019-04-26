package com.murfthe.photo.gallery.model;

import java.util.List;

public class PhotosPost extends BaseModel{
    private List<String> tags;
    private List<String> photoPaths;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getPhotoPaths() {
        return photoPaths;
    }

    public void setPhotoPaths(List<String> photoPaths) {
        this.photoPaths = photoPaths;
    }
}
