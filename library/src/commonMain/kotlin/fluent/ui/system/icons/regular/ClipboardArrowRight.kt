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

public val FluentIcons.Regular.ClipboardArrowRight: ImageVector
    get() {
        if (_ClipboardArrowRight != null) {
            return _ClipboardArrowRight!!
        }
        _ClipboardArrowRight = ImageVector.Builder(
            name = "Regular.ClipboardArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                curveTo(14.909f, 2f, 15.863f, 2.876f, 15.986f, 4.002f)
                curveTo(15.986f, 4.001f, 15.986f, 4f, 15.986f, 3.999f)
                lineTo(17.75f, 4f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(11.498f)
                curveTo(19.526f, 11.3f, 19.023f, 11.157f, 18.5f, 11.076f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 5.836f, 18.164f, 5.5f, 17.75f, 5.5f)
                lineTo(15.621f, 5.5f)
                curveTo(15.217f, 6.103f, 14.53f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.47f, 6.5f, 8.783f, 6.103f, 8.379f, 5.5f)
                lineTo(6.25f, 5.5f)
                curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(11.732f)
                curveTo(12.019f, 21.051f, 12.383f, 21.556f, 12.81f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                lineTo(8.014f, 3.999f)
                curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
                horizontalLineTo(13.75f)
                close()
                moveTo(15.995f, 4.096f)
                lineTo(16f, 4.25f)
                curveTo(16f, 4.198f, 15.998f, 4.147f, 15.995f, 4.096f)
                close()
                moveTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
                curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
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

        return _ClipboardArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardArrowRight: ImageVector? = null

@Preview
@Composable
private fun ClipboardArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardArrowRight, contentDescription = null)
    }
}
