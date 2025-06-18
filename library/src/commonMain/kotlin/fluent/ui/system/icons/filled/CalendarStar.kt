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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.CalendarStar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarStar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(21f, 8.5f)
            lineTo(21.001f, 12.023f)
            curveTo(19.991f, 11.375f, 18.789f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 18.789f, 11.375f, 19.991f, 12.023f, 21.001f)
            lineTo(6.25f, 21f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(21f)
            close()
            moveTo(16.984f, 14.045f)
            lineTo(16.945f, 14.144f)
            lineTo(16.388f, 15.931f)
            horizontalLineTo(14.585f)
            curveTo(14.053f, 15.931f, 13.813f, 16.6f, 14.168f, 16.967f)
            lineTo(14.242f, 17.032f)
            lineTo(15.7f, 18.137f)
            lineTo(15.143f, 19.924f)
            curveTo(14.978f, 20.454f, 15.518f, 20.899f, 15.964f, 20.655f)
            lineTo(16.042f, 20.604f)
            lineTo(17.5f, 19.5f)
            lineTo(18.958f, 20.604f)
            curveTo(19.39f, 20.932f, 19.964f, 20.534f, 19.879f, 20.016f)
            lineTo(19.857f, 19.924f)
            lineTo(19.3f, 18.137f)
            lineTo(20.758f, 17.032f)
            curveTo(21.189f, 16.706f, 21.006f, 16.018f, 20.511f, 15.939f)
            lineTo(20.415f, 15.931f)
            horizontalLineTo(18.612f)
            lineTo(18.055f, 14.144f)
            curveTo(17.892f, 13.618f, 17.212f, 13.585f, 16.984f, 14.045f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
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
private fun CalendarStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarStar, contentDescription = null)
    }
}
