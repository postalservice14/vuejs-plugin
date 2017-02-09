package org.vuejs.codeInsight;

import java.util.Arrays;
import java.util.List;

public class VueJSDirectives {
    private static final List<String> directives = Arrays.asList(
            "v-text",
            "v-html",
            "v-if",
            "v-show",
            "v-else",
            "v-for",
            "v-on",
            "v-bind",
            "v-model",
            "v-ref",
            "v-el",
            "v-pre",
            "v-cloak",
            "v-once",
            "v-else-if",
    );

    public static List<String> getDirectives() {
        return directives;
    }
}
