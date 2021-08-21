package ru.okcode.arco.android_core.string

/**
 * TextResource based on simple string value
 * @param string is a simple string value
 */
data class SimpleTextResource(val string: String) : TextResource() {
    override fun toString(): String = string
}