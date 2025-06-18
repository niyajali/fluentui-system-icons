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

public val FluentUi.Regular.ShapeExclude: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShapeExclude",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineTo(13.25f)
            curveTo(13.35f, 2f, 13.449f, 2.005f, 13.547f, 2.013f)
            curveTo(14.061f, 2.06f, 14.54f, 2.226f, 14.956f, 2.483f)
            curveTo(14.994f, 2.506f, 15.031f, 2.53f, 15.067f, 2.555f)
            curveTo(15.449f, 2.813f, 15.774f, 3.151f, 16.017f, 3.544f)
            curveTo(16.274f, 3.96f, 16.44f, 4.439f, 16.487f, 4.953f)
            lineTo(16.487f, 4.959f)
            curveTo(16.496f, 5.055f, 16.5f, 5.152f, 16.5f, 5.25f)
            verticalLineTo(7.5f)
            horizontalLineTo(18.75f)
            curveTo(19.142f, 7.5f, 19.517f, 7.569f, 19.865f, 7.696f)
            curveTo(20.3f, 7.855f, 20.692f, 8.105f, 21.018f, 8.422f)
            curveTo(21.028f, 8.432f, 21.038f, 8.442f, 21.048f, 8.452f)
            curveTo(21.402f, 8.805f, 21.674f, 9.24f, 21.835f, 9.726f)
            curveTo(21.942f, 10.048f, 22f, 10.392f, 22f, 10.75f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(10.75f)
            curveTo(10.392f, 22f, 10.048f, 21.942f, 9.726f, 21.835f)
            curveTo(9.694f, 21.825f, 9.663f, 21.814f, 9.633f, 21.803f)
            curveTo(9.171f, 21.634f, 8.758f, 21.363f, 8.422f, 21.018f)
            curveTo(8.105f, 20.692f, 7.855f, 20.3f, 7.696f, 19.865f)
            curveTo(7.687f, 19.841f, 7.679f, 19.817f, 7.671f, 19.792f)
            curveTo(7.56f, 19.465f, 7.5f, 19.115f, 7.5f, 18.75f)
            verticalLineTo(16.5f)
            horizontalLineTo(5.25f)
            curveTo(5.15f, 16.5f, 5.051f, 16.496f, 4.953f, 16.487f)
            curveTo(4.439f, 16.44f, 3.96f, 16.274f, 3.544f, 16.017f)
            curveTo(3.541f, 16.015f, 3.537f, 16.013f, 3.534f, 16.01f)
            curveTo(3.108f, 15.745f, 2.747f, 15.383f, 2.483f, 14.956f)
            curveTo(2.226f, 14.54f, 2.06f, 14.061f, 2.013f, 13.547f)
            curveTo(2.013f, 13.545f, 2.013f, 13.543f, 2.013f, 13.541f)
            curveTo(2.004f, 13.445f, 2f, 13.348f, 2f, 13.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(3.5f, 8.061f)
            verticalLineTo(9.939f)
            lineTo(9.939f, 3.5f)
            horizontalLineTo(8.061f)
            lineTo(3.5f, 8.061f)
            close()
            moveTo(5.939f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineTo(5.939f)
            lineTo(5.939f, 3.5f)
            close()
            moveTo(12.061f, 3.5f)
            lineTo(3.5f, 12.061f)
            verticalLineTo(13.25f)
            curveTo(3.5f, 13.456f, 3.536f, 13.654f, 3.601f, 13.838f)
            lineTo(7.642f, 9.798f)
            curveTo(7.957f, 8.769f, 8.769f, 7.957f, 9.798f, 7.642f)
            lineTo(13.838f, 3.601f)
            curveTo(13.654f, 3.536f, 13.456f, 3.5f, 13.25f, 3.5f)
            horizontalLineTo(12.061f)
            close()
            moveTo(14.899f, 4.662f)
            lineTo(12.061f, 7.5f)
            horizontalLineTo(13.939f)
            lineTo(15f, 6.439f)
            verticalLineTo(5.25f)
            curveTo(15f, 5.044f, 14.964f, 4.846f, 14.899f, 4.662f)
            close()
            moveTo(7.5f, 12.061f)
            lineTo(4.662f, 14.899f)
            curveTo(4.846f, 14.964f, 5.044f, 15f, 5.25f, 15f)
            horizontalLineTo(6.439f)
            lineTo(7.5f, 13.939f)
            verticalLineTo(12.061f)
            close()
            moveTo(9f, 18.561f)
            verticalLineTo(18.75f)
            curveTo(9f, 19.218f, 9.184f, 19.643f, 9.483f, 19.957f)
            lineTo(12.939f, 16.5f)
            horizontalLineTo(11.061f)
            lineTo(9f, 18.561f)
            close()
            moveTo(16.5f, 12.939f)
            lineTo(19.957f, 9.483f)
            curveTo(19.643f, 9.184f, 19.218f, 9f, 18.75f, 9f)
            horizontalLineTo(18.561f)
            lineTo(16.5f, 11.061f)
            verticalLineTo(12.939f)
            close()
            moveTo(20.5f, 11.061f)
            lineTo(11.061f, 20.5f)
            horizontalLineTo(12.939f)
            lineTo(20.5f, 12.939f)
            verticalLineTo(11.061f)
            close()
            moveTo(20.5f, 15.061f)
            lineTo(15.061f, 20.5f)
            horizontalLineTo(16.94f)
            lineTo(20.5f, 16.94f)
            verticalLineTo(15.061f)
            close()
            moveTo(20.466f, 19.095f)
            curveTo(20.328f, 19.785f, 19.785f, 20.328f, 19.095f, 20.466f)
            lineTo(20.466f, 19.095f)
            close()
            moveTo(9f, 10.75f)
            verticalLineTo(15f)
            horizontalLineTo(13.25f)
            curveTo(14.217f, 15f, 15f, 14.217f, 15f, 13.25f)
            verticalLineTo(9f)
            horizontalLineTo(10.75f)
            curveTo(9.783f, 9f, 9f, 9.783f, 9f, 10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShapeExcludePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShapeExclude, contentDescription = null)
    }
}
