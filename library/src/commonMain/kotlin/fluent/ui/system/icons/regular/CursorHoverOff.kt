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

public val FluentUi.Regular.CursorHoverOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CursorHoverOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(3.265f, 4.326f)
            curveTo(2.51f, 4.756f, 2f, 5.568f, 2f, 6.5f)
            verticalLineTo(15.5f)
            curveTo(2f, 16.881f, 3.119f, 18f, 4.5f, 18f)
            horizontalLineTo(9f)
            verticalLineTo(16.5f)
            horizontalLineTo(4.5f)
            curveTo(3.948f, 16.5f, 3.5f, 16.052f, 3.5f, 15.5f)
            verticalLineTo(6.5f)
            curveTo(3.5f, 5.968f, 3.916f, 5.532f, 4.441f, 5.502f)
            lineTo(10f, 11.061f)
            verticalLineTo(21.25f)
            curveTo(10f, 21.579f, 10.214f, 21.869f, 10.528f, 21.966f)
            curveTo(10.841f, 22.064f, 11.182f, 21.946f, 11.368f, 21.675f)
            lineTo(13.835f, 18.087f)
            lineTo(17.877f, 18.938f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(11.5f, 12.561f)
            lineTo(15.935f, 16.996f)
            lineTo(13.655f, 16.516f)
            curveTo(13.358f, 16.454f, 13.054f, 16.576f, 12.882f, 16.825f)
            lineTo(11.5f, 18.835f)
            verticalLineTo(12.561f)
            close()
            moveTo(20.5f, 15.5f)
            curveTo(20.5f, 15.995f, 20.14f, 16.406f, 19.668f, 16.486f)
            lineTo(20.811f, 17.629f)
            curveTo(21.524f, 17.189f, 22f, 16.4f, 22f, 15.5f)
            verticalLineTo(6.5f)
            curveTo(22f, 5.119f, 20.881f, 4f, 19.5f, 4f)
            horizontalLineTo(7.182f)
            lineTo(8.682f, 5.5f)
            horizontalLineTo(19.5f)
            curveTo(20.052f, 5.5f, 20.5f, 5.948f, 20.5f, 6.5f)
            verticalLineTo(15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CursorHoverOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CursorHoverOff, contentDescription = null)
    }
}
