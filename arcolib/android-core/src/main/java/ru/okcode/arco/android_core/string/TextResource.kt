package ru.okcode.arco.android_core.string

import android.content.res.Resources
import androidx.annotation.StringRes

abstract class TextResource {
    protected var resources: Resources? = null
        private set

    fun toString(resources: Resources): String {
        this.resources = resources
        return this.toString()
    }

    companion object {
        fun from(string: String): SimpleTextResource = SimpleTextResource(string)
        fun from(@StringRes stringResId: Int): IdTextResource = IdTextResource(stringResId)

        const val TO_STRING_RESOURCES_ERROR =
            "Resources needed to get the string. Use 'toString(resources: Resources) function instead of 'toString()'!"
    }
}
