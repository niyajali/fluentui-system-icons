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
 * NavigationLocationTarget icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: navigation, location, target
 * - Source: ic_fluent_navigation_location_target_20_regular.svg
 * 
 * @return The [ImageVector] for the NavigationLocationTarget icon.
 */
public val FluentIcons.Regular.NavigationLocationTarget: ImageVector
    get() {
        if (_navigationLocationTarget != null) {
            return _navigationLocationTarget!!
        }
        _navigationLocationTarget = Builder(name = "NavigationLocationTarget", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 5.0f)
                curveTo(2.224f, 5.0f, 2.0f, 5.224f, 2.0f, 5.5f)
                curveTo(2.0f, 5.776f, 2.224f, 6.0f, 2.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 6.0f, 18.0f, 5.776f, 18.0f, 5.5f)
                curveTo(18.0f, 5.224f, 17.776f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(2.5f)
                close()
                moveTo(2.5f, 10.0f)
                curveTo(2.224f, 10.0f, 2.0f, 10.224f, 2.0f, 10.5f)
                curveTo(2.0f, 10.776f, 2.224f, 11.0f, 2.5f, 11.0f)
                horizontalLineTo(12.695f)
                curveTo(13.091f, 10.683f, 13.538f, 10.435f, 14.018f, 10.268f)
                curveTo(14.033f, 10.176f, 14.055f, 10.087f, 14.086f, 10.0f)
                horizontalLineTo(2.5f)
                close()
                moveTo(10.36f, 15.475f)
                curveTo(10.24f, 15.334f, 10.147f, 15.173f, 10.086f, 15.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 15.0f, 2.0f, 15.224f, 2.0f, 15.5f)
                curveTo(2.0f, 15.776f, 2.224f, 16.0f, 2.5f, 16.0f)
                horizontalLineTo(11.275f)
                lineTo(11.268f, 15.982f)
                curveTo(10.915f, 15.927f, 10.593f, 15.747f, 10.36f, 15.475f)
                close()
                moveTo(15.5f, 15.5f)
                curveTo(15.698f, 15.5f, 15.891f, 15.441f, 16.056f, 15.332f)
                curveTo(16.22f, 15.222f, 16.348f, 15.065f, 16.424f, 14.883f)
                curveTo(16.5f, 14.7f, 16.519f, 14.499f, 16.481f, 14.305f)
                curveTo(16.442f, 14.111f, 16.347f, 13.933f, 16.207f, 13.793f)
                curveTo(16.067f, 13.653f, 15.889f, 13.558f, 15.695f, 13.519f)
                curveTo(15.501f, 13.481f, 15.3f, 13.5f, 15.117f, 13.576f)
                curveTo(14.935f, 13.652f, 14.778f, 13.78f, 14.668f, 13.944f)
                curveTo(14.559f, 14.109f, 14.5f, 14.302f, 14.5f, 14.5f)
                curveTo(14.5f, 14.765f, 14.605f, 15.02f, 14.793f, 15.207f)
                curveTo(14.98f, 15.395f, 15.235f, 15.5f, 15.5f, 15.5f)
                close()
                moveTo(19.5f, 14.0f)
                horizontalLineTo(18.949f)
                curveTo(18.841f, 13.256f, 18.495f, 12.567f, 17.964f, 12.036f)
                curveTo(17.433f, 11.505f, 16.744f, 11.159f, 16.0f, 11.051f)
                verticalLineTo(10.5f)
                curveTo(16.0f, 10.367f, 15.947f, 10.24f, 15.854f, 10.146f)
                curveTo(15.76f, 10.053f, 15.633f, 10.0f, 15.5f, 10.0f)
                curveTo(15.367f, 10.0f, 15.24f, 10.053f, 15.146f, 10.146f)
                curveTo(15.053f, 10.24f, 15.0f, 10.367f, 15.0f, 10.5f)
                verticalLineTo(11.051f)
                curveTo(14.256f, 11.159f, 13.567f, 11.505f, 13.036f, 12.036f)
                curveTo(12.505f, 12.567f, 12.159f, 13.256f, 12.051f, 14.0f)
                horizontalLineTo(11.5f)
                curveTo(11.367f, 14.0f, 11.24f, 14.053f, 11.146f, 14.146f)
                curveTo(11.053f, 14.24f, 11.0f, 14.367f, 11.0f, 14.5f)
                curveTo(11.0f, 14.633f, 11.053f, 14.76f, 11.146f, 14.854f)
                curveTo(11.24f, 14.947f, 11.367f, 15.0f, 11.5f, 15.0f)
                horizontalLineTo(12.051f)
                curveTo(12.159f, 15.744f, 12.505f, 16.433f, 13.036f, 16.964f)
                curveTo(13.567f, 17.495f, 14.256f, 17.841f, 15.0f, 17.949f)
                verticalLineTo(18.5f)
                curveTo(15.0f, 18.633f, 15.053f, 18.76f, 15.146f, 18.854f)
                curveTo(15.24f, 18.947f, 15.367f, 19.0f, 15.5f, 19.0f)
                curveTo(15.633f, 19.0f, 15.76f, 18.947f, 15.854f, 18.854f)
                curveTo(15.947f, 18.76f, 16.0f, 18.633f, 16.0f, 18.5f)
                verticalLineTo(17.949f)
                curveTo(16.744f, 17.841f, 17.433f, 17.495f, 17.964f, 16.964f)
                curveTo(18.495f, 16.433f, 18.841f, 15.744f, 18.949f, 15.0f)
                horizontalLineTo(19.5f)
                curveTo(19.633f, 15.0f, 19.76f, 14.947f, 19.854f, 14.854f)
                curveTo(19.947f, 14.76f, 20.0f, 14.633f, 20.0f, 14.5f)
                curveTo(20.0f, 14.367f, 19.947f, 14.24f, 19.854f, 14.146f)
                curveTo(19.76f, 14.053f, 19.633f, 14.0f, 19.5f, 14.0f)
                close()
                moveTo(17.268f, 16.268f)
                curveTo(16.859f, 16.677f, 16.321f, 16.932f, 15.745f, 16.988f)
                curveTo(15.17f, 17.045f, 14.592f, 16.901f, 14.111f, 16.579f)
                curveTo(13.63f, 16.258f, 13.276f, 15.78f, 13.108f, 15.226f)
                curveTo(12.94f, 14.673f, 12.969f, 14.078f, 13.19f, 13.544f)
                curveTo(13.411f, 13.01f, 13.811f, 12.569f, 14.321f, 12.296f)
                curveTo(14.831f, 12.023f, 15.42f, 11.936f, 15.987f, 12.048f)
                curveTo(16.555f, 12.161f, 17.065f, 12.467f, 17.432f, 12.914f)
                curveTo(17.799f, 13.361f, 18.0f, 13.922f, 18.0f, 14.5f)
                curveTo(18.0f, 14.828f, 17.935f, 15.153f, 17.81f, 15.457f)
                curveTo(17.684f, 15.76f, 17.5f, 16.036f, 17.268f, 16.268f)
                close()
            }
        }
        .build()
        return _navigationLocationTarget!!
    }

@Suppress("ObjectPropertyName")
private var _navigationLocationTarget: ImageVector? = null

@Preview
@Composable
private fun NavigationLocationTargetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NavigationLocationTarget, contentDescription = null)
    }
}

