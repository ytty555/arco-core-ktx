package ru.okcode.arco.textresource

import androidx.annotation.StringRes
import ru.okcode.arco.android_core.string.TextResource

data class FormattedTextResource(
    @StringRes val formatStringResId: Int, val intValue: Int
) : TextResource() {
    override fun toString(): String =
        resources?.getString(formatStringResId, intValue) ?: error(TO_STRING_RESOURCES_ERROR)
}