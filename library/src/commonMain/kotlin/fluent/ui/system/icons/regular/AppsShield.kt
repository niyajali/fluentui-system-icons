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
 * AppsShield Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for plugins, apps, tools.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_apps_shield_20_regular.svg)
 * 
 * @return The [ImageVector] for the AppsShield icon.
 */
public val FluentIcons.Regular.AppsShield: ImageVector
    get() {
        if (_appsShield != null) {
            return _appsShield!!
        }
        _appsShield = Builder(name = "AppsShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 17.0f)
                horizontalLineTo(8.425f)
                curveTo(8.58f, 16.695f, 8.711f, 16.362f, 8.809f, 16.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(6.985f)
                curveTo(6.441f, 10.247f, 5.966f, 9.843f, 5.634f, 9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(4.5f)
                curveTo(9.5f, 4.285f, 9.365f, 4.102f, 9.174f, 4.031f)
                lineTo(9.09f, 4.008f)
                lineTo(9.0f, 4.0f)
                horizontalLineTo(4.5f)
                curveTo(4.255f, 4.0f, 4.05f, 4.177f, 4.008f, 4.41f)
                lineTo(4.0f, 4.5f)
                verticalLineTo(9.083f)
                curveTo(3.777f, 9.159f, 3.568f, 9.288f, 3.395f, 9.469f)
                curveTo(3.281f, 9.589f, 3.148f, 9.718f, 3.0f, 9.846f)
                verticalLineTo(4.5f)
                curveTo(3.0f, 3.72f, 3.595f, 3.079f, 4.356f, 3.007f)
                lineTo(4.5f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.78f, 3.0f, 10.42f, 3.595f, 10.493f, 4.355f)
                lineTo(10.5f, 4.5f)
                verticalLineTo(4.754f)
                lineTo(12.689f, 2.485f)
                curveTo(13.228f, 1.926f, 14.096f, 1.876f, 14.696f, 2.347f)
                lineTo(14.812f, 2.448f)
                lineTo(17.569f, 5.173f)
                curveTo(18.122f, 5.719f, 18.161f, 6.588f, 17.68f, 7.184f)
                lineTo(17.577f, 7.3f)
                lineTo(15.266f, 9.499f)
                lineTo(15.5f, 9.5f)
                curveTo(16.28f, 9.5f, 16.92f, 10.095f, 16.993f, 10.856f)
                lineTo(17.0f, 11.0f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 16.28f, 16.405f, 16.92f, 15.644f, 16.993f)
                lineTo(15.5f, 17.0f)
                close()
                moveTo(15.5f, 10.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.5f)
                curveTo(15.745f, 16.0f, 15.95f, 15.823f, 15.992f, 15.59f)
                lineTo(16.0f, 15.5f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 10.755f, 15.823f, 10.55f, 15.59f, 10.508f)
                lineTo(15.5f, 10.5f)
                close()
                moveTo(10.5f, 7.709f)
                verticalLineTo(9.499f)
                horizontalLineTo(12.29f)
                lineTo(10.5f, 7.709f)
                close()
                moveTo(14.122f, 3.173f)
                curveTo(13.94f, 2.996f, 13.669f, 2.981f, 13.477f, 3.12f)
                lineTo(13.409f, 3.179f)
                lineTo(10.793f, 5.893f)
                curveTo(10.627f, 6.065f, 10.609f, 6.325f, 10.736f, 6.516f)
                lineTo(10.799f, 6.594f)
                lineTo(13.415f, 9.209f)
                curveTo(13.583f, 9.377f, 13.841f, 9.401f, 14.035f, 9.279f)
                lineTo(14.113f, 9.218f)
                lineTo(16.871f, 6.591f)
                curveTo(17.043f, 6.417f, 17.061f, 6.147f, 16.925f, 5.953f)
                lineTo(16.867f, 5.884f)
                lineTo(14.122f, 3.173f)
                close()
                moveTo(4.881f, 10.159f)
                curveTo(5.388f, 10.692f, 6.364f, 11.539f, 7.564f, 11.712f)
                curveTo(7.803f, 11.747f, 8.0f, 11.946f, 8.0f, 12.194f)
                verticalLineTo(14.517f)
                curveTo(8.0f, 17.639f, 5.216f, 18.772f, 4.614f, 18.98f)
                curveTo(4.539f, 19.007f, 4.462f, 19.007f, 4.386f, 18.98f)
                curveTo(3.784f, 18.772f, 1.0f, 17.639f, 1.0f, 14.517f)
                lineTo(1.0f, 12.194f)
                curveTo(1.0f, 11.946f, 1.197f, 11.747f, 1.436f, 11.712f)
                curveTo(2.636f, 11.538f, 3.611f, 10.692f, 4.119f, 10.159f)
                curveTo(4.321f, 9.947f, 4.678f, 9.947f, 4.881f, 10.159f)
                close()
            }
        }
        .build()
        return _appsShield!!
    }

@Suppress("ObjectPropertyName")
private var _appsShield: ImageVector? = null

@Preview
@Composable
private fun AppsShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AppsShield, contentDescription = "AppsShield Icon")
    }
}

