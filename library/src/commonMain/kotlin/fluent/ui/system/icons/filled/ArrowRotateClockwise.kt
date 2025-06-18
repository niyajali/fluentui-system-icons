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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ArrowRotateClockwise: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRotateClockwise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3f)
            curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
            curveTo(21f, 15.436f, 19.058f, 18.489f, 16.127f, 20.001f)
            lineTo(18f, 20f)
            curveTo(18.552f, 20f, 19f, 20.448f, 19f, 21f)
            curveTo(19f, 21.513f, 18.614f, 21.935f, 18.117f, 21.993f)
            lineTo(18f, 22f)
            horizontalLineTo(14f)
            curveTo(13.487f, 22f, 13.064f, 21.614f, 13.007f, 21.117f)
            lineTo(13f, 21f)
            verticalLineTo(17f)
            curveTo(13f, 16.448f, 13.448f, 16f, 14f, 16f)
            curveTo(14.513f, 16f, 14.936f, 16.386f, 14.993f, 16.883f)
            lineTo(15f, 17f)
            lineTo(15.001f, 18.327f)
            curveTo(17.397f, 17.19f, 19f, 14.753f, 19f, 12f)
            curveTo(19f, 8.134f, 15.866f, 5f, 12f, 5f)
            curveTo(8.134f, 5f, 5f, 8.134f, 5f, 12f)
            curveTo(5f, 12.552f, 4.552f, 13f, 4f, 13f)
            curveTo(3.448f, 13f, 3f, 12.552f, 3f, 12f)
            curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
            close()
            moveTo(12f, 9f)
            curveTo(13.657f, 9f, 15f, 10.343f, 15f, 12f)
            curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
            curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
            curveTo(9f, 10.343f, 10.343f, 9f, 12f, 9f)
            close()
            moveTo(12f, 11f)
            curveTo(11.448f, 11f, 11f, 11.448f, 11f, 12f)
            curveTo(11f, 12.552f, 11.448f, 13f, 12f, 13f)
            curveTo(12.552f, 13f, 13f, 12.552f, 13f, 12f)
            curveTo(13f, 11.448f, 12.552f, 11f, 12f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowRotateClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowRotateClockwise, contentDescription = null)
    }
}
