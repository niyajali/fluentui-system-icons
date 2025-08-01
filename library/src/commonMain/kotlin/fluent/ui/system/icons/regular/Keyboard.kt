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

public val FluentIcons.Regular.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) {
            return _Keyboard!!
        }
        _Keyboard = ImageVector.Builder(
            name = "Regular.Keyboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.745f, 5f)
                curveTo(20.988f, 5f, 21.995f, 6.007f, 21.995f, 7.25f)
                verticalLineTo(16.755f)
                curveTo(21.995f, 17.997f, 20.988f, 19.005f, 19.745f, 19.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 19.005f, 2f, 17.997f, 2f, 16.755f)
                verticalLineTo(7.25f)
                curveTo(2f, 6.007f, 3.007f, 5f, 4.25f, 5f)
                horizontalLineTo(19.745f)
                close()
                moveTo(19.745f, 6.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 6.5f, 3.5f, 6.836f, 3.5f, 7.25f)
                verticalLineTo(16.755f)
                curveTo(3.5f, 17.169f, 3.836f, 17.505f, 4.25f, 17.505f)
                horizontalLineTo(19.745f)
                curveTo(20.16f, 17.505f, 20.495f, 17.169f, 20.495f, 16.755f)
                verticalLineTo(7.25f)
                curveTo(20.495f, 6.836f, 20.16f, 6.5f, 19.745f, 6.5f)
                close()
                moveTo(6.75f, 14.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 14.5f, 18f, 14.836f, 18f, 15.25f)
                curveTo(18f, 15.63f, 17.718f, 15.943f, 17.352f, 15.993f)
                lineTo(17.25f, 16f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 16f, 6f, 15.664f, 6f, 15.25f)
                curveTo(6f, 14.87f, 6.282f, 14.557f, 6.648f, 14.507f)
                lineTo(6.75f, 14.5f)
                horizontalLineTo(17.25f)
                horizontalLineTo(6.75f)
                close()
                moveTo(16.5f, 11f)
                curveTo(17.052f, 11f, 17.5f, 11.448f, 17.5f, 12f)
                curveTo(17.5f, 12.552f, 17.052f, 13f, 16.5f, 13f)
                curveTo(15.948f, 13f, 15.5f, 12.552f, 15.5f, 12f)
                curveTo(15.5f, 11.448f, 15.948f, 11f, 16.5f, 11f)
                close()
                moveTo(10.505f, 11f)
                curveTo(11.057f, 11f, 11.505f, 11.448f, 11.505f, 12f)
                curveTo(11.505f, 12.552f, 11.057f, 13f, 10.505f, 13f)
                curveTo(9.953f, 13f, 9.505f, 12.552f, 9.505f, 12f)
                curveTo(9.505f, 11.448f, 9.953f, 11f, 10.505f, 11f)
                close()
                moveTo(7.505f, 11f)
                curveTo(8.057f, 11f, 8.505f, 11.448f, 8.505f, 12f)
                curveTo(8.505f, 12.552f, 8.057f, 13f, 7.505f, 13f)
                curveTo(6.953f, 13f, 6.505f, 12.552f, 6.505f, 12f)
                curveTo(6.505f, 11.448f, 6.953f, 11f, 7.505f, 11f)
                close()
                moveTo(13.505f, 11f)
                curveTo(14.057f, 11f, 14.505f, 11.448f, 14.505f, 12f)
                curveTo(14.505f, 12.552f, 14.057f, 13f, 13.505f, 13f)
                curveTo(12.953f, 13f, 12.505f, 12.552f, 12.505f, 12f)
                curveTo(12.505f, 11.448f, 12.953f, 11f, 13.505f, 11f)
                close()
                moveTo(6f, 8f)
                curveTo(6.552f, 8f, 7f, 8.448f, 7f, 9f)
                curveTo(7f, 9.552f, 6.552f, 10f, 6f, 10f)
                curveTo(5.448f, 10f, 5f, 9.552f, 5f, 9f)
                curveTo(5f, 8.448f, 5.448f, 8f, 6f, 8f)
                close()
                moveTo(8.995f, 8f)
                curveTo(9.547f, 8f, 9.995f, 8.448f, 9.995f, 9f)
                curveTo(9.995f, 9.552f, 9.547f, 10f, 8.995f, 10f)
                curveTo(8.443f, 10f, 7.995f, 9.552f, 7.995f, 9f)
                curveTo(7.995f, 8.448f, 8.443f, 8f, 8.995f, 8f)
                close()
                moveTo(11.995f, 8f)
                curveTo(12.547f, 8f, 12.995f, 8.448f, 12.995f, 9f)
                curveTo(12.995f, 9.552f, 12.547f, 10f, 11.995f, 10f)
                curveTo(11.443f, 10f, 10.995f, 9.552f, 10.995f, 9f)
                curveTo(10.995f, 8.448f, 11.443f, 8f, 11.995f, 8f)
                close()
                moveTo(14.995f, 8f)
                curveTo(15.547f, 8f, 15.995f, 8.448f, 15.995f, 9f)
                curveTo(15.995f, 9.552f, 15.547f, 10f, 14.995f, 10f)
                curveTo(14.443f, 10f, 13.995f, 9.552f, 13.995f, 9f)
                curveTo(13.995f, 8.448f, 14.443f, 8f, 14.995f, 8f)
                close()
                moveTo(17.995f, 8f)
                curveTo(18.547f, 8f, 18.995f, 8.448f, 18.995f, 9f)
                curveTo(18.995f, 9.552f, 18.547f, 10f, 17.995f, 10f)
                curveTo(17.443f, 10f, 16.995f, 9.552f, 16.995f, 9f)
                curveTo(16.995f, 8.448f, 17.443f, 8f, 17.995f, 8f)
                close()
            }
        }.build()

        return _Keyboard!!
    }

@Suppress("ObjectPropertyName")
private var _Keyboard: ImageVector? = null

@Preview
@Composable
private fun KeyboardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Keyboard, contentDescription = null)
    }
}
