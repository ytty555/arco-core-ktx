package ru.okcode.arco.android_core.string

import androidx.annotation.StringRes

/**
 * TextResource based on android string resources
 * @param stringResId is a string resource id that provides text string for your application
 */
data class IdTextResource(@StringRes val stringResId: Int) : TextResource() {
    override fun toString(): String {
        return resources?.getString(stringResId)
            ?: error(TO_STRING_RESOURCES_ERROR)
    }
}
