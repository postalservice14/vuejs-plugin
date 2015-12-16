package org.vuejs.lang;

import com.intellij.lang.xml.XMLLanguage;

public class VueJSLanguage extends XMLLanguage {
    public static final VueJSLanguage INSTANCE = new VueJSLanguage();

    private VueJSLanguage() {
        super(XMLLanguage.INSTANCE, "VueJS", "text/html", "text/htmlh");
    }
}
