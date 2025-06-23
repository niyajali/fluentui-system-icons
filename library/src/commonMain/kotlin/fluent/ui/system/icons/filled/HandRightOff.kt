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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.HandRightOff: ImageVector
    get() {
        if (_HandRightOff != null) {
            return _HandRightOff!!
        }
        _HandRightOff = ImageVector.Builder(
            name = "Filled.HandRightOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 6.061f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
                lineTo(16.414f, 17.475f)
                lineTo(16.307f, 17.599f)
                curveTo(15.69f, 18.31f, 15.166f, 19.096f, 14.745f, 19.937f)
                lineTo(14.612f, 20.204f)
                curveTo(14.061f, 21.306f, 12.936f, 22.001f, 11.705f, 22.001f)
                horizontalLineTo(9.537f)
                curveTo(8.494f, 22.001f, 7.47f, 21.497f, 6.914f, 20.542f)
                curveTo(6.168f, 19.263f, 5f, 16.933f, 5f, 14.754f)
                verticalLineTo(6.061f)
                close()
                moveTo(8f, 9.061f)
                lineTo(7f, 8.061f)
                verticalLineTo(10.998f)
                curveTo(7f, 11.274f, 7.224f, 11.498f, 7.5f, 11.498f)
                curveTo(7.776f, 11.498f, 8f, 11.274f, 8f, 10.998f)
                verticalLineTo(9.061f)
                close()
                moveTo(10f, 6.818f)
                lineTo(8f, 4.818f)
                verticalLineTo(4.25f)
                curveTo(8f, 3.698f, 8.448f, 3.25f, 9f, 3.25f)
                curveTo(9.552f, 3.25f, 10f, 3.698f, 10f, 4.25f)
                verticalLineTo(6.818f)
                close()
                moveTo(13f, 9.818f)
                lineTo(11f, 7.818f)
                verticalLineTo(2.997f)
                curveTo(11f, 2.445f, 11.448f, 1.997f, 12f, 1.997f)
                curveTo(12.552f, 1.997f, 13f, 2.445f, 13f, 2.997f)
                verticalLineTo(9.818f)
                close()
                moveTo(18.384f, 15.202f)
                lineTo(13.933f, 10.751f)
                curveTo(13.976f, 10.677f, 14f, 10.591f, 14f, 10.5f)
                verticalLineTo(4.25f)
                curveTo(14f, 3.698f, 14.448f, 3.25f, 15f, 3.25f)
                curveTo(15.552f, 3.25f, 16f, 3.698f, 16f, 4.25f)
                verticalLineTo(12.018f)
                curveTo(16.383f, 11.808f, 16.844f, 11.613f, 17.357f, 11.514f)
                curveTo(18.036f, 11.382f, 18.81f, 11.305f, 19.446f, 11.38f)
                curveTo(19.758f, 11.417f, 20.112f, 11.499f, 20.408f, 11.69f)
                curveTo(20.741f, 11.905f, 21f, 12.265f, 21f, 12.75f)
                curveTo(21f, 12.981f, 20.893f, 13.2f, 20.711f, 13.342f)
                lineTo(18.519f, 15.047f)
                lineTo(18.384f, 15.202f)
                close()
            }
        }.build()

        return _HandRightOff!!
    }

@Suppress("ObjectPropertyName")
private var _HandRightOff: ImageVector? = null

@Preview
@Composable
private fun HandRightOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HandRightOff, contentDescription = null)
    }
}
