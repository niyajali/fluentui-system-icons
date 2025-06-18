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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.Video: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Video",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.081f to Color(0xFFF08AF4),
                    0.394f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB),
                ),
                center = Offset(17f, 3f),
                radius = 19.164f,
            ),
        ) {
            moveTo(11f, 12f)
            lineTo(19.255f, 6.296f)
            curveTo(20.416f, 5.494f, 22f, 6.325f, 22f, 7.736f)
            verticalLineTo(16.264f)
            curveTo(22f, 17.675f, 20.416f, 18.506f, 19.255f, 17.704f)
            lineTo(11f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A),
                ),
                start = Offset(14.056f, 12f),
                end = Offset(21.993f, 11.767f),
            ),
            fillAlpha = 0.75f,
        ) {
            moveTo(11f, 12f)
            lineTo(19.255f, 6.296f)
            curveTo(20.416f, 5.494f, 22f, 6.325f, 22f, 7.736f)
            verticalLineTo(16.264f)
            curveTo(22f, 17.675f, 20.416f, 18.506f, 19.255f, 17.704f)
            lineTo(11f, 12f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.341f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB),
                ),
                center = Offset(-0.363f, 5.583f),
                radius = 21.053f,
            ),
        ) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(11.75f)
            curveTo(13.545f, 5f, 15f, 6.455f, 15f, 8.25f)
            verticalLineTo(15.75f)
            curveTo(15f, 17.545f, 13.545f, 19f, 11.75f, 19f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
            verticalLineTo(8.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3B148A),
                    1f to Color(0xFF4B20A0),
                ),
                start = Offset(3.796f, 13f),
                end = Offset(5.154f, 18.344f),
            ),
            fillAlpha = 0.5f,
            strokeAlpha = 0.5f,
        ) {
            moveTo(4f, 15f)
            curveTo(4f, 13.895f, 4.895f, 13f, 6f, 13f)
            horizontalLineTo(11f)
            curveTo(12.105f, 13f, 13f, 13.895f, 13f, 15f)
            curveTo(13f, 16.105f, 12.105f, 17f, 11f, 17f)
            horizontalLineTo(6f)
            curveTo(4.895f, 17f, 4f, 16.105f, 4f, 15f)
            close()
        }
        path(fill = SolidColor(Color(0xFFBABAFF))) {
            moveTo(6f, 14f)
            curveTo(5.448f, 14f, 5f, 14.448f, 5f, 15f)
            curveTo(5f, 15.552f, 5.448f, 16f, 6f, 16f)
            horizontalLineTo(8f)
            curveTo(8.552f, 16f, 9f, 15.552f, 9f, 15f)
            curveTo(9f, 14.448f, 8.552f, 14f, 8f, 14f)
            horizontalLineTo(6f)
            close()
        }
        path(fill = SolidColor(Color(0xFFBABAFF))) {
            moveTo(11f, 16f)
            curveTo(11.552f, 16f, 12f, 15.552f, 12f, 15f)
            curveTo(12f, 14.448f, 11.552f, 14f, 11f, 14f)
            curveTo(10.448f, 14f, 10f, 14.448f, 10f, 15f)
            curveTo(10f, 15.552f, 10.448f, 16f, 11f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Video, contentDescription = null)
    }
}
