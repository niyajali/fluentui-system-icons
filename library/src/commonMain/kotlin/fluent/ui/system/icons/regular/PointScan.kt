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

public val FluentIcons.Regular.PointScan: ImageVector
    get() {
        if (_PointScan != null) {
            return _PointScan!!
        }
        _PointScan = ImageVector.Builder(
            name = "Regular.PointScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.25f, 2f)
                curveTo(10.63f, 2f, 10.944f, 2.282f, 10.993f, 2.648f)
                lineTo(11f, 2.75f)
                lineTo(11.001f, 7.544f)
                curveTo(13.853f, 7.885f, 16.115f, 10.148f, 16.456f, 13f)
                lineTo(21.25f, 13f)
                curveTo(21.664f, 13f, 22f, 13.336f, 22f, 13.75f)
                curveTo(22f, 14.13f, 21.718f, 14.443f, 21.352f, 14.493f)
                lineTo(21.25f, 14.5f)
                lineTo(16.456f, 14.501f)
                curveTo(16.114f, 17.353f, 13.852f, 19.614f, 11.001f, 19.955f)
                lineTo(11f, 21.25f)
                curveTo(11f, 21.664f, 10.665f, 22f, 10.25f, 22f)
                curveTo(9.871f, 22f, 9.557f, 21.718f, 9.507f, 21.352f)
                lineTo(9.5f, 21.25f)
                lineTo(9.5f, 19.955f)
                curveTo(6.648f, 19.614f, 4.386f, 17.353f, 4.045f, 14.501f)
                lineTo(2.75f, 14.5f)
                curveTo(2.336f, 14.5f, 2f, 14.164f, 2f, 13.75f)
                curveTo(2f, 13.37f, 2.282f, 13.057f, 2.648f, 13.007f)
                lineTo(2.75f, 13f)
                lineTo(4.044f, 13f)
                curveTo(4.385f, 10.148f, 6.648f, 7.885f, 9.5f, 7.544f)
                lineTo(9.5f, 2.75f)
                curveTo(9.5f, 2.336f, 9.836f, 2f, 10.25f, 2f)
                close()
                moveTo(9.5f, 14.5f)
                lineTo(5.559f, 14.501f)
                curveTo(5.88f, 16.523f, 7.478f, 18.12f, 9.5f, 18.441f)
                lineTo(9.5f, 14.5f)
                close()
                moveTo(14.941f, 14.501f)
                lineTo(11f, 14.5f)
                lineTo(11.001f, 18.441f)
                curveTo(13.023f, 18.12f, 14.62f, 16.523f, 14.941f, 14.501f)
                close()
                moveTo(9.5f, 9.058f)
                curveTo(7.477f, 9.379f, 5.879f, 10.977f, 5.559f, 13f)
                lineTo(9.5f, 13f)
                lineTo(9.5f, 9.058f)
                close()
                moveTo(11.001f, 9.058f)
                lineTo(11f, 13f)
                lineTo(14.942f, 13f)
                curveTo(14.632f, 11.05f, 13.136f, 9.494f, 11.216f, 9.098f)
                lineTo(11.001f, 9.058f)
                close()
            }
        }.build()

        return _PointScan!!
    }

@Suppress("ObjectPropertyName")
private var _PointScan: ImageVector? = null

@Preview
@Composable
private fun PointScanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PointScan, contentDescription = null)
    }
}
