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

public val FluentIcons.Regular.CommentMultipleLink: ImageVector
    get() {
        if (_CommentMultipleLink != null) {
            return _CommentMultipleLink!!
        }
        _CommentMultipleLink = ImageVector.Builder(
            name = "Regular.CommentMultipleLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.006f, 5.007f)
                curveTo(5.087f, 5.002f, 5.168f, 5f, 5.25f, 5f)
                horizontalLineTo(15.75f)
                curveTo(18.097f, 5f, 20f, 6.903f, 20f, 9.25f)
                verticalLineTo(12.833f)
                curveTo(20.544f, 13.048f, 21.038f, 13.361f, 21.462f, 13.75f)
                curveTo(21.487f, 13.587f, 21.5f, 13.42f, 21.5f, 13.25f)
                verticalLineTo(9.25f)
                curveTo(21.5f, 6.074f, 18.926f, 3.5f, 15.75f, 3.5f)
                horizontalLineTo(7.75f)
                curveTo(6.596f, 3.5f, 5.583f, 4.101f, 5.006f, 5.007f)
                close()
                moveTo(19f, 9.25f)
                verticalLineTo(12.559f)
                curveTo(18.756f, 12.52f, 18.505f, 12.5f, 18.25f, 12.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(9.25f)
                curveTo(17.5f, 8.283f, 16.716f, 7.5f, 15.75f, 7.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 7.5f, 3.5f, 8.283f, 3.5f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 16.716f, 4.284f, 17.5f, 5.25f, 17.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(20.258f)
                lineTo(10.019f, 17.674f)
                curveTo(10.068f, 18.226f, 10.211f, 18.75f, 10.432f, 19.232f)
                lineTo(6.99f, 21.76f)
                curveTo(6.164f, 22.366f, 5f, 21.776f, 5f, 20.752f)
                verticalLineTo(18.99f)
                curveTo(3.322f, 18.863f, 2f, 17.461f, 2f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(2f, 7.455f, 3.455f, 6f, 5.25f, 6f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 6f, 19f, 7.455f, 19f, 9.25f)
                close()
                moveTo(22f, 17.25f)
                curveTo(22f, 15.179f, 20.321f, 13.5f, 18.25f, 13.5f)
                lineTo(18.148f, 13.507f)
                curveTo(17.782f, 13.557f, 17.5f, 13.87f, 17.5f, 14.25f)
                curveTo(17.5f, 14.664f, 17.836f, 15f, 18.25f, 15f)
                lineTo(18.404f, 15.005f)
                curveTo(19.575f, 15.084f, 20.5f, 16.059f, 20.5f, 17.25f)
                curveTo(20.5f, 18.493f, 19.493f, 19.5f, 18.25f, 19.5f)
                lineTo(18.247f, 19.505f)
                lineTo(18.145f, 19.512f)
                curveTo(17.779f, 19.563f, 17.498f, 19.878f, 17.5f, 20.258f)
                curveTo(17.502f, 20.672f, 17.839f, 21.007f, 18.253f, 21.005f)
                verticalLineTo(21f)
                lineTo(18.452f, 20.995f)
                curveTo(20.428f, 20.891f, 22f, 19.254f, 22f, 17.25f)
                close()
                moveTo(15.5f, 14.25f)
                curveTo(15.5f, 13.836f, 15.164f, 13.5f, 14.75f, 13.5f)
                lineTo(14.551f, 13.505f)
                curveTo(12.572f, 13.609f, 11f, 15.246f, 11f, 17.25f)
                curveTo(11f, 19.321f, 12.679f, 21f, 14.75f, 21f)
                lineTo(14.852f, 20.993f)
                curveTo(15.218f, 20.944f, 15.5f, 20.63f, 15.5f, 20.25f)
                curveTo(15.5f, 19.836f, 15.164f, 19.5f, 14.75f, 19.5f)
                lineTo(14.596f, 19.495f)
                curveTo(13.425f, 19.416f, 12.5f, 18.441f, 12.5f, 17.25f)
                curveTo(12.5f, 16.007f, 13.507f, 15f, 14.75f, 15f)
                lineTo(14.852f, 14.993f)
                curveTo(15.218f, 14.943f, 15.5f, 14.63f, 15.5f, 14.25f)
                close()
                moveTo(19f, 17.25f)
                curveTo(19f, 16.836f, 18.664f, 16.5f, 18.25f, 16.5f)
                horizontalLineTo(14.75f)
                lineTo(14.648f, 16.507f)
                curveTo(14.282f, 16.556f, 14f, 16.87f, 14f, 17.25f)
                curveTo(14f, 17.664f, 14.336f, 18f, 14.75f, 18f)
                horizontalLineTo(18.25f)
                lineTo(18.352f, 17.993f)
                curveTo(18.718f, 17.944f, 19f, 17.63f, 19f, 17.25f)
                close()
            }
        }.build()

        return _CommentMultipleLink!!
    }

@Suppress("ObjectPropertyName")
private var _CommentMultipleLink: ImageVector? = null

@Preview
@Composable
private fun CommentMultipleLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CommentMultipleLink, contentDescription = null)
    }
}
