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
 * CallWarning Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in call transferring issues.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_call_warning_20_regular.svg)
 * 
 * @return The [ImageVector] for the CallWarning icon.
 */
public val FluentIcons.Regular.CallWarning: ImageVector
    get() {
        if (_callWarning != null) {
            return _callWarning!!
        }
        _callWarning = Builder(name = "CallWarning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.603f, 1.554f)
                lineTo(9.107f, 8.552f)
                curveTo(8.774f, 9.217f, 9.258f, 10.0f, 10.002f, 10.0f)
                horizontalLineTo(16.998f)
                curveTo(17.742f, 10.0f, 18.226f, 9.217f, 17.893f, 8.552f)
                lineTo(14.394f, 1.553f)
                curveTo(14.025f, 0.815f, 12.972f, 0.816f, 12.603f, 1.554f)
                close()
                moveTo(13.998f, 3.495f)
                verticalLineTo(6.497f)
                curveTo(13.998f, 6.774f, 13.774f, 6.998f, 13.498f, 6.998f)
                curveTo(13.222f, 6.998f, 12.998f, 6.774f, 12.998f, 6.497f)
                verticalLineTo(3.495f)
                curveTo(12.998f, 3.219f, 13.222f, 2.995f, 13.498f, 2.995f)
                curveTo(13.774f, 2.995f, 13.998f, 3.219f, 13.998f, 3.495f)
                close()
                moveTo(13.498f, 8.999f)
                curveTo(13.222f, 8.999f, 12.998f, 8.775f, 12.998f, 8.499f)
                curveTo(12.998f, 8.223f, 13.222f, 7.999f, 13.498f, 7.999f)
                curveTo(13.774f, 7.999f, 13.998f, 8.223f, 13.998f, 8.499f)
                curveTo(13.998f, 8.775f, 13.774f, 8.999f, 13.498f, 8.999f)
                close()
                moveTo(3.551f, 2.443f)
                curveTo(4.405f, 1.965f, 5.494f, 1.853f, 6.535f, 2.116f)
                curveTo(7.042f, 2.245f, 7.475f, 2.573f, 7.735f, 3.027f)
                lineTo(8.707f, 4.722f)
                curveTo(9.333f, 5.814f, 9.049f, 7.202f, 8.044f, 7.961f)
                lineTo(7.443f, 8.415f)
                curveTo(7.16f, 8.628f, 7.043f, 8.93f, 7.101f, 9.185f)
                curveTo(7.284f, 9.997f, 7.688f, 10.751f, 8.253f, 11.306f)
                curveTo(8.422f, 11.472f, 8.718f, 11.529f, 9.041f, 11.405f)
                lineTo(9.707f, 11.151f)
                curveTo(10.866f, 10.707f, 12.175f, 11.181f, 12.781f, 12.264f)
                lineTo(13.734f, 13.967f)
                curveTo(13.998f, 14.436f, 14.042f, 14.998f, 13.855f, 15.503f)
                curveTo(13.484f, 16.506f, 12.769f, 17.314f, 11.89f, 17.719f)
                curveTo(10.997f, 18.131f, 9.952f, 18.114f, 9.006f, 17.483f)
                curveTo(7.508f, 16.484f, 5.703f, 14.804f, 4.068f, 12.002f)
                curveTo(2.412f, 9.163f, 1.995f, 6.745f, 2.042f, 4.944f)
                curveTo(2.072f, 3.79f, 2.682f, 2.929f, 3.551f, 2.443f)
                close()
                moveTo(4.039f, 3.315f)
                curveTo(3.453f, 3.644f, 3.061f, 4.197f, 3.041f, 4.97f)
                curveTo(2.999f, 6.584f, 3.369f, 8.818f, 4.932f, 11.498f)
                curveTo(6.49f, 14.169f, 8.19f, 15.737f, 9.561f, 16.651f)
                curveTo(10.2f, 17.078f, 10.875f, 17.086f, 11.472f, 16.811f)
                curveTo(12.083f, 16.53f, 12.627f, 15.94f, 12.917f, 15.156f)
                curveTo(13.002f, 14.925f, 12.982f, 14.67f, 12.862f, 14.455f)
                lineTo(11.908f, 12.753f)
                curveTo(11.545f, 12.103f, 10.759f, 11.819f, 10.064f, 12.085f)
                lineTo(9.398f, 12.339f)
                curveTo(8.818f, 12.561f, 8.074f, 12.532f, 7.552f, 12.02f)
                curveTo(6.838f, 11.318f, 6.347f, 10.388f, 6.125f, 9.405f)
                curveTo(5.962f, 8.681f, 6.321f, 8.008f, 6.841f, 7.616f)
                lineTo(7.442f, 7.163f)
                curveTo(8.045f, 6.708f, 8.215f, 5.875f, 7.839f, 5.219f)
                lineTo(6.868f, 3.524f)
                curveTo(6.742f, 3.306f, 6.534f, 3.148f, 6.29f, 3.086f)
                curveTo(5.463f, 2.876f, 4.641f, 2.979f, 4.039f, 3.315f)
                close()
            }
        }
        .build()
        return _callWarning!!
    }

@Suppress("ObjectPropertyName")
private var _callWarning: ImageVector? = null

@Preview
@Composable
private fun CallWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CallWarning, contentDescription = "CallWarning Icon")
    }
}

