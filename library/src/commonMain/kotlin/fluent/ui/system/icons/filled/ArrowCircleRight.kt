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

public val FluentUi.Filled.ArrowCircleRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.001f, 2f)
            curveTo(17.524f, 2f, 22.001f, 6.477f, 22.001f, 12f)
            curveTo(22.001f, 17.523f, 17.524f, 22f, 12.001f, 22f)
            curveTo(6.478f, 22f, 2.001f, 17.523f, 2.001f, 12f)
            curveTo(2.001f, 6.477f, 6.478f, 2f, 12.001f, 2f)
            close()
            moveTo(12.781f, 7.469f)
            lineTo(12.697f, 7.396f)
            curveTo(12.436f, 7.203f, 12.078f, 7.2f, 11.815f, 7.389f)
            lineTo(11.721f, 7.469f)
            lineTo(11.648f, 7.553f)
            curveTo(11.454f, 7.814f, 11.452f, 8.172f, 11.641f, 8.436f)
            lineTo(11.721f, 8.53f)
            lineTo(14.44f, 11.249f)
            horizontalLineTo(7.75f)
            lineTo(7.648f, 11.256f)
            curveTo(7.316f, 11.301f, 7.052f, 11.565f, 7.007f, 11.898f)
            lineTo(7f, 11.999f)
            lineTo(7.007f, 12.101f)
            curveTo(7.052f, 12.434f, 7.316f, 12.697f, 7.648f, 12.742f)
            lineTo(7.75f, 12.749f)
            horizontalLineTo(14.44f)
            lineTo(11.72f, 15.47f)
            lineTo(11.647f, 15.554f)
            curveTo(11.429f, 15.847f, 11.454f, 16.264f, 11.72f, 16.53f)
            curveTo(11.986f, 16.797f, 12.403f, 16.821f, 12.696f, 16.603f)
            lineTo(12.781f, 16.531f)
            lineTo(16.782f, 12.531f)
            lineTo(16.855f, 12.446f)
            curveTo(17.048f, 12.185f, 17.051f, 11.827f, 16.862f, 11.564f)
            lineTo(16.782f, 11.47f)
            lineTo(12.781f, 7.469f)
            lineTo(12.697f, 7.396f)
            lineTo(12.781f, 7.469f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowCircleRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowCircleRight, contentDescription = null)
    }
}
