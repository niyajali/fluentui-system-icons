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
package fluent.ui.system.icons.color

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Colored.Code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFC76EFB),
                        1f to Color(0xFF8B52F4)
                    ),
                    start = Offset(2.588f, 2.933f),
                    end = Offset(20.693f, 22.309f)
                )
            ) {
                moveTo(8.086f, 18.611f)
                lineTo(14.082f, 4.606f)
                curveTo(14.299f, 4.099f, 14.887f, 3.863f, 15.395f, 4.081f)
                curveTo(15.866f, 4.283f, 16.103f, 4.804f, 15.96f, 5.284f)
                lineTo(15.92f, 5.394f)
                lineTo(9.924f, 19.398f)
                curveTo(9.707f, 19.906f, 9.119f, 20.141f, 8.611f, 19.924f)
                curveTo(8.14f, 19.722f, 7.903f, 19.201f, 8.046f, 18.721f)
                lineTo(8.086f, 18.611f)
                lineTo(14.082f, 4.606f)
                lineTo(8.086f, 18.611f)
                close()
                moveTo(2.293f, 11.293f)
                lineTo(6.293f, 7.293f)
                curveTo(6.683f, 6.902f, 7.317f, 6.902f, 7.707f, 7.293f)
                curveTo(8.068f, 7.653f, 8.095f, 8.221f, 7.79f, 8.613f)
                lineTo(7.707f, 8.707f)
                lineTo(4.414f, 12f)
                lineTo(7.707f, 15.293f)
                curveTo(8.098f, 15.683f, 8.098f, 16.317f, 7.707f, 16.707f)
                curveTo(7.347f, 17.068f, 6.779f, 17.095f, 6.387f, 16.79f)
                lineTo(6.293f, 16.707f)
                lineTo(2.293f, 12.707f)
                curveTo(1.932f, 12.347f, 1.905f, 11.779f, 2.21f, 11.387f)
                lineTo(2.293f, 11.293f)
                lineTo(6.293f, 7.293f)
                lineTo(2.293f, 11.293f)
                close()
                moveTo(16.292f, 7.292f)
                curveTo(16.653f, 6.931f, 17.22f, 6.904f, 17.612f, 7.209f)
                lineTo(17.706f, 7.292f)
                lineTo(21.707f, 11.293f)
                curveTo(22.068f, 11.654f, 22.095f, 12.221f, 21.79f, 12.613f)
                lineTo(21.707f, 12.708f)
                lineTo(17.706f, 16.703f)
                curveTo(17.315f, 17.093f, 16.682f, 17.093f, 16.292f, 16.702f)
                curveTo(15.931f, 16.341f, 15.904f, 15.774f, 16.209f, 15.382f)
                lineTo(16.292f, 15.288f)
                lineTo(19.585f, 12f)
                lineTo(16.292f, 8.706f)
                curveTo(15.901f, 8.315f, 15.901f, 7.682f, 16.292f, 7.292f)
                close()
            }
        }.build()

        return _Code!!
    }

@Suppress("ObjectPropertyName")
private var _Code: ImageVector? = null

@Preview
@Composable
private fun CodePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Code, contentDescription = null)
    }
}
