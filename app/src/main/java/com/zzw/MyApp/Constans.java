package com.zzw.MyApp;

import android.os.Environment;

import java.io.File;

/**
 * Created by zzw on 2016/6/14.
 * 描述:
 */
public class Constans {

    public final static String JOKE_APP_KEY = "ecfe94c430da9ebaa46226cbd86f0bf6";//笑一笑
    public final static String CONSTELLATION_APP_KEY = "6ffecae5072e31cb8fb7ca7b323440e6";//星座
    public final static String NEWS_APP_KEY = "b622c4ab2cde18710dc2a0771e9171d5";//微信精选
    public final static String HISTORY_APP_KEY = "3c7d2a7599c4159faa32f238d55b3fe7";//历史上的今天
    public final static String LONG_BUS_APP_KEY = "85ae6cf04a2bf30726c9199090dfb979";//历史上的今天
    public final static String DUCK_APP_KEY = "cd81a23907ce981234eed8bc96d08bca";//周公解梦
    public final static String STUFF_APP_KEY = "bbb352453d93661a0baa994be909ec97";//老黄历


    public final static int HANDLER_POSt_TIME = 300;

    public final static int GLIDE_CACHE_SIZE = 104857600;

    public final static String GLIDE_CACHE_DIR = Environment.getExternalStorageDirectory() + File.separator + "Leisure";

    public final static String IMAGE_SAVA_PATH = Environment.getExternalStorageDirectory() + File.separator + "Pictures";
}
