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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ChannelSubtract: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChannelSubtract",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.995f, 6.066f)
            curveTo(20.899f, 4.356f, 19.483f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            lineTo(6.066f, 3.005f)
            curveTo(4.77f, 3.078f, 3.677f, 3.909f, 3.224f, 5.062f)
            curveTo(3.393f, 5.021f, 3.569f, 5f, 3.75f, 5f)
            curveTo(4.132f, 5f, 4.491f, 5.095f, 4.805f, 5.263f)
            curveTo(5.12f, 4.802f, 5.65f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            lineTo(17.894f, 4.506f)
            curveTo(18.793f, 4.579f, 19.5f, 5.332f, 19.5f, 6.25f)
            verticalLineTo(11.314f)
            curveTo(20.034f, 11.486f, 20.537f, 11.725f, 21f, 12.022f)
            verticalLineTo(6.25f)
            lineTo(20.995f, 6.066f)
            close()
            moveTo(12.022f, 21f)
            curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
            horizontalLineTo(6.25f)
            lineTo(6.107f, 19.494f)
            curveTo(5.207f, 19.421f, 4.5f, 18.668f, 4.5f, 17.75f)
            lineTo(4.5f, 9.372f)
            curveTo(4.266f, 9.455f, 4.013f, 9.5f, 3.75f, 9.5f)
            curveTo(3.487f, 9.5f, 3.234f, 9.455f, 3f, 9.372f)
            lineTo(3f, 17.75f)
            lineTo(3.005f, 17.934f)
            curveTo(3.101f, 19.643f, 4.517f, 21f, 6.25f, 21f)
            horizontalLineTo(12.022f)
            close()
            moveTo(11.731f, 14.503f)
            curveTo(12.017f, 13.952f, 12.381f, 13.447f, 12.807f, 13.003f)
            horizontalLineTo(8.748f)
            lineTo(8.646f, 13.01f)
            curveTo(8.28f, 13.06f, 7.998f, 13.373f, 7.998f, 13.753f)
            curveTo(7.998f, 14.167f, 8.334f, 14.503f, 8.748f, 14.503f)
            horizontalLineTo(11.731f)
            close()
            moveTo(16.002f, 10.246f)
            curveTo(16.002f, 9.832f, 15.667f, 9.496f, 15.252f, 9.496f)
            horizontalLineTo(8.748f)
            lineTo(8.646f, 9.503f)
            curveTo(8.28f, 9.553f, 7.998f, 9.867f, 7.998f, 10.246f)
            curveTo(7.998f, 10.66f, 8.334f, 10.996f, 8.748f, 10.996f)
            horizontalLineTo(15.252f)
            lineTo(15.354f, 10.989f)
            curveTo(15.72f, 10.94f, 16.002f, 10.626f, 16.002f, 10.246f)
            close()
            moveTo(5f, 7.25f)
            curveTo(5f, 6.56f, 4.441f, 6f, 3.75f, 6f)
            curveTo(3.06f, 6f, 2.5f, 6.56f, 2.5f, 7.25f)
            curveTo(2.5f, 7.941f, 3.06f, 8.5f, 3.75f, 8.5f)
            curveTo(4.441f, 8.5f, 5f, 7.941f, 5f, 7.25f)
            close()
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(20.497f, 18f)
            curveTo(20.772f, 18f, 20.996f, 17.776f, 20.996f, 17.5f)
            curveTo(20.996f, 17.224f, 20.772f, 17f, 20.497f, 17f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 17f, 13.996f, 17.224f, 13.996f, 17.5f)
            curveTo(13.996f, 17.776f, 14.22f, 18f, 14.496f, 18f)
            horizontalLineTo(20.497f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChannelSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChannelSubtract, contentDescription = null)
    }
}
