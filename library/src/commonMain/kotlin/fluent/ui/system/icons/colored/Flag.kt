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

public val FluentUi.Colored.Flag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Flag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFF63686E)
                ),
                start = Offset(4.5f, 24.089f),
                end = Offset(4.069f, 15.729f)
            )
        ) {
            moveTo(4.5f, 21.25f)
            verticalLineTo(15.5f)
            horizontalLineTo(3.007f)
            lineTo(3f, 21.25f)
            lineTo(3.007f, 21.352f)
            curveTo(3.057f, 21.718f, 3.37f, 22f, 3.75f, 22f)
            lineTo(3.852f, 21.993f)
            curveTo(4.218f, 21.943f, 4.5f, 21.63f, 4.5f, 21.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(-0.939f, -0.86f),
                end = Offset(6.516f, 17.385f)
            )
        ) {
            moveTo(3.75f, 2.998f)
            curveTo(3.336f, 2.998f, 3f, 3.334f, 3f, 3.748f)
            verticalLineTo(16f)
            curveTo(3f, 16.276f, 3.224f, 16.5f, 3.5f, 16.5f)
            lineTo(20.254f, 16.5f)
            curveTo(20.872f, 16.5f, 21.225f, 15.795f, 20.854f, 15.3f)
            lineTo(16.69f, 9.749f)
            lineTo(20.854f, 4.198f)
            curveTo(21.225f, 3.704f, 20.872f, 2.998f, 20.254f, 2.998f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Flag, contentDescription = null)
    }
}
