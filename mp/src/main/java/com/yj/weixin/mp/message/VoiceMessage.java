package com.yj.weixin.mp.message;

/**
 * Created by yuanjinglin on 18/4/27.
 */
public class VoiceMessage  extends  BaseMessage{
    private Voice Voice;

    public Voice getVoice() {
        return Voice;
    }

    public void setVoice(Voice voice) {
        Voice = voice;
    }
}
