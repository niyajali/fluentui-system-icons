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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowCircleUpRight: ImageVector
    get() {
        if (_ArrowCircleUpRight != null) {
            return _ArrowCircleUpRight!!
        }
        _ArrowCircleUpRight = ImageVector.Builder(
            name = "Regular.ArrowCircleUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.491f, 9.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 9.5f, 8f, 9.164f, 8f, 8.75f)
                curveTo(8f, 8.336f, 8.336f, 8f, 8.75f, 8f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 8f, 16f, 8.336f, 16f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(16f, 15.664f, 15.664f, 16f, 15.25f, 16f)
                curveTo(14.836f, 16f, 14.5f, 15.664f, 14.5f, 15.25f)
                verticalLineTo(10.611f)
                lineTo(9.278f, 15.783f)
                curveTo(8.983f, 16.074f, 8.509f, 16.072f, 8.217f, 15.778f)
                curveTo(7.926f, 15.483f, 7.928f, 15.009f, 8.222f, 14.717f)
                lineTo(13.491f, 9.5f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                close()
                moveTo(12f, 20.5f)
                curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
                curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
                close()
            }
        }.build()

        return _ArrowCircleUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleUpRight: ImageVector? = null

@Preview
@Composable
private fun ArrowCircleUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCircleUpRight, contentDescription = null)
    }
}
