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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.Form: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Form",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF),
                ),
                start = Offset(9.429f, 3f),
                end = Offset(16.325f, 20.03f),
            ),
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(5.4f, 5.4f),
                end = Offset(19.99f, 7.989f),
            ),
        ) {
            moveTo(12f, 10.75f)
            curveTo(12f, 10.336f, 12.336f, 10f, 12.75f, 10f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 10f, 18f, 10.336f, 18f, 10.75f)
            curveTo(18f, 11.164f, 17.664f, 11.5f, 17.25f, 11.5f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 11.5f, 12f, 11.164f, 12f, 10.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(5.4f, 5.4f),
                end = Offset(19.99f, 7.989f),
            ),
        ) {
            moveTo(12.75f, 15.5f)
            curveTo(12.336f, 15.5f, 12f, 15.836f, 12f, 16.25f)
            curveTo(12f, 16.664f, 12.336f, 17f, 12.75f, 17f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 17f, 18f, 16.664f, 18f, 16.25f)
            curveTo(18f, 15.836f, 17.664f, 15.5f, 17.25f, 15.5f)
            horizontalLineTo(12.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(5.4f, 5.4f),
                end = Offset(19.99f, 7.989f),
            ),
        ) {
            moveTo(6f, 6.75f)
            curveTo(6f, 6.336f, 6.336f, 6f, 6.75f, 6f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 6f, 18f, 6.336f, 18f, 6.75f)
            curveTo(18f, 7.164f, 17.664f, 7.5f, 17.25f, 7.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 7.5f, 6f, 7.164f, 6f, 6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(5.4f, 5.4f),
                end = Offset(19.99f, 7.989f),
            ),
        ) {
            moveTo(10f, 11f)
            curveTo(10f, 12.105f, 9.105f, 13f, 8f, 13f)
            curveTo(6.895f, 13f, 6f, 12.105f, 6f, 11f)
            curveTo(6f, 9.895f, 6.895f, 9f, 8f, 9f)
            curveTo(9.105f, 9f, 10f, 9.895f, 10f, 11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(5.4f, 5.4f),
                end = Offset(19.99f, 7.989f),
            ),
        ) {
            moveTo(8f, 18f)
            curveTo(9.105f, 18f, 10f, 17.105f, 10f, 16f)
            curveTo(10f, 14.895f, 9.105f, 14f, 8f, 14f)
            curveTo(6.895f, 14f, 6f, 14.895f, 6f, 16f)
            curveTo(6f, 17.105f, 6.895f, 18f, 8f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FormPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Form, contentDescription = null)
    }
}
