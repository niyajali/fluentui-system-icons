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

public val FluentIcons.Filled.ChatOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(4.418f, 5.479f)
            curveTo(2.911f, 7.23f, 2f, 9.509f, 2f, 12f)
            curveTo(2f, 13.643f, 2.397f, 15.229f, 3.145f, 16.65f)
            lineTo(2.029f, 20.939f)
            curveTo(1.992f, 21.079f, 1.992f, 21.227f, 2.029f, 21.367f)
            curveTo(2.147f, 21.821f, 2.611f, 22.094f, 3.065f, 21.975f)
            lineTo(7.356f, 20.858f)
            curveTo(8.775f, 21.604f, 10.36f, 22f, 12f, 22f)
            curveTo(14.491f, 22f, 16.77f, 21.089f, 18.521f, 19.582f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(13.42f, 14.481f)
            curveTo(13.398f, 14.486f, 13.376f, 14.49f, 13.354f, 14.493f)
            lineTo(13.252f, 14.5f)
            horizontalLineTo(8.75f)
            lineTo(8.648f, 14.493f)
            curveTo(8.282f, 14.443f, 8f, 14.13f, 8f, 13.75f)
            curveTo(8f, 13.37f, 8.282f, 13.057f, 8.648f, 13.007f)
            lineTo(8.75f, 13f)
            horizontalLineTo(11.939f)
            lineTo(13.42f, 14.481f)
            close()
            moveTo(9.939f, 11f)
            horizontalLineTo(8.75f)
            lineTo(8.648f, 10.993f)
            curveTo(8.282f, 10.943f, 8f, 10.63f, 8f, 10.25f)
            curveTo(8f, 9.928f, 8.202f, 9.654f, 8.487f, 9.548f)
            lineTo(9.939f, 11f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.25f, 11f)
            horizontalLineTo(14.182f)
            lineTo(20.482f, 17.3f)
            curveTo(21.444f, 15.763f, 22f, 13.947f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(10.053f, 2f, 8.237f, 2.556f, 6.7f, 3.518f)
            lineTo(12.682f, 9.5f)
            horizontalLineTo(15.25f)
            lineTo(15.352f, 9.507f)
            curveTo(15.718f, 9.557f, 16f, 9.87f, 16f, 10.25f)
            curveTo(16f, 10.63f, 15.718f, 10.943f, 15.352f, 10.993f)
            lineTo(15.25f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChatOff, contentDescription = null)
    }
}
