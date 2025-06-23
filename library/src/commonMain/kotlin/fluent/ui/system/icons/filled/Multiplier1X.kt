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

public val FluentIcons.Filled.Multiplier1X: ImageVector
    get() {
        if (_Multiplier1X != null) {
            return _Multiplier1X!!
        }
        _Multiplier1X = ImageVector.Builder(
            name = "Filled.Multiplier1X",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10f, 7.902f)
                curveTo(10f, 7.453f, 9.702f, 7.06f, 9.27f, 6.939f)
                curveTo(8.839f, 6.818f, 8.379f, 6.999f, 8.146f, 7.382f)
                curveTo(8.122f, 7.422f, 8.097f, 7.462f, 8.073f, 7.502f)
                curveTo(7.67f, 8.169f, 7.231f, 8.896f, 5.986f, 9.643f)
                curveTo(5.512f, 9.927f, 5.359f, 10.541f, 5.643f, 11.015f)
                curveTo(5.927f, 11.489f, 6.541f, 11.642f, 7.015f, 11.358f)
                curveTo(7.392f, 11.132f, 7.718f, 10.901f, 8f, 10.672f)
                verticalLineTo(16.001f)
                curveTo(8f, 16.553f, 8.448f, 17.001f, 9f, 17.001f)
                curveTo(9.553f, 17.001f, 10f, 16.553f, 10f, 16.001f)
                verticalLineTo(7.902f)
                close()
                moveTo(13.707f, 12.294f)
                curveTo(13.317f, 11.903f, 12.683f, 11.903f, 12.293f, 12.294f)
                curveTo(11.902f, 12.684f, 11.902f, 13.317f, 12.293f, 13.708f)
                lineTo(13.086f, 14.501f)
                lineTo(12.293f, 15.294f)
                curveTo(11.902f, 15.685f, 11.902f, 16.318f, 12.293f, 16.708f)
                curveTo(12.683f, 17.099f, 13.317f, 17.099f, 13.707f, 16.708f)
                lineTo(14.5f, 15.915f)
                lineTo(15.293f, 16.708f)
                curveTo(15.683f, 17.099f, 16.317f, 17.099f, 16.707f, 16.708f)
                curveTo(17.098f, 16.318f, 17.098f, 15.685f, 16.707f, 15.294f)
                lineTo(15.914f, 14.501f)
                lineTo(16.707f, 13.708f)
                curveTo(17.098f, 13.317f, 17.098f, 12.684f, 16.707f, 12.294f)
                curveTo(16.317f, 11.903f, 15.683f, 11.903f, 15.293f, 12.294f)
                lineTo(14.5f, 13.087f)
                lineTo(13.707f, 12.294f)
                close()
            }
        }.build()

        return _Multiplier1X!!
    }

@Suppress("ObjectPropertyName")
private var _Multiplier1X: ImageVector? = null

@Preview
@Composable
private fun Multiplier1XPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Multiplier1X, contentDescription = null)
    }
}
