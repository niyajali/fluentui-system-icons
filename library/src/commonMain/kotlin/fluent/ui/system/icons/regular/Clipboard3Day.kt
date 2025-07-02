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
 * Clipboard3Day icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: clipboard3day
 * - Source: ic_fluent_clipboard_3_day_24_regular.svg
 * 
 * @return The [ImageVector] for the Clipboard3Day icon.
 */
public val FluentIcons.Regular.Clipboard3Day: ImageVector
    get() {
        if (_clipboard3Day != null) {
            return _clipboard3Day!!
        }
        _clipboard3Day = Builder(name = "Clipboard3Day", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 17.25f)
                curveTo(8.0f, 17.664f, 8.336f, 18.0f, 8.75f, 18.0f)
                curveTo(9.164f, 18.0f, 9.5f, 17.664f, 9.5f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(9.5f, 9.336f, 9.164f, 9.0f, 8.75f, 9.0f)
                curveTo(8.336f, 9.0f, 8.0f, 9.336f, 8.0f, 9.75f)
                lineTo(8.0f, 17.25f)
                close()
                moveTo(15.25f, 18.0f)
                curveTo(14.836f, 18.0f, 14.5f, 17.664f, 14.5f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(14.5f, 9.336f, 14.836f, 9.0f, 15.25f, 9.0f)
                curveTo(15.664f, 9.0f, 16.0f, 9.336f, 16.0f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(16.0f, 17.664f, 15.664f, 18.0f, 15.25f, 18.0f)
                close()
                moveTo(11.25f, 17.25f)
                curveTo(11.25f, 17.664f, 11.586f, 18.0f, 12.0f, 18.0f)
                curveTo(12.414f, 18.0f, 12.75f, 17.664f, 12.75f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(12.75f, 9.336f, 12.414f, 9.0f, 12.0f, 9.0f)
                curveTo(11.586f, 9.0f, 11.25f, 9.336f, 11.25f, 9.75f)
                verticalLineTo(17.25f)
                close()
                moveTo(15.986f, 3.999f)
                curveTo(15.862f, 2.875f, 14.908f, 2.0f, 13.75f, 2.0f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2.0f, 8.138f, 2.875f, 8.014f, 3.999f)
                lineTo(6.25f, 4.0f)
                curveTo(5.007f, 4.0f, 4.0f, 5.007f, 4.0f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4.0f, 20.993f, 5.007f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 22.0f, 20.0f, 20.993f, 20.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20.0f, 5.007f, 18.993f, 4.0f, 17.75f, 4.0f)
                lineTo(15.986f, 3.999f)
                close()
                moveTo(15.995f, 4.096f)
                lineTo(16.0f, 4.25f)
                curveTo(16.0f, 4.198f, 15.998f, 4.147f, 15.995f, 4.096f)
                close()
                moveTo(10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.53f, 6.5f, 15.217f, 6.103f, 15.621f, 5.5f)
                lineTo(17.75f, 5.5f)
                curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(18.5f, 20.164f, 18.164f, 20.5f, 17.75f, 20.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
                lineTo(8.379f, 5.5f)
                curveTo(8.783f, 6.103f, 9.47f, 6.5f, 10.25f, 6.5f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5.0f, 13.75f, 5.0f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 5.0f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
            }
        }
        .build()
        return _clipboard3Day!!
    }

@Suppress("ObjectPropertyName")
private var _clipboard3Day: ImageVector? = null

@Preview
@Composable
private fun Clipboard3DayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Clipboard3Day, contentDescription = null)
    }
}

