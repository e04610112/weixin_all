package com.yj.weixin.mp.message;

import com.thoughtworks.xstream.XStream;

import java.util.Date;

/**
 * Created by yuanjinglin on 18/4/26.
 */
public class TextMessageUtil {
    /**
     * 将发送消息封装成对应的xml格式
     */
    public  String messageToxml(MessageText  message) {
        XStream xstream  = new XStream();
        xstream.alias("xml", message.getClass());
        return xstream.toXML(message);
    }
    /**
     * 封装发送消息对象,封装时，需要将调换发送者和接收者的关系
     * @param FromUserName
     * @param ToUserName
     */
    public  String initMessage(String FromUserName, String ToUserName) {
        MessageText text = new MessageText();
        text.setToUserName(FromUserName);
        text.setFromUserName(ToUserName);
        text.setContent("欢迎");
        text.setCreateTime(System.currentTimeMillis());
        text.setMsgType("text");
        return  messageToxml(text);
    }

    public  String initMessage(String FromUserName, String ToUserName,String context) {
        MessageText text = new MessageText();
        text.setToUserName(FromUserName);
        text.setFromUserName(ToUserName);
        text.setContent(context);
        text.setCreateTime(System.currentTimeMillis());
        text.setMsgType("text");
        return  messageToxml(text);
    }
}
