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
 * TvUsb icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tv, usb
 * - Source: ic_fluent_tv_usb_24_regular.svg
 * 
 * @return The [ImageVector] for the TvUsb icon.
 */
public val FluentIcons.Regular.TvUsb: ImageVector
    get() {
        if (_tvUsb != null) {
            return _tvUsb!!
        }
        _tvUsb = Builder(name = "TvUsb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.75f, 3.0f)
                curveTo(3.231f, 3.0f, 2.0f, 4.231f, 2.0f, 5.75f)
                verticalLineTo(14.25f)
                curveTo(2.0f, 15.769f, 3.231f, 17.0f, 4.75f, 17.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 15.5f, 3.5f, 14.94f, 3.5f, 14.25f)
                verticalLineTo(5.75f)
                curveTo(3.5f, 5.06f, 4.06f, 4.5f, 4.75f, 4.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 4.5f, 20.5f, 5.06f, 20.5f, 5.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(21.0f)
                curveTo(21.356f, 8.5f, 21.694f, 8.574f, 22.0f, 8.708f)
                verticalLineTo(5.75f)
                curveTo(22.0f, 4.231f, 20.769f, 3.0f, 19.25f, 3.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(5.75f, 18.5f)
                horizontalLineTo(14.751f)
                curveTo(14.797f, 18.595f, 14.849f, 18.687f, 14.908f, 18.776f)
                lineTo(15.708f, 20.0f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 20.0f, 5.0f, 19.664f, 5.0f, 19.25f)
                curveTo(5.0f, 18.836f, 5.336f, 18.5f, 5.75f, 18.5f)
                close()
                moveTo(17.5f, 20.0f)
                lineTo(16.163f, 17.955f)
                curveTo(16.057f, 17.792f, 16.0f, 17.602f, 16.0f, 17.408f)
                verticalLineTo(14.0f)
                curveTo(16.0f, 13.448f, 16.448f, 13.0f, 17.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 10.448f, 17.448f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 10.0f, 22.0f, 10.448f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.552f, 13.0f, 23.0f, 13.448f, 23.0f, 14.0f)
                verticalLineTo(17.441f)
                curveTo(23.0f, 17.638f, 22.942f, 17.83f, 22.833f, 17.994f)
                lineTo(21.5f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(21.5f, 22.552f, 21.052f, 23.0f, 20.5f, 23.0f)
                horizontalLineTo(18.5f)
                curveTo(17.948f, 23.0f, 17.5f, 22.552f, 17.5f, 22.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(20.5f, 11.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _tvUsb!!
    }

@Suppress("ObjectPropertyName")
private var _tvUsb: ImageVector? = null

@Preview
@Composable
private fun TvUsbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TvUsb, contentDescription = null)
    }
}

