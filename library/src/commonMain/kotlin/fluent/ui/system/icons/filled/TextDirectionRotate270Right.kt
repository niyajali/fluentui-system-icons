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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.TextDirectionRotate270Right: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextDirectionRotate270Right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.707f, 5.293f)
                curveTo(20.098f, 5.683f, 20.098f, 6.317f, 19.707f, 6.707f)
                curveTo(19.317f, 7.098f, 18.684f, 7.098f, 18.293f, 6.707f)
                lineTo(18f, 6.414f)
                verticalLineTo(20f)
                curveTo(18f, 20.552f, 17.552f, 21f, 17f, 21f)
                curveTo(16.448f, 21f, 16f, 20.552f, 16f, 20f)
                verticalLineTo(6.414f)
                lineTo(15.707f, 6.707f)
                curveTo(15.317f, 7.098f, 14.684f, 7.098f, 14.293f, 6.707f)
                curveTo(13.903f, 6.317f, 13.903f, 5.683f, 14.293f, 5.293f)
                lineTo(16.293f, 3.293f)
                curveTo(16.684f, 2.902f, 17.317f, 2.902f, 17.707f, 3.293f)
                lineTo(19.707f, 5.293f)
                close()
                moveTo(3.615f, 17.173f)
                lineTo(12.615f, 20.923f)
                curveTo(13.125f, 21.136f, 13.711f, 20.895f, 13.923f, 20.385f)
                curveTo(14.135f, 19.875f, 13.894f, 19.29f, 13.385f, 19.077f)
                lineTo(11f, 18.084f)
                verticalLineTo(14.417f)
                lineTo(13.385f, 13.423f)
                curveTo(13.894f, 13.211f, 14.135f, 12.625f, 13.923f, 12.116f)
                curveTo(13.711f, 11.606f, 13.125f, 11.365f, 12.615f, 11.577f)
                lineTo(3.615f, 15.327f)
                curveTo(3.243f, 15.483f, 3f, 15.847f, 3f, 16.25f)
                curveTo(3f, 16.654f, 3.243f, 17.018f, 3.615f, 17.173f)
                close()
                moveTo(9f, 17.25f)
                lineTo(6.6f, 16.25f)
                lineTo(9f, 15.25f)
                verticalLineTo(17.25f)
                close()
                moveTo(10.707f, 6.707f)
                curveTo(11.098f, 6.317f, 11.098f, 5.683f, 10.707f, 5.293f)
                lineTo(8.707f, 3.293f)
                curveTo(8.317f, 2.902f, 7.684f, 2.902f, 7.293f, 3.293f)
                lineTo(5.293f, 5.293f)
                curveTo(4.903f, 5.683f, 4.903f, 6.317f, 5.293f, 6.707f)
                curveTo(5.684f, 7.098f, 6.317f, 7.098f, 6.707f, 6.707f)
                lineTo(7f, 6.414f)
                verticalLineTo(10f)
                curveTo(7f, 10.552f, 7.448f, 11f, 8f, 11f)
                curveTo(8.553f, 11f, 9f, 10.552f, 9f, 10f)
                verticalLineTo(6.414f)
                lineTo(9.293f, 6.707f)
                curveTo(9.684f, 7.098f, 10.317f, 7.098f, 10.707f, 6.707f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextDirectionRotate270RightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextDirectionRotate270Right, contentDescription = null)
    }
}
