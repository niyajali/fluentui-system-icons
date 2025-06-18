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

public val FluentUi.Filled.CalendarChat: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarChat",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 8.5f)
            verticalLineTo(12.021f)
            curveTo(19.989f, 11.375f, 18.786f, 11f, 17.501f, 11f)
            curveTo(13.911f, 11f, 11f, 13.911f, 11f, 17.501f)
            curveTo(11f, 18.487f, 11.22f, 19.424f, 11.615f, 20.264f)
            lineTo(11.391f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(21f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(21f, 13.256f)
            curveTo(20.162f, 12.565f, 19.117f, 12.117f, 17.971f, 12.02f)
            curveTo(17.816f, 12.007f, 17.659f, 12f, 17.501f, 12f)
            curveTo(14.463f, 12f, 12f, 14.463f, 12f, 17.501f)
            curveTo(12f, 18.469f, 12.25f, 19.379f, 12.689f, 20.169f)
            lineTo(12.023f, 22.355f)
            curveTo(11.907f, 22.738f, 12.264f, 23.096f, 12.647f, 22.979f)
            lineTo(14.834f, 22.314f)
            curveTo(15.624f, 22.753f, 16.534f, 23.002f, 17.501f, 23.002f)
            curveTo(20.539f, 23.002f, 23.002f, 20.539f, 23.002f, 17.501f)
            curveTo(23.002f, 15.792f, 22.223f, 14.265f, 21f, 13.256f)
            close()
            moveTo(15.501f, 17.001f)
            curveTo(15.225f, 17.001f, 15.001f, 16.777f, 15.001f, 16.501f)
            curveTo(15.001f, 16.225f, 15.225f, 16.001f, 15.501f, 16.001f)
            horizontalLineTo(19.501f)
            curveTo(19.778f, 16.001f, 20.002f, 16.225f, 20.002f, 16.501f)
            curveTo(20.002f, 16.777f, 19.778f, 17.001f, 19.501f, 17.001f)
            horizontalLineTo(15.501f)
            close()
            moveTo(17.501f, 19.001f)
            horizontalLineTo(15.501f)
            curveTo(15.225f, 19.001f, 15.001f, 18.778f, 15.001f, 18.501f)
            curveTo(15.001f, 18.225f, 15.225f, 18.001f, 15.501f, 18.001f)
            horizontalLineTo(17.501f)
            curveTo(17.777f, 18.001f, 18.001f, 18.225f, 18.001f, 18.501f)
            curveTo(18.001f, 18.778f, 17.777f, 19.001f, 17.501f, 19.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarChat, contentDescription = null)
    }
}
