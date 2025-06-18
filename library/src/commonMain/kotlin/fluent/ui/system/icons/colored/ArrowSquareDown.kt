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

public val FluentUi.Colored.ArrowSquareDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ArrowSquareDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(3.643f, 6.375f),
                end = Offset(17.786f, 17.625f),
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
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0xFFB3E0FF),
                ),
                start = Offset(9.076f, 7.769f),
                end = Offset(16.75f, 25.272f),
            ),
        ) {
            moveTo(16.53f, 11.72f)
            lineTo(16.446f, 11.648f)
            curveTo(16.153f, 11.43f, 15.736f, 11.454f, 15.47f, 11.72f)
            lineTo(12.75f, 14.44f)
            lineTo(12.75f, 7.75f)
            lineTo(12.743f, 7.648f)
            curveTo(12.693f, 7.282f, 12.38f, 7f, 12f, 7f)
            lineTo(11.898f, 7.007f)
            curveTo(11.532f, 7.057f, 11.25f, 7.37f, 11.25f, 7.75f)
            lineTo(11.25f, 14.442f)
            lineTo(8.53f, 11.72f)
            lineTo(8.446f, 11.647f)
            curveTo(8.152f, 11.429f, 7.735f, 11.453f, 7.469f, 11.72f)
            curveTo(7.176f, 12.012f, 7.176f, 12.487f, 7.469f, 12.78f)
            lineTo(11.469f, 16.782f)
            lineTo(11.553f, 16.854f)
            curveTo(11.847f, 17.072f, 12.263f, 17.048f, 12.53f, 16.782f)
            lineTo(16.53f, 12.781f)
            lineTo(16.603f, 12.697f)
            curveTo(16.821f, 12.403f, 16.797f, 11.987f, 16.53f, 11.72f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSquareDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ArrowSquareDown, contentDescription = null)
    }
}
