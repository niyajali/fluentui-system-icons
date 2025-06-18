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

public val FluentUi.Colored.AppsListDetail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.AppsListDetail",
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
                start = Offset(9.35f, 3f),
                end = Offset(20.9f, 19f)
            )
        ) {
            moveTo(11f, 6f)
            curveTo(11f, 5.448f, 11.448f, 5f, 12f, 5f)
            horizontalLineTo(21f)
            curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
            curveTo(22f, 6.552f, 21.552f, 7f, 21f, 7f)
            horizontalLineTo(12f)
            curveTo(11.448f, 7f, 11f, 6.552f, 11f, 6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(9.35f, 3f),
                end = Offset(20.9f, 19f)
            )
        ) {
            moveTo(11f, 9f)
            curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
            horizontalLineTo(18f)
            curveTo(18.552f, 8f, 19f, 8.448f, 19f, 9f)
            curveTo(19f, 9.552f, 18.552f, 10f, 18f, 10f)
            horizontalLineTo(12f)
            curveTo(11.448f, 10f, 11f, 9.552f, 11f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(9.35f, 3f),
                end = Offset(20.9f, 19f)
            )
        ) {
            moveTo(11f, 15f)
            curveTo(11f, 14.448f, 11.448f, 14f, 12f, 14f)
            horizontalLineTo(21f)
            curveTo(21.552f, 14f, 22f, 14.448f, 22f, 15f)
            curveTo(22f, 15.552f, 21.552f, 16f, 21f, 16f)
            horizontalLineTo(12f)
            curveTo(11.448f, 16f, 11f, 15.552f, 11f, 15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(9.35f, 3f),
                end = Offset(20.9f, 19f)
            )
        ) {
            moveTo(11f, 18f)
            curveTo(11f, 17.448f, 11.448f, 17f, 12f, 17f)
            horizontalLineTo(18f)
            curveTo(18.552f, 17f, 19f, 17.448f, 19f, 18f)
            curveTo(19f, 18.552f, 18.552f, 19f, 18f, 19f)
            horizontalLineTo(12f)
            curveTo(11.448f, 19f, 11f, 18.552f, 11f, 18f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(3.665f, 6.127f),
                end = Offset(7.232f, 19.147f)
            )
        ) {
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(2f, 9.993f, 3.007f, 11f, 4.25f, 11f)
            horizontalLineTo(6.75f)
            curveTo(7.993f, 11f, 9f, 9.993f, 9f, 8.75f)
            verticalLineTo(6.25f)
            curveTo(9f, 5.007f, 7.993f, 4f, 6.75f, 4f)
            horizontalLineTo(4.25f)
            close()
            moveTo(4.25f, 13f)
            curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 18.993f, 3.007f, 20f, 4.25f, 20f)
            horizontalLineTo(6.75f)
            curveTo(7.993f, 20f, 9f, 18.993f, 9f, 17.75f)
            verticalLineTo(15.25f)
            curveTo(9f, 14.007f, 7.993f, 13f, 6.75f, 13f)
            horizontalLineTo(4.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppsListDetailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.AppsListDetail, contentDescription = null)
    }
}
