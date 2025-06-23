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

public val FluentIcons.Filled.ArrowBounce: ImageVector
    get() {
        if (_ArrowBounce != null) {
            return _ArrowBounce!!
        }
        _ArrowBounce = ImageVector.Builder(
            name = "Filled.ArrowBounce",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 7f)
                curveTo(11f, 6.448f, 10.552f, 6f, 10f, 6f)
                horizontalLineTo(3f)
                curveTo(2.448f, 6f, 2f, 6.448f, 2f, 7f)
                verticalLineTo(14f)
                curveTo(2f, 14.552f, 2.448f, 15f, 3f, 15f)
                curveTo(3.552f, 15f, 4f, 14.552f, 4f, 14f)
                verticalLineTo(9.414f)
                lineTo(12.043f, 17.457f)
                curveTo(12.231f, 17.645f, 12.485f, 17.75f, 12.75f, 17.75f)
                curveTo(13.015f, 17.75f, 13.27f, 17.645f, 13.457f, 17.457f)
                lineTo(21.707f, 9.207f)
                curveTo(22.098f, 8.817f, 22.098f, 8.183f, 21.707f, 7.793f)
                curveTo(21.317f, 7.402f, 20.683f, 7.402f, 20.293f, 7.793f)
                lineTo(12.75f, 15.336f)
                lineTo(5.414f, 8f)
                horizontalLineTo(10f)
                curveTo(10.552f, 8f, 11f, 7.552f, 11f, 7f)
                close()
            }
        }.build()

        return _ArrowBounce!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBounce: ImageVector? = null

@Preview
@Composable
private fun ArrowBouncePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowBounce, contentDescription = null)
    }
}
