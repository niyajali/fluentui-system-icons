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

public val FluentIcons.Regular.ChannelAdd: ImageVector
    get() {
        if (_ChannelAdd != null) {
            return _ChannelAdd!!
        }
        _ChannelAdd = ImageVector.Builder(
            name = "Regular.ChannelAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                curveTo(19.483f, 3f, 20.899f, 4.356f, 20.995f, 6.066f)
                lineTo(21f, 6.25f)
                verticalLineTo(12.022f)
                curveTo(20.537f, 11.725f, 20.034f, 11.486f, 19.5f, 11.314f)
                verticalLineTo(6.25f)
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
                moveTo(11.314f, 19.5f)
                curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.517f, 21f, 3.101f, 19.643f, 3.005f, 17.934f)
                lineTo(3f, 17.75f)
                lineTo(3f, 9.372f)
                curveTo(3.234f, 9.455f, 3.487f, 9.5f, 3.75f, 9.5f)
                curveTo(4.013f, 9.5f, 4.266f, 9.455f, 4.5f, 9.372f)
                lineTo(4.5f, 17.75f)
                curveTo(4.5f, 18.668f, 5.207f, 19.421f, 6.107f, 19.494f)
                lineTo(6.25f, 19.5f)
                horizontalLineTo(11.314f)
                close()
                moveTo(11.731f, 14.503f)
                curveTo(12.017f, 13.952f, 12.381f, 13.447f, 12.807f, 13.003f)
                horizontalLineTo(8.748f)
                lineTo(8.646f, 13.01f)
                curveTo(8.28f, 13.06f, 7.998f, 13.373f, 7.998f, 13.753f)
                curveTo(7.998f, 14.167f, 8.334f, 14.503f, 8.748f, 14.503f)
                horizontalLineTo(11.731f)
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
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _ChannelAdd!!
    }

@Suppress("ObjectPropertyName")
private var _ChannelAdd: ImageVector? = null

@Preview
@Composable
private fun ChannelAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChannelAdd, contentDescription = null)
    }
}
