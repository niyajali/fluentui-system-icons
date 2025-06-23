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

public val FluentIcons.Filled.SlideMultipleArrowRight: ImageVector
    get() {
        if (_SlideMultipleArrowRight != null) {
            return _SlideMultipleArrowRight!!
        }
        _SlideMultipleArrowRight = ImageVector.Builder(
            name = "Filled.SlideMultipleArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 7.75f)
                curveTo(2f, 5.127f, 4.127f, 3f, 6.75f, 3f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 3f, 19f, 4.007f, 19f, 5.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(7.75f)
                curveTo(5.955f, 5.5f, 4.5f, 6.955f, 4.5f, 8.75f)
                verticalLineTo(17f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 17f, 2f, 15.993f, 2f, 14.75f)
                verticalLineTo(7.75f)
                close()
                moveTo(7.75f, 6.5f)
                curveTo(6.507f, 6.5f, 5.5f, 7.507f, 5.5f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(5.5f, 19.493f, 6.507f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(11.732f)
                curveTo(11.264f, 19.603f, 11f, 18.582f, 11f, 17.5f)
                curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
                curveTo(19.247f, 11f, 20.832f, 11.689f, 22f, 12.81f)
                verticalLineTo(8.75f)
                curveTo(22f, 7.507f, 20.993f, 6.5f, 19.75f, 6.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(14.5f, 17f)
                curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
                curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(19.293f)
                lineTo(17.646f, 19.646f)
                curveTo(17.451f, 19.842f, 17.451f, 20.158f, 17.646f, 20.354f)
                curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
                lineTo(20.854f, 17.854f)
                curveTo(21.049f, 17.658f, 21.049f, 17.342f, 20.854f, 17.146f)
                lineTo(18.354f, 14.646f)
                curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
                curveTo(17.451f, 14.842f, 17.451f, 15.158f, 17.646f, 15.354f)
                lineTo(19.293f, 17f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _SlideMultipleArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _SlideMultipleArrowRight: ImageVector? = null

@Preview
@Composable
private fun SlideMultipleArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideMultipleArrowRight, contentDescription = null)
    }
}
