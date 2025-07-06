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
 * MailShield Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook
 * - Description: Used in general mail scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mail_shield_20_regular.svg)
 * 
 * @return The [ImageVector] for the MailShield icon.
 */
public val FluentIcons.Regular.MailShield: ImageVector
    get() {
        if (_mailShield != null) {
            return _mailShield!!
        }
        _mailShield = Builder(name = "MailShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 2.624f)
                curveTo(17.656f, 2.575f, 17.323f, 2.483f, 17.0f, 2.347f)
                curveTo(16.394f, 2.093f, 15.823f, 1.685f, 15.284f, 1.122f)
                curveTo(15.128f, 0.959f, 14.874f, 0.959f, 14.718f, 1.122f)
                curveTo(13.723f, 2.158f, 12.623f, 2.667f, 11.4f, 2.667f)
                curveTo(11.179f, 2.667f, 11.0f, 2.853f, 11.0f, 3.083f)
                verticalLineTo(5.584f)
                lineTo(11.004f, 5.85f)
                curveTo(11.046f, 7.097f, 11.384f, 8.15f, 12.01f, 9.0f)
                curveTo(12.285f, 9.372f, 12.615f, 9.706f, 13.0f, 10.0f)
                curveTo(13.523f, 10.4f, 14.148f, 10.727f, 14.873f, 10.979f)
                curveTo(14.956f, 11.007f, 15.044f, 11.007f, 15.127f, 10.979f)
                curveTo(17.687f, 10.09f, 19.0f, 8.266f, 19.0f, 5.584f)
                verticalLineTo(3.083f)
                lineTo(18.992f, 2.999f)
                curveTo(18.955f, 2.809f, 18.793f, 2.667f, 18.6f, 2.667f)
                curveTo(18.397f, 2.667f, 18.197f, 2.653f, 18.0f, 2.624f)
                close()
                moveTo(10.0f, 4.0f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 4.0f, 2.0f, 5.119f, 2.0f, 6.5f)
                verticalLineTo(14.5f)
                curveTo(2.0f, 15.881f, 3.119f, 17.0f, 4.5f, 17.0f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 17.0f, 18.0f, 15.881f, 18.0f, 14.5f)
                verticalLineTo(10.469f)
                curveTo(17.696f, 10.743f, 17.362f, 10.989f, 17.0f, 11.208f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 15.328f, 16.328f, 16.0f, 15.5f, 16.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 16.0f, 3.0f, 15.328f, 3.0f, 14.5f)
                verticalLineTo(7.963f)
                lineTo(9.746f, 11.931f)
                lineTo(9.828f, 11.969f)
                curveTo(9.967f, 12.021f, 10.123f, 12.008f, 10.253f, 11.931f)
                lineTo(12.303f, 10.725f)
                curveTo(12.027f, 10.507f, 11.774f, 10.269f, 11.544f, 10.011f)
                lineTo(10.0f, 10.92f)
                lineTo(3.0f, 6.802f)
                verticalLineTo(6.5f)
                curveTo(3.0f, 5.672f, 3.672f, 5.0f, 4.5f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _mailShield!!
    }

@Suppress("ObjectPropertyName")
private var _mailShield: ImageVector? = null

@Preview
@Composable
private fun MailShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailShield, contentDescription = "MailShield Icon")
    }
}

