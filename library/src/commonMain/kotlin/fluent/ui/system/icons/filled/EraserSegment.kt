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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.EraserSegment: ImageVector
    get() {
        if (_EraserSegment != null) {
            return _EraserSegment!!
        }
        _EraserSegment = ImageVector.Builder(
            name = "Filled.EraserSegment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.651f, 2.638f)
                curveTo(13.537f, 1.76f, 14.968f, 1.771f, 15.841f, 2.661f)
                lineTo(20.751f, 7.669f)
                curveTo(21.612f, 8.547f, 21.609f, 9.953f, 20.744f, 10.827f)
                lineTo(12.161f, 19.5f)
                horizontalLineTo(16.115f)
                curveTo(16.433f, 18.485f, 17.381f, 17.75f, 18.5f, 17.75f)
                curveTo(19.881f, 17.75f, 21f, 18.869f, 21f, 20.25f)
                curveTo(21f, 21.63f, 19.881f, 22.75f, 18.5f, 22.75f)
                curveTo(17.381f, 22.75f, 16.433f, 22.014f, 16.115f, 21f)
                horizontalLineTo(9.848f)
                curveTo(9.242f, 21.03f, 8.626f, 20.816f, 8.159f, 20.358f)
                lineTo(3.06f, 15.35f)
                curveTo(2.164f, 14.471f, 2.161f, 13.03f, 3.053f, 12.146f)
                lineTo(12.651f, 2.638f)
                close()
                moveTo(9.8f, 19.5f)
                curveTo(9.971f, 19.485f, 10.138f, 19.411f, 10.268f, 19.28f)
                lineTo(11.736f, 17.797f)
                lineTo(5.637f, 11.698f)
                lineTo(4.108f, 13.212f)
                curveTo(3.811f, 13.506f, 3.812f, 13.987f, 4.111f, 14.28f)
                lineTo(9.21f, 19.288f)
                curveTo(9.36f, 19.435f, 9.555f, 19.506f, 9.75f, 19.502f)
                verticalLineTo(19.5f)
                horizontalLineTo(9.8f)
                close()
            }
        }.build()

        return _EraserSegment!!
    }

@Suppress("ObjectPropertyName")
private var _EraserSegment: ImageVector? = null

@Preview
@Composable
private fun EraserSegmentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EraserSegment, contentDescription = null)
    }
}
