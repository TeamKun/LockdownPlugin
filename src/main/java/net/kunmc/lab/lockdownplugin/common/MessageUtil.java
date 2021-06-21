package net.kunmc.lab.lockdownplugin.common;

public class MessageUtil {
    public static final String PLUGIN_NAME = "LockdownPlugin";
    public static final String START = "スタート";
    public static final String END = "終了";

    public static String getStartMessage() {
        return PLUGIN_NAME + START;
    }

    public  static  String getEndMessage() {
        return PLUGIN_NAME + END;
    }
}
