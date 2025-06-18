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

public val FluentUi.Colored.PeopleList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.PeopleList",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE),
                ),
                start = Offset(4.854f, 14.931f),
                end = Offset(7.41f, 21.927f),
            ),
        ) {
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineTo(16.5f)
            curveTo(2f, 16.5f, 2f, 21f, 8f, 21f)
            curveTo(14f, 21f, 14f, 16.5f, 14f, 16.5f)
            verticalLineTo(16.25f)
            curveTo(14f, 15.007f, 12.993f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8),
                ),
                start = Offset(8f, 13.167f),
                end = Offset(11.607f, 24.721f),
            ),
        ) {
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineTo(16.5f)
            curveTo(2f, 16.5f, 2f, 21f, 8f, 21f)
            curveTo(14f, 21f, 14f, 16.5f, 14f, 16.5f)
            verticalLineTo(16.25f)
            curveTo(14f, 15.007f, 12.993f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xBF0A1852),
                    1f to Color(0x000A1852),
                ),
                start = Offset(15f, 18f),
                end = Offset(9f, 18f),
            ),
            fillAlpha = 0.75f,
        ) {
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineTo(16.5f)
            curveTo(2f, 16.5f, 2f, 21f, 8f, 21f)
            curveTo(14f, 21f, 14f, 16.5f, 14f, 16.5f)
            verticalLineTo(16.25f)
            curveTo(14f, 15.007f, 12.993f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(15.427f, 6.798f),
                end = Offset(18.485f, 11.68f),
            ),
        ) {
            moveTo(17f, 12f)
            curveTo(18.657f, 12f, 20f, 10.657f, 20f, 9f)
            curveTo(20f, 7.343f, 18.657f, 6f, 17f, 6f)
            curveTo(15.343f, 6f, 14f, 7.343f, 14f, 9f)
            curveTo(14f, 10.657f, 15.343f, 12f, 17f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE),
                ),
                start = Offset(5.902f, 5.063f),
                end = Offset(9.98f, 11.574f),
            ),
        ) {
            moveTo(8f, 12f)
            curveTo(10.209f, 12f, 12f, 10.209f, 12f, 8f)
            curveTo(12f, 5.791f, 10.209f, 4f, 8f, 4f)
            curveTo(5.791f, 4f, 4f, 5.791f, 4f, 8f)
            curveTo(4f, 10.209f, 5.791f, 12f, 8f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF),
                ),
                start = Offset(14.929f, 11f),
                end = Offset(19.143f, 21.407f),
            ),
        ) {
            moveTo(11f, 13f)
            curveTo(11f, 11.895f, 11.895f, 11f, 13f, 11f)
            horizontalLineTo(20f)
            curveTo(21.105f, 11f, 22f, 11.895f, 22f, 13f)
            verticalLineTo(20f)
            curveTo(22f, 21.105f, 21.105f, 22f, 20f, 22f)
            horizontalLineTo(13f)
            curveTo(11.895f, 22f, 11f, 21.105f, 11f, 20f)
            verticalLineTo(13f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7),
                ),
                start = Offset(9.5f, 8.1f),
                end = Offset(20f, 20f),
            ),
        ) {
            moveTo(13.75f, 13f)
            curveTo(13.336f, 13f, 13f, 13.336f, 13f, 13.75f)
            curveTo(13f, 14.164f, 13.336f, 14.5f, 13.75f, 14.5f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 14.5f, 20f, 14.164f, 20f, 13.75f)
            curveTo(20f, 13.336f, 19.664f, 13f, 19.25f, 13f)
            horizontalLineTo(13.75f)
            close()
            moveTo(13.75f, 15.75f)
            curveTo(13.336f, 15.75f, 13f, 16.086f, 13f, 16.5f)
            curveTo(13f, 16.914f, 13.336f, 17.25f, 13.75f, 17.25f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 17.25f, 20f, 16.914f, 20f, 16.5f)
            curveTo(20f, 16.086f, 19.664f, 15.75f, 19.25f, 15.75f)
            horizontalLineTo(13.75f)
            close()
            moveTo(13.75f, 18.5f)
            curveTo(13.336f, 18.5f, 13f, 18.836f, 13f, 19.25f)
            curveTo(13f, 19.664f, 13.336f, 20f, 13.75f, 20f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 20f, 20f, 19.664f, 20f, 19.25f)
            curveTo(20f, 18.836f, 19.664f, 18.5f, 19.25f, 18.5f)
            horizontalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.PeopleList, contentDescription = null)
    }
}
