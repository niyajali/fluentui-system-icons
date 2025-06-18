/**
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
package fluent.ui.system.icons.colored

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.ListBar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ListBar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(5.475f, 0.429f),
                end = Offset(20.939f, 19.98f)
            )
        ) {
            moveTo(8f, 21f)
            horizontalLineTo(19f)
            curveTo(20.105f, 21f, 21f, 20.105f, 21f, 19f)
            verticalLineTo(18f)
            curveTo(21f, 16.895f, 20.105f, 16f, 19f, 16f)
            horizontalLineTo(8f)
            lineTo(7.5f, 18.5f)
            lineTo(8f, 21f)
            close()
            moveTo(8f, 14.5f)
            horizontalLineTo(19f)
            curveTo(20.105f, 14.5f, 21f, 13.605f, 21f, 12.5f)
            verticalLineTo(11.5f)
            curveTo(21f, 10.395f, 20.105f, 9.5f, 19f, 9.5f)
            horizontalLineTo(8f)
            lineTo(7.5f, 12f)
            lineTo(8f, 14.5f)
            close()
            moveTo(8f, 8f)
            horizontalLineTo(19f)
            curveTo(20.105f, 8f, 21f, 7.105f, 21f, 6f)
            verticalLineTo(5f)
            curveTo(21f, 3.895f, 20.105f, 3f, 19f, 3f)
            horizontalLineTo(8f)
            lineTo(7.5f, 5.5f)
            lineTo(8f, 8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(4.189f, 5.393f),
                end = Offset(11.747f, 8.745f)
            )
        ) {
            moveTo(8f, 9.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(5f)
            curveTo(3.895f, 14.5f, 3f, 13.605f, 3f, 12.5f)
            lineTo(3f, 11.5f)
            curveTo(3f, 10.395f, 3.895f, 9.5f, 5f, 9.5f)
            horizontalLineTo(8f)
            close()
            moveTo(8f, 3f)
            verticalLineTo(8f)
            horizontalLineTo(5f)
            curveTo(3.895f, 8f, 3f, 7.105f, 3f, 6f)
            lineTo(3f, 5f)
            curveTo(3f, 3.895f, 3.895f, 3f, 5f, 3f)
            horizontalLineTo(8f)
            close()
            moveTo(8f, 16f)
            verticalLineTo(21f)
            horizontalLineTo(5f)
            curveTo(3.895f, 21f, 3f, 20.105f, 3f, 19f)
            lineTo(3f, 18f)
            curveTo(3f, 16.895f, 3.895f, 16f, 5f, 16f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ListBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ListBar, contentDescription = null)
    }
}
