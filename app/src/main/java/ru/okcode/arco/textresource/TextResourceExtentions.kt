package ru.okcode.arco.textresource

import androidx.annotation.StringRes
import ru.okcode.arco.android_core.string.TextResource

fun TextResource.Companion.from(@StringRes stringResId: Int, intValue: Int): FormattedTextResource =
    FormattedTextResource(stringResId, intValue)