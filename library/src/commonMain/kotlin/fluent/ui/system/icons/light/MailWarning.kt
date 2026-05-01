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

package fluent.ui.system.icons.light

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
 * MailWarning Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon, outlook
 * - Description: Used in general mail scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mail_warning_32_light.svg)
 * 
 * @return The [ImageVector] for the MailWarning icon.
 */
public val FluentIcons.Light.MailWarning: ImageVector
    get() {
        if (_mailWarning != null) {
            return _mailWarning!!
        }
        _mailWarning = Builder(name = "MailWarning", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.958f, 6.001f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 6.001f, 3.0f, 7.568f, 3.0f, 9.501f)
                verticalLineTo(10.207f)
                lineTo(16.0f, 17.428f)
                lineTo(20.37f, 15.0f)
                horizontalLineTo(22.43f)
                lineTo(16.243f, 18.438f)
                curveTo(16.092f, 18.522f, 15.908f, 18.522f, 15.757f, 18.438f)
                lineTo(3.0f, 11.35f)
                verticalLineTo(22.5f)
                curveTo(3.0f, 24.433f, 4.567f, 26.0f, 6.5f, 26.0f)
                horizontalLineTo(25.5f)
                curveTo(27.433f, 26.0f, 29.0f, 24.433f, 29.0f, 22.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(29.503f)
                curveTo(29.674f, 15.0f, 29.841f, 14.983f, 30.0f, 14.952f)
                verticalLineTo(22.5f)
                curveTo(30.0f, 24.986f, 27.985f, 27.0f, 25.5f, 27.0f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 27.0f, 2.0f, 24.986f, 2.0f, 22.5f)
                verticalLineTo(9.501f)
                curveTo(2.0f, 7.015f, 4.015f, 5.001f, 6.5f, 5.001f)
                horizontalLineTo(20.459f)
                lineTo(19.958f, 6.001f)
                close()
                moveTo(23.164f, 1.828f)
                curveTo(23.717f, 0.724f, 25.283f, 0.724f, 25.836f, 1.828f)
                lineTo(30.838f, 11.82f)
                curveTo(31.339f, 12.82f, 30.616f, 14.0f, 29.502f, 14.0f)
                horizontalLineTo(19.498f)
                curveTo(18.384f, 14.0f, 17.661f, 12.82f, 18.162f, 11.82f)
                lineTo(23.164f, 1.828f)
                close()
                moveTo(24.5f, 11.0f)
                curveTo(24.224f, 11.0f, 24.0f, 11.224f, 24.0f, 11.5f)
                curveTo(24.0f, 11.776f, 24.224f, 12.0f, 24.5f, 12.0f)
                curveTo(24.776f, 12.0f, 25.0f, 11.776f, 25.0f, 11.5f)
                curveTo(25.0f, 11.224f, 24.776f, 11.0f, 24.5f, 11.0f)
                close()
                moveTo(24.5f, 4.001f)
                curveTo(24.224f, 4.001f, 24.0f, 4.224f, 24.0f, 4.501f)
                verticalLineTo(9.501f)
                curveTo(24.0f, 9.777f, 24.224f, 10.0f, 24.5f, 10.0f)
                curveTo(24.776f, 10.0f, 25.0f, 9.777f, 25.0f, 9.501f)
                verticalLineTo(4.501f)
                curveTo(25.0f, 4.224f, 24.776f, 4.001f, 24.5f, 4.001f)
                close()
            }
        }
        .build()
        return _mailWarning!!
    }

@Suppress("ObjectPropertyName")
private var _mailWarning: ImageVector? = null

@Preview
@Composable
private fun MailWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailWarning, contentDescription = "MailWarning Icon")
    }
}

