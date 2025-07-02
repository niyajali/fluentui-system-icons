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
 * NavigationLocationTarget icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: navigation, location, target
 * - Source: ic_fluent_navigation_location_target_20_filled.svg
 * 
 * @return The [ImageVector] for the NavigationLocationTarget icon.
 */
public val FluentIcons.Filled.NavigationLocationTarget: ImageVector
    get() {
        if (_navigationLocationTarget != null) {
            return _navigationLocationTarget!!
        }
        _navigationLocationTarget = Builder(name = "NavigationLocationTarget", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 5.0f)
                curveTo(2.336f, 5.0f, 2.0f, 5.336f, 2.0f, 5.75f)
                curveTo(2.0f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 6.5f, 18.0f, 6.164f, 18.0f, 5.75f)
                curveTo(18.0f, 5.336f, 17.664f, 5.0f, 17.25f, 5.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 10.75f)
                curveTo(2.0f, 10.336f, 2.336f, 10.0f, 2.75f, 10.0f)
                horizontalLineTo(14.086f)
                curveTo(14.055f, 10.087f, 14.033f, 10.176f, 14.018f, 10.268f)
                curveTo(13.382f, 10.49f, 12.805f, 10.852f, 12.329f, 11.328f)
                curveTo(12.273f, 11.384f, 12.219f, 11.441f, 12.166f, 11.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 11.5f, 2.0f, 11.164f, 2.0f, 10.75f)
                close()
                moveTo(2.75f, 15.0f)
                horizontalLineTo(10.086f)
                curveTo(10.147f, 15.173f, 10.24f, 15.334f, 10.36f, 15.475f)
                curveTo(10.593f, 15.747f, 10.915f, 15.927f, 11.268f, 15.982f)
                curveTo(11.33f, 16.159f, 11.403f, 16.332f, 11.486f, 16.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 16.5f, 2.0f, 16.164f, 2.0f, 15.75f)
                curveTo(2.0f, 15.336f, 2.336f, 15.0f, 2.75f, 15.0f)
                close()
                moveTo(16.056f, 15.332f)
                curveTo(15.891f, 15.441f, 15.698f, 15.5f, 15.5f, 15.5f)
                curveTo(15.235f, 15.5f, 14.98f, 15.395f, 14.793f, 15.207f)
                curveTo(14.605f, 15.02f, 14.5f, 14.765f, 14.5f, 14.5f)
                curveTo(14.5f, 14.302f, 14.559f, 14.109f, 14.668f, 13.944f)
                curveTo(14.778f, 13.78f, 14.935f, 13.652f, 15.117f, 13.576f)
                curveTo(15.3f, 13.5f, 15.501f, 13.481f, 15.695f, 13.519f)
                curveTo(15.889f, 13.558f, 16.067f, 13.653f, 16.207f, 13.793f)
                curveTo(16.347f, 13.933f, 16.442f, 14.111f, 16.481f, 14.305f)
                curveTo(16.519f, 14.499f, 16.5f, 14.7f, 16.424f, 14.883f)
                curveTo(16.348f, 15.065f, 16.22f, 15.222f, 16.056f, 15.332f)
                close()
                moveTo(18.949f, 14.0f)
                horizontalLineTo(19.5f)
                curveTo(19.633f, 14.0f, 19.76f, 14.053f, 19.854f, 14.146f)
                curveTo(19.947f, 14.24f, 20.0f, 14.367f, 20.0f, 14.5f)
                curveTo(20.0f, 14.633f, 19.947f, 14.76f, 19.854f, 14.854f)
                curveTo(19.76f, 14.947f, 19.633f, 15.0f, 19.5f, 15.0f)
                horizontalLineTo(18.949f)
                curveTo(18.841f, 15.744f, 18.495f, 16.433f, 17.964f, 16.964f)
                curveTo(17.433f, 17.495f, 16.744f, 17.841f, 16.0f, 17.949f)
                verticalLineTo(18.5f)
                curveTo(16.0f, 18.633f, 15.947f, 18.76f, 15.854f, 18.854f)
                curveTo(15.76f, 18.947f, 15.633f, 19.0f, 15.5f, 19.0f)
                curveTo(15.367f, 19.0f, 15.24f, 18.947f, 15.146f, 18.854f)
                curveTo(15.053f, 18.76f, 15.0f, 18.633f, 15.0f, 18.5f)
                verticalLineTo(17.949f)
                curveTo(14.256f, 17.841f, 13.567f, 17.495f, 13.036f, 16.964f)
                curveTo(12.505f, 16.433f, 12.159f, 15.744f, 12.051f, 15.0f)
                horizontalLineTo(11.5f)
                curveTo(11.367f, 15.0f, 11.24f, 14.947f, 11.146f, 14.854f)
                curveTo(11.053f, 14.76f, 11.0f, 14.633f, 11.0f, 14.5f)
                curveTo(11.0f, 14.367f, 11.053f, 14.24f, 11.146f, 14.146f)
                curveTo(11.24f, 14.053f, 11.367f, 14.0f, 11.5f, 14.0f)
                horizontalLineTo(12.051f)
                curveTo(12.159f, 13.256f, 12.505f, 12.567f, 13.036f, 12.036f)
                curveTo(13.567f, 11.505f, 14.256f, 11.159f, 15.0f, 11.051f)
                verticalLineTo(10.5f)
                curveTo(15.0f, 10.367f, 15.053f, 10.24f, 15.146f, 10.146f)
                curveTo(15.24f, 10.053f, 15.367f, 10.0f, 15.5f, 10.0f)
                curveTo(15.633f, 10.0f, 15.76f, 10.053f, 15.854f, 10.146f)
                curveTo(15.947f, 10.24f, 16.0f, 10.367f, 16.0f, 10.5f)
                verticalLineTo(11.051f)
                curveTo(16.744f, 11.159f, 17.433f, 11.505f, 17.964f, 12.036f)
                curveTo(18.495f, 12.567f, 18.841f, 13.256f, 18.949f, 14.0f)
                close()
                moveTo(15.745f, 16.988f)
                curveTo(16.321f, 16.932f, 16.859f, 16.677f, 17.268f, 16.268f)
                curveTo(17.5f, 16.036f, 17.684f, 15.76f, 17.81f, 15.457f)
                curveTo(17.935f, 15.153f, 18.0f, 14.828f, 18.0f, 14.5f)
                curveTo(18.0f, 13.922f, 17.799f, 13.361f, 17.432f, 12.914f)
                curveTo(17.065f, 12.467f, 16.555f, 12.161f, 15.987f, 12.048f)
                curveTo(15.42f, 11.936f, 14.831f, 12.023f, 14.321f, 12.296f)
                curveTo(13.811f, 12.569f, 13.411f, 13.01f, 13.19f, 13.544f)
                curveTo(12.969f, 14.078f, 12.94f, 14.673f, 13.108f, 15.226f)
                curveTo(13.276f, 15.78f, 13.63f, 16.258f, 14.111f, 16.579f)
                curveTo(14.592f, 16.901f, 15.17f, 17.045f, 15.745f, 16.988f)
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
        Image(imageVector = FluentIcons.Filled.NavigationLocationTarget, contentDescription = null)
    }
}

