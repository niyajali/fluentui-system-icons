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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.CursorHover: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorHover",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 4f)
            curveTo(3.119f, 4f, 2f, 5.119f, 2f, 6.5f)
            verticalLineTo(15.5f)
            curveTo(2f, 16.881f, 3.119f, 18f, 4.5f, 18f)
            horizontalLineTo(9f)
            verticalLineTo(10.75f)
            curveTo(9f, 10.09f, 9.371f, 9.487f, 9.959f, 9.189f)
            curveTo(10.547f, 8.891f, 11.253f, 8.949f, 11.785f, 9.339f)
            lineTo(19.285f, 16.839f)
            curveTo(19.66f, 17.114f, 19.9f, 17.518f, 19.975f, 17.955f)
            curveTo(21.128f, 17.733f, 22f, 16.718f, 22f, 15.5f)
            verticalLineTo(6.5f)
            curveTo(22f, 5.119f, 20.881f, 4f, 19.5f, 4f)
            horizontalLineTo(4.5f)
            close()
            moveTo(11.28f, 10.22f)
            curveTo(11.066f, 10.005f, 10.743f, 9.941f, 10.463f, 10.057f)
            curveTo(10.183f, 10.173f, 10f, 10.447f, 10f, 10.75f)
            verticalLineTo(21.25f)
            curveTo(10f, 21.579f, 10.214f, 21.869f, 10.528f, 21.966f)
            curveTo(10.841f, 22.064f, 11.182f, 21.946f, 11.368f, 21.675f)
            lineTo(13.835f, 18.087f)
            lineTo(18.096f, 18.984f)
            curveTo(18.42f, 19.052f, 18.751f, 18.899f, 18.91f, 18.607f)
            curveTo(19.067f, 18.315f, 19.015f, 17.954f, 18.78f, 17.72f)
            lineTo(11.28f, 10.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CursorHoverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CursorHover, contentDescription = null)
    }
}
