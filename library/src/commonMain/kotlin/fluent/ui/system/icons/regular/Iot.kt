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
 * IoT Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent devices with sensors, software, and other technology that shares data with other devices.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_iot_24_regular.svg)
 * 
 * @return The [ImageVector] for the IoT icon.
 */
public val FluentIcons.Regular.IoT: ImageVector
    get() {
        if (_ioT != null) {
            return _ioT!!
        }
        _ioT = Builder(name = "IoT", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 4.492f)
                curveTo(19.0f, 5.873f, 17.881f, 6.992f, 16.5f, 6.992f)
                curveTo(16.325f, 6.992f, 16.153f, 6.974f, 15.988f, 6.94f)
                lineTo(14.708f, 9.057f)
                curveTo(15.502f, 9.788f, 16.0f, 10.836f, 16.0f, 12.001f)
                curveTo(16.0f, 12.02f, 16.0f, 12.04f, 16.0f, 12.059f)
                lineTo(17.296f, 12.32f)
                curveTo(17.718f, 11.535f, 18.546f, 11.001f, 19.5f, 11.001f)
                curveTo(20.881f, 11.001f, 22.0f, 12.12f, 22.0f, 13.501f)
                curveTo(22.0f, 14.881f, 20.881f, 16.001f, 19.5f, 16.001f)
                curveTo(18.218f, 16.001f, 17.162f, 15.036f, 17.017f, 13.794f)
                lineTo(15.698f, 13.528f)
                curveTo(15.353f, 14.362f, 14.735f, 15.054f, 13.954f, 15.492f)
                lineTo(14.45f, 17.003f)
                curveTo(14.466f, 17.003f, 14.483f, 17.003f, 14.5f, 17.003f)
                curveTo(15.881f, 17.003f, 17.0f, 18.122f, 17.0f, 19.503f)
                curveTo(17.0f, 20.884f, 15.881f, 22.003f, 14.5f, 22.003f)
                curveTo(13.119f, 22.003f, 12.0f, 20.884f, 12.0f, 19.503f)
                curveTo(12.0f, 18.673f, 12.405f, 17.937f, 13.028f, 17.482f)
                lineTo(12.531f, 15.966f)
                curveTo(12.358f, 15.989f, 12.18f, 16.001f, 12.0f, 16.001f)
                curveTo(10.679f, 16.001f, 9.508f, 15.36f, 8.779f, 14.373f)
                lineTo(6.985f, 15.221f)
                curveTo(6.995f, 15.313f, 7.0f, 15.406f, 7.0f, 15.501f)
                curveTo(7.0f, 16.881f, 5.881f, 18.001f, 4.5f, 18.001f)
                curveTo(3.119f, 18.001f, 2.0f, 16.881f, 2.0f, 15.501f)
                curveTo(2.0f, 14.12f, 3.119f, 13.001f, 4.5f, 13.001f)
                curveTo(5.248f, 13.001f, 5.919f, 13.329f, 6.377f, 13.849f)
                lineTo(8.131f, 13.02f)
                curveTo(8.046f, 12.695f, 8.0f, 12.353f, 8.0f, 12.001f)
                curveTo(8.0f, 11.033f, 8.344f, 10.146f, 8.915f, 9.454f)
                lineTo(7.924f, 8.325f)
                curveTo(7.638f, 8.438f, 7.326f, 8.501f, 7.0f, 8.501f)
                curveTo(5.619f, 8.501f, 4.5f, 7.381f, 4.5f, 6.001f)
                curveTo(4.5f, 4.62f, 5.619f, 3.501f, 7.0f, 3.501f)
                curveTo(8.381f, 3.501f, 9.5f, 4.62f, 9.5f, 6.001f)
                curveTo(9.5f, 6.509f, 9.348f, 6.982f, 9.088f, 7.377f)
                lineTo(10.07f, 8.496f)
                curveTo(10.643f, 8.18f, 11.3f, 8.001f, 12.0f, 8.001f)
                curveTo(12.505f, 8.001f, 12.989f, 8.094f, 13.434f, 8.266f)
                lineTo(14.679f, 6.205f)
                curveTo(14.258f, 5.758f, 14.0f, 5.155f, 14.0f, 4.492f)
                curveTo(14.0f, 3.111f, 15.119f, 1.992f, 16.5f, 1.992f)
                curveTo(17.881f, 1.992f, 19.0f, 3.111f, 19.0f, 4.492f)
                close()
                moveTo(17.5f, 4.492f)
                curveTo(17.5f, 3.94f, 17.052f, 3.492f, 16.5f, 3.492f)
                curveTo(15.948f, 3.492f, 15.5f, 3.94f, 15.5f, 4.492f)
                curveTo(15.5f, 5.044f, 15.948f, 5.492f, 16.5f, 5.492f)
                curveTo(17.052f, 5.492f, 17.5f, 5.044f, 17.5f, 4.492f)
                close()
                moveTo(7.0f, 7.001f)
                curveTo(7.552f, 7.001f, 8.0f, 6.553f, 8.0f, 6.001f)
                curveTo(8.0f, 5.448f, 7.552f, 5.001f, 7.0f, 5.001f)
                curveTo(6.448f, 5.001f, 6.0f, 5.448f, 6.0f, 6.001f)
                curveTo(6.0f, 6.553f, 6.448f, 7.001f, 7.0f, 7.001f)
                close()
                moveTo(12.0f, 14.501f)
                curveTo(13.381f, 14.501f, 14.5f, 13.381f, 14.5f, 12.001f)
                curveTo(14.5f, 10.62f, 13.381f, 9.501f, 12.0f, 9.501f)
                curveTo(10.619f, 9.501f, 9.5f, 10.62f, 9.5f, 12.001f)
                curveTo(9.5f, 13.381f, 10.619f, 14.501f, 12.0f, 14.501f)
                close()
                moveTo(5.5f, 15.501f)
                curveTo(5.5f, 14.948f, 5.052f, 14.501f, 4.5f, 14.501f)
                curveTo(3.948f, 14.501f, 3.5f, 14.948f, 3.5f, 15.501f)
                curveTo(3.5f, 16.053f, 3.948f, 16.501f, 4.5f, 16.501f)
                curveTo(5.052f, 16.501f, 5.5f, 16.053f, 5.5f, 15.501f)
                close()
                moveTo(15.5f, 19.503f)
                curveTo(15.5f, 18.951f, 15.052f, 18.503f, 14.5f, 18.503f)
                curveTo(13.948f, 18.503f, 13.5f, 18.951f, 13.5f, 19.503f)
                curveTo(13.5f, 20.055f, 13.948f, 20.503f, 14.5f, 20.503f)
                curveTo(15.052f, 20.503f, 15.5f, 20.055f, 15.5f, 19.503f)
                close()
                moveTo(19.5f, 14.501f)
                curveTo(20.052f, 14.501f, 20.5f, 14.053f, 20.5f, 13.501f)
                curveTo(20.5f, 12.948f, 20.052f, 12.501f, 19.5f, 12.501f)
                curveTo(18.948f, 12.501f, 18.5f, 12.948f, 18.5f, 13.501f)
                curveTo(18.5f, 14.053f, 18.948f, 14.501f, 19.5f, 14.501f)
                close()
            }
        }
        .build()
        return _ioT!!
    }

@Suppress("ObjectPropertyName")
private var _ioT: ImageVector? = null

@Preview
@Composable
private fun IoTPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.IoT, contentDescription = "IoT Icon")
    }
}

