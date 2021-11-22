package com.appsflyer.reactnative;

import android.app.Activity;

import com.appsflyer.AppsFlyerLib;

public class RNAppsFlyerLib {
    public static void addPushNotificationDeepLinkPath(String ...path) {
        AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath(path);
    }

    public static void sendPushNotificationData(Activity activity) {
        AppsFlyerLib.getInstance().sendPushNotificationData(activity);
    }
}
