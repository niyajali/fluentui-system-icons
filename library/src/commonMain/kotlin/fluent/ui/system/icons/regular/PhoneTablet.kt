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

public val FluentIcons.Regular.PhoneTablet: ImageVector
    get() {
        if (_PhoneTablet != null) {
            return _PhoneTablet!!
        }
        _PhoneTablet = ImageVector.Builder(
            name = "Regular.PhoneTablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.254f, 7f)
                curveTo(9.221f, 7f, 10.004f, 7.783f, 10.004f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(10.004f, 19.216f, 9.221f, 20f, 8.254f, 20f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 20f, 2f, 19.216f, 2f, 18.25f)
                verticalLineTo(8.75f)
                curveTo(2f, 7.783f, 2.783f, 7f, 3.75f, 7f)
                horizontalLineTo(8.254f)
                close()
                moveTo(8.254f, 8.5f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 8.5f, 3.5f, 8.612f, 3.5f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(3.5f, 18.388f, 3.612f, 18.5f, 3.75f, 18.5f)
                horizontalLineTo(8.254f)
                curveTo(8.393f, 18.5f, 8.504f, 18.388f, 8.504f, 18.25f)
                verticalLineTo(8.75f)
                curveTo(8.504f, 8.612f, 8.393f, 8.5f, 8.254f, 8.5f)
                close()
                moveTo(6.252f, 16f)
                curveTo(6.666f, 16f, 7.002f, 16.336f, 7.002f, 16.75f)
                curveTo(7.002f, 17.13f, 6.72f, 17.444f, 6.354f, 17.493f)
                lineTo(6.252f, 17.5f)
                horizontalLineTo(5.752f)
                curveTo(5.338f, 17.5f, 5.002f, 17.164f, 5.002f, 16.75f)
                curveTo(5.002f, 16.37f, 5.284f, 16.056f, 5.65f, 16.007f)
                lineTo(5.752f, 16f)
                horizontalLineTo(6.252f)
                close()
                moveTo(19.749f, 4f)
                curveTo(20.94f, 4f, 21.915f, 4.925f, 21.994f, 6.096f)
                lineTo(21.999f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(21.999f, 15.941f, 21.074f, 16.916f, 19.903f, 16.995f)
                lineTo(19.749f, 17f)
                horizontalLineTo(10.999f)
                verticalLineTo(15.5f)
                horizontalLineTo(19.749f)
                curveTo(20.129f, 15.5f, 20.443f, 15.218f, 20.493f, 14.852f)
                lineTo(20.499f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(20.499f, 5.87f, 20.217f, 5.557f, 19.851f, 5.507f)
                lineTo(19.749f, 5.5f)
                horizontalLineTo(8.249f)
                curveTo(7.923f, 5.5f, 7.645f, 5.709f, 7.542f, 6f)
                lineTo(6.013f, 6f)
                curveTo(6.131f, 4.929f, 7.002f, 4.084f, 8.085f, 4.006f)
                lineTo(8.249f, 4f)
                horizontalLineTo(19.749f)
                close()
                moveTo(15.249f, 13f)
                curveTo(15.664f, 13f, 15.999f, 13.336f, 15.999f, 13.75f)
                curveTo(15.999f, 14.164f, 15.664f, 14.5f, 15.249f, 14.5f)
                horizontalLineTo(12.749f)
                curveTo(12.335f, 14.5f, 11.999f, 14.164f, 11.999f, 13.75f)
                curveTo(11.999f, 13.336f, 12.335f, 13f, 12.749f, 13f)
                horizontalLineTo(15.249f)
                close()
            }
        }.build()

        return _PhoneTablet!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneTablet: ImageVector? = null

@Preview
@Composable
private fun PhoneTabletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneTablet, contentDescription = null)
    }
}
