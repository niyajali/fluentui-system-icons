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

public val FluentIcons.Regular.LocationLive: ImageVector
    get() {
        if (_LocationLive != null) {
            return _LocationLive!!
        }
        _LocationLive = ImageVector.Builder(
            name = "Regular.LocationLive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.799f, 2.026f)
                curveTo(9.385f, 1.999f, 9.028f, 2.312f, 9.001f, 2.725f)
                curveTo(8.974f, 3.139f, 9.287f, 3.496f, 9.7f, 3.523f)
                curveTo(14.942f, 3.868f, 19.134f, 8.061f, 19.477f, 13.303f)
                curveTo(19.504f, 13.716f, 19.861f, 14.029f, 20.275f, 14.002f)
                curveTo(20.688f, 13.975f, 21.001f, 13.618f, 20.974f, 13.205f)
                curveTo(20.581f, 7.211f, 15.791f, 2.42f, 9.799f, 2.026f)
                close()
                moveTo(8.497f, 15.622f)
                curveTo(9.118f, 15.622f, 9.622f, 15.118f, 9.622f, 14.497f)
                curveTo(9.622f, 13.875f, 9.118f, 13.372f, 8.497f, 13.372f)
                curveTo(7.875f, 13.372f, 7.372f, 13.875f, 7.372f, 14.497f)
                curveTo(7.372f, 15.118f, 7.875f, 15.622f, 8.497f, 15.622f)
                close()
                moveTo(7.976f, 21.772f)
                lineTo(7.588f, 21.386f)
                curveTo(7.348f, 21.149f, 7.019f, 20.822f, 6.66f, 20.465f)
                curveTo(5.942f, 19.751f, 5.102f, 18.916f, 4.618f, 18.432f)
                curveTo(2.472f, 16.285f, 2.472f, 12.805f, 4.618f, 10.659f)
                curveTo(6.765f, 8.512f, 10.245f, 8.512f, 12.391f, 10.659f)
                curveTo(14.537f, 12.805f, 14.537f, 16.285f, 12.391f, 18.432f)
                curveTo(11.947f, 18.876f, 11.107f, 19.712f, 10.379f, 20.435f)
                lineTo(9.033f, 21.772f)
                curveTo(8.741f, 22.062f, 8.269f, 22.062f, 7.976f, 21.772f)
                close()
                moveTo(5.679f, 11.719f)
                curveTo(4.118f, 13.28f, 4.118f, 15.81f, 5.679f, 17.371f)
                curveTo(6.161f, 17.853f, 6.999f, 18.687f, 7.718f, 19.401f)
                lineTo(8.505f, 20.183f)
                lineTo(9.321f, 19.371f)
                curveTo(10.05f, 18.647f, 10.888f, 17.814f, 11.33f, 17.371f)
                curveTo(12.891f, 15.81f, 12.891f, 13.28f, 11.33f, 11.719f)
                curveTo(9.77f, 10.159f, 7.239f, 10.159f, 5.679f, 11.719f)
                close()
                moveTo(9.818f, 5.503f)
                curveTo(9.406f, 5.465f, 9.041f, 5.77f, 9.004f, 6.182f)
                curveTo(8.967f, 6.595f, 9.271f, 6.959f, 9.684f, 6.997f)
                curveTo(13.032f, 7.299f, 15.7f, 9.966f, 16.003f, 13.314f)
                curveTo(16.04f, 13.726f, 16.405f, 14.03f, 16.818f, 13.993f)
                curveTo(17.23f, 13.955f, 17.534f, 13.591f, 17.497f, 13.178f)
                curveTo(17.128f, 9.109f, 13.888f, 5.87f, 9.818f, 5.503f)
                close()
            }
        }.build()

        return _LocationLive!!
    }

@Suppress("ObjectPropertyName")
private var _LocationLive: ImageVector? = null

@Preview
@Composable
private fun LocationLivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LocationLive, contentDescription = null)
    }
}
