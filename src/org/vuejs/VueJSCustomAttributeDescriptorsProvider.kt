package org.vuejs

import com.intellij.psi.xml.XmlTag
import com.intellij.xml.XmlAttributeDescriptor
import com.intellij.xml.XmlAttributeDescriptorsProvider

public open class VueJSCustomAttributeDescriptorsProvider(): XmlAttributeDescriptorsProvider {
    var vuejs:VueJS? = null

    override fun getAttributeDescriptors(tag: XmlTag?): Array<out XmlAttributeDescriptor>? {
        if (vuejs == null) {
            vuejs = VueJS.getInstance(tag?.project)
        }

        if (tag == null) {
            return XmlAttributeDescriptor.EMPTY
        }

        return vuejs?.attrArray
    }

    override fun getAttributeDescriptor(attributeName: String?, tag: XmlTag?): XmlAttributeDescriptor? {
        if (tag != null)
        {
            val descriptor = vuejs?.attrLookup?.get(attributeName) ?: return null
            return descriptor
        }

        return null
    }

}