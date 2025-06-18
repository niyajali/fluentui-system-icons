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

public val FluentUi.Filled.TextDirectionVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDirectionVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 4f)
            curveTo(8f, 3.448f, 7.552f, 3f, 7f, 3f)
            curveTo(6.448f, 3f, 6f, 3.448f, 6f, 4f)
            verticalLineTo(17.586f)
            lineTo(5.707f, 17.293f)
            curveTo(5.317f, 16.902f, 4.683f, 16.902f, 4.293f, 17.293f)
            curveTo(3.902f, 17.683f, 3.902f, 18.317f, 4.293f, 18.707f)
            lineTo(6.293f, 20.707f)
            curveTo(6.683f, 21.098f, 7.317f, 21.098f, 7.707f, 20.707f)
            lineTo(9.707f, 18.707f)
            curveTo(10.098f, 18.317f, 10.098f, 17.683f, 9.707f, 17.293f)
            curveTo(9.317f, 16.902f, 8.683f, 16.902f, 8.293f, 17.293f)
            lineTo(8f, 17.586f)
            verticalLineTo(4f)
            close()
            moveTo(17.173f, 3.615f)
            curveTo(17.018f, 3.243f, 16.654f, 3f, 16.25f, 3f)
            curveTo(15.847f, 3f, 15.483f, 3.243f, 15.327f, 3.615f)
            lineTo(11.577f, 12.615f)
            curveTo(11.365f, 13.125f, 11.606f, 13.711f, 12.116f, 13.923f)
            curveTo(12.625f, 14.135f, 13.211f, 13.894f, 13.423f, 13.385f)
            lineTo(14.417f, 11f)
            horizontalLineTo(18.084f)
            lineTo(19.077f, 13.385f)
            curveTo(19.29f, 13.894f, 19.875f, 14.135f, 20.385f, 13.923f)
            curveTo(20.895f, 13.711f, 21.136f, 13.125f, 20.923f, 12.615f)
            lineTo(17.173f, 3.615f)
            close()
            moveTo(17.25f, 9f)
            horizontalLineTo(15.25f)
            lineTo(16.25f, 6.6f)
            lineTo(17.25f, 9f)
            close()
            moveTo(16f, 14f)
            curveTo(15.448f, 14f, 15f, 14.448f, 15f, 15f)
            verticalLineTo(17.586f)
            lineTo(14.707f, 17.293f)
            curveTo(14.317f, 16.902f, 13.683f, 16.902f, 13.293f, 17.293f)
            curveTo(12.902f, 17.683f, 12.902f, 18.317f, 13.293f, 18.707f)
            lineTo(15.293f, 20.707f)
            curveTo(15.683f, 21.098f, 16.317f, 21.098f, 16.707f, 20.707f)
            lineTo(18.707f, 18.707f)
            curveTo(19.098f, 18.317f, 19.098f, 17.683f, 18.707f, 17.293f)
            curveTo(18.317f, 16.902f, 17.683f, 16.902f, 17.293f, 17.293f)
            lineTo(17f, 17.586f)
            verticalLineTo(15f)
            curveTo(17f, 14.448f, 16.552f, 14f, 16f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextDirectionVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextDirectionVertical, contentDescription = null)
    }
}
