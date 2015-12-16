package org.vuejs

import com.intellij.psi.PsiElement
import com.intellij.xml.impl.schema.AnyXmlAttributeDescriptor

public class VueJSAttributeDescriptor(attributeName: String?) : AnyXmlAttributeDescriptor(attributeName) {
    var attrName = attributeName

    override fun getDeclaration(): PsiElement? {
        return null;
    }
}