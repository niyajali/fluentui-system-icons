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
 * MailInboxArrowDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook
 * - Description: Used to represent mail inbox.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mail_inbox_arrow_down_20_filled.svg)
 * 
 * @return The [ImageVector] for the MailInboxArrowDown icon.
 */
public val FluentIcons.Filled.MailInboxArrowDown: ImageVector
    get() {
        if (_mailInboxArrowDown != null) {
            return _mailInboxArrowDown!!
        }
        _mailInboxArrowDown = Builder(name = "MailInboxArrowDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 10.4f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 11.0f, 12.001f, 11.223f, 12.0f, 11.498f)
                lineTo(12.0f, 11.499f)
                lineTo(12.0f, 11.511f)
                curveTo(11.999f, 11.524f, 11.998f, 11.544f, 11.996f, 11.572f)
                curveTo(11.993f, 11.627f, 11.984f, 11.709f, 11.968f, 11.808f)
                curveTo(11.934f, 12.01f, 11.868f, 12.271f, 11.74f, 12.526f)
                curveTo(11.614f, 12.78f, 11.432f, 13.018f, 11.168f, 13.193f)
                curveTo(10.907f, 13.367f, 10.538f, 13.5f, 10.0f, 13.5f)
                curveTo(9.462f, 13.5f, 9.093f, 13.367f, 8.832f, 13.193f)
                curveTo(8.568f, 13.018f, 8.386f, 12.78f, 8.26f, 12.526f)
                curveTo(8.132f, 12.271f, 8.066f, 12.01f, 8.032f, 11.808f)
                curveTo(8.016f, 11.709f, 8.008f, 11.627f, 8.004f, 11.572f)
                curveTo(8.002f, 11.544f, 8.001f, 11.524f, 8.0f, 11.511f)
                lineTo(8.0f, 11.499f)
                curveTo(8.0f, 11.223f, 7.776f, 11.0f, 7.5f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 5.895f, 4.895f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(8.022f)
                curveTo(8.053f, 4.657f, 8.116f, 4.322f, 8.207f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 4.0f, 3.0f, 5.343f, 3.0f, 7.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.657f, 4.343f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 18.0f, 17.0f, 16.657f, 17.0f, 15.0f)
                verticalLineTo(9.743f)
                curveTo(16.693f, 9.996f, 16.358f, 10.217f, 16.0f, 10.4f)
                close()
                moveTo(13.5f, 10.0f)
                curveTo(15.985f, 10.0f, 18.0f, 7.985f, 18.0f, 5.5f)
                curveTo(18.0f, 3.015f, 15.985f, 1.0f, 13.5f, 1.0f)
                curveTo(11.015f, 1.0f, 9.0f, 3.015f, 9.0f, 5.5f)
                curveTo(9.0f, 7.985f, 11.015f, 10.0f, 13.5f, 10.0f)
                close()
                moveTo(11.146f, 5.854f)
                curveTo(10.951f, 5.658f, 10.951f, 5.342f, 11.146f, 5.146f)
                curveTo(11.342f, 4.951f, 11.658f, 4.951f, 11.854f, 5.146f)
                lineTo(13.0f, 6.293f)
                verticalLineTo(3.5f)
                curveTo(13.0f, 3.224f, 13.224f, 3.0f, 13.5f, 3.0f)
                curveTo(13.776f, 3.0f, 14.0f, 3.224f, 14.0f, 3.5f)
                verticalLineTo(6.293f)
                lineTo(15.146f, 5.146f)
                curveTo(15.342f, 4.951f, 15.658f, 4.951f, 15.854f, 5.146f)
                curveTo(16.049f, 5.342f, 16.049f, 5.658f, 15.854f, 5.854f)
                lineTo(13.854f, 7.854f)
                curveTo(13.806f, 7.901f, 13.75f, 7.938f, 13.691f, 7.962f)
                curveTo(13.633f, 7.986f, 13.57f, 8.0f, 13.503f, 8.0f)
                lineTo(13.5f, 8.0f)
                lineTo(13.497f, 8.0f)
                curveTo(13.43f, 8.0f, 13.367f, 7.986f, 13.309f, 7.962f)
                curveTo(13.25f, 7.938f, 13.196f, 7.903f, 13.149f, 7.856f)
                lineTo(13.146f, 7.853f)
                lineTo(11.146f, 5.854f)
                close()
            }
        }
        .build()
        return _mailInboxArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _mailInboxArrowDown: ImageVector? = null

@Preview
@Composable
private fun MailInboxArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailInboxArrowDown, contentDescription = "MailInboxArrowDown Icon")
    }
}

