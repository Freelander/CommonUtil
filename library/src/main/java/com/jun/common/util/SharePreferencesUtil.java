
package com.jun.common.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Jun on 2016/5/3.
 * 描述：保存到 SharedPreferences 的数据
 *
 * @author Jun
 * @version v0.1.4
 */
public class SharePreferencesUtil {

    private static final String TAG = "SharePreferencesHelper";

    private SharedPreferences mPreferences;

    private SharedPreferences.Editor mEditor;

    private static SharePreferencesUtil mSPHelper;

    public static SharePreferencesUtil getInstance(Context context) {
        if (mSPHelper == null)
            mSPHelper = new SharePreferencesUtil(context);

        return mSPHelper;
    }

    public SharePreferencesUtil(Context context) {
        mPreferences = context.getSharedPreferences(TAG, Context.MODE_APPEND);
    }

    public boolean putString(String key, String value) {
        mEditor = mPreferences.edit();
        mEditor.putString(key, value);
        return mEditor.commit();
    }

    public String getString(String key) {
        return mPreferences.getString(key, "");
    }

    public String getString(String key, String defValue) {
        return mPreferences.getString(key, defValue);
    }

    public boolean putInt(String key, int value) {
        mEditor = mPreferences.edit();
        mEditor.putInt(key, value);
        return mEditor.commit();
    }

    public int getInt(String key) {
        return mPreferences.getInt(key, 0);
    }

    public int getInt(String key, int defValue) {
        return mPreferences.getInt(key, defValue);
    }

    public boolean putBoolean(String key, boolean value) {
        mEditor = mPreferences.edit();
        mEditor.putBoolean(key, value);
        return mEditor.commit();
    }

    public boolean getBoolean(String key) {
        return mPreferences.getBoolean(key, false);
    }

    public boolean getBoolean(String key, boolean defVaule) {
        return mPreferences.getBoolean(key, defVaule);
    }

}
