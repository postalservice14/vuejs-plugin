package org.vuejs.lang;

import com.intellij.lang.html.HTMLLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class VueJSFileType extends LanguageFileType {

    public static final VueJSFileType INSTANCE = new VueJSFileType();

    private VueJSFileType() {
        super(HTMLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Vue.js file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Vue.js Template";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "vue";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return VueJSIcons.FILE;
    }
}
