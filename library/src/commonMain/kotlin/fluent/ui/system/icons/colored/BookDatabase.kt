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

public val FluentUi.Colored.BookDatabase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.BookDatabase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    0.716f to Color(0xFF58AAFE)
                ),
                start = Offset(12.174f, 20.4f),
                end = Offset(12.174f, 18f)
            )
        ) {
            moveTo(5f, 19f)
            horizontalLineTo(20.281f)
            curveTo(20.281f, 19f, 20f, 19.5f, 20f, 20f)
            curveTo(20f, 20.5f, 20.281f, 21f, 20.281f, 21f)
            horizontalLineTo(6f)
            curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
            verticalLineTo(19f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(9.693f, 5.742f),
                end = Offset(12.681f, 27.308f)
            )
        ) {
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
            horizontalLineTo(5.5f)
            curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
            curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
            verticalLineTo(4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(10.449f, 4.314f),
                end = Offset(15.053f, 11.478f)
            )
        ) {
            moveTo(7f, 6f)
            curveTo(7f, 5.448f, 7.448f, 5f, 8f, 5f)
            horizontalLineTo(16f)
            curveTo(16.552f, 5f, 17f, 5.448f, 17f, 6f)
            verticalLineTo(8f)
            curveTo(17f, 8.552f, 16.552f, 9f, 16f, 9f)
            horizontalLineTo(8f)
            curveTo(7.448f, 9f, 7f, 8.552f, 7f, 8f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(15.5f, 20.5f),
                radius = 3.905f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
            curveTo(20.5f, 10.035f, 20.5f, 16.025f, 20.5f, 21.25f)
            curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
            verticalLineTo(4.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF171155),
                    0.328f to Color(0xFF171155),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(15f, 19.5f),
                radius = 7.5f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
            curveTo(20.5f, 10.035f, 20.5f, 16.025f, 20.5f, 21.25f)
            curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
            verticalLineTo(4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(15.361f, 12.575f),
                end = Offset(21.193f, 22.072f)
            )
        ) {
            moveTo(19.5f, 15.896f)
            curveTo(20.029f, 15.822f, 20.534f, 15.708f, 21f, 15.559f)
            curveTo(21.351f, 15.446f, 21.68f, 15.313f, 21.983f, 15.162f)
            curveTo(22.337f, 14.985f, 22.69f, 14.762f, 23f, 14.492f)
            verticalLineTo(20.5f)
            curveTo(23f, 21.881f, 20.761f, 23f, 18f, 23f)
            curveTo(15.95f, 23f, 14.188f, 22.383f, 13.416f, 21.5f)
            curveTo(13.148f, 21.194f, 13f, 20.856f, 13f, 20.5f)
            verticalLineTo(14.492f)
            curveTo(13.31f, 14.762f, 13.663f, 14.985f, 14.017f, 15.162f)
            curveTo(15.088f, 15.698f, 16.498f, 16f, 18f, 16f)
            curveTo(18.514f, 16f, 19.017f, 15.965f, 19.5f, 15.896f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF66C0FF),
                    1f to Color(0xFFC8F3FF)
                ),
                start = Offset(21.333f, 17.5f),
                end = Offset(15.222f, 12f)
            )
        ) {
            moveTo(19.5f, 12.114f)
            curveTo(20.046f, 12.2f, 20.552f, 12.332f, 21f, 12.5f)
            curveTo(22.214f, 12.956f, 23f, 13.682f, 23f, 14.5f)
            curveTo(23f, 15.318f, 22.214f, 16.044f, 21f, 16.5f)
            curveTo(20.552f, 16.668f, 20.046f, 16.8f, 19.5f, 16.885f)
            curveTo(19.027f, 16.96f, 18.523f, 17f, 18f, 17f)
            curveTo(15.239f, 17f, 13f, 15.881f, 13f, 14.5f)
            curveTo(13f, 13.119f, 15.239f, 12f, 18f, 12f)
            curveTo(18.523f, 12f, 19.027f, 12.04f, 19.5f, 12.114f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.BookDatabase, contentDescription = null)
    }
}
