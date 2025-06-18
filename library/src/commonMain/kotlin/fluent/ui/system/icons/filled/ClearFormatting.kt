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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ClearFormatting: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClearFormatting",
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
            moveTo(3f, 19f)
            lineTo(11.174f, 19.001f)
            curveTo(11.344f, 19.721f, 11.635f, 20.396f, 12.023f, 21.001f)
            lineTo(3f, 21f)
            curveTo(2.448f, 21f, 2f, 20.552f, 2f, 20f)
            curveTo(2f, 19.487f, 2.386f, 19.065f, 2.883f, 19.007f)
            lineTo(3f, 19f)
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
            moveTo(16.001f, 3f)
            curveTo(16.579f, 3f, 17.028f, 3.486f, 17f, 4.048f)
            lineTo(16.988f, 4.161f)
            lineTo(16.743f, 5.661f)
            curveTo(16.653f, 6.206f, 16.139f, 6.576f, 15.594f, 6.487f)
            curveTo(15.088f, 6.404f, 14.733f, 5.955f, 14.757f, 5.455f)
            lineTo(14.769f, 5.339f)
            lineTo(14.824f, 5f)
            horizontalLineTo(11.432f)
            lineTo(9.672f, 16f)
            horizontalLineTo(10f)
            curveTo(10.513f, 16f, 10.936f, 16.386f, 10.993f, 16.883f)
            lineTo(11f, 17f)
            curveTo(11f, 17.513f, 10.614f, 17.935f, 10.117f, 17.993f)
            lineTo(10f, 18f)
            horizontalLineTo(7f)
            curveTo(6.448f, 18f, 6f, 17.552f, 6f, 17f)
            curveTo(6f, 16.487f, 6.386f, 16.065f, 6.883f, 16.007f)
            lineTo(7f, 16f)
            horizontalLineTo(7.647f)
            lineTo(9.407f, 5f)
            horizontalLineTo(5.846f)
            lineTo(5.735f, 5.665f)
            curveTo(5.644f, 6.21f, 5.129f, 6.577f, 4.584f, 6.486f)
            curveTo(4.078f, 6.402f, 3.725f, 5.951f, 3.75f, 5.451f)
            lineTo(3.762f, 5.335f)
            lineTo(4.013f, 3.835f)
            curveTo(4.087f, 3.393f, 4.444f, 3.06f, 4.879f, 3.007f)
            lineTo(4.999f, 3f)
            horizontalLineTo(16.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClearFormattingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClearFormatting, contentDescription = null)
    }
}
