package org.vuejs.codeInsight.attributes;

import com.intellij.lang.javascript.psi.JSImplicitElementProvider;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.StubIndexKey;
import com.intellij.util.ArrayUtil;
import com.intellij.xml.impl.BasicXmlAttributeDescriptor;
import com.intellij.xml.impl.XmlAttributeDescriptorEx;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VueJSAttributeDescriptor extends BasicXmlAttributeDescriptor implements XmlAttributeDescriptorEx {

    private final Project project;
    private final String attributeName;
    private final StubIndexKey<String, JSImplicitElementProvider> index;

    public VueJSAttributeDescriptor(final Project project, String attributeName, final StubIndexKey<String, JSImplicitElementProvider> index) {
        this.project = project;
        this.attributeName = attributeName;
        this.index = index;
    }

    @Nullable
    @Override
    public String handleTargetRename(@NotNull @NonNls String newTargetName) {
        return newTargetName;
    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public boolean hasIdType() {
        return false;
    }

    @Override
    public boolean hasIdRefType() {
        return false;
    }

    @Override
    public boolean isEnumerated() {
        return index != null;
    }

    @Override
    public PsiElement getDeclaration() {
        return null;
    }

    @Override
    public String getName() {
        return attributeName;
    }

    @Override
    public void init(PsiElement element) {
    }

    @Override
    public Object[] getDependences() {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Override
    public boolean isFixed() {
        return false;
    }

    @Override
    public String getDefaultValue() {
        return null;
    }

    @Override
    public String[] getEnumeratedValues() {
        return ArrayUtil.EMPTY_STRING_ARRAY;
    }
}
