package com.example.examplemod.listener;

import com.google.gson.JsonObject;
import com.tecknix.modintegration.SettingType;
import com.tecknix.modintegration.TecknixChangeListener;

import java.awt.*;

public class ExampleListener {

    @TecknixChangeListener(settingName = "test_setting_boolean")
    public void listenBoolean(JsonObject object) {
        final SettingType settingType = SettingType.fromJson(object);

        //Lets say we want to listen for our boolean setting.
        System.out.println("Setting Name: " + object.get("setting_name").getAsString());
        System.out.println("Setting Type: " + settingType.name());

        if (settingType == SettingType.BOOLEAN) { //This will always be true if there is only one setting with the name "test_setting_boolean"
            System.out.println("Boolean Toggle: " + object.get("setting_value").getAsBoolean());
        }
    }

    @TecknixChangeListener(settingName = "test_setting_slider")
    public void listenSlider(JsonObject object) {
        final SettingType settingType = SettingType.fromJson(object);

        //Lets say we want to listen for our boolean setting.
        System.out.println("Setting Name: " + object.get("setting_name").getAsString());
        System.out.println("Setting Type: " + settingType.name());

        if (settingType == SettingType.SLIDER) {
            System.out.println("Slider Value: " + object.get("setting_value").getAsDouble());

            /* You may also fetch any of the values you defined earlier in the json file. */
            System.out.println("Slider Maximum Value: " + object.get("setting_max").getAsInt());
            System.out.println("Slider Minimum Value: " + object.get("setting_min").getAsInt());
        }
    }

    @TecknixChangeListener(settingName = "test_setting_mode")
    public void listenMode(JsonObject object) {
        final SettingType settingType = SettingType.fromJson(object);

        //Lets say we want to listen for our boolean setting.
        System.out.println("Setting Name: " + object.get("setting_name").getAsString());
        System.out.println("Setting Type: " + settingType.name());

        if (settingType == SettingType.MODE) {
            /* The returned value will be an index, EX: 0, 1, 2 */
            System.out.println("Mode Index Value: " + object.get("setting_value").getAsInt());
        }
    }

    @TecknixChangeListener(settingName = "test_setting_color")
    public void listenColor(JsonObject object) {
        final SettingType settingType = SettingType.fromJson(object);

        //Lets say we want to listen for our boolean setting.
        System.out.println("Setting Name: " + object.get("setting_name").getAsString());
        System.out.println("Setting Type: " + settingType.name());

        if (settingType == SettingType.COLOR) {
            /* The returned value will be an integer color. */
            System.out.println("Color Value: " + object.get("setting_value").getAsInt());

            /* You may convert this back to an AWT color object like so: */
            final Color color = new Color(object.get("setting_value").getAsInt());
            System.out.println("Color Value From AWT Object: " + color.getRGB());
        }
    }
}
