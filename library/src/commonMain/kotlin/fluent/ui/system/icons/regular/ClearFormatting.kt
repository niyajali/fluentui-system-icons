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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ClearFormatting: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClearFormatting",
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
            moveTo(11.314f, 19.5f)
            curveTo(11.486f, 20.034f, 11.726f, 20.538f, 12.023f, 21.001f)
            lineTo(2.75f, 21f)
            curveTo(2.336f, 21f, 2f, 20.664f, 2f, 20.25f)
            curveTo(2f, 19.87f, 2.282f, 19.556f, 2.648f, 19.507f)
            lineTo(2.75f, 19.5f)
            lineTo(11.314f, 19.5f)
            close()
            moveTo(15.093f, 14.966f)
            lineTo(15.024f, 15.024f)
            lineTo(14.966f, 15.093f)
            curveTo(14.848f, 15.264f, 14.848f, 15.491f, 14.966f, 15.662f)
            lineTo(15.024f, 15.731f)
            lineTo(16.793f, 17.501f)
            lineTo(15.026f, 19.267f)
            lineTo(14.969f, 19.337f)
            curveTo(14.85f, 19.507f, 14.85f, 19.735f, 14.969f, 19.905f)
            lineTo(15.026f, 19.975f)
            lineTo(15.096f, 20.032f)
            curveTo(15.266f, 20.151f, 15.494f, 20.151f, 15.664f, 20.032f)
            lineTo(15.733f, 19.975f)
            lineTo(17.5f, 18.208f)
            lineTo(19.269f, 19.977f)
            lineTo(19.339f, 20.035f)
            curveTo(19.509f, 20.153f, 19.737f, 20.153f, 19.907f, 20.035f)
            lineTo(19.976f, 19.977f)
            lineTo(20.034f, 19.908f)
            curveTo(20.153f, 19.737f, 20.153f, 19.51f, 20.034f, 19.339f)
            lineTo(19.976f, 19.27f)
            lineTo(18.207f, 17.501f)
            lineTo(19.979f, 15.731f)
            lineTo(20.037f, 15.662f)
            curveTo(20.155f, 15.491f, 20.155f, 15.264f, 20.037f, 15.093f)
            lineTo(19.979f, 15.024f)
            lineTo(19.91f, 14.966f)
            curveTo(19.74f, 14.848f, 19.512f, 14.848f, 19.341f, 14.966f)
            lineTo(19.272f, 15.024f)
            lineTo(17.5f, 16.794f)
            lineTo(15.731f, 15.024f)
            lineTo(15.662f, 14.966f)
            curveTo(15.516f, 14.865f, 15.327f, 14.851f, 15.169f, 14.923f)
            lineTo(15.093f, 14.966f)
            close()
            moveTo(15.75f, 3.5f)
            curveTo(16.18f, 3.5f, 16.514f, 3.857f, 16.5f, 4.274f)
            lineTo(16.49f, 4.371f)
            lineTo(16.245f, 5.871f)
            curveTo(16.178f, 6.28f, 15.792f, 6.557f, 15.384f, 6.49f)
            curveTo(15.009f, 6.429f, 14.745f, 6.1f, 14.755f, 5.731f)
            lineTo(14.764f, 5.629f)
            lineTo(14.867f, 5f)
            horizontalLineTo(11.007f)
            lineTo(9.001f, 16.5f)
            horizontalLineTo(9.75f)
            curveTo(10.13f, 16.5f, 10.443f, 16.782f, 10.493f, 17.148f)
            lineTo(10.5f, 17.25f)
            curveTo(10.5f, 17.63f, 10.218f, 17.944f, 9.852f, 17.993f)
            lineTo(9.75f, 18f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 18f, 6f, 17.664f, 6f, 17.25f)
            curveTo(6f, 16.87f, 6.282f, 16.556f, 6.648f, 16.507f)
            lineTo(6.75f, 16.5f)
            horizontalLineTo(7.479f)
            lineTo(9.485f, 5f)
            horizontalLineTo(5.385f)
            lineTo(5.239f, 5.874f)
            curveTo(5.171f, 6.282f, 4.784f, 6.558f, 4.376f, 6.49f)
            curveTo(4.001f, 6.427f, 3.738f, 6.097f, 3.75f, 5.728f)
            lineTo(3.76f, 5.626f)
            lineTo(4.01f, 4.126f)
            curveTo(4.065f, 3.801f, 4.323f, 3.554f, 4.642f, 3.508f)
            lineTo(4.75f, 3.5f)
            horizontalLineTo(15.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClearFormattingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClearFormatting, contentDescription = null)
    }
}
