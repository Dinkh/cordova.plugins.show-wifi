package com.mgd.plugin.wifi_settings;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;

import android.content.Intent;
import android.provider.Settings;
import android.util.Log;

import org.json.JSONArray;

public class WifiSettings extends CordovaPlugin {
    public static final String ACTION_LAUNCH_SETTINGS = "show";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if(this.cordova.getActivity().isFinishing()) return true;

        if (action.equals(ACTION_LAUNCH_SETTINGS)) {
            show(callbackContext);

            return true;
        }

        return false;
    }

    private synchronized void show(final CallbackContext callbackContext) {
        final CordovaInterface cordova = this.cordova;

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
//                    Log.v("TD:: LauchSettings", android.provider.Settings.ACTION_WIFI_SETTINGS);
//                    Log.v("TD:: LauchSettings", Settings.ACTION_WIRELESS_SETTINGS);

                    Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                    cordova.getActivity().startActivity(intent);
                    Log.v("TD:: [WifiSettings.show]", "showing wifi settings on android device");

                    callbackContext.success("true");
                } catch (Exception e) {
                    callbackContext.error(e.getMessage());
                }
            }
        };

        this.cordova.getActivity().runOnUiThread(runnable);
    }
}