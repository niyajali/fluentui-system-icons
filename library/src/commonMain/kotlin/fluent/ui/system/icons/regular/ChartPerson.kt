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

public val FluentIcons.Regular.ChartPerson: ImageVector
    get() {
        if (_ChartPerson != null) {
            return _ChartPerson!!
        }
        _ChartPerson = ImageVector.Builder(
            name = "Regular.ChartPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.5f, 2.75f)
                curveTo(12.5f, 2.336f, 12.164f, 2f, 11.75f, 2f)
                curveTo(11.336f, 2f, 11f, 2.336f, 11f, 2.75f)
                verticalLineTo(3f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
                horizontalLineTo(7.648f)
                lineTo(6.173f, 20.77f)
                curveTo(5.908f, 21.088f, 5.951f, 21.561f, 6.269f, 21.826f)
                curveTo(6.587f, 22.091f, 7.06f, 22.049f, 7.326f, 21.73f)
                lineTo(9.601f, 19f)
                horizontalLineTo(13.109f)
                curveTo(13.287f, 18.385f, 13.672f, 17.858f, 14.184f, 17.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 4.5f, 20.5f, 5.284f, 20.5f, 6.25f)
                verticalLineTo(11.627f)
                curveTo(21.407f, 12.26f, 22f, 13.311f, 22f, 14.5f)
                verticalLineTo(6.25f)
                curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
                horizontalLineTo(12.5f)
                verticalLineTo(2.75f)
                close()
                moveTo(6f, 7.75f)
                curveTo(6f, 7.336f, 6.336f, 7f, 6.75f, 7f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 7f, 11.5f, 7.336f, 11.5f, 7.75f)
                curveTo(11.5f, 8.164f, 11.164f, 8.5f, 10.75f, 8.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 8.5f, 6f, 8.164f, 6f, 7.75f)
                close()
                moveTo(6.75f, 10f)
                curveTo(6.336f, 10f, 6f, 10.336f, 6f, 10.75f)
                curveTo(6f, 11.164f, 6.336f, 11.5f, 6.75f, 11.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 11.5f, 14f, 11.164f, 14f, 10.75f)
                curveTo(14f, 10.336f, 13.664f, 10f, 13.25f, 10f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6f, 13.75f)
                curveTo(6f, 13.336f, 6.336f, 13f, 6.75f, 13f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 13f, 13f, 13.336f, 13f, 13.75f)
                curveTo(13f, 14.164f, 12.664f, 14.5f, 12.25f, 14.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 14.5f, 6f, 14.164f, 6f, 13.75f)
                close()
                moveTo(21f, 14.5f)
                curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
                curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
                curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
                curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
                close()
                moveTo(23f, 19.875f)
                curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
                curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _ChartPerson!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPerson: ImageVector? = null

@Preview
@Composable
private fun ChartPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChartPerson, contentDescription = null)
    }
}
