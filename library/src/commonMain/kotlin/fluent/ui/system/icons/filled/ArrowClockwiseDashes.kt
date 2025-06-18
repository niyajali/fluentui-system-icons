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

public val FluentUi.Filled.ArrowClockwiseDashes: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowClockwiseDashes",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19f, 4f)
            curveTo(19f, 3.448f, 18.552f, 3f, 18f, 3f)
            curveTo(17.448f, 3f, 17f, 3.448f, 17f, 4f)
            verticalLineTo(4.514f)
            curveTo(16.134f, 3.935f, 15.162f, 3.502f, 14.119f, 3.25f)
            curveTo(13.53f, 3.108f, 13.002f, 3.584f, 13.002f, 4.19f)
            curveTo(13.002f, 4.695f, 13.376f, 5.116f, 13.864f, 5.25f)
            curveTo(14.484f, 5.421f, 15.071f, 5.675f, 15.609f, 6f)
            horizontalLineTo(15f)
            curveTo(14.448f, 6f, 14f, 6.448f, 14f, 7f)
            curveTo(14f, 7.552f, 14.448f, 8f, 15f, 8f)
            horizontalLineTo(18f)
            curveTo(18.552f, 8f, 19f, 7.552f, 19f, 7f)
            verticalLineTo(4f)
            close()
            moveTo(9.885f, 3.25f)
            curveTo(10.473f, 3.108f, 11.002f, 3.584f, 11.002f, 4.19f)
            curveTo(11.002f, 4.695f, 10.627f, 5.116f, 10.14f, 5.25f)
            curveTo(9.577f, 5.405f, 9.043f, 5.629f, 8.546f, 5.911f)
            curveTo(8.107f, 6.161f, 7.545f, 6.128f, 7.187f, 5.77f)
            curveTo(6.759f, 5.342f, 6.797f, 4.632f, 7.313f, 4.316f)
            curveTo(8.099f, 3.836f, 8.964f, 3.472f, 9.885f, 3.25f)
            close()
            moveTo(19.812f, 12.998f)
            curveTo(19.307f, 12.998f, 18.886f, 13.373f, 18.752f, 13.861f)
            curveTo(18.597f, 14.424f, 18.373f, 14.959f, 18.091f, 15.455f)
            curveTo(17.841f, 15.895f, 17.874f, 16.457f, 18.231f, 16.814f)
            curveTo(18.66f, 17.243f, 19.37f, 17.205f, 19.686f, 16.688f)
            curveTo(20.167f, 15.902f, 20.53f, 15.036f, 20.752f, 14.115f)
            curveTo(20.893f, 13.527f, 20.418f, 12.998f, 19.812f, 12.998f)
            close()
            moveTo(13.864f, 18.75f)
            curveTo(13.376f, 18.884f, 13.002f, 19.305f, 13.002f, 19.81f)
            curveTo(13.002f, 20.416f, 13.53f, 20.891f, 14.119f, 20.75f)
            curveTo(15.04f, 20.528f, 15.905f, 20.164f, 16.691f, 19.683f)
            curveTo(17.208f, 19.367f, 17.246f, 18.657f, 16.817f, 18.229f)
            curveTo(16.46f, 17.871f, 15.898f, 17.838f, 15.458f, 18.088f)
            curveTo(14.962f, 18.371f, 14.427f, 18.594f, 13.864f, 18.75f)
            close()
            moveTo(8.545f, 18.088f)
            curveTo(8.105f, 17.838f, 7.543f, 17.871f, 7.186f, 18.228f)
            curveTo(6.757f, 18.656f, 6.795f, 19.367f, 7.311f, 19.683f)
            curveTo(8.098f, 20.164f, 8.964f, 20.528f, 9.885f, 20.75f)
            curveTo(10.473f, 20.891f, 11.002f, 20.416f, 11.002f, 19.81f)
            curveTo(11.002f, 19.305f, 10.627f, 18.884f, 10.14f, 18.75f)
            curveTo(9.576f, 18.594f, 9.041f, 18.371f, 8.545f, 18.088f)
            close()
            moveTo(5.252f, 13.861f)
            curveTo(5.118f, 13.373f, 4.697f, 12.998f, 4.191f, 12.998f)
            curveTo(3.586f, 12.998f, 3.11f, 13.527f, 3.252f, 14.115f)
            curveTo(3.474f, 15.036f, 3.837f, 15.901f, 4.317f, 16.688f)
            curveTo(4.633f, 17.204f, 5.344f, 17.242f, 5.772f, 16.814f)
            curveTo(6.129f, 16.456f, 6.162f, 15.894f, 5.912f, 15.455f)
            curveTo(5.63f, 14.958f, 5.407f, 14.424f, 5.252f, 13.861f)
            close()
            moveTo(5.913f, 8.543f)
            curveTo(6.163f, 8.104f, 6.13f, 7.542f, 5.773f, 7.184f)
            curveTo(5.345f, 6.756f, 4.635f, 6.794f, 4.319f, 7.31f)
            curveTo(3.838f, 8.096f, 3.475f, 8.961f, 3.253f, 9.881f)
            curveTo(3.111f, 10.47f, 3.586f, 10.998f, 4.192f, 10.998f)
            curveTo(4.697f, 10.998f, 5.118f, 10.624f, 5.253f, 10.137f)
            curveTo(5.407f, 9.574f, 5.631f, 9.04f, 5.913f, 8.543f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowClockwiseDashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowClockwiseDashes, contentDescription = null)
    }
}
