package com.yj.weixin.mp.message;

import com.thoughtworks.xstream.XStream;
import com.yj.weixin.mp.util.UploadUtil;
import com.yj.weixin.mp.util.WeiXinUtil;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * Created by yuanjinglin on 18/4/27.
 */
public class ImageMessageUtil implements BaseMessageUtil<ImageMessage> {
    /**
     * 将信息转为xml格式
     */
    @Override
    public String messageToxml(ImageMessage imageMessage) {
        XStream xtream = new XStream();
        xtream.alias("xml", imageMessage.getClass());
        xtream.alias("Image", new Image().getClass());
        return xtream.toString();
    }
    /**
     * 封装信息
     */
    @Override
    public String initMessage(String FromUserName, String ToUserName) {
        Image image = new Image();
        image.setMediaId("b97RtPiaueTSaXsDH0aGYWrFBpM4Gxps9bant1aS4AlisFDypkr_vSBei7VZVA3e");
        ImageMessage message = new ImageMessage();
        message.setFromUserName(ToUserName);
        message.setToUserName(FromUserName);
        message.setCreateTime(System.currentTimeMillis());
        message.setImage(image);
        return messageToxml(message);
    }
    /**
     * 获取Media
     * @return
     */
    public String getmediaId() {
        String path = "/Users/linyuanjing/myproject/weixin_all/mp/src/main/java/com/yj/weixin/mp/util/IMG_6315.JPG";
        String mediaId = null;
        try {
            String accessToken = WeiXinUtil.getAccess_Token();
            mediaId = UploadUtil.upload(path, accessToken, "image");
            System.out.println("上传图片成功，id:"+mediaId);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mediaId;
    }
}
