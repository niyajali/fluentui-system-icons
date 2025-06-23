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

public val FluentIcons.Filled.SlideLink: ImageVector
    get() {
        if (_SlideLink != null) {
            return _SlideLink!!
        }
        _SlideLink = ImageVector.Builder(
            name = "Filled.SlideLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6.25f)
                curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
                verticalLineTo(13.377f)
                curveTo(21.224f, 12.825f, 20.275f, 12.5f, 19.25f, 12.5f)
                horizontalLineTo(15.75f)
                curveTo(13.127f, 12.5f, 11f, 14.627f, 11f, 17.25f)
                curveTo(11f, 18.275f, 11.325f, 19.224f, 11.877f, 20f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(23f, 17.25f)
                curveTo(23f, 15.179f, 21.321f, 13.5f, 19.25f, 13.5f)
                lineTo(19.148f, 13.507f)
                curveTo(18.782f, 13.557f, 18.5f, 13.87f, 18.5f, 14.25f)
                curveTo(18.5f, 14.664f, 18.836f, 15f, 19.25f, 15f)
                lineTo(19.404f, 15.005f)
                curveTo(20.575f, 15.084f, 21.5f, 16.059f, 21.5f, 17.25f)
                curveTo(21.5f, 18.493f, 20.493f, 19.5f, 19.25f, 19.5f)
                lineTo(19.247f, 19.505f)
                lineTo(19.145f, 19.512f)
                curveTo(18.779f, 19.563f, 18.498f, 19.878f, 18.5f, 20.258f)
                curveTo(18.502f, 20.672f, 18.839f, 21.007f, 19.253f, 21.005f)
                verticalLineTo(21f)
                lineTo(19.452f, 20.995f)
                curveTo(21.428f, 20.891f, 23f, 19.254f, 23f, 17.25f)
                close()
                moveTo(16.5f, 14.25f)
                curveTo(16.5f, 13.836f, 16.164f, 13.5f, 15.75f, 13.5f)
                lineTo(15.551f, 13.505f)
                curveTo(13.572f, 13.609f, 12f, 15.246f, 12f, 17.25f)
                curveTo(12f, 19.321f, 13.679f, 21f, 15.75f, 21f)
                lineTo(15.852f, 20.993f)
                curveTo(16.218f, 20.944f, 16.5f, 20.63f, 16.5f, 20.25f)
                curveTo(16.5f, 19.836f, 16.164f, 19.5f, 15.75f, 19.5f)
                lineTo(15.596f, 19.495f)
                curveTo(14.425f, 19.416f, 13.5f, 18.441f, 13.5f, 17.25f)
                curveTo(13.5f, 16.007f, 14.507f, 15f, 15.75f, 15f)
                lineTo(15.852f, 14.993f)
                curveTo(16.218f, 14.943f, 16.5f, 14.63f, 16.5f, 14.25f)
                close()
                moveTo(20f, 17.25f)
                curveTo(20f, 16.836f, 19.664f, 16.5f, 19.25f, 16.5f)
                horizontalLineTo(15.75f)
                lineTo(15.648f, 16.507f)
                curveTo(15.282f, 16.556f, 15f, 16.87f, 15f, 17.25f)
                curveTo(15f, 17.664f, 15.336f, 18f, 15.75f, 18f)
                horizontalLineTo(19.25f)
                lineTo(19.352f, 17.993f)
                curveTo(19.718f, 17.944f, 20f, 17.63f, 20f, 17.25f)
                close()
            }
        }.build()

        return _SlideLink!!
    }

@Suppress("ObjectPropertyName")
private var _SlideLink: ImageVector? = null

@Preview
@Composable
private fun SlideLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideLink, contentDescription = null)
    }
}
