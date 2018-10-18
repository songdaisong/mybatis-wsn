package com.scu.pojo;

import java.io.Serializable;

public class NewsWithBLOBs extends News implements Serializable {
    private String content;

    private byte[] pic;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}