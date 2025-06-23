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

public val FluentIcons.Filled.TextHeader4: ImageVector
    get() {
        if (_TextHeader4 != null) {
            return _TextHeader4!!
        }
        _TextHeader4 = ImageVector.Builder(
            name = "Filled.TextHeader4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 5f)
                curveTo(11.552f, 5f, 12f, 5.448f, 12f, 6f)
                verticalLineTo(18f)
                curveTo(12f, 18.552f, 11.552f, 19f, 11f, 19f)
                curveTo(10.448f, 19f, 10f, 18.552f, 10f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                curveTo(4f, 18.552f, 3.552f, 19f, 3f, 19f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
                curveTo(3.552f, 5f, 4f, 5.448f, 4f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                curveTo(10f, 5.448f, 10.448f, 5f, 11f, 5f)
                close()
                moveTo(18.801f, 5.444f)
                curveTo(19.531f, 4.567f, 21.005f, 5.07f, 21.006f, 6.252f)
                verticalLineTo(14f)
                horizontalLineTo(22.001f)
                lineTo(22.104f, 14.005f)
                curveTo(22.608f, 14.056f, 23.001f, 14.482f, 23.001f, 15f)
                curveTo(23.001f, 15.518f, 22.608f, 15.944f, 22.104f, 15.995f)
                lineTo(22.001f, 16f)
                horizontalLineTo(21.006f)
                verticalLineTo(18f)
                curveTo(21.006f, 18.552f, 20.558f, 19f, 20.006f, 19f)
                curveTo(19.454f, 19f, 19.006f, 18.552f, 19.006f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(14.265f)
                curveTo(13.05f, 16f, 12.339f, 14.632f, 13.037f, 13.638f)
                lineTo(18.732f, 5.533f)
                lineTo(18.801f, 5.444f)
                close()
                moveTo(15.227f, 14f)
                horizontalLineTo(19.006f)
                verticalLineTo(8.623f)
                lineTo(15.227f, 14f)
                close()
            }
        }.build()

        return _TextHeader4!!
    }

@Suppress("ObjectPropertyName")
private var _TextHeader4: ImageVector? = null

@Preview
@Composable
private fun TextHeader4Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHeader4, contentDescription = null)
    }
}
