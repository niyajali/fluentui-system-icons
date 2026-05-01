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
 * LightbulbPulse Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in tooltip, sharing knowledge, or AI suggested scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_lightbulb_pulse_24_regular.svg)
 * 
 * @return The [ImageVector] for the LightbulbPulse icon.
 */
public val FluentIcons.Regular.LightbulbPulse: ImageVector
    get() {
        if (_lightbulbPulse != null) {
            return _lightbulbPulse!!
        }
        _lightbulbPulse = Builder(name = "LightbulbPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.272f, 12.5f)
                curveTo(7.593f, 12.983f, 7.988f, 13.457f, 8.462f, 13.92f)
                curveTo(8.726f, 14.178f, 8.922f, 14.496f, 9.033f, 14.846f)
                lineTo(9.082f, 15.023f)
                lineTo(9.537f, 16.999f)
                horizontalLineTo(14.46f)
                lineTo(14.918f, 15.023f)
                curveTo(15.001f, 14.663f, 15.171f, 14.331f, 15.411f, 14.054f)
                lineTo(15.537f, 13.92f)
                curveTo(16.011f, 13.457f, 16.407f, 12.983f, 16.728f, 12.5f)
                horizontalLineTo(18.46f)
                curveTo(18.018f, 13.371f, 17.394f, 14.204f, 16.586f, 14.993f)
                curveTo(16.509f, 15.068f, 16.45f, 15.158f, 16.411f, 15.258f)
                lineTo(16.379f, 15.36f)
                lineTo(15.248f, 20.256f)
                curveTo(15.025f, 21.22f, 14.203f, 21.919f, 13.229f, 21.993f)
                lineTo(13.056f, 22.0f)
                horizontalLineTo(10.942f)
                curveTo(9.953f, 22.0f, 9.087f, 21.354f, 8.795f, 20.423f)
                lineTo(8.75f, 20.256f)
                lineTo(7.62f, 15.36f)
                curveTo(7.588f, 15.221f, 7.516f, 15.093f, 7.414f, 14.993f)
                curveTo(6.606f, 14.204f, 5.98f, 13.371f, 5.538f, 12.5f)
                horizontalLineTo(7.272f)
                close()
                moveTo(10.212f, 19.918f)
                curveTo(10.283f, 20.224f, 10.535f, 20.45f, 10.839f, 20.492f)
                lineTo(10.942f, 20.5f)
                horizontalLineTo(13.056f)
                curveTo(13.37f, 20.5f, 13.647f, 20.305f, 13.757f, 20.018f)
                lineTo(13.787f, 19.918f)
                lineTo(14.114f, 18.499f)
                horizontalLineTo(9.883f)
                lineTo(10.212f, 19.918f)
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
                moveTo(11.999f, 2.001f)
                curveTo(15.919f, 2.001f, 19.11f, 5.112f, 19.242f, 9.0f)
                horizontalLineTo(17.743f)
                curveTo(17.612f, 5.941f, 15.091f, 3.501f, 11.999f, 3.501f)
                curveTo(8.907f, 3.501f, 6.386f, 5.941f, 6.255f, 9.0f)
                horizontalLineTo(4.754f)
                curveTo(4.886f, 5.112f, 8.079f, 2.001f, 11.999f, 2.001f)
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
        Image(imageVector = FluentIcons.Regular.LightbulbPulse, contentDescription = "LightbulbPulse Icon")
    }
}

