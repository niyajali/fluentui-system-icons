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

public val FluentIcons.Filled.BinFull: ImageVector
    get() {
        if (_BinFull != null) {
            return _BinFull!!
        }
        _BinFull = ImageVector.Builder(
            name = "Filled.BinFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.156f, 3.381f)
                curveTo(17.504f, 3.157f, 17.605f, 2.693f, 17.381f, 2.345f)
                curveTo(17.157f, 1.996f, 16.693f, 1.895f, 16.344f, 2.119f)
                lineTo(2.344f, 11.119f)
                curveTo(2.13f, 11.257f, 2f, 11.495f, 2f, 11.75f)
                verticalLineTo(18.75f)
                curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
                verticalLineTo(11.75f)
                curveTo(22f, 11.336f, 21.664f, 11f, 21.25f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(7.75f)
                curveTo(21f, 6.784f, 20.216f, 6f, 19.25f, 6f)
                horizontalLineTo(16.25f)
                curveTo(15.283f, 6f, 14.5f, 6.784f, 14.5f, 7.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(11.25f)
                curveTo(10.283f, 8.5f, 9.5f, 9.284f, 9.5f, 10.25f)
                verticalLineTo(11f)
                horizontalLineTo(5.304f)
                lineTo(17.156f, 3.381f)
                close()
                moveTo(14.5f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(10.25f)
                curveTo(11f, 10.112f, 11.112f, 10f, 11.25f, 10f)
                horizontalLineTo(14.5f)
                close()
                moveTo(19.5f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(7.75f)
                curveTo(16f, 7.612f, 16.112f, 7.5f, 16.25f, 7.5f)
                horizontalLineTo(19.25f)
                curveTo(19.388f, 7.5f, 19.5f, 7.612f, 19.5f, 7.75f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _BinFull!!
    }

@Suppress("ObjectPropertyName")
private var _BinFull: ImageVector? = null

@Preview
@Composable
private fun BinFullPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BinFull, contentDescription = null)
    }
}
