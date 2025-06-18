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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.ChatMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ChatMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.63f to Color(0xFF3D35B1),
                    0.85f to Color(0xFF6553C9),
                    1f to Color(0xFF7660D3),
                ),
                center = Offset(11.027f, 10.005f),
                radius = 10.573f,
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(22f, 13.5f)
            curveTo(22f, 9.358f, 18.642f, 6f, 14.5f, 6f)
            curveTo(10.358f, 6f, 7f, 9.358f, 7f, 13.5f)
            curveTo(7f, 17.642f, 10.358f, 21f, 14.5f, 21f)
            curveTo(15.6f, 21f, 16.646f, 20.763f, 17.589f, 20.336f)
            curveTo(18.847f, 20.627f, 20.202f, 20.876f, 20.825f, 20.987f)
            curveTo(21.513f, 21.11f, 22.112f, 20.506f, 21.978f, 19.817f)
            curveTo(21.861f, 19.208f, 21.599f, 17.9f, 21.297f, 16.675f)
            curveTo(21.748f, 15.71f, 22f, 14.634f, 22f, 13.5f)
            close()
            moveTo(14.517f, 18f)
            horizontalLineTo(14.483f)
            curveTo(14.488f, 18f, 14.494f, 18f, 14.5f, 18f)
            curveTo(14.506f, 18f, 14.511f, 18f, 14.517f, 18f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(2f, 3f),
                end = Offset(17.003f, 18f),
            ),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(2f, 10.5f)
            curveTo(2f, 6.358f, 5.358f, 3f, 9.5f, 3f)
            curveTo(13.642f, 3f, 17f, 6.358f, 17f, 10.5f)
            curveTo(17f, 14.642f, 13.642f, 18f, 9.5f, 18f)
            curveTo(8.4f, 18f, 7.354f, 17.763f, 6.411f, 17.336f)
            curveTo(5.153f, 17.627f, 3.798f, 17.876f, 3.175f, 17.987f)
            curveTo(2.487f, 18.11f, 1.888f, 17.506f, 2.022f, 16.817f)
            curveTo(2.14f, 16.208f, 2.401f, 14.9f, 2.703f, 13.675f)
            curveTo(2.252f, 12.71f, 2f, 11.634f, 2f, 10.5f)
            close()
            moveTo(9.483f, 15f)
            horizontalLineTo(9.517f)
            curveTo(9.512f, 15f, 9.506f, 15f, 9.5f, 15f)
            curveTo(9.494f, 15f, 9.489f, 15f, 9.483f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ChatMultiple, contentDescription = null)
    }
}
