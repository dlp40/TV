package com.fongmi.android.tv.utils;

import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import com.fongmi.android.tv.App;

public class Prefers {

    private static SharedPreferences getPrefers() {
        return PreferenceManager.getDefaultSharedPreferences(App.get());
    }

    public static String getString(String key, String defaultValue) {
        return getPrefers().getString(key, defaultValue);
    }

    public static String getString(String key) {
        return getString(key, "");
    }

    public static int getInt(String key, int defaultValue) {
        return getPrefers().getInt(key, defaultValue);
    }

    public static int getInt(String key) {
        return getInt(key, 0);
    }

    public static boolean getBoolean(String key, boolean defaultValue) {
        return getPrefers().getBoolean(key, defaultValue);
    }

    public static boolean getBoolean(String key) {
        return getPrefers().getBoolean(key, false);
    }

    public static void put(String key, Object obj) {
        if (obj == null) return;
        if (obj instanceof String) {
            getPrefers().edit().putString(key, (String) obj).apply();
        } else if (obj instanceof Boolean) {
            getPrefers().edit().putBoolean(key, (Boolean) obj).apply();
        } else if (obj instanceof Float) {
            getPrefers().edit().putFloat(key, (Float) obj).apply();
        } else if (obj instanceof Integer) {
            getPrefers().edit().putInt(key, (Integer) obj).apply();
        } else if (obj instanceof Long) {
            getPrefers().edit().putLong(key, (Long) obj).apply();
        }
    }

    public static String getKeep() {
        return getString("keep");
    }

    public static void putKeep(String keep) {
        put("keep", keep);
    }

    public static int getWall() {
        return getInt("wall", 1);
    }

    public static void putWall(int wall) {
        put("wall", wall);
    }

    public static int getReset() {
        return getInt("reset", 0);
    }

    public static void putReset(int reset) {
        put("reset", reset);
    }

    public static int getPlayer() {
        return getInt("player", 0);
    }

    public static void putPlayer(int player) {
        put("player", player);
    }

    public static int getDecode() {
        return getInt("decode", 1);
    }

    public static void putDecode(int decode) {
        put("decode", decode);
    }

    public static int getRender() {
        return getInt("render", 0);
    }

    public static void putRender(int render) {
        put("render", render);
    }

    public static int getQuality() {
        return getInt("quality", 2);
    }

    public static void putQuality(int quality) {
        put("quality", quality);
    }

    public static int getSize() {
        return getInt("size", 2);
    }

    public static void putSize(int size) {
        put("size", size);
    }

    public static String getParse() {
        return getString("parse");
    }

    public static void putParse(String parse) {
        put("parse", parse);
    }

    public static String getKeyword() {
        return getString("keyword");
    }

    public static void putKeyword(String keyword) {
        put("keyword", keyword);
    }

    public static int getVodScale() {
        return getInt("vodScale");
    }

    public static void putVodScale(int scale) {
        put("vodScale", scale);
    }

    public static int getLiveScale() {
        return getInt("liveScale", getVodScale());
    }

    public static void putLiveScale(int scale) {
        put("liveScale", scale);
    }

    public static boolean isInvert() {
        return getBoolean("invert", false);
    }

    public static void putInvert(boolean invert) {
        put("invert", invert);
    }

    public static boolean isAcross() {
        return getBoolean("across", true);
    }

    public static void putAcross(boolean across) {
        put("across", across);
    }

    public static boolean getUpdate() {
        return getBoolean("update", true);
    }

    public static void putUpdate(boolean update) {
        put("update", update);
    }

    public static float getThumbnail() {
        return 0.3f * getQuality() + 0.4f;
    }

    public static int getColumn() {
        return Math.abs(getSize() - 7);
    }
}
