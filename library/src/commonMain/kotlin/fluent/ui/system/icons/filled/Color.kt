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

public val FluentUi.Filled.Color: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Color",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.839f, 5.858f)
            curveTo(6.78f, 1.942f, 12.868f, 0.803f, 17.203f, 3.498f)
            curveTo(21.483f, 6.159f, 23.057f, 11.275f, 21.304f, 16.075f)
            curveTo(19.649f, 20.608f, 15.287f, 22.403f, 12.144f, 20.123f)
            curveTo(10.967f, 19.269f, 10.51f, 18.198f, 10.29f, 16.459f)
            lineTo(10.184f, 15.472f)
            lineTo(10.139f, 15.074f)
            curveTo(10.016f, 14.14f, 9.828f, 13.722f, 9.434f, 13.502f)
            curveTo(8.899f, 13.204f, 8.542f, 13.197f, 7.839f, 13.469f)
            lineTo(7.488f, 13.615f)
            lineTo(7.309f, 13.693f)
            curveTo(6.295f, 14.133f, 5.621f, 14.288f, 4.768f, 14.109f)
            lineTo(4.568f, 14.062f)
            lineTo(4.404f, 14.015f)
            curveTo(1.615f, 13.151f, 1.202f, 9.368f, 3.839f, 5.858f)
            close()
            moveTo(16.767f, 10.58f)
            curveTo(16.946f, 11.247f, 17.631f, 11.642f, 18.298f, 11.464f)
            curveTo(18.965f, 11.285f, 19.36f, 10.599f, 19.182f, 9.933f)
            curveTo(19.003f, 9.266f, 18.318f, 8.87f, 17.651f, 9.049f)
            curveTo(16.984f, 9.227f, 16.588f, 9.913f, 16.767f, 10.58f)
            close()
            moveTo(17.261f, 14.068f)
            curveTo(17.44f, 14.735f, 18.126f, 15.131f, 18.792f, 14.952f)
            curveTo(19.459f, 14.774f, 19.855f, 14.088f, 19.676f, 13.421f)
            curveTo(19.498f, 12.755f, 18.812f, 12.359f, 18.145f, 12.537f)
            curveTo(17.479f, 12.716f, 17.083f, 13.401f, 17.261f, 14.068f)
            close()
            moveTo(14.788f, 7.577f)
            curveTo(14.967f, 8.244f, 15.653f, 8.64f, 16.319f, 8.461f)
            curveTo(16.986f, 8.282f, 17.382f, 7.597f, 17.203f, 6.93f)
            curveTo(17.024f, 6.263f, 16.339f, 5.867f, 15.672f, 6.046f)
            curveTo(15.005f, 6.225f, 14.61f, 6.91f, 14.788f, 7.577f)
            close()
            moveTo(14.76f, 16.575f)
            curveTo(14.939f, 17.242f, 15.624f, 17.638f, 16.291f, 17.459f)
            curveTo(16.958f, 17.281f, 17.353f, 16.595f, 17.175f, 15.928f)
            curveTo(16.996f, 15.262f, 16.311f, 14.866f, 15.644f, 15.045f)
            curveTo(14.977f, 15.223f, 14.581f, 15.909f, 14.76f, 16.575f)
            close()
            moveTo(11.263f, 6.605f)
            curveTo(11.442f, 7.272f, 12.127f, 7.668f, 12.794f, 7.489f)
            curveTo(13.461f, 7.311f, 13.856f, 6.625f, 13.678f, 5.958f)
            curveTo(13.499f, 5.292f, 12.814f, 4.896f, 12.147f, 5.075f)
            curveTo(11.48f, 5.253f, 11.084f, 5.939f, 11.263f, 6.605f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Color, contentDescription = null)
    }
}
