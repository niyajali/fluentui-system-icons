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

package fluent.ui.system.icons.regular

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
 * ChatMail Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in real time chat scenarios (versus comment - different icon).
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_chat_mail_20_regular.svg)
 * 
 * @return The [ImageVector] for the ChatMail icon.
 */
public val FluentIcons.Regular.ChatMail: ImageVector
    get() {
        if (_chatMail != null) {
            return _chatMail!!
        }
        _chatMail = Builder(name = "ChatMail", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 5.724f, 6.224f, 5.5f, 6.5f, 5.5f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 5.5f, 10.0f, 5.724f, 10.0f, 6.0f)
                curveTo(10.0f, 6.276f, 9.776f, 6.5f, 9.5f, 6.5f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 6.5f, 6.0f, 6.276f, 6.0f, 6.0f)
                close()
                moveTo(6.5f, 7.5f)
                curveTo(6.224f, 7.5f, 6.0f, 7.724f, 6.0f, 8.0f)
                curveTo(6.0f, 8.276f, 6.224f, 8.5f, 6.5f, 8.5f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 8.5f, 9.0f, 8.276f, 9.0f, 8.0f)
                curveTo(9.0f, 7.724f, 8.776f, 7.5f, 8.5f, 7.5f)
                horizontalLineTo(6.5f)
                close()
                moveTo(8.0f, 1.0f)
                curveTo(4.686f, 1.0f, 2.0f, 3.686f, 2.0f, 7.0f)
                curveTo(2.0f, 8.04f, 2.265f, 9.019f, 2.731f, 9.872f)
                lineTo(2.019f, 12.363f)
                curveTo(1.968f, 12.541f, 2.02f, 12.733f, 2.154f, 12.861f)
                curveTo(2.288f, 12.989f, 2.482f, 13.033f, 2.658f, 12.974f)
                lineTo(4.996f, 12.195f)
                curveTo(5.88f, 12.707f, 6.906f, 13.0f, 8.0f, 13.0f)
                curveTo(11.314f, 13.0f, 14.0f, 10.314f, 14.0f, 7.0f)
                curveTo(14.0f, 3.686f, 11.314f, 1.0f, 8.0f, 1.0f)
                close()
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 4.239f, 5.239f, 2.0f, 8.0f, 2.0f)
                curveTo(10.761f, 2.0f, 13.0f, 4.239f, 13.0f, 7.0f)
                curveTo(13.0f, 9.761f, 10.761f, 12.0f, 8.0f, 12.0f)
                curveTo(7.015f, 12.0f, 6.099f, 11.716f, 5.325f, 11.225f)
                curveTo(5.198f, 11.145f, 5.042f, 11.126f, 4.899f, 11.173f)
                lineTo(3.241f, 11.726f)
                lineTo(3.75f, 9.945f)
                curveTo(3.788f, 9.812f, 3.77f, 9.67f, 3.699f, 9.552f)
                curveTo(3.255f, 8.805f, 3.0f, 7.933f, 3.0f, 7.0f)
                close()
                moveTo(12.276f, 14.947f)
                lineTo(9.874f, 13.746f)
                curveTo(10.314f, 13.624f, 10.737f, 13.46f, 11.137f, 13.259f)
                lineTo(12.5f, 13.941f)
                lineTo(17.0f, 11.691f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 10.448f, 16.552f, 10.0f, 16.0f, 10.0f)
                horizontalLineTo(14.326f)
                curveTo(14.479f, 9.679f, 14.607f, 9.345f, 14.71f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 9.0f, 18.0f, 9.895f, 18.0f, 11.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 17.105f, 17.105f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(9.0f)
                curveTo(7.895f, 18.0f, 7.0f, 17.105f, 7.0f, 16.0f)
                verticalLineTo(13.929f)
                curveTo(7.327f, 13.976f, 7.66f, 14.0f, 8.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(8.0f, 16.552f, 8.448f, 17.0f, 9.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 17.0f, 17.0f, 16.552f, 17.0f, 16.0f)
                verticalLineTo(12.809f)
                lineTo(12.724f, 14.947f)
                curveTo(12.583f, 15.017f, 12.417f, 15.017f, 12.276f, 14.947f)
                close()
            }
        }
        .build()
        return _chatMail!!
    }

@Suppress("ObjectPropertyName")
private var _chatMail: ImageVector? = null

@Preview
@Composable
private fun ChatMailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChatMail, contentDescription = "ChatMail Icon")
    }
}

