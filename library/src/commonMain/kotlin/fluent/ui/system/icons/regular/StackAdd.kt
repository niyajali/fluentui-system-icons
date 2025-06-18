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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.StackAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StackAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 7.5f)
            curveTo(12f, 4.462f, 9.538f, 2f, 6.5f, 2f)
            curveTo(3.462f, 2f, 1f, 4.462f, 1f, 7.5f)
            curveTo(1f, 10.538f, 3.462f, 13f, 6.5f, 13f)
            curveTo(9.538f, 13f, 12f, 10.538f, 12f, 7.5f)
            close()
            moveTo(7.001f, 8f)
            lineTo(7.001f, 10.503f)
            curveTo(7.001f, 10.78f, 6.777f, 11.003f, 6.501f, 11.003f)
            curveTo(6.225f, 11.003f, 6.001f, 10.78f, 6.001f, 10.503f)
            lineTo(6.001f, 8f)
            horizontalLineTo(3.496f)
            curveTo(3.22f, 8f, 2.996f, 7.776f, 2.996f, 7.5f)
            curveTo(2.996f, 7.224f, 3.22f, 7f, 3.496f, 7f)
            horizontalLineTo(6f)
            lineTo(6f, 4.499f)
            curveTo(6f, 4.223f, 6.224f, 3.999f, 6.5f, 3.999f)
            curveTo(6.776f, 3.999f, 7f, 4.223f, 7f, 4.499f)
            lineTo(7f, 7f)
            horizontalLineTo(9.497f)
            curveTo(9.772f, 7f, 9.996f, 7.224f, 9.996f, 7.5f)
            curveTo(9.996f, 7.776f, 9.772f, 8f, 9.497f, 8f)
            horizontalLineTo(7.001f)
            close()
            moveTo(15f, 6.5f)
            horizontalLineTo(12.924f)
            curveTo(12.843f, 5.977f, 12.7f, 5.474f, 12.502f, 5f)
            horizontalLineTo(15f)
            curveTo(16.105f, 5f, 17f, 5.895f, 17f, 7f)
            verticalLineTo(14f)
            curveTo(17f, 15.105f, 16.105f, 16f, 15f, 16f)
            horizontalLineTo(4f)
            curveTo(2.895f, 16f, 2f, 15.105f, 2f, 14f)
            verticalLineTo(12.19f)
            curveTo(2.444f, 12.617f, 2.949f, 12.981f, 3.5f, 13.268f)
            verticalLineTo(14f)
            curveTo(3.5f, 14.276f, 3.724f, 14.5f, 4f, 14.5f)
            horizontalLineTo(15f)
            curveTo(15.276f, 14.5f, 15.5f, 14.276f, 15.5f, 14f)
            verticalLineTo(7f)
            curveTo(15.5f, 6.724f, 15.276f, 6.5f, 15f, 6.5f)
            close()
            moveTo(4.563f, 17f)
            curveTo(4.785f, 17.863f, 5.568f, 18.5f, 6.5f, 18.5f)
            horizontalLineTo(15.5f)
            curveTo(17.709f, 18.5f, 19.5f, 16.709f, 19.5f, 14.5f)
            verticalLineTo(9.5f)
            curveTo(19.5f, 8.568f, 18.863f, 7.785f, 18f, 7.563f)
            verticalLineTo(14.5f)
            curveTo(18f, 15.881f, 16.881f, 17f, 15.5f, 17f)
            horizontalLineTo(4.563f)
            close()
            moveTo(7.063f, 19.5f)
            curveTo(7.285f, 20.363f, 8.068f, 21f, 9f, 21f)
            horizontalLineTo(16.25f)
            curveTo(19.426f, 21f, 22f, 18.426f, 22f, 15.25f)
            verticalLineTo(12f)
            curveTo(22f, 11.068f, 21.363f, 10.285f, 20.5f, 10.063f)
            verticalLineTo(15.25f)
            curveTo(20.5f, 17.597f, 18.597f, 19.5f, 16.25f, 19.5f)
            horizontalLineTo(7.063f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StackAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.StackAdd, contentDescription = null)
    }
}
