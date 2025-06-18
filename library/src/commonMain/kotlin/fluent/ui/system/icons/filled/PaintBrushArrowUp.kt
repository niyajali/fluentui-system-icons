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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.PaintBrushArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBrushArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(10.895f, 2f, 10f, 2.895f, 10f, 4f)
            verticalLineTo(7.5f)
            horizontalLineTo(7.112f)
            curveTo(5.938f, 7.5f, 5.035f, 8.493f, 5.072f, 9.631f)
            curveTo(5.085f, 10.023f, 5.094f, 10.986f, 5.093f, 11.5f)
            horizontalLineTo(19f)
            verticalLineTo(9.75f)
            curveTo(19f, 8.507f, 17.993f, 7.5f, 16.75f, 7.5f)
            horizontalLineTo(14f)
            verticalLineTo(4f)
            curveTo(14f, 2.895f, 13.105f, 2f, 12f, 2f)
            close()
            moveTo(4.855f, 15.114f)
            curveTo(4.944f, 14.393f, 5.039f, 13f, 5.039f, 13f)
            horizontalLineTo(19f)
            verticalLineTo(14.169f)
            curveTo(18.768f, 14.059f, 18.512f, 14f, 18.25f, 14f)
            curveTo(17.786f, 14f, 17.341f, 14.184f, 17.013f, 14.513f)
            lineTo(14.513f, 17.013f)
            curveTo(13.829f, 17.696f, 13.829f, 18.804f, 14.513f, 19.487f)
            curveTo(15.064f, 20.039f, 15.892f, 20.145f, 16.55f, 19.807f)
            verticalLineTo(22f)
            horizontalLineTo(10.554f)
            curveTo(10.719f, 21.616f, 10.914f, 21.128f, 11.087f, 20.612f)
            curveTo(11.285f, 20.018f, 11.388f, 19.576f, 11.442f, 19.271f)
            curveTo(11.469f, 19.118f, 11.483f, 19f, 11.491f, 18.914f)
            curveTo(11.495f, 18.871f, 11.497f, 18.836f, 11.498f, 18.808f)
            curveTo(11.499f, 18.795f, 11.5f, 18.783f, 11.5f, 18.773f)
            lineTo(11.5f, 18.76f)
            lineTo(11.5f, 18.755f)
            lineTo(11.5f, 18.752f)
            lineTo(11.5f, 18.751f)
            lineTo(11.5f, 18.75f)
            curveTo(11.5f, 18.75f, 11.5f, 18f, 10.75f, 18f)
            curveTo(10.34f, 18f, 10.006f, 18.33f, 10f, 18.739f)
            curveTo(10f, 18.743f, 9.999f, 18.757f, 9.997f, 18.778f)
            curveTo(9.993f, 18.82f, 9.984f, 18.897f, 9.965f, 19.01f)
            curveTo(9.925f, 19.236f, 9.84f, 19.607f, 9.663f, 20.138f)
            curveTo(9.486f, 20.671f, 9.277f, 21.18f, 9.11f, 21.557f)
            curveTo(9.029f, 21.742f, 8.959f, 21.894f, 8.909f, 22f)
            horizontalLineTo(7.566f)
            curveTo(7.688f, 21.733f, 7.828f, 21.416f, 7.973f, 21.071f)
            curveTo(8.379f, 20.102f, 8.852f, 18.836f, 8.992f, 17.856f)
            curveTo(9.051f, 17.446f, 8.766f, 17.066f, 8.356f, 17.007f)
            curveTo(7.946f, 16.949f, 7.566f, 17.234f, 7.508f, 17.644f)
            curveTo(7.398f, 18.414f, 6.996f, 19.523f, 6.59f, 20.491f)
            curveTo(6.391f, 20.964f, 6.2f, 21.384f, 6.059f, 21.686f)
            curveTo(5.999f, 21.814f, 5.948f, 21.92f, 5.91f, 22f)
            horizontalLineTo(3.75f)
            curveTo(3.475f, 22f, 3.222f, 21.85f, 3.091f, 21.608f)
            curveTo(2.96f, 21.367f, 2.971f, 21.073f, 3.12f, 20.843f)
            curveTo(4.068f, 19.378f, 4.59f, 17.262f, 4.855f, 15.114f)
            close()
            moveTo(16.28f, 18.78f)
            curveTo(15.987f, 19.073f, 15.513f, 19.073f, 15.22f, 18.78f)
            curveTo(14.927f, 18.487f, 14.927f, 18.013f, 15.22f, 17.72f)
            lineTo(17.72f, 15.22f)
            curveTo(17.86f, 15.079f, 18.051f, 15f, 18.25f, 15f)
            curveTo(18.449f, 15f, 18.64f, 15.079f, 18.78f, 15.22f)
            lineTo(21.28f, 17.72f)
            curveTo(21.573f, 18.013f, 21.573f, 18.487f, 21.28f, 18.78f)
            curveTo(20.987f, 19.073f, 20.513f, 19.073f, 20.22f, 18.78f)
            lineTo(19f, 17.561f)
            verticalLineTo(22.25f)
            curveTo(19f, 22.664f, 18.664f, 23f, 18.25f, 23f)
            curveTo(17.836f, 23f, 17.5f, 22.664f, 17.5f, 22.25f)
            verticalLineTo(17.561f)
            lineTo(16.28f, 18.78f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaintBrushArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PaintBrushArrowUp, contentDescription = null)
    }
}
