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
 * WindowBulletList Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_bullet_list_20_regular.svg)
 * 
 * @return The [ImageVector] for the WindowBulletList icon.
 */
public val FluentIcons.Regular.WindowBulletList: ImageVector
    get() {
        if (_windowBulletList != null) {
            return _windowBulletList!!
        }
        _windowBulletList = Builder(name = "WindowBulletList", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.578f, 9.11f)
                curveTo(5.525f, 9.233f, 5.499f, 9.366f, 5.5f, 9.5f)
                curveTo(5.503f, 9.637f, 5.529f, 9.772f, 5.578f, 9.9f)
                curveTo(5.624f, 10.018f, 5.696f, 10.125f, 5.789f, 10.211f)
                curveTo(5.883f, 10.299f, 5.991f, 10.371f, 6.109f, 10.422f)
                curveTo(6.233f, 10.475f, 6.366f, 10.501f, 6.5f, 10.5f)
                curveTo(6.635f, 10.506f, 6.769f, 10.479f, 6.891f, 10.422f)
                curveTo(7.01f, 10.369f, 7.118f, 10.295f, 7.211f, 10.203f)
                curveTo(7.3f, 10.113f, 7.372f, 10.007f, 7.422f, 9.891f)
                curveTo(7.475f, 9.767f, 7.501f, 9.634f, 7.5f, 9.5f)
                curveTo(7.5f, 9.366f, 7.474f, 9.233f, 7.422f, 9.11f)
                curveTo(7.373f, 8.989f, 7.298f, 8.879f, 7.203f, 8.789f)
                curveTo(7.109f, 8.701f, 7.001f, 8.63f, 6.883f, 8.578f)
                curveTo(6.762f, 8.526f, 6.632f, 8.499f, 6.5f, 8.5f)
                curveTo(6.365f, 8.496f, 6.231f, 8.523f, 6.109f, 8.581f)
                curveTo(5.99f, 8.635f, 5.882f, 8.709f, 5.789f, 8.8f)
                curveTo(5.7f, 8.889f, 5.629f, 8.994f, 5.578f, 9.11f)
                close()
                moveTo(5.578f, 13.11f)
                curveTo(5.525f, 13.233f, 5.499f, 13.366f, 5.5f, 13.5f)
                curveTo(5.503f, 13.636f, 5.53f, 13.771f, 5.578f, 13.899f)
                curveTo(5.624f, 14.017f, 5.696f, 14.124f, 5.789f, 14.211f)
                curveTo(5.883f, 14.299f, 5.991f, 14.371f, 6.109f, 14.422f)
                curveTo(6.233f, 14.475f, 6.366f, 14.501f, 6.5f, 14.5f)
                curveTo(6.635f, 14.506f, 6.769f, 14.479f, 6.891f, 14.422f)
                curveTo(7.01f, 14.369f, 7.118f, 14.295f, 7.211f, 14.204f)
                curveTo(7.3f, 14.114f, 7.372f, 14.007f, 7.422f, 13.891f)
                curveTo(7.475f, 13.767f, 7.501f, 13.634f, 7.5f, 13.5f)
                curveTo(7.5f, 13.366f, 7.474f, 13.233f, 7.422f, 13.11f)
                curveTo(7.373f, 12.989f, 7.298f, 12.879f, 7.203f, 12.789f)
                curveTo(7.109f, 12.701f, 7.001f, 12.63f, 6.883f, 12.579f)
                curveTo(6.762f, 12.526f, 6.632f, 12.499f, 6.5f, 12.5f)
                curveTo(6.365f, 12.495f, 6.231f, 12.522f, 6.109f, 12.579f)
                curveTo(5.99f, 12.632f, 5.882f, 12.706f, 5.789f, 12.797f)
                curveTo(5.7f, 12.887f, 5.628f, 12.993f, 5.578f, 13.11f)
                close()
                moveTo(9.549f, 10.0f)
                curveTo(9.406f, 10.002f, 9.267f, 9.949f, 9.162f, 9.852f)
                verticalLineTo(9.848f)
                curveTo(9.112f, 9.805f, 9.072f, 9.751f, 9.044f, 9.691f)
                curveTo(9.016f, 9.63f, 9.002f, 9.565f, 9.002f, 9.498f)
                curveTo(9.002f, 9.432f, 9.016f, 9.366f, 9.044f, 9.306f)
                curveTo(9.072f, 9.245f, 9.112f, 9.191f, 9.162f, 9.148f)
                curveTo(9.267f, 9.051f, 9.406f, 8.998f, 9.549f, 9.0f)
                horizontalLineTo(13.949f)
                curveTo(14.093f, 8.999f, 14.232f, 9.053f, 14.336f, 9.152f)
                curveTo(14.387f, 9.195f, 14.427f, 9.249f, 14.455f, 9.31f)
                curveTo(14.483f, 9.37f, 14.497f, 9.436f, 14.497f, 9.502f)
                curveTo(14.497f, 9.569f, 14.483f, 9.634f, 14.455f, 9.695f)
                curveTo(14.427f, 9.755f, 14.387f, 9.809f, 14.336f, 9.852f)
                curveTo(14.231f, 9.949f, 14.093f, 10.002f, 13.949f, 10.0f)
                horizontalLineTo(9.549f)
                close()
                moveTo(9.162f, 13.852f)
                curveTo(9.268f, 13.949f, 9.406f, 14.002f, 9.549f, 14.0f)
                horizontalLineTo(13.949f)
                curveTo(14.092f, 14.002f, 14.231f, 13.949f, 14.336f, 13.852f)
                curveTo(14.387f, 13.809f, 14.427f, 13.755f, 14.455f, 13.695f)
                curveTo(14.483f, 13.634f, 14.497f, 13.568f, 14.497f, 13.502f)
                curveTo(14.497f, 13.436f, 14.483f, 13.37f, 14.455f, 13.309f)
                curveTo(14.427f, 13.249f, 14.387f, 13.195f, 14.336f, 13.152f)
                curveTo(14.232f, 13.054f, 14.093f, 12.999f, 13.949f, 13.0f)
                horizontalLineTo(9.549f)
                curveTo(9.406f, 12.998f, 9.268f, 13.051f, 9.162f, 13.148f)
                curveTo(9.112f, 13.191f, 9.072f, 13.245f, 9.044f, 13.306f)
                curveTo(9.016f, 13.366f, 9.002f, 13.432f, 9.002f, 13.498f)
                curveTo(9.002f, 13.564f, 9.016f, 13.63f, 9.044f, 13.691f)
                curveTo(9.072f, 13.751f, 9.112f, 13.805f, 9.162f, 13.848f)
                verticalLineTo(13.852f)
                close()
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(15.657f, 3.0f, 17.0f, 4.343f, 17.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 15.657f, 15.657f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 17.0f, 3.0f, 15.657f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 4.0f)
                curveTo(4.895f, 4.0f, 4.0f, 4.895f, 4.0f, 6.0f)
                lineTo(16.0f, 6.0f)
                curveTo(16.0f, 4.895f, 15.105f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 15.105f, 4.895f, 16.0f, 6.0f, 16.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 16.0f, 16.0f, 15.105f, 16.0f, 14.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _windowBulletList!!
    }

@Suppress("ObjectPropertyName")
private var _windowBulletList: ImageVector? = null

@Preview
@Composable
private fun WindowBulletListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowBulletList, contentDescription = "WindowBulletList Icon")
    }
}

