/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.DualScreenLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 5f)
            horizontalLineTo(16.5f)
            curveTo(15.846f, 5f, 15.289f, 5.419f, 15.084f, 6.003f)
            curveTo(15.03f, 6.159f, 15f, 6.326f, 15f, 6.5f)
            verticalLineTo(11.5f)
            curveTo(15f, 12.328f, 15.672f, 13f, 16.5f, 13f)
            horizontalLineTo(22.5f)
            curveTo(23.328f, 13f, 24f, 12.328f, 24f, 11.5f)
            verticalLineTo(6.5f)
            curveTo(24f, 5.672f, 23.328f, 5f, 22.5f, 5f)
            horizontalLineTo(22f)
            verticalLineTo(4f)
            curveTo(22f, 2.619f, 20.881f, 1.5f, 19.5f, 1.5f)
            curveTo(18.119f, 1.5f, 17f, 2.619f, 17f, 4f)
            verticalLineTo(5f)
            close()
            moveTo(18.5f, 4f)
            curveTo(18.5f, 3.448f, 18.948f, 3f, 19.5f, 3f)
            curveTo(20.052f, 3f, 20.5f, 3.448f, 20.5f, 4f)
            verticalLineTo(5f)
            horizontalLineTo(18.5f)
            verticalLineTo(4f)
            close()
            moveTo(20.5f, 9f)
            curveTo(20.5f, 9.552f, 20.052f, 10f, 19.5f, 10f)
            curveTo(18.948f, 10f, 18.5f, 9.552f, 18.5f, 9f)
            curveTo(18.5f, 8.448f, 18.948f, 8f, 19.5f, 8f)
            curveTo(20.052f, 8f, 20.5f, 8.448f, 20.5f, 9f)
            close()
            moveTo(12.998f, 6.003f)
            horizontalLineTo(14.049f)
            curveTo(14.017f, 6.164f, 14f, 6.33f, 14f, 6.5f)
            verticalLineTo(11.5f)
            curveTo(14f, 12.881f, 15.119f, 14f, 16.5f, 14f)
            horizontalLineTo(21.995f)
            verticalLineTo(20.249f)
            curveTo(21.995f, 21.215f, 21.212f, 21.999f, 20.245f, 21.999f)
            horizontalLineTo(12.998f)
            curveTo(12.911f, 21.999f, 12.825f, 21.992f, 12.742f, 21.98f)
            lineTo(12.742f, 6.022f)
            curveTo(12.825f, 6.01f, 12.911f, 6.003f, 12.998f, 6.003f)
            close()
            moveTo(16.239f, 17.5f)
            horizontalLineTo(14.739f)
            lineTo(14.637f, 17.507f)
            curveTo(14.271f, 17.556f, 13.989f, 17.87f, 13.989f, 18.25f)
            curveTo(13.989f, 18.629f, 14.271f, 18.943f, 14.637f, 18.993f)
            lineTo(14.739f, 19f)
            horizontalLineTo(16.239f)
            lineTo(16.34f, 18.993f)
            curveTo(16.707f, 18.943f, 16.989f, 18.629f, 16.989f, 18.25f)
            curveTo(16.989f, 17.87f, 16.707f, 17.556f, 16.34f, 17.507f)
            lineTo(16.239f, 17.5f)
            close()
            moveTo(10.998f, 6.001f)
            curveTo(11.081f, 6.001f, 11.163f, 6.007f, 11.243f, 6.018f)
            lineTo(11.243f, 21.979f)
            curveTo(11.163f, 21.99f, 11.081f, 21.996f, 10.998f, 21.996f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 21.996f, 2f, 21.213f, 2f, 20.246f)
            verticalLineTo(7.751f)
            curveTo(2f, 6.784f, 2.783f, 6.001f, 3.75f, 6.001f)
            horizontalLineTo(10.998f)
            close()
            moveTo(9.243f, 17.5f)
            horizontalLineTo(7.741f)
            lineTo(7.639f, 17.507f)
            curveTo(7.273f, 17.556f, 6.991f, 17.87f, 6.991f, 18.25f)
            curveTo(6.991f, 18.629f, 7.273f, 18.943f, 7.639f, 18.993f)
            lineTo(7.741f, 19f)
            horizontalLineTo(9.243f)
            lineTo(9.345f, 18.993f)
            curveTo(9.711f, 18.943f, 9.993f, 18.629f, 9.993f, 18.25f)
            curveTo(9.993f, 17.87f, 9.711f, 17.556f, 9.345f, 17.507f)
            lineTo(9.243f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DualScreenLock, contentDescription = null)
    }
}
