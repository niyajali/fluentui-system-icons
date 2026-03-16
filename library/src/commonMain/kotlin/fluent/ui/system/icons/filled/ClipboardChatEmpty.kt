/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * ClipboardChatEmpty Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in copy & task scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_clipboard_chat_empty_24_filled.svg)
 * 
 * @return The [ImageVector] for the ClipboardChatEmpty icon.
 */
public val FluentIcons.Filled.ClipboardChatEmpty: ImageVector
    get() {
        if (_clipboardChatEmpty != null) {
            return _clipboardChatEmpty!!
        }
        _clipboardChatEmpty = Builder(name = "ClipboardChatEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
                curveTo(14.908f, 2.0f, 15.862f, 2.875f, 15.986f, 4.0f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4.0f, 20.0f, 5.007f, 20.0f, 6.25f)
                verticalLineTo(9.504f)
                curveTo(18.71f, 8.534f, 17.113f, 8.0f, 15.5f, 8.0f)
                curveTo(11.358f, 8.0f, 8.0f, 11.358f, 8.0f, 15.5f)
                curveTo(8.0f, 16.58f, 8.243f, 17.681f, 8.698f, 18.66f)
                lineTo(8.073f, 20.748f)
                curveTo(7.947f, 21.17f, 7.987f, 21.615f, 8.17f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22.0f, 4.0f, 20.993f, 4.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4.0f, 5.007f, 5.007f, 4.0f, 6.25f, 4.0f)
                horizontalLineTo(8.014f)
                curveTo(8.138f, 2.875f, 9.092f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(10.25f, 3.5f)
                curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
                curveTo(9.5f, 4.664f, 9.836f, 5.0f, 10.25f, 5.0f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 5.0f, 14.5f, 4.664f, 14.5f, 4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(22.0f, 15.5f)
                curveTo(22.0f, 19.09f, 19.09f, 22.0f, 15.5f, 22.0f)
                curveTo(14.391f, 22.0f, 13.346f, 21.72f, 12.431f, 21.229f)
                lineTo(9.966f, 21.969f)
                curveTo(9.702f, 22.048f, 9.415f, 21.975f, 9.22f, 21.78f)
                curveTo(9.025f, 21.585f, 8.952f, 21.299f, 9.031f, 21.035f)
                lineTo(9.77f, 18.568f)
                curveTo(9.26f, 17.618f, 9.018f, 16.573f, 9.0f, 15.5f)
                curveTo(9.0f, 11.91f, 11.91f, 9.0f, 15.5f, 9.0f)
                curveTo(19.09f, 9.0f, 22.0f, 11.888f, 22.0f, 15.5f)
                close()
            }
        }
        .build()
        return _clipboardChatEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _clipboardChatEmpty: ImageVector? = null

@Preview
@Composable
private fun ClipboardChatEmptyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardChatEmpty, contentDescription = "ClipboardChatEmpty Icon")
    }
}

