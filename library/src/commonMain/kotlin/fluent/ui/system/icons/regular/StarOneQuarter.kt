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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.StarOneQuarter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarOneQuarter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.209f, 3.102f)
            curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.102f)
            lineTo(8.43f, 7.88f)
            lineTo(3.157f, 8.646f)
            curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
            lineTo(6.224f, 14.668f)
            lineTo(5.324f, 19.919f)
            curveTo(5.174f, 20.789f, 5.864f, 21.497f, 6.649f, 21.5f)
            curveTo(6.859f, 21.501f, 7.075f, 21.452f, 7.284f, 21.342f)
            lineTo(9f, 20.44f)
            verticalLineTo(20.439f)
            lineTo(11.998f, 18.863f)
            lineTo(16.714f, 21.342f)
            curveTo(17.705f, 21.863f, 18.862f, 21.022f, 18.673f, 19.919f)
            lineTo(17.772f, 14.668f)
            lineTo(21.588f, 10.949f)
            curveTo(22.389f, 10.168f, 21.947f, 8.807f, 20.84f, 8.646f)
            lineTo(15.567f, 7.88f)
            lineTo(13.209f, 3.102f)
            close()
            moveTo(9f, 18.744f)
            verticalLineTo(9.282f)
            curveTo(9.32f, 9.164f, 9.586f, 8.926f, 9.74f, 8.614f)
            lineTo(11.998f, 4.039f)
            lineTo(14.257f, 8.614f)
            curveTo(14.453f, 9.013f, 14.833f, 9.289f, 15.273f, 9.353f)
            lineTo(20.323f, 10.087f)
            lineTo(16.669f, 13.649f)
            curveTo(16.351f, 13.959f, 16.206f, 14.406f, 16.281f, 14.844f)
            lineTo(17.143f, 19.873f)
            lineTo(12.627f, 17.498f)
            curveTo(12.233f, 17.292f, 11.764f, 17.292f, 11.37f, 17.498f)
            lineTo(9f, 18.744f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarOneQuarterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StarOneQuarter, contentDescription = null)
    }
}
