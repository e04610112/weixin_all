package com.yj.weixin.mp.message;

/**
 * 图片消息
 * Created by yuanjinglin on 18/4/27.
 */
public class ImageMessage extends BaseMessage{
    private Image Image;//Image节点

    public Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }
}
