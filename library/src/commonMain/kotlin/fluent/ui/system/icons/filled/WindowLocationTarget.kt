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
 * WindowLocationTarget icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: window, location, target
 * - Source: ic_fluent_window_location_target_20_filled.svg
 * 
 * @return The [ImageVector] for the WindowLocationTarget icon.
 */
public val FluentIcons.Filled.WindowLocationTarget: ImageVector
    get() {
        if (_windowLocationTarget != null) {
            return _windowLocationTarget!!
        }
        _windowLocationTarget = Builder(name = "WindowLocationTarget", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 3.0f, 17.0f, 4.343f, 17.0f, 6.0f)
                verticalLineTo(10.758f)
                curveTo(16.691f, 10.551f, 16.356f, 10.382f, 16.0f, 10.256f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 15.105f, 4.895f, 16.0f, 6.0f, 16.0f)
                horizontalLineTo(10.256f)
                curveTo(10.382f, 16.356f, 10.551f, 16.691f, 10.758f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 17.0f, 3.0f, 15.657f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(15.056f, 15.332f)
                curveTo(14.891f, 15.441f, 14.698f, 15.5f, 14.5f, 15.5f)
                curveTo(14.235f, 15.5f, 13.98f, 15.395f, 13.793f, 15.207f)
                curveTo(13.605f, 15.02f, 13.5f, 14.765f, 13.5f, 14.5f)
                curveTo(13.5f, 14.302f, 13.559f, 14.109f, 13.668f, 13.944f)
                curveTo(13.778f, 13.78f, 13.935f, 13.652f, 14.117f, 13.576f)
                curveTo(14.3f, 13.5f, 14.501f, 13.481f, 14.695f, 13.519f)
                curveTo(14.889f, 13.558f, 15.067f, 13.653f, 15.207f, 13.793f)
                curveTo(15.347f, 13.933f, 15.442f, 14.111f, 15.481f, 14.305f)
                curveTo(15.519f, 14.499f, 15.5f, 14.7f, 15.424f, 14.883f)
                curveTo(15.348f, 15.065f, 15.22f, 15.222f, 15.056f, 15.332f)
                close()
                moveTo(17.949f, 14.0f)
                horizontalLineTo(18.5f)
                curveTo(18.633f, 14.0f, 18.76f, 14.053f, 18.854f, 14.146f)
                curveTo(18.947f, 14.24f, 19.0f, 14.367f, 19.0f, 14.5f)
                curveTo(19.0f, 14.633f, 18.947f, 14.76f, 18.854f, 14.854f)
                curveTo(18.76f, 14.947f, 18.633f, 15.0f, 18.5f, 15.0f)
                horizontalLineTo(17.949f)
                curveTo(17.841f, 15.744f, 17.495f, 16.433f, 16.964f, 16.964f)
                curveTo(16.433f, 17.495f, 15.744f, 17.841f, 15.0f, 17.949f)
                verticalLineTo(18.5f)
                curveTo(15.0f, 18.633f, 14.947f, 18.76f, 14.854f, 18.854f)
                curveTo(14.76f, 18.947f, 14.633f, 19.0f, 14.5f, 19.0f)
                curveTo(14.367f, 19.0f, 14.24f, 18.947f, 14.146f, 18.854f)
                curveTo(14.053f, 18.76f, 14.0f, 18.633f, 14.0f, 18.5f)
                verticalLineTo(17.949f)
                curveTo(13.256f, 17.841f, 12.567f, 17.495f, 12.036f, 16.964f)
                curveTo(11.505f, 16.433f, 11.159f, 15.744f, 11.051f, 15.0f)
                horizontalLineTo(10.5f)
                curveTo(10.367f, 15.0f, 10.24f, 14.947f, 10.146f, 14.854f)
                curveTo(10.053f, 14.76f, 10.0f, 14.633f, 10.0f, 14.5f)
                curveTo(10.0f, 14.367f, 10.053f, 14.24f, 10.146f, 14.146f)
                curveTo(10.24f, 14.053f, 10.367f, 14.0f, 10.5f, 14.0f)
                horizontalLineTo(11.051f)
                curveTo(11.159f, 13.256f, 11.505f, 12.567f, 12.036f, 12.036f)
                curveTo(12.567f, 11.505f, 13.256f, 11.159f, 14.0f, 11.051f)
                verticalLineTo(10.5f)
                curveTo(14.0f, 10.367f, 14.053f, 10.24f, 14.146f, 10.146f)
                curveTo(14.24f, 10.053f, 14.367f, 10.0f, 14.5f, 10.0f)
                curveTo(14.633f, 10.0f, 14.76f, 10.053f, 14.854f, 10.146f)
                curveTo(14.947f, 10.24f, 15.0f, 10.367f, 15.0f, 10.5f)
                verticalLineTo(11.051f)
                curveTo(15.744f, 11.159f, 16.433f, 11.505f, 16.964f, 12.036f)
                curveTo(17.495f, 12.567f, 17.841f, 13.256f, 17.949f, 14.0f)
                close()
                moveTo(14.745f, 16.988f)
                curveTo(15.321f, 16.932f, 15.859f, 16.677f, 16.268f, 16.268f)
                curveTo(16.5f, 16.036f, 16.684f, 15.76f, 16.81f, 15.457f)
                curveTo(16.935f, 15.153f, 17.0f, 14.828f, 17.0f, 14.5f)
                curveTo(17.0f, 13.922f, 16.799f, 13.361f, 16.432f, 12.914f)
                curveTo(16.065f, 12.467f, 15.555f, 12.161f, 14.987f, 12.048f)
                curveTo(14.42f, 11.936f, 13.831f, 12.023f, 13.321f, 12.296f)
                curveTo(12.811f, 12.569f, 12.411f, 13.01f, 12.19f, 13.544f)
                curveTo(11.969f, 14.078f, 11.94f, 14.673f, 12.108f, 15.226f)
                curveTo(12.276f, 15.78f, 12.63f, 16.258f, 13.111f, 16.579f)
                curveTo(13.592f, 16.901f, 14.17f, 17.045f, 14.745f, 16.988f)
                close()
            }
        }
        .build()
        return _windowLocationTarget!!
    }

@Suppress("ObjectPropertyName")
private var _windowLocationTarget: ImageVector? = null

@Preview
@Composable
private fun WindowLocationTargetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowLocationTarget, contentDescription = null)
    }
}

