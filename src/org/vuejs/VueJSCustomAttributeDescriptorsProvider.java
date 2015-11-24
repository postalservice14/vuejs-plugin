package org.vuejs;

import com.intellij.psi.xml.XmlTag;
import com.intellij.xml.XmlAttributeDescriptor;
import com.intellij.xml.XmlAttributeDescriptorsProvider;
import com.intellij.xml.impl.schema.AnyXmlAttributeDescriptor;
import com.intellij.xml.util.HtmlUtil;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class VueJSCustomAttributeDescriptorsProvider implements XmlAttributeDescriptorsProvider {

    @Override
    public XmlAttributeDescriptor[] getAttributeDescriptors(XmlTag xmlTag) {
        if (xmlTag == null || !HtmlUtil.isHtml5Context(xmlTag)) {
            return XmlAttributeDescriptor.EMPTY;
        }
        final List<XmlAttributeDescriptor> result = new ArrayList<XmlAttributeDescriptor>();
        result.add(new AnyXmlAttributeDescriptor("v-text"));
        result.add(new AnyXmlAttributeDescriptor("v-html"));
        result.add(new AnyXmlAttributeDescriptor("v-if"));
        result.add(new AnyXmlAttributeDescriptor("v-show"));
        result.add(new AnyXmlAttributeDescriptor("v-else"));
        result.add(new AnyXmlAttributeDescriptor("v-for"));
        result.add(new AnyXmlAttributeDescriptor("v-on"));
        result.add(new AnyXmlAttributeDescriptor("v-bind"));
        result.add(new AnyXmlAttributeDescriptor("v-model"));
        result.add(new AnyXmlAttributeDescriptor("v-ref"));
        result.add(new AnyXmlAttributeDescriptor("v-el"));
        result.add(new AnyXmlAttributeDescriptor("v-pre"));
        result.add(new AnyXmlAttributeDescriptor("v-cloak"));

        return result.toArray(new XmlAttributeDescriptor[result.size()]);
    }

    @Nullable
    @Override
    public XmlAttributeDescriptor getAttributeDescriptor(String attributeName, XmlTag xmlTag) {
        if (xmlTag != null && HtmlUtil.isHtml5Context(xmlTag) && HtmlUtil.isCustomHtml5Attribute(attributeName)) {
            return new AnyXmlAttributeDescriptor(attributeName);
        }

        return null;
    }
}
