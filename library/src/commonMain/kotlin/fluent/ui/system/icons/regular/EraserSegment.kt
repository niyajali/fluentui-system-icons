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

public val FluentIcons.Regular.EraserSegment: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EraserSegment",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.841f, 2.661f)
            curveTo(14.968f, 1.771f, 13.537f, 1.76f, 12.651f, 2.638f)
            lineTo(3.053f, 12.146f)
            curveTo(2.161f, 13.03f, 2.164f, 14.471f, 3.06f, 15.35f)
            lineTo(8.159f, 20.358f)
            curveTo(8.626f, 20.816f, 9.242f, 21.03f, 9.848f, 21f)
            horizontalLineTo(16.115f)
            curveTo(16.433f, 22.014f, 17.381f, 22.75f, 18.5f, 22.75f)
            curveTo(19.881f, 22.75f, 21f, 21.63f, 21f, 20.25f)
            curveTo(21f, 18.869f, 19.881f, 17.75f, 18.5f, 17.75f)
            curveTo(17.381f, 17.75f, 16.433f, 18.485f, 16.115f, 19.5f)
            horizontalLineTo(12.161f)
            lineTo(20.744f, 10.827f)
            curveTo(21.609f, 9.953f, 21.612f, 8.547f, 20.751f, 7.669f)
            lineTo(15.841f, 2.661f)
            close()
            moveTo(9.75f, 19.5f)
            verticalLineTo(19.502f)
            curveTo(9.555f, 19.506f, 9.36f, 19.435f, 9.21f, 19.288f)
            lineTo(4.111f, 14.28f)
            curveTo(3.812f, 13.987f, 3.811f, 13.506f, 4.108f, 13.212f)
            lineTo(5.637f, 11.698f)
            lineTo(11.736f, 17.797f)
            lineTo(10.268f, 19.28f)
            curveTo(10.138f, 19.411f, 9.971f, 19.485f, 9.8f, 19.5f)
            horizontalLineTo(9.75f)
            close()
            moveTo(13.707f, 3.704f)
            curveTo(14.002f, 3.411f, 14.479f, 3.414f, 14.77f, 3.711f)
            lineTo(19.68f, 8.72f)
            curveTo(19.967f, 9.012f, 19.966f, 9.481f, 19.678f, 9.772f)
            lineTo(12.792f, 16.73f)
            lineTo(6.703f, 10.642f)
            lineTo(13.707f, 3.704f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EraserSegmentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.EraserSegment, contentDescription = null)
    }
}
