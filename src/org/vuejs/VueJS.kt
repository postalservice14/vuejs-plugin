package org.vuejs

import com.intellij.openapi.components.AbstractProjectComponent
import com.intellij.openapi.project.Project
import com.intellij.xml.XmlAttributeDescriptor
import java.util.*
import kotlin.properties.Delegates

open class VueJS(project: Project) : AbstractProjectComponent(project) {
    var directiveNames: Array<String?> = arrayOf(
            "text",
            "html",
            "if",
            "show",
            "else",
            "for",
            "on",
            "bind",
            "model",
            "ref",
            "el",
            "pre",
            "cloak"
    )

    var attrs:List<VueJSAttributeDescriptor> by Delegates.notNull()
    var attrLookup:HashMap<String, VueJSAttributeDescriptor> = hashMapOf()
    var attrArray:Array<XmlAttributeDescriptor> by Delegates.notNull()

    companion object factory{
        fun getInstance(project : Project?) : VueJS {
            return project?.getComponent(javaClass<VueJS>())!!
        }
    }

    override fun initComponent() {
        attrs = directiveNames.map { name -> VueJSAttributeDescriptor("v-" + name)}
        attrs.forEach {
            descriptor -> attrLookup.put(descriptor.name!!, descriptor)
        }
        attrArray = attrs.toTypedArray()
    }

    override fun getComponentName(): String {
        return "VueJSProjectComponent"
    }
}