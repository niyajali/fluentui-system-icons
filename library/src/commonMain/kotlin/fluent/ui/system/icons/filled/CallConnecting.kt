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
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: call, connecting
 * - Source: ic_fluent_call_connecting_20_filled.svg
 * 
 * @return The [ImageVector] for the CallConnecting icon.
 */
public val FluentIcons.Filled.CallConnecting: ImageVector
    get() {
        if (_callConnecting != null) {
            return _callConnecting!!
        }
        _callConnecting = Builder(name = "CallConnecting", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.551f, 2.442f)
                curveTo(4.405f, 1.964f, 5.494f, 1.852f, 6.535f, 2.116f)
                curveTo(7.042f, 2.244f, 7.475f, 2.573f, 7.735f, 3.026f)
                lineTo(8.633f, 4.592f)
                curveTo(9.298f, 5.752f, 8.933f, 7.23f, 7.804f, 7.946f)
                lineTo(7.014f, 8.448f)
                curveTo(6.687f, 8.655f, 6.567f, 8.972f, 6.642f, 9.223f)
                curveTo(6.91f, 10.121f, 7.503f, 11.118f, 8.155f, 11.8f)
                curveTo(8.349f, 12.002f, 8.705f, 12.051f, 9.053f, 11.848f)
                lineTo(9.49f, 11.593f)
                curveTo(10.697f, 10.889f, 12.248f, 11.311f, 12.931f, 12.531f)
                lineTo(13.734f, 13.966f)
                curveTo(13.998f, 14.436f, 14.042f, 14.997f, 13.855f, 15.502f)
                curveTo(13.484f, 16.505f, 12.769f, 17.313f, 11.89f, 17.719f)
                curveTo(10.997f, 18.13f, 9.952f, 18.114f, 9.006f, 17.482f)
                curveTo(7.508f, 16.484f, 5.703f, 14.804f, 4.068f, 12.001f)
                curveTo(2.412f, 9.162f, 1.995f, 6.745f, 2.042f, 4.943f)
                curveTo(2.072f, 3.79f, 2.682f, 2.928f, 3.551f, 2.442f)
                close()
                moveTo(12.743f, 2.062f)
                curveTo(12.501f, 1.928f, 12.197f, 2.015f, 12.063f, 2.256f)
                curveTo(11.929f, 2.498f, 12.016f, 2.802f, 12.257f, 2.936f)
                lineTo(12.641f, 3.15f)
                curveTo(15.076f, 4.502f, 16.694f, 6.962f, 16.971f, 9.734f)
                lineTo(17.003f, 10.049f)
                curveTo(17.03f, 10.324f, 17.275f, 10.524f, 17.55f, 10.497f)
                curveTo(17.824f, 10.469f, 18.025f, 10.224f, 17.997f, 9.95f)
                lineTo(17.966f, 9.635f)
                curveTo(17.656f, 6.537f, 15.848f, 3.787f, 13.127f, 2.275f)
                lineTo(12.743f, 2.062f)
                close()
                moveTo(11.571f, 4.742f)
                curveTo(11.713f, 4.505f, 12.021f, 4.428f, 12.257f, 4.571f)
                lineTo(12.381f, 4.645f)
                curveTo(14.014f, 5.625f, 15.136f, 7.272f, 15.449f, 9.15f)
                lineTo(15.493f, 9.417f)
                curveTo(15.539f, 9.689f, 15.355f, 9.947f, 15.082f, 9.992f)
                curveTo(14.81f, 10.038f, 14.552f, 9.854f, 14.507f, 9.581f)
                lineTo(14.462f, 9.314f)
                curveTo(14.197f, 7.725f, 13.249f, 6.332f, 11.867f, 5.502f)
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
        Image(imageVector = FluentIcons.Filled.CallConnecting, contentDescription = null)
    }
}

