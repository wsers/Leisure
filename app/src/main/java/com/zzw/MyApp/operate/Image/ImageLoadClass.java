package com.zzw.MyApp.operate.Image;

import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.zzw.MyApp.R;

/**
 * Created by zzw on 2016/6/15.
 * 描述:
 */
public class ImageLoadClass {

    public static void loadImage(Activity activity, String url, ImageView imageView) {
        try {
            useGlideLoadImage(activity, url, imageView);
        } catch (Exception e) {
        }
    }


    private static void useGlideLoadImage(Activity activity, String path, ImageView imageView) {
        Glide.with(activity).load(path).placeholder(R.mipmap.ic_loading).dontAnimate().diskCacheStrategy(DiskCacheStrategy.SOURCE).error(R.mipmap.ic_loading).
                into(imageView);
    }

}