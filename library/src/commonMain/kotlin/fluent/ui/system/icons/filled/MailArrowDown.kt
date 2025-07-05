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
 * MailArrowDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook
 * - Description: Used in general mail scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mail_arrow_down_20_filled.svg)
 * 
 * @return The [ImageVector] for the MailArrowDown icon.
 */
public val FluentIcons.Filled.MailArrowDown: ImageVector
    get() {
        if (_mailArrowDown != null) {
            return _mailArrowDown!!
        }
        _mailArrowDown = Builder(name = "MailArrowDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                curveTo(15.83f, 11.0f, 17.049f, 10.528f, 18.0f, 9.743f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 15.881f, 16.881f, 17.0f, 15.5f, 17.0f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 17.0f, 2.0f, 15.881f, 2.0f, 14.5f)
                verticalLineTo(7.373f)
                lineTo(9.747f, 11.931f)
                curveTo(9.903f, 12.023f, 10.097f, 12.023f, 10.254f, 11.931f)
                lineTo(12.484f, 10.619f)
                curveTo(13.108f, 10.865f, 13.788f, 11.0f, 14.5f, 11.0f)
                close()
                moveTo(4.5f, 4.0f)
                horizontalLineTo(9.207f)
                curveTo(9.072f, 4.477f, 9.0f, 4.98f, 9.0f, 5.5f)
                curveTo(9.0f, 7.406f, 9.969f, 9.085f, 11.442f, 10.072f)
                lineTo(10.0f, 10.92f)
                lineTo(2.015f, 6.223f)
                curveTo(2.153f, 4.973f, 3.213f, 4.0f, 4.5f, 4.0f)
                close()
                moveTo(14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 7.985f, 19.0f, 5.5f)
                curveTo(19.0f, 3.015f, 16.985f, 1.0f, 14.5f, 1.0f)
                curveTo(12.015f, 1.0f, 10.0f, 3.015f, 10.0f, 5.5f)
                curveTo(10.0f, 7.985f, 12.015f, 10.0f, 14.5f, 10.0f)
                close()
                moveTo(12.146f, 5.854f)
                curveTo(11.951f, 5.658f, 11.951f, 5.342f, 12.146f, 5.146f)
                curveTo(12.342f, 4.951f, 12.658f, 4.951f, 12.854f, 5.146f)
                lineTo(14.0f, 6.293f)
                verticalLineTo(3.5f)
                curveTo(14.0f, 3.224f, 14.224f, 3.0f, 14.5f, 3.0f)
                curveTo(14.776f, 3.0f, 15.0f, 3.224f, 15.0f, 3.5f)
                verticalLineTo(6.293f)
                lineTo(16.146f, 5.146f)
                curveTo(16.342f, 4.951f, 16.658f, 4.951f, 16.854f, 5.146f)
                curveTo(17.049f, 5.342f, 17.049f, 5.658f, 16.854f, 5.854f)
                lineTo(14.854f, 7.854f)
                curveTo(14.806f, 7.901f, 14.75f, 7.938f, 14.691f, 7.962f)
                curveTo(14.633f, 7.986f, 14.57f, 8.0f, 14.503f, 8.0f)
                lineTo(14.5f, 8.0f)
                lineTo(14.497f, 8.0f)
                curveTo(14.43f, 8.0f, 14.367f, 7.986f, 14.309f, 7.962f)
                curveTo(14.25f, 7.938f, 14.196f, 7.903f, 14.149f, 7.856f)
                lineTo(14.146f, 7.853f)
                lineTo(12.146f, 5.854f)
                close()
            }
        }
        .build()
        return _mailArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _mailArrowDown: ImageVector? = null

@Preview
@Composable
private fun MailArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailArrowDown, contentDescription = "MailArrowDown Icon")
    }
}

