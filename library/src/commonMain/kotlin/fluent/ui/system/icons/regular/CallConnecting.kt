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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * CallConnecting icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: call, connecting
 * - Source: ic_fluent_call_connecting_20_regular.svg
 * 
 * @return The [ImageVector] for the CallConnecting icon.
 */
public val FluentIcons.Regular.CallConnecting: ImageVector
    get() {
        if (_callConnecting != null) {
            return _callConnecting!!
        }
        _callConnecting = Builder(name = "CallConnecting", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.535f, 2.116f)
                curveTo(5.494f, 1.852f, 4.405f, 1.964f, 3.551f, 2.442f)
                curveTo(2.682f, 2.928f, 2.072f, 3.79f, 2.042f, 4.943f)
                curveTo(1.995f, 6.745f, 2.412f, 9.162f, 4.068f, 12.001f)
                curveTo(5.703f, 14.804f, 7.508f, 16.484f, 9.006f, 17.482f)
                curveTo(9.952f, 18.114f, 10.997f, 18.13f, 11.89f, 17.719f)
                curveTo(12.769f, 17.313f, 13.484f, 16.505f, 13.855f, 15.502f)
                curveTo(14.042f, 14.997f, 13.998f, 14.436f, 13.734f, 13.966f)
                lineTo(12.781f, 12.264f)
                curveTo(12.175f, 11.181f, 10.866f, 10.707f, 9.707f, 11.15f)
                lineTo(9.041f, 11.405f)
                curveTo(8.718f, 11.528f, 8.422f, 11.471f, 8.253f, 11.306f)
                curveTo(7.688f, 10.75f, 7.284f, 9.997f, 7.101f, 9.185f)
                curveTo(7.043f, 8.929f, 7.16f, 8.627f, 7.443f, 8.414f)
                lineTo(8.044f, 7.96f)
                curveTo(9.049f, 7.202f, 9.333f, 5.814f, 8.707f, 4.721f)
                lineTo(7.735f, 3.026f)
                curveTo(7.475f, 2.573f, 7.042f, 2.244f, 6.535f, 2.116f)
                close()
                moveTo(3.041f, 4.97f)
                curveTo(3.061f, 4.196f, 3.453f, 3.643f, 4.039f, 3.315f)
                curveTo(4.641f, 2.978f, 5.463f, 2.876f, 6.29f, 3.085f)
                curveTo(6.534f, 3.147f, 6.742f, 3.305f, 6.868f, 3.524f)
                lineTo(7.839f, 5.219f)
                curveTo(8.215f, 5.874f, 8.045f, 6.707f, 7.442f, 7.162f)
                lineTo(6.841f, 7.616f)
                curveTo(6.321f, 8.008f, 5.962f, 8.68f, 6.125f, 9.405f)
                curveTo(6.347f, 10.387f, 6.838f, 11.318f, 7.552f, 12.019f)
                curveTo(8.074f, 12.531f, 8.818f, 12.561f, 9.398f, 12.339f)
                lineTo(10.064f, 12.084f)
                curveTo(10.759f, 11.818f, 11.545f, 12.102f, 11.908f, 12.752f)
                lineTo(12.862f, 14.455f)
                curveTo(12.982f, 14.669f, 13.002f, 14.925f, 12.917f, 15.155f)
                curveTo(12.627f, 15.94f, 12.083f, 16.529f, 11.472f, 16.81f)
                curveTo(10.875f, 17.085f, 10.2f, 17.077f, 9.561f, 16.65f)
                curveTo(8.19f, 15.736f, 6.49f, 14.168f, 4.932f, 11.497f)
                curveTo(3.369f, 8.817f, 2.999f, 6.583f, 3.041f, 4.97f)
                close()
                moveTo(12.743f, 2.062f)
                curveTo(12.501f, 1.928f, 12.197f, 2.015f, 12.063f, 2.256f)
                curveTo(11.929f, 2.498f, 12.016f, 2.802f, 12.257f, 2.936f)
                lineTo(12.641f, 3.15f)
                curveTo(15.076f, 4.503f, 16.694f, 6.963f, 16.971f, 9.734f)
                lineTo(17.003f, 10.049f)
                curveTo(17.03f, 10.324f, 17.275f, 10.524f, 17.55f, 10.497f)
                curveTo(17.824f, 10.469f, 18.025f, 10.224f, 17.997f, 9.95f)
                lineTo(17.966f, 9.635f)
                curveTo(17.656f, 6.537f, 15.848f, 3.787f, 13.127f, 2.276f)
                lineTo(12.743f, 2.062f)
                close()
                moveTo(11.571f, 4.742f)
                curveTo(11.713f, 4.505f, 12.021f, 4.429f, 12.257f, 4.571f)
                lineTo(12.381f, 4.645f)
                curveTo(14.014f, 5.625f, 15.136f, 7.272f, 15.449f, 9.15f)
                lineTo(15.493f, 9.417f)
                curveTo(15.539f, 9.69f, 15.355f, 9.947f, 15.082f, 9.993f)
                curveTo(14.81f, 10.038f, 14.552f, 9.854f, 14.507f, 9.582f)
                lineTo(14.462f, 9.315f)
                curveTo(14.197f, 7.725f, 13.249f, 6.332f, 11.867f, 5.503f)
                lineTo(11.743f, 5.428f)
                curveTo(11.506f, 5.286f, 11.429f, 4.979f, 11.571f, 4.742f)
                close()
            }
        }
        .build()
        return _callConnecting!!
    }

@Suppress("ObjectPropertyName")
private var _callConnecting: ImageVector? = null

@Preview
@Composable
private fun CallConnectingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CallConnecting, contentDescription = null)
    }
}

