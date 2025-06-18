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

public val FluentUi.Filled.SeatAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SeatAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.5f)
            curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
            curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
            curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
            close()
            moveTo(18.001f, 7f)
            lineTo(18.001f, 9.504f)
            curveTo(18.001f, 9.78f, 17.777f, 10.003f, 17.501f, 10.003f)
            curveTo(17.225f, 10.003f, 17.001f, 9.78f, 17.001f, 9.504f)
            lineTo(17.001f, 7f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 7f, 13.996f, 6.776f, 13.996f, 6.5f)
            curveTo(13.996f, 6.224f, 14.22f, 6f, 14.496f, 6f)
            horizontalLineTo(17f)
            lineTo(17f, 3.499f)
            curveTo(17f, 3.223f, 17.224f, 2.999f, 17.5f, 2.999f)
            curveTo(17.776f, 2.999f, 18f, 3.223f, 18f, 3.499f)
            lineTo(18f, 6f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 6f, 20.996f, 6.224f, 20.996f, 6.5f)
            curveTo(20.996f, 6.776f, 20.772f, 7f, 20.497f, 7f)
            horizontalLineTo(18.001f)
            close()
            moveTo(19.471f, 12.696f)
            curveTo(18.85f, 12.893f, 18.187f, 13f, 17.5f, 13f)
            curveTo(17.34f, 13f, 17.181f, 12.994f, 17.023f, 12.983f)
            curveTo(16.403f, 13.438f, 16f, 14.172f, 16f, 15f)
            verticalLineTo(21f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 21f, 21f, 19.993f, 21f, 18.75f)
            verticalLineTo(15f)
            curveTo(21f, 13.964f, 20.369f, 13.075f, 19.471f, 12.696f)
            close()
            moveTo(12.022f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(11.877f)
            curveTo(3.685f, 11.328f, 4.554f, 11f, 5.5f, 11f)
            curveTo(6.839f, 11f, 8.024f, 11.658f, 8.75f, 12.668f)
            curveTo(9.476f, 11.658f, 10.661f, 11f, 12f, 11f)
            curveTo(12.314f, 11f, 12.619f, 11.036f, 12.912f, 11.104f)
            curveTo(11.731f, 9.928f, 11f, 8.299f, 11f, 6.5f)
            curveTo(11f, 5.211f, 11.375f, 4.01f, 12.022f, 3f)
            close()
            moveTo(12f, 12.5f)
            curveTo(13.381f, 12.5f, 14.5f, 13.619f, 14.5f, 15f)
            verticalLineTo(21f)
            horizontalLineTo(9.5f)
            verticalLineTo(15f)
            curveTo(9.5f, 13.619f, 10.619f, 12.5f, 12f, 12.5f)
            close()
            moveTo(8f, 21f)
            verticalLineTo(15f)
            curveTo(8f, 13.619f, 6.881f, 12.5f, 5.5f, 12.5f)
            curveTo(4.119f, 12.5f, 3f, 13.619f, 3f, 15f)
            verticalLineTo(18.75f)
            curveTo(3f, 19.993f, 4.007f, 21f, 5.25f, 21f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SeatAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SeatAdd, contentDescription = null)
    }
}
