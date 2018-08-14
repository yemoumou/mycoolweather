package com.huiqiao.ymm.mycoolweather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 创建时间 2018/08/14 17:13
 * 包名： com.huiqiao.ymm.mycoolweather.utils
 *
 * @author ymou
 *         描述：
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
