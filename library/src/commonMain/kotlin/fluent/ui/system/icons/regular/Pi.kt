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

public val FluentIcons.Regular.Pi: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pi",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.5f, 6.75f)
            curveTo(2.5f, 5.231f, 3.731f, 4f, 5.25f, 4f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 4f, 21f, 4.336f, 21f, 4.75f)
            curveTo(21f, 5.164f, 20.664f, 5.5f, 20.25f, 5.5f)
            horizontalLineTo(17f)
            verticalLineTo(16.952f)
            curveTo(17f, 18.163f, 18.199f, 19.008f, 19.339f, 18.601f)
            lineTo(19.498f, 18.544f)
            curveTo(19.888f, 18.404f, 20.317f, 18.608f, 20.456f, 18.998f)
            curveTo(20.596f, 19.388f, 20.392f, 19.817f, 20.002f, 19.956f)
            lineTo(19.843f, 20.013f)
            curveTo(17.727f, 20.769f, 15.5f, 19.2f, 15.5f, 16.952f)
            verticalLineTo(5.5f)
            horizontalLineTo(9.494f)
            curveTo(9.49f, 5.74f, 9.482f, 6.059f, 9.468f, 6.444f)
            curveTo(9.437f, 7.341f, 9.373f, 8.597f, 9.247f, 10.034f)
            curveTo(8.995f, 12.896f, 8.489f, 16.532f, 7.458f, 19.496f)
            curveTo(7.322f, 19.888f, 6.895f, 20.094f, 6.504f, 19.958f)
            curveTo(6.112f, 19.822f, 5.906f, 19.395f, 6.042f, 19.004f)
            curveTo(7.011f, 16.218f, 7.504f, 12.729f, 7.753f, 9.903f)
            curveTo(7.876f, 8.497f, 7.938f, 7.268f, 7.969f, 6.392f)
            curveTo(7.982f, 6.03f, 7.989f, 5.729f, 7.994f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 5.5f, 4f, 6.06f, 4f, 6.75f)
            verticalLineTo(7.25f)
            curveTo(4f, 7.664f, 3.664f, 8f, 3.25f, 8f)
            curveTo(2.836f, 8f, 2.5f, 7.664f, 2.5f, 7.25f)
            verticalLineTo(6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Pi, contentDescription = null)
    }
}
