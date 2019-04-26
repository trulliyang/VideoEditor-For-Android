package com.example.videoeditor.jni;

public class AudioJniUtils {


    static {
        System.loadLibrary("native-lib");
    }
    public static native byte[] audioMix(byte[] sourceA,byte[] sourceB,byte[] dst,float firstVol , float secondVol);

    public static native String putString(String info);


}
