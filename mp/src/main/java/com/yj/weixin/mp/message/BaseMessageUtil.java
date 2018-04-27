package com.yj.weixin.mp.message;

/**
 * Created by yuanjinglin on 18/4/26.
 */
public interface BaseMessageUtil <T>{
    /**
     * 将回复的信息对象转xml格式给微信
     * @param
     * @return
     */
    public  abstract  String messageToxml(T t);

    /**
     * 回复的信息封装
     * @param FromUserName
     * @param ToUserName
     * @param
     * @return
     */
    public abstract  String initMessage(String FromUserName,String ToUserName);

}
