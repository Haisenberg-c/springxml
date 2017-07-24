package com.zhen.www.bean;

import javax.persistence.*;

@Entity
@Table(name = "image_circle", schema = "travel")
public class ImageCircle {
    private int imageId;
    private String imageTitle;
    private String imagePicpath;
    private String imagePath;
    private Integer imageMenuid;

    @Id
    @Column(name = "image_id")
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Basic
    @Column(name = "image_title")
    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    @Basic
    @Column(name = "image_picpath")
    public String getImagePicpath() {
        return imagePicpath;
    }

    public void setImagePicpath(String imagePicpath) {
        this.imagePicpath = imagePicpath;
    }

    @Basic
    @Column(name = "image_path")
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Basic
    @Column(name = "image_menuid")
    public Integer getImageMenuid() {
        return imageMenuid;
    }

    public void setImageMenuid(Integer imageMenuid) {
        this.imageMenuid = imageMenuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageCircle that = (ImageCircle) o;

        if (imageId != that.imageId) return false;
        if (imageTitle != null ? !imageTitle.equals(that.imageTitle) : that.imageTitle != null) return false;
        if (imagePicpath != null ? !imagePicpath.equals(that.imagePicpath) : that.imagePicpath != null) return false;
        if (imagePath != null ? !imagePath.equals(that.imagePath) : that.imagePath != null) return false;
        if (imageMenuid != null ? !imageMenuid.equals(that.imageMenuid) : that.imageMenuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imageId;
        result = 31 * result + (imageTitle != null ? imageTitle.hashCode() : 0);
        result = 31 * result + (imagePicpath != null ? imagePicpath.hashCode() : 0);
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        result = 31 * result + (imageMenuid != null ? imageMenuid.hashCode() : 0);
        return result;
    }
}
