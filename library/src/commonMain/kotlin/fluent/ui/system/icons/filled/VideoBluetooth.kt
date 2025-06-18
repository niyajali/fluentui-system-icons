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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.VideoBluetooth: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoBluetooth",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7.25f)
            curveTo(3f, 5.455f, 4.455f, 4f, 6.25f, 4f)
            horizontalLineTo(12.75f)
            curveTo(14.545f, 4f, 16f, 5.455f, 16f, 7.25f)
            verticalLineTo(14.75f)
            curveTo(16f, 16.545f, 14.545f, 18f, 12.75f, 18f)
            horizontalLineTo(7.686f)
            curveTo(7.91f, 17.679f, 8.021f, 17.29f, 7.997f, 16.895f)
            curveTo(7.968f, 16.419f, 7.747f, 15.975f, 7.383f, 15.667f)
            lineTo(6.599f, 15f)
            lineTo(7.383f, 14.333f)
            curveTo(7.747f, 14.025f, 7.968f, 13.581f, 7.997f, 13.105f)
            curveTo(8.026f, 12.629f, 7.859f, 12.162f, 7.535f, 11.812f)
            lineTo(4.531f, 8.562f)
            curveTo(4.136f, 8.134f, 3.56f, 7.938f, 3f, 8.017f)
            verticalLineTo(7.25f)
            close()
            moveTo(20.257f, 16.688f)
            lineTo(17f, 14.439f)
            verticalLineTo(7.562f)
            lineTo(20.257f, 5.313f)
            curveTo(21.418f, 4.511f, 23.002f, 5.342f, 23.002f, 6.753f)
            verticalLineTo(15.248f)
            curveTo(23.002f, 16.659f, 21.418f, 17.49f, 20.257f, 16.688f)
            close()
            moveTo(3.797f, 9.241f)
            curveTo(3.587f, 9.014f, 3.26f, 8.939f, 2.973f, 9.052f)
            curveTo(2.685f, 9.164f, 2.496f, 9.441f, 2.496f, 9.75f)
            verticalLineTo(12.825f)
            lineTo(1.736f, 12.179f)
            curveTo(1.42f, 11.91f, 0.947f, 11.949f, 0.679f, 12.264f)
            curveTo(0.41f, 12.58f, 0.449f, 13.053f, 0.764f, 13.321f)
            lineTo(2.496f, 14.793f)
            verticalLineTo(15.207f)
            lineTo(0.764f, 16.678f)
            curveTo(0.449f, 16.947f, 0.41f, 17.42f, 0.679f, 17.736f)
            curveTo(0.947f, 18.051f, 1.42f, 18.09f, 1.736f, 17.822f)
            lineTo(2.496f, 17.175f)
            verticalLineTo(20.25f)
            curveTo(2.496f, 20.559f, 2.685f, 20.836f, 2.973f, 20.948f)
            curveTo(3.26f, 21.061f, 3.587f, 20.986f, 3.797f, 20.759f)
            lineTo(6.801f, 17.509f)
            curveTo(6.939f, 17.359f, 7.011f, 17.159f, 6.999f, 16.955f)
            curveTo(6.986f, 16.751f, 6.891f, 16.561f, 6.736f, 16.428f)
            lineTo(5.055f, 15f)
            lineTo(6.736f, 13.571f)
            curveTo(6.891f, 13.439f, 6.986f, 13.249f, 6.999f, 13.045f)
            curveTo(7.011f, 12.841f, 6.939f, 12.641f, 6.801f, 12.491f)
            lineTo(3.797f, 9.241f)
            close()
            moveTo(5.169f, 17.065f)
            lineTo(3.996f, 18.334f)
            verticalLineTo(16.069f)
            lineTo(5.169f, 17.065f)
            close()
            moveTo(3.996f, 11.666f)
            lineTo(5.169f, 12.935f)
            lineTo(3.996f, 13.932f)
            verticalLineTo(11.666f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoBluetoothPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoBluetooth, contentDescription = null)
    }
}
