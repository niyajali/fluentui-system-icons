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
 * LightbulbPulse Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in tooltip, sharing knowledge, or AI suggested scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_lightbulb_pulse_24_filled.svg)
 * 
 * @return The [ImageVector] for the LightbulbPulse icon.
 */
public val FluentIcons.Filled.LightbulbPulse: ImageVector
    get() {
        if (_lightbulbPulse != null) {
            return _lightbulbPulse!!
        }
        _lightbulbPulse = Builder(name = "LightbulbPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.248f, 20.258f)
                curveTo(15.025f, 21.221f, 14.202f, 21.919f, 13.229f, 21.993f)
                lineTo(13.057f, 22.0f)
                horizontalLineTo(10.944f)
                curveTo(9.955f, 22.0f, 9.09f, 21.354f, 8.798f, 20.423f)
                lineTo(8.752f, 20.256f)
                lineTo(8.462f, 18.999f)
                horizontalLineTo(15.539f)
                lineTo(15.248f, 20.258f)
                close()
                moveTo(10.367f, 13.878f)
                curveTo(10.611f, 14.512f, 11.201f, 14.949f, 11.879f, 14.996f)
                curveTo(12.557f, 15.043f, 13.2f, 14.694f, 13.53f, 14.1f)
                lineTo(14.726f, 11.947f)
                curveTo(15.054f, 12.298f, 15.515f, 12.5f, 16.001f, 12.5f)
                horizontalLineTo(18.462f)
                curveTo(18.001f, 13.407f, 17.343f, 14.273f, 16.485f, 15.092f)
                curveTo(16.45f, 15.125f, 16.426f, 15.169f, 16.415f, 15.216f)
                lineTo(15.887f, 17.499f)
                horizontalLineTo(8.115f)
                lineTo(7.589f, 15.217f)
                curveTo(7.578f, 15.169f, 7.553f, 15.125f, 7.518f, 15.092f)
                curveTo(6.66f, 14.273f, 6.002f, 13.407f, 5.541f, 12.5f)
                horizontalLineTo(8.001f)
                curveTo(8.627f, 12.5f, 9.195f, 12.166f, 9.506f, 11.64f)
                lineTo(10.367f, 13.878f)
                close()
                moveTo(9.497f, 6.0f)
                curveTo(9.808f, 5.999f, 10.088f, 6.19f, 10.2f, 6.48f)
                lineTo(12.124f, 11.482f)
                lineTo(13.845f, 8.386f)
                lineTo(13.896f, 8.307f)
                curveTo(14.025f, 8.13f, 14.227f, 8.017f, 14.449f, 8.002f)
                curveTo(14.703f, 7.985f, 14.947f, 8.097f, 15.1f, 8.3f)
                lineTo(16.375f, 10.0f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 10.0f, 19.5f, 10.336f, 19.5f, 10.75f)
                curveTo(19.5f, 11.164f, 19.164f, 11.5f, 18.75f, 11.5f)
                horizontalLineTo(16.0f)
                curveTo(15.764f, 11.5f, 15.542f, 11.389f, 15.4f, 11.2f)
                lineTo(14.594f, 10.124f)
                lineTo(12.655f, 13.614f)
                curveTo(12.514f, 13.869f, 12.238f, 14.018f, 11.947f, 13.998f)
                curveTo(11.657f, 13.978f, 11.404f, 13.791f, 11.3f, 13.519f)
                lineTo(9.508f, 8.862f)
                lineTo(8.702f, 11.014f)
                curveTo(8.592f, 11.306f, 8.313f, 11.5f, 8.0f, 11.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 11.5f, 4.5f, 11.164f, 4.5f, 10.75f)
                curveTo(4.5f, 10.336f, 4.836f, 10.0f, 5.25f, 10.0f)
                horizontalLineTo(7.48f)
                lineTo(8.798f, 6.486f)
                lineTo(8.847f, 6.382f)
                curveTo(8.978f, 6.15f, 9.225f, 6.001f, 9.497f, 6.0f)
                close()
                moveTo(12.001f, 2.001f)
                curveTo(15.921f, 2.001f, 19.112f, 5.112f, 19.244f, 9.0f)
                horizontalLineTo(16.876f)
                lineTo(15.901f, 7.7f)
                curveTo(15.546f, 7.226f, 14.973f, 6.964f, 14.382f, 7.004f)
                curveTo(13.864f, 7.039f, 13.392f, 7.302f, 13.09f, 7.715f)
                lineTo(12.972f, 7.9f)
                lineTo(12.29f, 9.126f)
                lineTo(11.135f, 6.122f)
                curveTo(10.874f, 5.444f, 10.22f, 4.997f, 9.493f, 5.0f)
                curveTo(8.767f, 5.003f, 8.117f, 5.455f, 7.862f, 6.136f)
                lineTo(6.788f, 9.0f)
                horizontalLineTo(4.758f)
                curveTo(4.89f, 5.112f, 8.081f, 2.001f, 12.001f, 2.001f)
                close()
            }
        }
        .build()
        return _lightbulbPulse!!
    }

@Suppress("ObjectPropertyName")
private var _lightbulbPulse: ImageVector? = null

@Preview
@Composable
private fun LightbulbPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LightbulbPulse, contentDescription = "LightbulbPulse Icon")
    }
}

