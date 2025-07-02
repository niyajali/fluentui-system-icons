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
 * AppsSettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: apps, settings
 * - Source: ic_fluent_apps_settings_20_regular.svg
 * 
 * @return The [ImageVector] for the AppsSettings icon.
 */
public val FluentIcons.Regular.AppsSettings: ImageVector
    get() {
        if (_appsSettings != null) {
            return _appsSettings!!
        }
        _appsSettings = Builder(name = "AppsSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 17.0f)
                horizontalLineTo(10.401f)
                curveTo(10.563f, 16.683f, 10.695f, 16.349f, 10.793f, 16.0f)
                horizontalLineTo(15.5f)
                curveTo(15.746f, 16.0f, 15.95f, 15.823f, 15.992f, 15.59f)
                lineTo(16.0f, 15.5f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 10.755f, 15.823f, 10.55f, 15.59f, 10.508f)
                lineTo(15.5f, 10.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(12.205f)
                curveTo(10.248f, 11.658f, 9.909f, 11.158f, 9.5f, 10.725f)
                verticalLineTo(10.5f)
                horizontalLineTo(9.275f)
                curveTo(8.842f, 10.091f, 8.343f, 9.752f, 7.795f, 9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(4.5f)
                curveTo(9.5f, 4.285f, 9.365f, 4.102f, 9.175f, 4.031f)
                lineTo(9.09f, 4.008f)
                lineTo(9.0f, 4.0f)
                horizontalLineTo(4.5f)
                curveTo(4.255f, 4.0f, 4.051f, 4.177f, 4.008f, 4.41f)
                lineTo(4.0f, 4.5f)
                verticalLineTo(9.207f)
                curveTo(3.652f, 9.306f, 3.317f, 9.438f, 3.0f, 9.6f)
                verticalLineTo(4.5f)
                curveTo(3.0f, 3.72f, 3.595f, 3.079f, 4.356f, 3.007f)
                lineTo(4.5f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.78f, 3.0f, 10.421f, 3.595f, 10.493f, 4.355f)
                lineTo(10.5f, 4.5f)
                verticalLineTo(4.754f)
                lineTo(12.689f, 2.485f)
                curveTo(13.228f, 1.926f, 14.096f, 1.876f, 14.696f, 2.347f)
                lineTo(14.812f, 2.448f)
                lineTo(17.57f, 5.173f)
                curveTo(18.122f, 5.719f, 18.162f, 6.588f, 17.68f, 7.184f)
                lineTo(17.577f, 7.3f)
                lineTo(15.266f, 9.499f)
                lineTo(15.5f, 9.5f)
                curveTo(16.28f, 9.5f, 16.921f, 10.095f, 16.993f, 10.856f)
                lineTo(17.0f, 11.0f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 16.28f, 16.406f, 16.92f, 15.645f, 16.993f)
                lineTo(15.5f, 17.0f)
                close()
                moveTo(10.5f, 7.709f)
                verticalLineTo(9.499f)
                horizontalLineTo(12.29f)
                lineTo(10.5f, 7.709f)
                close()
                moveTo(14.123f, 3.173f)
                curveTo(13.94f, 2.996f, 13.67f, 2.981f, 13.477f, 3.12f)
                lineTo(13.409f, 3.179f)
                lineTo(10.793f, 5.893f)
                curveTo(10.627f, 6.065f, 10.609f, 6.325f, 10.736f, 6.516f)
                lineTo(10.799f, 6.594f)
                lineTo(13.415f, 9.209f)
                curveTo(13.583f, 9.377f, 13.841f, 9.401f, 14.035f, 9.279f)
                lineTo(14.113f, 9.218f)
                lineTo(16.871f, 6.591f)
                curveTo(17.044f, 6.417f, 17.061f, 6.147f, 16.925f, 5.953f)
                lineTo(16.867f, 5.884f)
                lineTo(14.123f, 3.173f)
                close()
                moveTo(3.066f, 11.442f)
                curveTo(3.369f, 12.523f, 2.723f, 13.642f, 1.635f, 13.92f)
                lineTo(1.174f, 14.038f)
                curveTo(1.159f, 14.19f, 1.151f, 14.344f, 1.151f, 14.5f)
                curveTo(1.151f, 14.688f, 1.162f, 14.873f, 1.184f, 15.054f)
                lineTo(1.534f, 15.137f)
                curveTo(2.653f, 15.401f, 3.319f, 16.554f, 2.99f, 17.656f)
                lineTo(2.863f, 18.079f)
                curveTo(3.121f, 18.282f, 3.4f, 18.456f, 3.698f, 18.596f)
                lineTo(4.023f, 18.252f)
                curveTo(4.813f, 17.416f, 6.144f, 17.417f, 6.932f, 18.254f)
                lineTo(7.27f, 18.612f)
                curveTo(7.562f, 18.477f, 7.838f, 18.309f, 8.092f, 18.114f)
                lineTo(7.936f, 17.558f)
                curveTo(7.632f, 16.476f, 8.278f, 15.358f, 9.366f, 15.08f)
                lineTo(9.827f, 14.962f)
                curveTo(9.842f, 14.81f, 9.849f, 14.656f, 9.849f, 14.5f)
                curveTo(9.849f, 14.312f, 9.838f, 14.127f, 9.817f, 13.945f)
                lineTo(9.468f, 13.863f)
                curveTo(8.348f, 13.598f, 7.682f, 12.446f, 8.012f, 11.344f)
                lineTo(8.138f, 10.922f)
                curveTo(7.881f, 10.718f, 7.601f, 10.544f, 7.303f, 10.403f)
                lineTo(6.978f, 10.747f)
                curveTo(6.188f, 11.583f, 4.858f, 11.583f, 4.069f, 10.746f)
                lineTo(3.731f, 10.388f)
                curveTo(3.439f, 10.523f, 3.164f, 10.69f, 2.91f, 10.885f)
                lineTo(3.066f, 11.442f)
                close()
                moveTo(5.5f, 15.5f)
                curveTo(4.948f, 15.5f, 4.5f, 15.052f, 4.5f, 14.5f)
                curveTo(4.5f, 13.948f, 4.948f, 13.5f, 5.5f, 13.5f)
                curveTo(6.053f, 13.5f, 6.5f, 13.948f, 6.5f, 14.5f)
                curveTo(6.5f, 15.052f, 6.053f, 15.5f, 5.5f, 15.5f)
                close()
            }
        }
        .build()
        return _appsSettings!!
    }

@Suppress("ObjectPropertyName")
private var _appsSettings: ImageVector? = null

@Preview
@Composable
private fun AppsSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AppsSettings, contentDescription = null)
    }
}

