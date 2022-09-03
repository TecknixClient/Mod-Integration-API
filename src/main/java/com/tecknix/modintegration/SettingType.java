package com.tecknix.modintegration;

import com.google.gson.JsonObject;

/**
 * @author Tecknix Software
 * @see SettingType
 * Allows you to parse to setting types.
 */
public enum SettingType {
    BOOLEAN,
    SLIDER,
    MODE,
    COLOR;

    public static SettingType fromJson(JsonObject object) {
        return valueOf(object.get("setting_type").getAsString());
    }
}
