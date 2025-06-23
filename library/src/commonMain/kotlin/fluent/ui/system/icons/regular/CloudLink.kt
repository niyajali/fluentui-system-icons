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

public val FluentIcons.Regular.CloudLink: ImageVector
    get() {
        if (_CloudLink != null) {
            return _CloudLink!!
        }
        _CloudLink = ImageVector.Builder(
            name = "Regular.CloudLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 5.5f)
                curveTo(9.587f, 5.5f, 7.617f, 7.4f, 7.505f, 9.785f)
                curveTo(7.486f, 10.185f, 7.156f, 10.5f, 6.756f, 10.5f)
                horizontalLineTo(6.5f)
                curveTo(4.843f, 10.5f, 3.5f, 11.843f, 3.5f, 13.5f)
                curveTo(3.5f, 15.157f, 4.843f, 16.5f, 6.5f, 16.5f)
                horizontalLineTo(10.007f)
                curveTo(10.034f, 17.027f, 10.147f, 17.532f, 10.333f, 18f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
                curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
                curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
                curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.019f)
                curveTo(20.153f, 9.226f, 21.913f, 11.064f, 21.997f, 13.33f)
                curveTo(21.479f, 12.666f, 20.788f, 12.144f, 19.992f, 11.83f)
                curveTo(19.454f, 11.028f, 18.539f, 10.5f, 17.5f, 10.5f)
                horizontalLineTo(17.244f)
                curveTo(16.844f, 10.5f, 16.514f, 10.185f, 16.495f, 9.785f)
                curveTo(16.383f, 7.4f, 14.413f, 5.5f, 12f, 5.5f)
                close()
                moveTo(22f, 16.25f)
                curveTo(22f, 14.179f, 20.321f, 12.5f, 18.25f, 12.5f)
                lineTo(18.148f, 12.507f)
                curveTo(17.782f, 12.557f, 17.5f, 12.87f, 17.5f, 13.25f)
                curveTo(17.5f, 13.664f, 17.836f, 14f, 18.25f, 14f)
                lineTo(18.404f, 14.005f)
                curveTo(19.575f, 14.084f, 20.5f, 15.059f, 20.5f, 16.25f)
                curveTo(20.5f, 17.493f, 19.493f, 18.5f, 18.25f, 18.5f)
                lineTo(18.247f, 18.505f)
                lineTo(18.145f, 18.512f)
                curveTo(17.779f, 18.563f, 17.498f, 18.878f, 17.5f, 19.258f)
                curveTo(17.502f, 19.672f, 17.839f, 20.007f, 18.253f, 20.005f)
                verticalLineTo(20f)
                lineTo(18.452f, 19.995f)
                curveTo(20.428f, 19.891f, 22f, 18.254f, 22f, 16.25f)
                close()
                moveTo(15.5f, 13.25f)
                curveTo(15.5f, 12.836f, 15.164f, 12.5f, 14.75f, 12.5f)
                lineTo(14.551f, 12.505f)
                curveTo(12.572f, 12.609f, 11f, 14.246f, 11f, 16.25f)
                curveTo(11f, 18.321f, 12.679f, 20f, 14.75f, 20f)
                lineTo(14.852f, 19.993f)
                curveTo(15.218f, 19.944f, 15.5f, 19.63f, 15.5f, 19.25f)
                curveTo(15.5f, 18.836f, 15.164f, 18.5f, 14.75f, 18.5f)
                lineTo(14.596f, 18.495f)
                curveTo(13.425f, 18.416f, 12.5f, 17.441f, 12.5f, 16.25f)
                curveTo(12.5f, 15.007f, 13.507f, 14f, 14.75f, 14f)
                lineTo(14.852f, 13.993f)
                curveTo(15.218f, 13.943f, 15.5f, 13.63f, 15.5f, 13.25f)
                close()
                moveTo(19f, 16.25f)
                curveTo(19f, 15.836f, 18.664f, 15.5f, 18.25f, 15.5f)
                horizontalLineTo(14.75f)
                lineTo(14.648f, 15.507f)
                curveTo(14.282f, 15.557f, 14f, 15.87f, 14f, 16.25f)
                curveTo(14f, 16.664f, 14.336f, 17f, 14.75f, 17f)
                horizontalLineTo(18.25f)
                lineTo(18.352f, 16.993f)
                curveTo(18.718f, 16.944f, 19f, 16.63f, 19f, 16.25f)
                close()
            }
        }.build()

        return _CloudLink!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLink: ImageVector? = null

@Preview
@Composable
private fun CloudLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CloudLink, contentDescription = null)
    }
}
