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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ClockBill: ImageVector
    get() {
        if (_ClockBill != null) {
            return _ClockBill!!
        }
        _ClockBill = ImageVector.Builder(
            name = "Regular.ClockBill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 11f)
                curveTo(4.5f, 6.306f, 8.306f, 2.5f, 13f, 2.5f)
                curveTo(17.694f, 2.5f, 21.5f, 6.306f, 21.5f, 11f)
                curveTo(21.5f, 15.694f, 17.694f, 19.5f, 13f, 19.5f)
                curveTo(12.312f, 19.5f, 11.642f, 19.418f, 11.002f, 19.264f)
                verticalLineTo(20.5f)
                curveTo(11.002f, 20.6f, 10.997f, 20.7f, 10.989f, 20.798f)
                curveTo(11.639f, 20.93f, 12.311f, 21f, 13f, 21f)
                curveTo(18.523f, 21f, 23f, 16.523f, 23f, 11f)
                curveTo(23f, 5.477f, 18.523f, 1f, 13f, 1f)
                curveTo(7.477f, 1f, 3f, 5.477f, 3f, 11f)
                lineTo(3f, 11.036f)
                curveTo(3.164f, 11.012f, 3.331f, 11f, 3.501f, 11f)
                horizontalLineTo(4.5f)
                close()
                moveTo(12.993f, 5.648f)
                curveTo(12.943f, 5.282f, 12.63f, 5f, 12.25f, 5f)
                curveTo(11.836f, 5f, 11.5f, 5.336f, 11.5f, 5.75f)
                verticalLineTo(11.75f)
                lineTo(11.507f, 11.852f)
                curveTo(11.557f, 12.218f, 11.87f, 12.5f, 12.25f, 12.5f)
                horizontalLineTo(16.25f)
                lineTo(16.352f, 12.493f)
                curveTo(16.718f, 12.443f, 17f, 12.13f, 17f, 11.75f)
                curveTo(17f, 11.336f, 16.664f, 11f, 16.25f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(5.75f)
                lineTo(12.993f, 5.648f)
                close()
                moveTo(1f, 14.5f)
                curveTo(1f, 13.119f, 2.119f, 12f, 3.5f, 12f)
                horizontalLineTo(7.5f)
                curveTo(8.881f, 12f, 10f, 13.119f, 10f, 14.5f)
                verticalLineTo(20.5f)
                curveTo(10f, 21.881f, 8.881f, 23f, 7.5f, 23f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 23f, 1f, 21.881f, 1f, 20.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(7.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 14f, 3f, 14.224f, 3f, 14.5f)
                curveTo(3f, 14.776f, 3.224f, 15f, 3.5f, 15f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 15f, 8f, 14.776f, 8f, 14.5f)
                curveTo(8f, 14.224f, 7.776f, 14f, 7.5f, 14f)
                close()
                moveTo(7.5f, 17f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 17f, 3f, 17.224f, 3f, 17.5f)
                curveTo(3f, 17.776f, 3.224f, 18f, 3.5f, 18f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 18f, 8f, 17.776f, 8f, 17.5f)
                curveTo(8f, 17.224f, 7.776f, 17f, 7.5f, 17f)
                close()
                moveTo(7.5f, 20f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 20f, 3f, 20.224f, 3f, 20.5f)
                curveTo(3f, 20.776f, 3.224f, 21f, 3.5f, 21f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 21f, 8f, 20.776f, 8f, 20.5f)
                curveTo(8f, 20.224f, 7.776f, 20f, 7.5f, 20f)
                close()
            }
        }.build()

        return _ClockBill!!
    }

@Suppress("ObjectPropertyName")
private var _ClockBill: ImageVector? = null

@Preview
@Composable
private fun ClockBillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClockBill, contentDescription = null)
    }
}
