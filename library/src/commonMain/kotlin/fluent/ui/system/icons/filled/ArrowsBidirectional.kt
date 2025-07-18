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

public val FluentIcons.Filled.ArrowsBidirectional: ImageVector
    get() {
        if (_ArrowsBidirectional != null) {
            return _ArrowsBidirectional!!
        }
        _ArrowsBidirectional = ImageVector.Builder(
            name = "Filled.ArrowsBidirectional",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.002f, 8.999f)
                horizontalLineTo(9.005f)
                lineTo(9.006f, 6.75f)
                curveTo(9.006f, 6.09f, 8.215f, 5.752f, 7.738f, 6.207f)
                lineTo(2.234f, 11.457f)
                curveTo(1.925f, 11.753f, 1.925f, 12.247f, 2.234f, 12.543f)
                lineTo(7.738f, 17.793f)
                lineTo(7.82f, 17.861f)
                curveTo(8.301f, 18.209f, 9.006f, 17.873f, 9.006f, 17.25f)
                lineTo(9.005f, 15f)
                horizontalLineTo(15.002f)
                lineTo(15.002f, 17.25f)
                curveTo(15.002f, 17.91f, 15.793f, 18.248f, 16.27f, 17.792f)
                lineTo(21.767f, 12.542f)
                curveTo(22.077f, 12.247f, 22.077f, 11.753f, 21.767f, 11.458f)
                lineTo(16.27f, 6.207f)
                curveTo(15.793f, 5.751f, 15.002f, 6.09f, 15.002f, 6.75f)
                lineTo(15.002f, 8.999f)
                close()
            }
        }.build()

        return _ArrowsBidirectional!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsBidirectional: ImageVector? = null

@Preview
@Composable
private fun ArrowsBidirectionalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowsBidirectional, contentDescription = null)
    }
}
