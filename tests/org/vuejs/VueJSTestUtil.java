package org.vuejs;

import com.intellij.openapi.application.PathManager;

public class VueJSTestUtil {
    public static String getBaseTestDataPath(Class clazz) {
        return PathManager.getJarPathForClass(clazz) + "/" + clazz.getPackage().getName().replace('.', '/') + "/data/";
    }
}
