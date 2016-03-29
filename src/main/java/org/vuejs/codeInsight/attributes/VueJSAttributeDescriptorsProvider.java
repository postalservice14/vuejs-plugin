package org.vuejs.codeInsight.attributes;

import com.intellij.psi.xml.XmlTag;
import com.intellij.xml.XmlAttributeDescriptor;
import com.intellij.xml.XmlAttributeDescriptorsProvider;
import org.jetbrains.annotations.Nullable;
import org.vuejs.codeInsight.VueJSDirectives;

import java.util.LinkedHashMap;
import java.util.Map;

public class VueJSAttributeDescriptorsProvider implements XmlAttributeDescriptorsProvider {
    @Override
    public XmlAttributeDescriptor[] getAttributeDescriptors(XmlTag context) {
        final Map<String, XmlAttributeDescriptor> result = new LinkedHashMap<>();
        for (String attributeName : VueJSDirectives.getDirectives()) {
            result.put(attributeName, new VueJSAttributeDescriptor(context.getProject(), attributeName, null));
        }
        return result.values().toArray(new XmlAttributeDescriptor[result.size()]);
    }

    @Nullable
    @Override
    public XmlAttributeDescriptor getAttributeDescriptor(String attributeName, XmlTag context) {
        if (VueJSDirectives.getDirectives().contains(attributeName)) {
            return new VueJSAttributeDescriptor(context.getProject(), attributeName, null);
        }

        return null;
    }
}
