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
 * WindowBulletListAdd icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: window, bullet, list, add
 * - Source: ic_fluent_window_bullet_list_add_20_regular.svg
 * 
 * @return The [ImageVector] for the WindowBulletListAdd icon.
 */
public val FluentIcons.Regular.WindowBulletListAdd: ImageVector
    get() {
        if (_windowBulletListAdd != null) {
            return _windowBulletListAdd!!
        }
        _windowBulletListAdd = Builder(name = "WindowBulletListAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(9.6f)
                curveTo(9.438f, 16.683f, 9.306f, 16.349f, 9.207f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 16.0f, 4.0f, 15.105f, 4.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.207f)
                curveTo(16.349f, 9.306f, 16.683f, 9.438f, 17.0f, 9.6f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(4.0f, 6.0f)
                curveTo(4.0f, 4.895f, 4.895f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 4.0f, 16.0f, 4.895f, 16.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(14.085f, 9.015f)
                curveTo(14.041f, 9.005f, 13.996f, 9.0f, 13.95f, 9.0f)
                horizontalLineTo(9.55f)
                curveTo(9.407f, 8.998f, 9.268f, 9.051f, 9.163f, 9.148f)
                curveTo(9.113f, 9.191f, 9.072f, 9.245f, 9.045f, 9.306f)
                curveTo(9.017f, 9.366f, 9.003f, 9.432f, 9.003f, 9.498f)
                curveTo(9.003f, 9.565f, 9.017f, 9.63f, 9.045f, 9.691f)
                curveTo(9.072f, 9.751f, 9.113f, 9.805f, 9.163f, 9.848f)
                verticalLineTo(9.852f)
                curveTo(9.268f, 9.949f, 9.407f, 10.002f, 9.55f, 10.0f)
                horizontalLineTo(11.337f)
                curveTo(12.125f, 9.445f, 13.066f, 9.091f, 14.085f, 9.015f)
                close()
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
                curveTo(7.372f, 8.989f, 7.298f, 8.879f, 7.203f, 8.789f)
                curveTo(7.109f, 8.701f, 7.001f, 8.63f, 6.883f, 8.578f)
                curveTo(6.762f, 8.526f, 6.632f, 8.499f, 6.5f, 8.5f)
                curveTo(6.365f, 8.496f, 6.231f, 8.523f, 6.109f, 8.581f)
                curveTo(5.99f, 8.635f, 5.882f, 8.709f, 5.789f, 8.8f)
                curveTo(5.7f, 8.889f, 5.628f, 8.994f, 5.578f, 9.11f)
                close()
                moveTo(5.5f, 13.5f)
                curveTo(5.499f, 13.366f, 5.525f, 13.233f, 5.578f, 13.11f)
                curveTo(5.628f, 12.993f, 5.7f, 12.887f, 5.789f, 12.797f)
                curveTo(5.882f, 12.706f, 5.99f, 12.632f, 6.109f, 12.579f)
                curveTo(6.231f, 12.522f, 6.365f, 12.495f, 6.5f, 12.5f)
                curveTo(6.632f, 12.499f, 6.762f, 12.526f, 6.883f, 12.579f)
                curveTo(7.001f, 12.63f, 7.109f, 12.701f, 7.203f, 12.789f)
                curveTo(7.298f, 12.879f, 7.372f, 12.989f, 7.422f, 13.11f)
                curveTo(7.474f, 13.233f, 7.5f, 13.366f, 7.5f, 13.5f)
                curveTo(7.501f, 13.634f, 7.475f, 13.767f, 7.422f, 13.891f)
                curveTo(7.372f, 14.007f, 7.3f, 14.114f, 7.211f, 14.204f)
                curveTo(7.118f, 14.295f, 7.01f, 14.369f, 6.891f, 14.422f)
                curveTo(6.769f, 14.479f, 6.635f, 14.506f, 6.5f, 14.5f)
                curveTo(6.366f, 14.501f, 6.233f, 14.475f, 6.109f, 14.422f)
                curveTo(5.991f, 14.371f, 5.883f, 14.299f, 5.789f, 14.211f)
                curveTo(5.696f, 14.124f, 5.624f, 14.017f, 5.578f, 13.899f)
                curveTo(5.529f, 13.771f, 5.503f, 13.636f, 5.5f, 13.5f)
                close()
                moveTo(17.0f, 18.242f)
                curveTo(16.26f, 18.736f, 15.39f, 19.0f, 14.5f, 19.0f)
                curveTo(13.307f, 19.0f, 12.162f, 18.526f, 11.318f, 17.682f)
                curveTo(10.474f, 16.838f, 10.0f, 15.693f, 10.0f, 14.5f)
                curveTo(10.0f, 13.61f, 10.264f, 12.74f, 10.758f, 12.0f)
                curveTo(11.253f, 11.26f, 11.956f, 10.683f, 12.778f, 10.342f)
                curveTo(13.6f, 10.002f, 14.505f, 9.913f, 15.378f, 10.087f)
                curveTo(16.251f, 10.26f, 17.053f, 10.689f, 17.682f, 11.318f)
                curveTo(18.311f, 11.947f, 18.74f, 12.749f, 18.913f, 13.622f)
                curveTo(19.087f, 14.495f, 18.998f, 15.4f, 18.657f, 16.222f)
                curveTo(18.317f, 17.044f, 17.74f, 17.747f, 17.0f, 18.242f)
                close()
                moveTo(14.854f, 12.146f)
                curveTo(14.76f, 12.053f, 14.633f, 12.0f, 14.5f, 12.0f)
                curveTo(14.367f, 12.0f, 14.24f, 12.053f, 14.146f, 12.146f)
                curveTo(14.053f, 12.24f, 14.0f, 12.367f, 14.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.367f, 14.0f, 12.24f, 14.053f, 12.146f, 14.146f)
                curveTo(12.053f, 14.24f, 12.0f, 14.367f, 12.0f, 14.5f)
                curveTo(12.0f, 14.633f, 12.053f, 14.76f, 12.146f, 14.854f)
                curveTo(12.24f, 14.947f, 12.367f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 16.633f, 14.053f, 16.76f, 14.146f, 16.854f)
                curveTo(14.24f, 16.947f, 14.367f, 17.0f, 14.5f, 17.0f)
                curveTo(14.633f, 17.0f, 14.76f, 16.947f, 14.854f, 16.854f)
                curveTo(14.947f, 16.76f, 15.0f, 16.633f, 15.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.633f, 15.0f, 16.76f, 14.947f, 16.854f, 14.854f)
                curveTo(16.947f, 14.76f, 17.0f, 14.633f, 17.0f, 14.5f)
                curveTo(17.0f, 14.367f, 16.947f, 14.24f, 16.854f, 14.146f)
                curveTo(16.76f, 14.053f, 16.633f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 12.367f, 14.947f, 12.24f, 14.854f, 12.146f)
                close()
            }
        }
        .build()
        return _windowBulletListAdd!!
    }

@Suppress("ObjectPropertyName")
private var _windowBulletListAdd: ImageVector? = null

@Preview
@Composable
private fun WindowBulletListAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowBulletListAdd, contentDescription = null)
    }
}

