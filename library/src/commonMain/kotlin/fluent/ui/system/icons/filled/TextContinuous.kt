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

public val FluentIcons.Filled.TextContinuous: ImageVector
    get() {
        if (_TextContinuous != null) {
            return _TextContinuous!!
        }
        _TextContinuous = ImageVector.Builder(
            name = "Filled.TextContinuous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6f)
                curveTo(3f, 5.448f, 3.448f, 5f, 4f, 5f)
                horizontalLineTo(20f)
                curveTo(20.552f, 5f, 21f, 5.448f, 21f, 6f)
                curveTo(21f, 6.552f, 20.552f, 7f, 20f, 7f)
                horizontalLineTo(4f)
                curveTo(3.448f, 7f, 3f, 6.552f, 3f, 6f)
                close()
                moveTo(8f, 10f)
                curveTo(8f, 9.448f, 8.448f, 9f, 9f, 9f)
                horizontalLineTo(20f)
                curveTo(20.552f, 9f, 21f, 9.448f, 21f, 10f)
                curveTo(21f, 10.552f, 20.552f, 11f, 20f, 11f)
                horizontalLineTo(9f)
                curveTo(8.448f, 11f, 8f, 10.552f, 8f, 10f)
                close()
                moveTo(8f, 14f)
                curveTo(8f, 13.448f, 8.448f, 13f, 9f, 13f)
                horizontalLineTo(20f)
                curveTo(20.552f, 13f, 21f, 13.448f, 21f, 14f)
                curveTo(21f, 14.552f, 20.552f, 15f, 20f, 15f)
                horizontalLineTo(9f)
                curveTo(8.448f, 15f, 8f, 14.552f, 8f, 14f)
                close()
                moveTo(20f, 19f)
                horizontalLineTo(4f)
                curveTo(3.448f, 19f, 3f, 18.552f, 3f, 18f)
                curveTo(3f, 17.448f, 3.448f, 17f, 4f, 17f)
                horizontalLineTo(20f)
                curveTo(20.552f, 17f, 21f, 17.448f, 21f, 18f)
                curveTo(21f, 18.552f, 20.552f, 19f, 20f, 19f)
                close()
                moveTo(3.293f, 11.207f)
                curveTo(2.902f, 10.817f, 2.902f, 10.183f, 3.293f, 9.793f)
                curveTo(3.683f, 9.402f, 4.317f, 9.402f, 4.707f, 9.793f)
                lineTo(6.207f, 11.293f)
                curveTo(6.598f, 11.683f, 6.598f, 12.317f, 6.207f, 12.707f)
                lineTo(4.707f, 14.207f)
                curveTo(4.317f, 14.598f, 3.683f, 14.598f, 3.293f, 14.207f)
                curveTo(2.902f, 13.817f, 2.902f, 13.183f, 3.293f, 12.793f)
                lineTo(4.086f, 12f)
                lineTo(3.293f, 11.207f)
                close()
            }
        }.build()

        return _TextContinuous!!
    }

@Suppress("ObjectPropertyName")
private var _TextContinuous: ImageVector? = null

@Preview
@Composable
private fun TextContinuousPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextContinuous, contentDescription = null)
    }
}
