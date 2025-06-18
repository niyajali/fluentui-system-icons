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

public val FluentIcons.Filled.Crop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 15.5f)
            curveTo(7f, 16.28f, 7.595f, 16.92f, 8.356f, 16.993f)
            lineTo(8.5f, 17f)
            horizontalLineTo(21f)
            curveTo(21.552f, 17f, 22f, 17.448f, 22f, 18f)
            curveTo(22f, 18.513f, 21.614f, 18.935f, 21.117f, 18.993f)
            lineTo(21f, 19f)
            horizontalLineTo(19f)
            verticalLineTo(21f)
            curveTo(19f, 21.552f, 18.552f, 22f, 18f, 22f)
            curveTo(17.487f, 22f, 17.065f, 21.614f, 17.007f, 21.117f)
            lineTo(17f, 21f)
            verticalLineTo(19f)
            horizontalLineTo(8.5f)
            curveTo(6.631f, 19f, 5.105f, 17.536f, 5.005f, 15.692f)
            lineTo(5f, 15.5f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            curveTo(2f, 5.487f, 2.386f, 5.064f, 2.883f, 5.007f)
            lineTo(3f, 5f)
            horizontalLineTo(5f)
            verticalLineTo(3f)
            curveTo(5f, 2.448f, 5.448f, 2f, 6f, 2f)
            curveTo(6.513f, 2f, 6.936f, 2.386f, 6.993f, 2.883f)
            lineTo(7f, 3f)
            verticalLineTo(15.5f)
            close()
            moveTo(8f, 5f)
            horizontalLineTo(15.5f)
            curveTo(17.369f, 5f, 18.895f, 6.464f, 18.995f, 8.308f)
            lineTo(19f, 8.5f)
            verticalLineTo(16f)
            horizontalLineTo(17f)
            verticalLineTo(8.5f)
            curveTo(17f, 7.72f, 16.405f, 7.08f, 15.644f, 7.007f)
            lineTo(15.5f, 7f)
            horizontalLineTo(8f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CropPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Crop, contentDescription = null)
    }
}
