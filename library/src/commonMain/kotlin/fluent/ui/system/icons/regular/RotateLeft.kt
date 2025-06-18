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

public val FluentUi.Regular.RotateLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RotateLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.015f, 5f)
            curveTo(15.099f, 5f, 15.182f, 5.002f, 15.264f, 5.005f)
            curveTo(15.27f, 5.005f, 15.276f, 5.005f, 15.282f, 5.005f)
            curveTo(16.442f, 5.05f, 17.517f, 5.37f, 18.413f, 5.888f)
            curveTo(19.976f, 6.79f, 21f, 8.295f, 21f, 10f)
            curveTo(21f, 11.708f, 19.972f, 13.216f, 18.404f, 14.118f)
            curveTo(17.437f, 14.674f, 16.264f, 15f, 15f, 15f)
            horizontalLineTo(14.5f)
            curveTo(14.181f, 15f, 13.908f, 14.8f, 13.8f, 14.519f)
            curveTo(13.768f, 14.436f, 13.75f, 14.345f, 13.75f, 14.25f)
            curveTo(13.75f, 13.836f, 14.086f, 13.5f, 14.5f, 13.5f)
            horizontalLineTo(15f)
            curveTo(15.963f, 13.5f, 16.856f, 13.265f, 17.588f, 12.864f)
            curveTo(18.744f, 12.23f, 19.5f, 11.184f, 19.5f, 10f)
            curveTo(19.5f, 8.816f, 18.744f, 7.77f, 17.588f, 7.136f)
            curveTo(16.913f, 6.767f, 16.102f, 6.538f, 15.225f, 6.504f)
            lineTo(15f, 6.5f)
            horizontalLineTo(8.061f)
            lineTo(9.781f, 8.221f)
            curveTo(10.073f, 8.514f, 10.073f, 8.988f, 9.78f, 9.28f)
            curveTo(9.514f, 9.547f, 9.097f, 9.571f, 8.804f, 9.353f)
            lineTo(8.72f, 9.28f)
            lineTo(8.719f, 9.279f)
            lineTo(5.72f, 6.28f)
            curveTo(5.714f, 6.274f, 5.708f, 6.268f, 5.702f, 6.262f)
            curveTo(5.438f, 5.98f, 5.433f, 5.545f, 5.685f, 5.257f)
            curveTo(5.696f, 5.244f, 5.708f, 5.232f, 5.72f, 5.22f)
            lineTo(8.719f, 2.221f)
            lineTo(8.72f, 2.22f)
            lineTo(8.804f, 2.147f)
            curveTo(9.097f, 1.929f, 9.514f, 1.953f, 9.78f, 2.22f)
            curveTo(10.073f, 2.512f, 10.073f, 2.986f, 9.781f, 3.279f)
            lineTo(8.062f, 5f)
            horizontalLineTo(15f)
            curveTo(15.005f, 5f, 15.01f, 5f, 15.015f, 5f)
            close()
            moveTo(20.389f, 20.067f)
            curveTo(20.628f, 20.206f, 20.709f, 20.511f, 20.571f, 20.75f)
            curveTo(20.482f, 20.905f, 20.317f, 21f, 20.138f, 21f)
            horizontalLineTo(4f)
            curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
            verticalLineTo(10.867f)
            curveTo(3f, 10.591f, 3.224f, 10.367f, 3.5f, 10.367f)
            curveTo(3.588f, 10.367f, 3.674f, 10.39f, 3.751f, 10.434f)
            lineTo(20.389f, 20.067f)
            close()
            moveTo(16.415f, 19.5f)
            lineTo(4.5f, 12.602f)
            verticalLineTo(19.5f)
            horizontalLineTo(16.415f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RotateLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RotateLeft, contentDescription = null)
    }
}
