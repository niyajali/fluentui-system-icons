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

public val FluentIcons.Regular.ShapeUnion: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShapeUnion",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 2f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(13.25f)
            curveTo(2f, 13.35f, 2.005f, 13.449f, 2.013f, 13.547f)
            curveTo(2.06f, 14.061f, 2.226f, 14.54f, 2.483f, 14.956f)
            curveTo(2.506f, 14.994f, 2.53f, 15.031f, 2.555f, 15.067f)
            curveTo(2.813f, 15.449f, 3.151f, 15.774f, 3.544f, 16.017f)
            curveTo(3.96f, 16.274f, 4.439f, 16.44f, 4.953f, 16.487f)
            lineTo(4.959f, 16.487f)
            curveTo(5.055f, 16.496f, 5.152f, 16.5f, 5.25f, 16.5f)
            horizontalLineTo(7.5f)
            verticalLineTo(18.75f)
            curveTo(7.5f, 19.142f, 7.569f, 19.517f, 7.696f, 19.865f)
            curveTo(7.855f, 20.3f, 8.105f, 20.692f, 8.422f, 21.018f)
            curveTo(8.432f, 21.028f, 8.442f, 21.038f, 8.452f, 21.048f)
            curveTo(8.805f, 21.402f, 9.24f, 21.674f, 9.726f, 21.835f)
            curveTo(10.048f, 21.942f, 10.392f, 22f, 10.75f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(10.75f)
            curveTo(22f, 10.392f, 21.942f, 10.048f, 21.835f, 9.726f)
            curveTo(21.825f, 9.694f, 21.814f, 9.663f, 21.803f, 9.633f)
            curveTo(21.634f, 9.171f, 21.363f, 8.758f, 21.018f, 8.422f)
            curveTo(20.692f, 8.105f, 20.3f, 7.855f, 19.865f, 7.696f)
            curveTo(19.841f, 7.687f, 19.817f, 7.679f, 19.792f, 7.671f)
            curveTo(19.465f, 7.56f, 19.115f, 7.5f, 18.75f, 7.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(5.25f)
            curveTo(16.5f, 5.15f, 16.496f, 5.051f, 16.487f, 4.953f)
            curveTo(16.44f, 4.439f, 16.274f, 3.96f, 16.017f, 3.544f)
            curveTo(15.994f, 3.506f, 15.97f, 3.469f, 15.945f, 3.433f)
            curveTo(15.687f, 3.051f, 15.349f, 2.726f, 14.956f, 2.483f)
            curveTo(14.54f, 2.226f, 14.061f, 2.06f, 13.547f, 2.013f)
            curveTo(13.545f, 2.013f, 13.543f, 2.013f, 13.541f, 2.013f)
            curveTo(13.445f, 2.004f, 13.348f, 2f, 13.25f, 2f)
            horizontalLineTo(5.25f)
            close()
            moveTo(5.939f, 3.5f)
            lineTo(3.5f, 5.939f)
            verticalLineTo(5.25f)
            curveTo(3.5f, 4.284f, 4.284f, 3.5f, 5.25f, 3.5f)
            horizontalLineTo(5.939f)
            close()
            moveTo(3.5f, 8.061f)
            lineTo(8.061f, 3.5f)
            horizontalLineTo(9.939f)
            lineTo(3.5f, 9.939f)
            verticalLineTo(8.061f)
            close()
            moveTo(12.061f, 3.5f)
            horizontalLineTo(13.25f)
            curveTo(13.456f, 3.5f, 13.654f, 3.536f, 13.838f, 3.601f)
            lineTo(3.601f, 13.838f)
            curveTo(3.536f, 13.654f, 3.5f, 13.456f, 3.5f, 13.25f)
            verticalLineTo(12.061f)
            lineTo(12.061f, 3.5f)
            close()
            moveTo(14.899f, 4.662f)
            curveTo(14.964f, 4.846f, 15f, 5.044f, 15f, 5.25f)
            verticalLineTo(6.439f)
            lineTo(6.439f, 15f)
            horizontalLineTo(5.25f)
            curveTo(5.044f, 15f, 4.846f, 14.964f, 4.662f, 14.899f)
            lineTo(14.899f, 4.662f)
            close()
            moveTo(15.003f, 8.557f)
            curveTo(15.032f, 8.807f, 15.243f, 9f, 15.5f, 9f)
            horizontalLineTo(16.44f)
            lineTo(9f, 16.44f)
            verticalLineTo(15.5f)
            curveTo(9f, 15.243f, 8.807f, 15.032f, 8.557f, 15.003f)
            lineTo(15.003f, 8.557f)
            close()
            moveTo(18.561f, 9f)
            horizontalLineTo(18.75f)
            curveTo(19.218f, 9f, 19.643f, 9.184f, 19.957f, 9.483f)
            lineTo(9.483f, 19.957f)
            curveTo(9.184f, 19.643f, 9f, 19.218f, 9f, 18.75f)
            verticalLineTo(18.561f)
            lineTo(18.561f, 9f)
            close()
            moveTo(20.5f, 11.061f)
            verticalLineTo(12.939f)
            lineTo(12.939f, 20.5f)
            horizontalLineTo(11.061f)
            lineTo(20.5f, 11.061f)
            close()
            moveTo(20.5f, 15.061f)
            verticalLineTo(16.94f)
            lineTo(16.94f, 20.5f)
            horizontalLineTo(15.061f)
            lineTo(20.5f, 15.061f)
            close()
            moveTo(20.466f, 19.095f)
            curveTo(20.328f, 19.785f, 19.785f, 20.328f, 19.095f, 20.466f)
            lineTo(20.466f, 19.095f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShapeUnionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShapeUnion, contentDescription = null)
    }
}
