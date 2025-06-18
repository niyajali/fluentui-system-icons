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

public val FluentIcons.Regular.CopyAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CopyAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.503f, 4.627f)
            lineTo(5.5f, 6.75f)
            verticalLineTo(17.254f)
            curveTo(5.5f, 19.049f, 6.955f, 20.504f, 8.75f, 20.504f)
            lineTo(10.734f, 20.504f)
            curveTo(11.022f, 21.055f, 11.387f, 21.56f, 11.814f, 22.004f)
            horizontalLineTo(8.75f)
            curveTo(6.127f, 22.004f, 4f, 19.878f, 4f, 17.254f)
            verticalLineTo(6.75f)
            curveTo(4f, 5.769f, 4.627f, 4.935f, 5.503f, 4.627f)
            close()
            moveTo(20f, 4.25f)
            verticalLineTo(12.022f)
            curveTo(19.537f, 11.725f, 19.034f, 11.486f, 18.5f, 11.314f)
            verticalLineTo(4.25f)
            curveTo(18.5f, 3.836f, 18.164f, 3.5f, 17.75f, 3.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 3.5f, 8f, 3.836f, 8f, 4.25f)
            verticalLineTo(17.25f)
            curveTo(8f, 17.664f, 8.336f, 18f, 8.75f, 18f)
            horizontalLineTo(10.019f)
            curveTo(10.059f, 18.52f, 10.159f, 19.022f, 10.314f, 19.5f)
            horizontalLineTo(8.75f)
            curveTo(7.507f, 19.5f, 6.5f, 18.493f, 6.5f, 17.25f)
            verticalLineTo(4.25f)
            curveTo(6.5f, 3.007f, 7.507f, 2f, 8.75f, 2f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            close()
            moveTo(22f, 17.5f)
            curveTo(22f, 14.462f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 14.462f, 11f, 17.5f)
            curveTo(11f, 20.538f, 13.462f, 23f, 16.5f, 23f)
            curveTo(19.538f, 23f, 22f, 20.538f, 22f, 17.5f)
            close()
            moveTo(17.001f, 18f)
            lineTo(17.001f, 20.503f)
            curveTo(17.001f, 20.78f, 16.777f, 21.003f, 16.501f, 21.003f)
            curveTo(16.225f, 21.003f, 16.001f, 20.78f, 16.001f, 20.503f)
            lineTo(16.001f, 18f)
            horizontalLineTo(13.496f)
            curveTo(13.22f, 18f, 12.996f, 17.776f, 12.996f, 17.5f)
            curveTo(12.996f, 17.224f, 13.22f, 17f, 13.496f, 17f)
            horizontalLineTo(16f)
            lineTo(16f, 14.499f)
            curveTo(16f, 14.223f, 16.224f, 13.999f, 16.5f, 13.999f)
            curveTo(16.776f, 13.999f, 17f, 14.223f, 17f, 14.499f)
            lineTo(17f, 17f)
            horizontalLineTo(19.497f)
            curveTo(19.772f, 17f, 19.996f, 17.224f, 19.996f, 17.5f)
            curveTo(19.996f, 17.776f, 19.772f, 18f, 19.497f, 18f)
            horizontalLineTo(17.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CopyAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CopyAdd, contentDescription = null)
    }
}
