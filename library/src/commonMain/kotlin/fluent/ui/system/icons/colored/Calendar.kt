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

public val FluentUi.Colored.Calendar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Calendar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFFB3E0FF),
                ),
                start = Offset(15.25f, 22.781f),
                end = Offset(9.834f, 7.321f),
            ),
        ) {
            moveTo(21f, 7.5f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineTo(12f, 6.5f)
            lineTo(21f, 7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8),
                ),
                start = Offset(13.929f, 12.432f),
                end = Offset(16.625f, 24.267f),
            ),
        ) {
            moveTo(21f, 7.5f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineTo(12f, 6.5f)
            lineTo(21f, 7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF),
                ),
                start = Offset(10.909f, 9.692f),
                end = Offset(13.059f, 23.697f),
            ),
        ) {
            moveTo(7.25f, 15f)
            curveTo(7.94f, 15f, 8.5f, 15.56f, 8.5f, 16.25f)
            curveTo(8.5f, 16.94f, 7.94f, 17.5f, 7.25f, 17.5f)
            curveTo(6.56f, 17.5f, 6f, 16.94f, 6f, 16.25f)
            curveTo(6f, 15.56f, 6.56f, 15f, 7.25f, 15f)
            close()
            moveTo(12f, 15f)
            curveTo(12.69f, 15f, 13.25f, 15.56f, 13.25f, 16.25f)
            curveTo(13.25f, 16.94f, 12.69f, 17.5f, 12f, 17.5f)
            curveTo(11.31f, 17.5f, 10.75f, 16.94f, 10.75f, 16.25f)
            curveTo(10.75f, 15.56f, 11.31f, 15f, 12f, 15f)
            close()
            moveTo(7.25f, 10.5f)
            curveTo(7.94f, 10.5f, 8.5f, 11.06f, 8.5f, 11.75f)
            curveTo(8.5f, 12.44f, 7.94f, 13f, 7.25f, 13f)
            curveTo(6.56f, 13f, 6f, 12.44f, 6f, 11.75f)
            curveTo(6f, 11.06f, 6.56f, 10.5f, 7.25f, 10.5f)
            close()
            moveTo(12f, 10.5f)
            curveTo(12.69f, 10.5f, 13.25f, 11.06f, 13.25f, 11.75f)
            curveTo(13.25f, 12.44f, 12.69f, 13f, 12f, 13f)
            curveTo(11.31f, 13f, 10.75f, 12.44f, 10.75f, 11.75f)
            curveTo(10.75f, 11.06f, 11.31f, 10.5f, 12f, 10.5f)
            close()
            moveTo(16.75f, 10.5f)
            curveTo(17.44f, 10.5f, 18f, 11.06f, 18f, 11.75f)
            curveTo(18f, 12.44f, 17.44f, 13f, 16.75f, 13f)
            curveTo(16.06f, 13f, 15.5f, 12.44f, 15.5f, 11.75f)
            curveTo(15.5f, 11.06f, 16.06f, 10.5f, 16.75f, 10.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(3f, 3f),
                end = Offset(18.372f, -1.963f),
            ),
        ) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Calendar, contentDescription = null)
    }
}
