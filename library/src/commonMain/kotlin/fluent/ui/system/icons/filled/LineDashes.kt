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

public val FluentIcons.Filled.LineDashes: ImageVector
    get() {
        if (_LineDashes != null) {
            return _LineDashes!!
        }
        _LineDashes = ImageVector.Builder(
            name = "Filled.LineDashes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.707f, 2.297f)
                curveTo(22.098f, 2.687f, 22.098f, 3.32f, 21.707f, 3.711f)
                lineTo(21.207f, 4.211f)
                curveTo(20.817f, 4.602f, 20.183f, 4.602f, 19.793f, 4.211f)
                curveTo(19.402f, 3.82f, 19.402f, 3.187f, 19.793f, 2.797f)
                lineTo(20.293f, 2.297f)
                curveTo(20.683f, 1.906f, 21.317f, 1.906f, 21.707f, 2.297f)
                close()
                moveTo(17.703f, 6.297f)
                curveTo(18.094f, 6.688f, 18.094f, 7.321f, 17.703f, 7.711f)
                lineTo(16.706f, 8.708f)
                curveTo(16.316f, 9.099f, 15.682f, 9.099f, 15.292f, 8.708f)
                curveTo(14.901f, 8.318f, 14.901f, 7.685f, 15.292f, 7.294f)
                lineTo(16.289f, 6.297f)
                curveTo(16.68f, 5.907f, 17.313f, 5.907f, 17.703f, 6.297f)
                close()
                moveTo(13.207f, 10.793f)
                curveTo(13.598f, 11.183f, 13.598f, 11.816f, 13.207f, 12.207f)
                lineTo(12.207f, 13.207f)
                curveTo(11.817f, 13.597f, 11.183f, 13.597f, 10.793f, 13.207f)
                curveTo(10.402f, 12.816f, 10.402f, 12.183f, 10.793f, 11.793f)
                lineTo(11.793f, 10.793f)
                curveTo(12.183f, 10.402f, 12.817f, 10.402f, 13.207f, 10.793f)
                close()
                moveTo(8.703f, 16.711f)
                curveTo(9.093f, 16.32f, 9.093f, 15.687f, 8.703f, 15.297f)
                curveTo(8.312f, 14.906f, 7.679f, 14.906f, 7.289f, 15.297f)
                lineTo(6.291f, 16.295f)
                curveTo(5.9f, 16.685f, 5.9f, 17.318f, 6.291f, 17.709f)
                curveTo(6.681f, 18.099f, 7.315f, 18.099f, 7.705f, 17.709f)
                lineTo(8.703f, 16.711f)
                close()
                moveTo(4.212f, 21.207f)
                curveTo(4.603f, 20.816f, 4.603f, 20.183f, 4.212f, 19.793f)
                curveTo(3.821f, 19.402f, 3.188f, 19.402f, 2.798f, 19.793f)
                lineTo(2.298f, 20.293f)
                curveTo(1.907f, 20.683f, 1.907f, 21.316f, 2.298f, 21.707f)
                curveTo(2.688f, 22.097f, 3.321f, 22.097f, 3.712f, 21.707f)
                lineTo(4.212f, 21.207f)
                close()
            }
        }.build()

        return _LineDashes!!
    }

@Suppress("ObjectPropertyName")
private var _LineDashes: ImageVector? = null

@Preview
@Composable
private fun LineDashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineDashes, contentDescription = null)
    }
}
