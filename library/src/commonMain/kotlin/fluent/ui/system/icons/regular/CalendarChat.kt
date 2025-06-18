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
package fluent.ui.system.icons.regular

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
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.CalendarChat: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarChat",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(12.021f)
            curveTo(20.537f, 11.724f, 20.033f, 11.485f, 19.5f, 11.313f)
            verticalLineTo(8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(11.314f)
            curveTo(11.398f, 19.762f, 11.499f, 20.017f, 11.615f, 20.264f)
            lineTo(11.391f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(19.5f, 12.374f)
            curveTo(20.048f, 12.588f, 20.554f, 12.887f, 21f, 13.256f)
            curveTo(22.223f, 14.265f, 23.002f, 15.792f, 23.002f, 17.501f)
            curveTo(23.002f, 20.539f, 20.539f, 23.002f, 17.501f, 23.002f)
            curveTo(16.534f, 23.002f, 15.624f, 22.753f, 14.834f, 22.314f)
            lineTo(12.647f, 22.979f)
            curveTo(12.264f, 23.096f, 11.907f, 22.738f, 12.023f, 22.355f)
            lineTo(12.689f, 20.169f)
            curveTo(12.25f, 19.379f, 12f, 18.469f, 12f, 17.501f)
            curveTo(12f, 14.522f, 14.369f, 12.095f, 17.326f, 12.003f)
            curveTo(17.375f, 12.001f, 17.425f, 12f, 17.475f, 12f)
            curveTo(17.484f, 12f, 17.492f, 12f, 17.501f, 12f)
            curveTo(18.206f, 12f, 18.88f, 12.133f, 19.5f, 12.374f)
            close()
            moveTo(19.501f, 17.001f)
            curveTo(19.778f, 17.001f, 20.002f, 16.777f, 20.002f, 16.501f)
            curveTo(20.002f, 16.225f, 19.778f, 16.001f, 19.501f, 16.001f)
            horizontalLineTo(15.501f)
            curveTo(15.224f, 16.001f, 15.001f, 16.225f, 15.001f, 16.501f)
            curveTo(15.001f, 16.777f, 15.224f, 17.001f, 15.501f, 17.001f)
            horizontalLineTo(19.501f)
            close()
            moveTo(15.501f, 19.001f)
            horizontalLineTo(17.501f)
            curveTo(17.777f, 19.001f, 18.001f, 18.778f, 18.001f, 18.501f)
            curveTo(18.001f, 18.225f, 17.777f, 18.001f, 17.501f, 18.001f)
            horizontalLineTo(15.501f)
            curveTo(15.224f, 18.001f, 15.001f, 18.225f, 15.001f, 18.501f)
            curveTo(15.001f, 18.778f, 15.224f, 19.001f, 15.501f, 19.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarChat, contentDescription = null)
    }
}
