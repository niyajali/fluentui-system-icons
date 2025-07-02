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
 * PhoneEraser icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: phone, eraser
 * - Source: ic_fluent_phone_eraser_20_regular.svg
 * 
 * @return The [ImageVector] for the PhoneEraser icon.
 */
public val FluentIcons.Regular.PhoneEraser: ImageVector
    get() {
        if (_phoneEraser != null) {
            return _phoneEraser!!
        }
        _phoneEraser = Builder(name = "PhoneEraser", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.578f, 1.439f)
                curveTo(15.163f, 0.854f, 16.113f, 0.854f, 16.699f, 1.439f)
                lineTo(18.561f, 3.301f)
                curveTo(19.147f, 3.887f, 19.147f, 4.837f, 18.561f, 5.423f)
                lineTo(13.423f, 10.561f)
                curveTo(12.837f, 11.146f, 11.887f, 11.146f, 11.301f, 10.561f)
                lineTo(9.439f, 8.699f)
                curveTo(8.854f, 8.113f, 8.854f, 7.163f, 9.439f, 6.577f)
                lineTo(14.578f, 1.439f)
                close()
                moveTo(10.146f, 7.285f)
                curveTo(9.951f, 7.48f, 9.951f, 7.796f, 10.146f, 7.992f)
                lineTo(12.008f, 9.854f)
                curveTo(12.204f, 10.049f, 12.52f, 10.049f, 12.715f, 9.854f)
                lineTo(14.005f, 8.564f)
                lineTo(11.436f, 5.995f)
                lineTo(10.146f, 7.285f)
                close()
                moveTo(12.532f, 2.071f)
                curveTo(12.362f, 2.025f, 12.184f, 2.0f, 12.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 2.0f, 4.0f, 2.895f, 4.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.105f, 4.895f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(12.0f)
                curveTo(13.105f, 18.0f, 14.0f, 17.105f, 14.0f, 16.0f)
                verticalLineTo(11.389f)
                curveTo(13.703f, 11.647f, 13.36f, 11.823f, 13.0f, 11.918f)
                verticalLineTo(16.0f)
                curveTo(13.0f, 16.552f, 12.552f, 17.0f, 12.0f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 17.0f, 5.0f, 16.552f, 5.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.448f, 5.448f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(11.603f)
                lineTo(12.532f, 2.071f)
                close()
                moveTo(7.5f, 14.5f)
                curveTo(7.5f, 14.224f, 7.724f, 14.0f, 8.0f, 14.0f)
                horizontalLineTo(10.0f)
                curveTo(10.276f, 14.0f, 10.5f, 14.224f, 10.5f, 14.5f)
                curveTo(10.5f, 14.776f, 10.276f, 15.0f, 10.0f, 15.0f)
                horizontalLineTo(8.0f)
                curveTo(7.724f, 15.0f, 7.5f, 14.776f, 7.5f, 14.5f)
                close()
            }
        }
        .build()
        return _phoneEraser!!
    }

@Suppress("ObjectPropertyName")
private var _phoneEraser: ImageVector? = null

@Preview
@Composable
private fun PhoneEraserPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneEraser, contentDescription = null)
    }
}

