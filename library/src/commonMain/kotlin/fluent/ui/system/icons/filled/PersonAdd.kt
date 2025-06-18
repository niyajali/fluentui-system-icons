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

public val FluentIcons.Filled.PersonAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 17.5f)
            curveTo(11f, 16.211f, 11.375f, 15.01f, 12.023f, 14f)
            lineTo(4.253f, 14f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
            verticalLineTo(17.169f)
            curveTo(2.004f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
            curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
            curveTo(10.932f, 22.001f, 11.797f, 21.922f, 12.592f, 21.762f)
            curveTo(11.601f, 20.621f, 11f, 19.131f, 11f, 17.5f)
            close()
            moveTo(15f, 7.005f)
            curveTo(15f, 4.243f, 12.762f, 2.005f, 10f, 2.005f)
            curveTo(7.239f, 2.005f, 5f, 4.243f, 5f, 7.005f)
            curveTo(5f, 9.766f, 7.239f, 12.005f, 10f, 12.005f)
            curveTo(12.762f, 12.005f, 15f, 9.766f, 15f, 7.005f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.463f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.463f, 12f, 12f, 14.463f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.463f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(17.41f, 14.008f)
            lineTo(17.5f, 14f)
            lineTo(17.59f, 14.008f)
            curveTo(17.794f, 14.045f, 17.955f, 14.206f, 17.992f, 14.41f)
            lineTo(18f, 14.5f)
            lineTo(17.999f, 17f)
            horizontalLineTo(20.504f)
            lineTo(20.594f, 17.008f)
            curveTo(20.798f, 17.045f, 20.959f, 17.206f, 20.996f, 17.41f)
            lineTo(21.004f, 17.5f)
            lineTo(20.996f, 17.59f)
            curveTo(20.959f, 17.794f, 20.798f, 17.955f, 20.594f, 17.992f)
            lineTo(20.504f, 18f)
            horizontalLineTo(17.999f)
            lineTo(18f, 20.5f)
            lineTo(17.992f, 20.59f)
            curveTo(17.955f, 20.794f, 17.794f, 20.955f, 17.59f, 20.992f)
            lineTo(17.5f, 21f)
            lineTo(17.41f, 20.992f)
            curveTo(17.206f, 20.955f, 17.045f, 20.794f, 17.008f, 20.59f)
            lineTo(17f, 20.5f)
            lineTo(16.999f, 18f)
            horizontalLineTo(14.504f)
            lineTo(14.414f, 17.992f)
            curveTo(14.21f, 17.955f, 14.049f, 17.794f, 14.012f, 17.59f)
            lineTo(14.004f, 17.5f)
            lineTo(14.012f, 17.41f)
            curveTo(14.049f, 17.206f, 14.21f, 17.045f, 14.414f, 17.008f)
            lineTo(14.504f, 17f)
            horizontalLineTo(16.999f)
            lineTo(17f, 14.5f)
            lineTo(17.008f, 14.41f)
            curveTo(17.045f, 14.206f, 17.206f, 14.045f, 17.41f, 14.008f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonAdd, contentDescription = null)
    }
}
