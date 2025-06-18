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

public val FluentUi.Colored.Diversity: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Diversity",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B),
                ),
                start = Offset(8.339f, 8.892f),
                end = Offset(19.212f, 20.111f),
            ),
        ) {
            moveTo(17.625f, 12.745f)
            curveTo(17.238f, 12.522f, 16.762f, 12.522f, 16.375f, 12.745f)
            lineTo(13.627f, 14.331f)
            curveTo(13.241f, 14.554f, 13.002f, 14.967f, 13.002f, 15.414f)
            verticalLineTo(18.586f)
            curveTo(13.002f, 19.033f, 13.241f, 19.446f, 13.627f, 19.669f)
            lineTo(16.375f, 21.255f)
            curveTo(16.762f, 21.479f, 17.238f, 21.479f, 17.625f, 21.255f)
            lineTo(20.373f, 19.669f)
            curveTo(20.759f, 19.446f, 20.998f, 19.033f, 20.998f, 18.586f)
            verticalLineTo(15.414f)
            curveTo(20.998f, 14.967f, 20.759f, 14.554f, 20.373f, 14.331f)
            lineTo(17.625f, 12.745f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401),
                ),
                start = Offset(9.667f, -1f),
                end = Offset(19.5f, 11.75f),
            ),
        ) {
            moveTo(15.25f, 3f)
            curveTo(14.007f, 3f, 13f, 4.007f, 13f, 5.25f)
            verticalLineTo(8.75f)
            curveTo(13f, 9.993f, 14.007f, 11f, 15.25f, 11f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 11f, 21f, 9.993f, 21f, 8.75f)
            verticalLineTo(5.25f)
            curveTo(21f, 4.007f, 19.993f, 3f, 18.75f, 3f)
            horizontalLineTo(15.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(3f, 13f),
                end = Offset(11f, 21f),
            ),
        ) {
            moveTo(7f, 13f)
            curveTo(4.791f, 13f, 3f, 14.791f, 3f, 17f)
            curveTo(3f, 19.209f, 4.791f, 21f, 7f, 21f)
            curveTo(9.209f, 21f, 11f, 19.209f, 11f, 17f)
            curveTo(11f, 14.791f, 9.209f, 13f, 7f, 13f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF24A9D),
                    1f to Color(0xFFD7257D),
                ),
                start = Offset(3.286f, 4.5f),
                end = Offset(8.807f, 10.236f),
            ),
        ) {
            moveTo(5.55f, 3.898f)
            curveTo(6.153f, 2.701f, 7.847f, 2.701f, 8.45f, 3.898f)
            lineTo(10.822f, 8.614f)
            curveTo(11.371f, 9.707f, 10.585f, 11f, 9.372f, 11f)
            lineTo(4.628f, 11f)
            curveTo(3.415f, 11f, 2.629f, 9.707f, 3.178f, 8.614f)
            lineTo(5.55f, 3.898f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DiversityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Diversity, contentDescription = null)
    }
}
