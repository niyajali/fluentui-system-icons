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
 * WrenchSettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: wrench, settings
 * - Source: ic_fluent_wrench_settings_24_regular.svg
 * 
 * @return The [ImageVector] for the WrenchSettings icon.
 */
public val FluentIcons.Regular.WrenchSettings: ImageVector
    get() {
        if (_wrenchSettings != null) {
            return _wrenchSettings!!
        }
        _wrenchSettings = Builder(name = "WrenchSettings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 2.0f)
                curveTo(13.463f, 2.0f, 11.0f, 4.462f, 11.0f, 7.5f)
                curveTo(11.0f, 7.943f, 11.053f, 8.375f, 11.152f, 8.789f)
                lineTo(2.841f, 17.1f)
                curveTo(1.72f, 18.222f, 1.72f, 20.04f, 2.841f, 21.161f)
                curveTo(3.962f, 22.282f, 5.78f, 22.282f, 6.902f, 21.161f)
                lineTo(11.016f, 17.047f)
                curveTo(11.1f, 15.826f, 11.521f, 14.697f, 12.188f, 13.754f)
                lineTo(5.841f, 20.1f)
                curveTo(5.305f, 20.636f, 4.437f, 20.636f, 3.902f, 20.1f)
                curveTo(3.366f, 19.565f, 3.366f, 18.697f, 3.902f, 18.161f)
                lineTo(12.525f, 9.538f)
                curveTo(12.726f, 9.337f, 12.796f, 9.039f, 12.706f, 8.77f)
                curveTo(12.573f, 8.372f, 12.5f, 7.945f, 12.5f, 7.5f)
                curveTo(12.5f, 5.291f, 14.291f, 3.5f, 16.5f, 3.5f)
                curveTo(16.642f, 3.5f, 16.781f, 3.507f, 16.918f, 3.522f)
                lineTo(15.074f, 5.366f)
                curveTo(14.585f, 5.854f, 14.585f, 6.646f, 15.074f, 7.134f)
                lineTo(16.867f, 8.927f)
                curveTo(17.355f, 9.415f, 18.146f, 9.415f, 18.634f, 8.927f)
                lineTo(20.479f, 7.082f)
                curveTo(20.493f, 7.22f, 20.5f, 7.359f, 20.5f, 7.5f)
                curveTo(20.5f, 9.046f, 19.623f, 10.388f, 18.338f, 11.054f)
                curveTo(18.99f, 11.137f, 19.612f, 11.318f, 20.188f, 11.58f)
                curveTo(21.301f, 10.574f, 22.0f, 9.119f, 22.0f, 7.5f)
                curveTo(22.0f, 6.733f, 21.843f, 6.002f, 21.558f, 5.337f)
                curveTo(21.46f, 5.108f, 21.255f, 4.942f, 21.011f, 4.895f)
                curveTo(20.766f, 4.848f, 20.514f, 4.925f, 20.338f, 5.101f)
                lineTo(17.75f, 7.689f)
                lineTo(16.311f, 6.25f)
                lineTo(18.899f, 3.662f)
                curveTo(19.075f, 3.486f, 19.152f, 3.234f, 19.105f, 2.99f)
                curveTo(19.058f, 2.745f, 18.893f, 2.54f, 18.664f, 2.442f)
                curveTo(17.999f, 2.157f, 17.267f, 2.0f, 16.5f, 2.0f)
                close()
                moveTo(14.277f, 13.976f)
                curveTo(14.592f, 15.066f, 13.938f, 16.199f, 12.836f, 16.472f)
                lineTo(12.252f, 16.616f)
                curveTo(12.207f, 16.904f, 12.184f, 17.199f, 12.184f, 17.5f)
                curveTo(12.184f, 17.815f, 12.209f, 18.123f, 12.258f, 18.424f)
                lineTo(12.798f, 18.553f)
                curveTo(13.91f, 18.821f, 14.571f, 19.966f, 14.248f, 21.064f)
                lineTo(14.061f, 21.695f)
                curveTo(14.5f, 22.081f, 15.001f, 22.394f, 15.545f, 22.617f)
                lineTo(16.039f, 22.098f)
                curveTo(16.827f, 21.269f, 18.15f, 21.269f, 18.938f, 22.098f)
                lineTo(19.437f, 22.623f)
                curveTo(19.98f, 22.403f, 20.48f, 22.093f, 20.919f, 21.71f)
                lineTo(20.721f, 21.024f)
                curveTo(20.407f, 19.934f, 21.061f, 18.801f, 22.163f, 18.528f)
                lineTo(22.746f, 18.384f)
                curveTo(22.791f, 18.096f, 22.815f, 17.801f, 22.815f, 17.5f)
                curveTo(22.815f, 17.185f, 22.789f, 16.877f, 22.74f, 16.576f)
                lineTo(22.201f, 16.447f)
                curveTo(21.088f, 16.179f, 20.427f, 15.034f, 20.751f, 13.936f)
                lineTo(20.937f, 13.305f)
                curveTo(20.498f, 12.92f, 19.997f, 12.606f, 19.453f, 12.384f)
                lineTo(18.96f, 12.902f)
                curveTo(18.171f, 13.731f, 16.849f, 13.731f, 16.061f, 12.902f)
                lineTo(15.562f, 12.377f)
                curveTo(15.018f, 12.597f, 14.518f, 12.907f, 14.079f, 13.289f)
                lineTo(14.277f, 13.976f)
                close()
                moveTo(17.499f, 19.0f)
                curveTo(16.698f, 19.0f, 16.049f, 18.329f, 16.049f, 17.5f)
                curveTo(16.049f, 16.672f, 16.698f, 16.0f, 17.499f, 16.0f)
                curveTo(18.3f, 16.0f, 18.949f, 16.672f, 18.949f, 17.5f)
                curveTo(18.949f, 18.329f, 18.3f, 19.0f, 17.499f, 19.0f)
                close()
            }
        }
        .build()
        return _wrenchSettings!!
    }

@Suppress("ObjectPropertyName")
private var _wrenchSettings: ImageVector? = null

@Preview
@Composable
private fun WrenchSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WrenchSettings, contentDescription = null)
    }
}

