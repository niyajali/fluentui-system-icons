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

public val FluentIcons.Regular.BrightnessLow: ImageVector
    get() {
        if (_BrightnessLow != null) {
            return _BrightnessLow!!
        }
        _BrightnessLow = ImageVector.Builder(
            name = "Regular.BrightnessLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.5f)
                curveTo(12.414f, 3.5f, 12.75f, 3.836f, 12.75f, 4.25f)
                verticalLineTo(5.25f)
                curveTo(12.75f, 5.664f, 12.414f, 6f, 12f, 6f)
                curveTo(11.586f, 6f, 11.25f, 5.664f, 11.25f, 5.25f)
                verticalLineTo(4.25f)
                curveTo(11.25f, 3.836f, 11.586f, 3.5f, 12f, 3.5f)
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
                moveTo(19.75f, 12.75f)
                curveTo(20.164f, 12.75f, 20.5f, 12.414f, 20.5f, 12f)
                curveTo(20.5f, 11.586f, 20.164f, 11.25f, 19.75f, 11.25f)
                horizontalLineTo(18.75f)
                curveTo(18.336f, 11.25f, 18f, 11.586f, 18f, 12f)
                curveTo(18f, 12.414f, 18.336f, 12.75f, 18.75f, 12.75f)
                horizontalLineTo(19.75f)
                close()
                moveTo(12f, 18f)
                curveTo(12.414f, 18f, 12.75f, 18.336f, 12.75f, 18.75f)
                verticalLineTo(19.75f)
                curveTo(12.75f, 20.164f, 12.414f, 20.5f, 12f, 20.5f)
                curveTo(11.586f, 20.5f, 11.25f, 20.164f, 11.25f, 19.75f)
                verticalLineTo(18.75f)
                curveTo(11.25f, 18.336f, 11.586f, 18f, 12f, 18f)
                close()
                moveTo(5.25f, 12.75f)
                curveTo(5.664f, 12.75f, 6f, 12.414f, 6f, 12f)
                curveTo(6f, 11.586f, 5.664f, 11.25f, 5.25f, 11.25f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 11.25f, 3.5f, 11.586f, 3.5f, 12f)
                curveTo(3.5f, 12.414f, 3.836f, 12.75f, 4.25f, 12.75f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6.22f, 6.22f)
                curveTo(6.513f, 5.927f, 6.987f, 5.927f, 7.28f, 6.22f)
                lineTo(7.78f, 6.72f)
                curveTo(8.073f, 7.013f, 8.073f, 7.487f, 7.78f, 7.78f)
                curveTo(7.487f, 8.073f, 7.013f, 8.073f, 6.72f, 7.78f)
                lineTo(6.22f, 7.28f)
                curveTo(5.927f, 6.987f, 5.927f, 6.513f, 6.22f, 6.22f)
                close()
                moveTo(7.28f, 17.78f)
                curveTo(6.987f, 18.073f, 6.513f, 18.073f, 6.22f, 17.78f)
                curveTo(5.927f, 17.487f, 5.927f, 17.013f, 6.22f, 16.72f)
                lineTo(6.72f, 16.22f)
                curveTo(7.013f, 15.927f, 7.487f, 15.927f, 7.78f, 16.22f)
                curveTo(8.073f, 16.513f, 8.073f, 16.987f, 7.78f, 17.28f)
                lineTo(7.28f, 17.78f)
                close()
                moveTo(17.78f, 6.22f)
                curveTo(17.487f, 5.927f, 17.013f, 5.927f, 16.72f, 6.22f)
                lineTo(16.22f, 6.72f)
                curveTo(15.927f, 7.013f, 15.927f, 7.487f, 16.22f, 7.78f)
                curveTo(16.513f, 8.073f, 16.987f, 8.073f, 17.28f, 7.78f)
                lineTo(17.78f, 7.28f)
                curveTo(18.073f, 6.987f, 18.073f, 6.513f, 17.78f, 6.22f)
                close()
                moveTo(16.72f, 17.78f)
                curveTo(17.013f, 18.073f, 17.487f, 18.073f, 17.78f, 17.78f)
                curveTo(18.073f, 17.487f, 18.073f, 17.013f, 17.78f, 16.72f)
                lineTo(17.28f, 16.22f)
                curveTo(16.987f, 15.927f, 16.513f, 15.927f, 16.22f, 16.22f)
                curveTo(15.927f, 16.513f, 15.927f, 16.987f, 16.22f, 17.28f)
                lineTo(16.72f, 17.78f)
                close()
            }
        }.build()

        return _BrightnessLow!!
    }

@Suppress("ObjectPropertyName")
private var _BrightnessLow: ImageVector? = null

@Preview
@Composable
private fun BrightnessLowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BrightnessLow, contentDescription = null)
    }
}
