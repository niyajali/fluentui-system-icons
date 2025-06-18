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
package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.CalendarCancel: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarCancel",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(15.024f, 15.024f)
            curveTo(14.828f, 15.219f, 14.828f, 15.536f, 15.024f, 15.731f)
            lineTo(16.793f, 17.501f)
            lineTo(15.026f, 19.267f)
            curveTo(14.831f, 19.463f, 14.831f, 19.779f, 15.026f, 19.975f)
            curveTo(15.222f, 20.17f, 15.538f, 20.17f, 15.733f, 19.975f)
            lineTo(17.5f, 18.208f)
            lineTo(19.269f, 19.977f)
            curveTo(19.465f, 20.172f, 19.781f, 20.172f, 19.976f, 19.977f)
            curveTo(20.172f, 19.782f, 20.172f, 19.465f, 19.976f, 19.27f)
            lineTo(18.208f, 17.501f)
            lineTo(19.979f, 15.731f)
            curveTo(20.174f, 15.536f, 20.174f, 15.219f, 19.979f, 15.024f)
            curveTo(19.784f, 14.829f, 19.467f, 14.829f, 19.272f, 15.024f)
            lineTo(17.501f, 16.794f)
            lineTo(15.731f, 15.024f)
            curveTo(15.536f, 14.829f, 15.219f, 14.829f, 15.024f, 15.024f)
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
private fun CalendarCancelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarCancel, contentDescription = null)
    }
}
