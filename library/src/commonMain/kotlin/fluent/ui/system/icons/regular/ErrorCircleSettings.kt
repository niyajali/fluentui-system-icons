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
 * ErrorCircleSettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: error, circle, settings
 * - Source: ic_fluent_error_circle_settings_20_regular.svg
 * 
 * @return The [ImageVector] for the ErrorCircleSettings icon.
 */
public val FluentIcons.Regular.ErrorCircleSettings: ImageVector
    get() {
        if (_errorCircleSettings != null) {
            return _errorCircleSettings!!
        }
        _errorCircleSettings = Builder(name = "ErrorCircleSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                curveTo(18.0f, 5.582f, 14.418f, 2.0f, 10.0f, 2.0f)
                curveTo(5.582f, 2.0f, 2.0f, 5.582f, 2.0f, 10.0f)
                curveTo(2.0f, 14.418f, 5.582f, 18.0f, 10.0f, 18.0f)
                curveTo(10.198f, 18.0f, 10.394f, 17.993f, 10.589f, 17.979f)
                curveTo(10.431f, 17.667f, 10.303f, 17.339f, 10.206f, 16.997f)
                curveTo(10.138f, 16.999f, 10.069f, 17.0f, 10.0f, 17.0f)
                curveTo(6.134f, 17.0f, 3.0f, 13.866f, 3.0f, 10.0f)
                curveTo(3.0f, 6.134f, 6.134f, 3.0f, 10.0f, 3.0f)
                curveTo(13.866f, 3.0f, 17.0f, 6.134f, 17.0f, 10.0f)
                curveTo(17.0f, 10.069f, 16.999f, 10.138f, 16.997f, 10.206f)
                curveTo(17.339f, 10.303f, 17.667f, 10.431f, 17.979f, 10.589f)
                curveTo(17.993f, 10.394f, 18.0f, 10.198f, 18.0f, 10.0f)
                close()
                moveTo(10.658f, 12.889f)
                curveTo(10.53f, 12.657f, 10.283f, 12.5f, 10.0f, 12.5f)
                curveTo(9.586f, 12.5f, 9.25f, 12.836f, 9.25f, 13.25f)
                curveTo(9.25f, 13.664f, 9.586f, 14.0f, 10.0f, 14.0f)
                curveTo(10.075f, 14.0f, 10.148f, 13.989f, 10.216f, 13.968f)
                curveTo(10.325f, 13.59f, 10.474f, 13.229f, 10.658f, 12.889f)
                close()
                moveTo(10.492f, 6.41f)
                curveTo(10.45f, 6.177f, 10.245f, 6.0f, 10.0f, 6.0f)
                curveTo(9.724f, 6.0f, 9.5f, 6.224f, 9.5f, 6.5f)
                verticalLineTo(11.0f)
                lineTo(9.508f, 11.09f)
                curveTo(9.55f, 11.323f, 9.755f, 11.5f, 10.0f, 11.5f)
                curveTo(10.276f, 11.5f, 10.5f, 11.276f, 10.5f, 11.0f)
                verticalLineTo(6.5f)
                lineTo(10.492f, 6.41f)
                close()
                moveTo(11.635f, 14.92f)
                curveTo(12.723f, 14.642f, 13.369f, 13.523f, 13.066f, 12.442f)
                lineTo(12.91f, 11.885f)
                curveTo(13.164f, 11.69f, 13.439f, 11.523f, 13.731f, 11.388f)
                lineTo(14.069f, 11.746f)
                curveTo(14.858f, 12.583f, 16.188f, 12.584f, 16.978f, 11.747f)
                lineTo(17.303f, 11.404f)
                curveTo(17.601f, 11.544f, 17.881f, 11.718f, 18.138f, 11.922f)
                lineTo(18.012f, 12.344f)
                curveTo(17.682f, 13.446f, 18.348f, 14.598f, 19.468f, 14.863f)
                lineTo(19.817f, 14.946f)
                curveTo(19.838f, 15.127f, 19.849f, 15.312f, 19.849f, 15.5f)
                curveTo(19.849f, 15.656f, 19.842f, 15.81f, 19.827f, 15.962f)
                lineTo(19.366f, 16.08f)
                curveTo(18.278f, 16.358f, 17.632f, 17.477f, 17.936f, 18.558f)
                lineTo(18.092f, 19.114f)
                curveTo(17.838f, 19.31f, 17.562f, 19.477f, 17.27f, 19.612f)
                lineTo(16.933f, 19.254f)
                curveTo(16.144f, 18.417f, 14.813f, 18.416f, 14.023f, 19.253f)
                lineTo(13.698f, 19.597f)
                curveTo(13.4f, 19.456f, 13.12f, 19.282f, 12.863f, 19.079f)
                lineTo(12.99f, 18.656f)
                curveTo(13.319f, 17.554f, 12.653f, 16.402f, 11.534f, 16.137f)
                lineTo(11.184f, 16.054f)
                curveTo(11.163f, 15.873f, 11.151f, 15.688f, 11.151f, 15.5f)
                curveTo(11.151f, 15.344f, 11.159f, 15.19f, 11.174f, 15.038f)
                lineTo(11.635f, 14.92f)
                close()
                moveTo(16.5f, 15.5f)
                curveTo(16.5f, 14.948f, 16.053f, 14.5f, 15.5f, 14.5f)
                curveTo(14.948f, 14.5f, 14.5f, 14.948f, 14.5f, 15.5f)
                curveTo(14.5f, 16.052f, 14.948f, 16.5f, 15.5f, 16.5f)
                curveTo(16.053f, 16.5f, 16.5f, 16.052f, 16.5f, 15.5f)
                close()
            }
        }
        .build()
        return _errorCircleSettings!!
    }

@Suppress("ObjectPropertyName")
private var _errorCircleSettings: ImageVector? = null

@Preview
@Composable
private fun ErrorCircleSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ErrorCircleSettings, contentDescription = null)
    }
}

