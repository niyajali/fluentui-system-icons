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

public val FluentIcons.Regular.ChannelArrowLeft: ImageVector
    get() {
        if (_ChannelArrowLeft != null) {
            return _ChannelArrowLeft!!
        }
        _ChannelArrowLeft = ImageVector.Builder(
            name = "Regular.ChannelArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(4.5f, 9.372f)
                lineTo(4.5f, 17.75f)
                curveTo(4.5f, 18.668f, 5.207f, 19.421f, 6.107f, 19.494f)
                lineTo(6.25f, 19.5f)
                lineTo(11.314f, 19.5f)
                curveTo(11.486f, 20.034f, 11.726f, 20.538f, 12.023f, 21.001f)
                lineTo(6.25f, 21f)
                curveTo(4.517f, 21f, 3.101f, 19.643f, 3.005f, 17.934f)
                lineTo(3f, 17.75f)
                lineTo(3f, 9.372f)
                curveTo(3.234f, 9.455f, 3.487f, 9.5f, 3.75f, 9.5f)
                curveTo(4.013f, 9.5f, 4.266f, 9.455f, 4.5f, 9.372f)
                close()
                moveTo(16.719f, 14.589f)
                lineTo(16.65f, 14.646f)
                lineTo(14.134f, 17.163f)
                lineTo(14.094f, 17.213f)
                lineTo(14.05f, 17.29f)
                lineTo(14.027f, 17.349f)
                lineTo(14.008f, 17.434f)
                lineTo(14.006f, 17.544f)
                lineTo(14.021f, 17.63f)
                lineTo(14.05f, 17.71f)
                lineTo(14.083f, 17.771f)
                lineTo(14.134f, 17.837f)
                lineTo(16.65f, 20.354f)
                curveTo(16.845f, 20.549f, 17.162f, 20.549f, 17.357f, 20.354f)
                curveTo(17.531f, 20.18f, 17.55f, 19.911f, 17.415f, 19.716f)
                lineTo(17.357f, 19.646f)
                lineTo(15.711f, 18f)
                horizontalLineTo(20.5f)
                curveTo(20.746f, 18f, 20.95f, 17.823f, 20.992f, 17.59f)
                lineTo(21f, 17.5f)
                curveTo(21f, 17.254f, 20.823f, 17.05f, 20.59f, 17.008f)
                lineTo(20.5f, 17f)
                horizontalLineTo(15.711f)
                lineTo(17.357f, 15.354f)
                curveTo(17.531f, 15.18f, 17.55f, 14.911f, 17.415f, 14.716f)
                lineTo(17.357f, 14.646f)
                curveTo(17.184f, 14.473f, 16.914f, 14.454f, 16.719f, 14.589f)
                close()
                moveTo(12.807f, 13.003f)
                curveTo(12.381f, 13.448f, 12.017f, 13.952f, 11.731f, 14.503f)
                lineTo(8.748f, 14.503f)
                curveTo(8.334f, 14.503f, 7.998f, 14.167f, 7.998f, 13.753f)
                curveTo(7.998f, 13.373f, 8.28f, 13.06f, 8.646f, 13.01f)
                lineTo(8.748f, 13.003f)
                lineTo(12.807f, 13.003f)
                close()
                moveTo(17.75f, 3f)
                curveTo(19.483f, 3f, 20.899f, 4.356f, 20.995f, 6.066f)
                lineTo(21f, 6.25f)
                lineTo(21.001f, 12.022f)
                curveTo(20.538f, 11.726f, 20.034f, 11.486f, 19.5f, 11.314f)
                lineTo(19.5f, 6.25f)
                curveTo(19.5f, 5.332f, 18.793f, 4.579f, 17.894f, 4.506f)
                lineTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.65f, 4.5f, 5.12f, 4.802f, 4.805f, 5.263f)
                curveTo(4.491f, 5.095f, 4.132f, 5f, 3.75f, 5f)
                curveTo(3.569f, 5f, 3.393f, 5.021f, 3.224f, 5.062f)
                curveTo(3.677f, 3.909f, 4.77f, 3.078f, 6.066f, 3.005f)
                lineTo(6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(15.252f, 9.496f)
                curveTo(15.667f, 9.496f, 16.002f, 9.832f, 16.002f, 10.246f)
                curveTo(16.002f, 10.626f, 15.72f, 10.94f, 15.354f, 10.989f)
                lineTo(15.252f, 10.996f)
                horizontalLineTo(8.748f)
                curveTo(8.334f, 10.996f, 7.998f, 10.66f, 7.998f, 10.246f)
                curveTo(7.998f, 9.867f, 8.28f, 9.553f, 8.646f, 9.503f)
                lineTo(8.748f, 9.496f)
                horizontalLineTo(15.252f)
                close()
                moveTo(3.75f, 6f)
                curveTo(4.441f, 6f, 5f, 6.56f, 5f, 7.25f)
                curveTo(5f, 7.941f, 4.441f, 8.5f, 3.75f, 8.5f)
                curveTo(3.06f, 8.5f, 2.5f, 7.941f, 2.5f, 7.25f)
                curveTo(2.5f, 6.56f, 3.06f, 6f, 3.75f, 6f)
                close()
            }
        }.build()

        return _ChannelArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChannelArrowLeft: ImageVector? = null

@Preview
@Composable
private fun ChannelArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChannelArrowLeft, contentDescription = null)
    }
}
