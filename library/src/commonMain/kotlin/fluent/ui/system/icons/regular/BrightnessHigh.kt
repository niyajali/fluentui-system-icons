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

public val FluentIcons.Regular.BrightnessHigh: ImageVector
    get() {
        if (_BrightnessHigh != null) {
            return _BrightnessHigh!!
        }
        _BrightnessHigh = ImageVector.Builder(
            name = "Regular.BrightnessHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(12.414f, 2f, 12.75f, 2.336f, 12.75f, 2.75f)
                verticalLineTo(4.25f)
                curveTo(12.75f, 4.664f, 12.414f, 5f, 12f, 5f)
                curveTo(11.586f, 5f, 11.25f, 4.664f, 11.25f, 4.25f)
                verticalLineTo(2.75f)
                curveTo(11.25f, 2.336f, 11.586f, 2f, 12f, 2f)
                close()
                moveTo(12f, 17f)
                curveTo(14.761f, 17f, 17f, 14.761f, 17f, 12f)
                curveTo(17f, 9.239f, 14.761f, 7f, 12f, 7f)
                curveTo(9.239f, 7f, 7f, 9.239f, 7f, 12f)
                curveTo(7f, 14.761f, 9.239f, 17f, 12f, 17f)
                close()
                moveTo(12f, 15.5f)
                curveTo(10.067f, 15.5f, 8.5f, 13.933f, 8.5f, 12f)
                curveTo(8.5f, 10.067f, 10.067f, 8.5f, 12f, 8.5f)
                curveTo(13.933f, 8.5f, 15.5f, 10.067f, 15.5f, 12f)
                curveTo(15.5f, 13.933f, 13.933f, 15.5f, 12f, 15.5f)
                close()
                moveTo(21.25f, 12.75f)
                curveTo(21.664f, 12.75f, 22f, 12.414f, 22f, 12f)
                curveTo(22f, 11.586f, 21.664f, 11.25f, 21.25f, 11.25f)
                horizontalLineTo(19.75f)
                curveTo(19.336f, 11.25f, 19f, 11.586f, 19f, 12f)
                curveTo(19f, 12.414f, 19.336f, 12.75f, 19.75f, 12.75f)
                horizontalLineTo(21.25f)
                close()
                moveTo(12f, 19f)
                curveTo(12.414f, 19f, 12.75f, 19.336f, 12.75f, 19.75f)
                verticalLineTo(21.25f)
                curveTo(12.75f, 21.664f, 12.414f, 22f, 12f, 22f)
                curveTo(11.586f, 22f, 11.25f, 21.664f, 11.25f, 21.25f)
                verticalLineTo(19.75f)
                curveTo(11.25f, 19.336f, 11.586f, 19f, 12f, 19f)
                close()
                moveTo(4.25f, 12.75f)
                curveTo(4.664f, 12.75f, 5f, 12.414f, 5f, 12f)
                curveTo(5f, 11.586f, 4.664f, 11.25f, 4.25f, 11.25f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 11.25f, 2f, 11.586f, 2f, 12f)
                curveTo(2f, 12.414f, 2.336f, 12.75f, 2.75f, 12.75f)
                horizontalLineTo(4.25f)
                close()
                moveTo(4.22f, 4.22f)
                curveTo(4.513f, 3.927f, 4.987f, 3.927f, 5.28f, 4.22f)
                lineTo(6.78f, 5.72f)
                curveTo(7.073f, 6.013f, 7.073f, 6.488f, 6.78f, 6.781f)
                curveTo(6.487f, 7.074f, 6.013f, 7.074f, 5.72f, 6.781f)
                lineTo(4.22f, 5.281f)
                curveTo(3.927f, 4.988f, 3.927f, 4.513f, 4.22f, 4.22f)
                close()
                moveTo(5.28f, 19.781f)
                curveTo(4.987f, 20.074f, 4.513f, 20.074f, 4.22f, 19.781f)
                curveTo(3.927f, 19.488f, 3.927f, 19.013f, 4.22f, 18.72f)
                lineTo(5.72f, 17.22f)
                curveTo(6.013f, 16.927f, 6.487f, 16.927f, 6.78f, 17.22f)
                curveTo(7.073f, 17.513f, 7.073f, 17.988f, 6.78f, 18.281f)
                lineTo(5.28f, 19.781f)
                close()
                moveTo(19.78f, 4.22f)
                curveTo(19.487f, 3.927f, 19.013f, 3.927f, 18.72f, 4.22f)
                lineTo(17.22f, 5.72f)
                curveTo(16.927f, 6.013f, 16.927f, 6.488f, 17.22f, 6.781f)
                curveTo(17.513f, 7.074f, 17.987f, 7.074f, 18.28f, 6.781f)
                lineTo(19.78f, 5.281f)
                curveTo(20.073f, 4.988f, 20.073f, 4.513f, 19.78f, 4.22f)
                close()
                moveTo(18.72f, 19.781f)
                curveTo(19.013f, 20.074f, 19.487f, 20.074f, 19.78f, 19.781f)
                curveTo(20.073f, 19.488f, 20.073f, 19.013f, 19.78f, 18.72f)
                lineTo(18.28f, 17.22f)
                curveTo(17.987f, 16.927f, 17.513f, 16.927f, 17.22f, 17.22f)
                curveTo(16.927f, 17.513f, 16.927f, 17.988f, 17.22f, 18.281f)
                lineTo(18.72f, 19.781f)
                close()
            }
        }.build()

        return _BrightnessHigh!!
    }

@Suppress("ObjectPropertyName")
private var _BrightnessHigh: ImageVector? = null

@Preview
@Composable
private fun BrightnessHighPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BrightnessHigh, contentDescription = null)
    }
}
