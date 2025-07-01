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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.FastForwardCircle: ImageVector
    get() {
        if (_FastForwardCircle != null) {
            return _FastForwardCircle!!
        }
        _FastForwardCircle = ImageVector.Builder(
            name = "Colored.FastForwardCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF52D17C),
                        1f to Color(0xFF22918B)
                    ),
                    start = Offset(2.714f, 5.75f),
                    end = Offset(16.517f, 20.09f)
                )
            ) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.533f, 8.883f)
                curveTo(12.533f, 8.168f, 13.376f, 7.751f, 13.987f, 8.163f)
                lineTo(18.609f, 11.28f)
                curveTo(19.13f, 11.631f, 19.13f, 12.369f, 18.609f, 12.72f)
                lineTo(13.987f, 15.837f)
                curveTo(13.376f, 16.249f, 12.533f, 15.832f, 12.533f, 15.117f)
                verticalLineTo(13.086f)
                lineTo(8.454f, 15.837f)
                curveTo(7.843f, 16.249f, 7f, 15.832f, 7f, 15.117f)
                verticalLineTo(8.883f)
                curveTo(7f, 8.168f, 7.843f, 7.751f, 8.454f, 8.163f)
                lineTo(12.533f, 10.914f)
                verticalLineTo(8.883f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFE3FFD9)
                    ),
                    start = Offset(9.25f, 8.816f),
                    end = Offset(10.957f, 17.854f)
                )
            ) {
                moveTo(12.533f, 8.883f)
                curveTo(12.533f, 8.168f, 13.376f, 7.751f, 13.987f, 8.163f)
                lineTo(18.609f, 11.28f)
                curveTo(19.13f, 11.631f, 19.13f, 12.369f, 18.609f, 12.72f)
                lineTo(13.987f, 15.837f)
                curveTo(13.376f, 16.249f, 12.533f, 15.832f, 12.533f, 15.117f)
                verticalLineTo(13.086f)
                lineTo(8.454f, 15.837f)
                curveTo(7.843f, 16.249f, 7f, 15.832f, 7f, 15.117f)
                verticalLineTo(8.883f)
                curveTo(7f, 8.168f, 7.843f, 7.751f, 8.454f, 8.163f)
                lineTo(12.533f, 10.914f)
                verticalLineTo(8.883f)
                close()
            }
        }.build()

        return _FastForwardCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FastForwardCircle: ImageVector? = null

@Preview
@Composable
private fun FastForwardCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.FastForwardCircle, contentDescription = null)
    }
}
