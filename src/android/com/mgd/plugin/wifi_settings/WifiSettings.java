package com.mgd.plugin.wifi_settings;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;

import android.content.Context;
import android.content.Intent;

import android.media.AudioManager;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.apache.cordova.CordovaActivity;
import android.net.Uri;
import android.text.Html;

import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.PluginResult;

import android.provider.Settings;

public class WifiSettings extends CordovaPlugin {
    public static final String ACTION_LAUNCH_SETTINGS = "show";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if(this.cordova.getActivity().isFinishing()) return true;

        if (action.equals(ACTION_LAUNCH_SETTINGS)) {
Log.v("TD:: WifiSettings", "1");

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
Log.v("TD:: LauchSettings", android.provider.Settings.ACTION_WIRELESS_SETTINGS);
                Context context = cordova.getActivity().getApplicationContext();

//                Intent intent = new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS);
//                Intent intent = new Intent(Settings.ACTION_WIRELESS_SETTINGS);

                Intent intent = new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS);
//                startActivity(intent);            }
                cordova.getActivity().startActivity(intent);

//                try {
//                    Log.v("TD:: AudioTogglePlugin", json.getString("mode"));
//
//                    callbackContext.success(json);
//                } catch (Exception e) {
//                    callbackContext.error(e.getMessage());
//                }
            }
        };

        this.cordova.getActivity().runOnUiThread(runnable);
    }
}