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
 * CubeLink icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: cube, link
 * - Source: ic_fluent_cube_link_20_regular.svg
 * 
 * @return The [ImageVector] for the CubeLink icon.
 */
public val FluentIcons.Regular.CubeLink: ImageVector
    get() {
        if (_cubeLink != null) {
            return _cubeLink!!
        }
        _cubeLink = Builder(name = "CubeLink", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.043f, 6.296f)
                curveTo(5.155f, 6.044f, 5.451f, 5.93f, 5.703f, 6.042f)
                lineTo(10.0f, 7.952f)
                lineTo(14.297f, 6.042f)
                curveTo(14.549f, 5.93f, 14.845f, 6.044f, 14.957f, 6.296f)
                curveTo(15.069f, 6.549f, 14.955f, 6.844f, 14.703f, 6.956f)
                lineTo(10.5f, 8.824f)
                verticalLineTo(13.499f)
                curveTo(10.5f, 13.776f, 10.276f, 13.999f, 10.0f, 13.999f)
                curveTo(9.724f, 13.999f, 9.5f, 13.776f, 9.5f, 13.499f)
                verticalLineTo(8.824f)
                lineTo(5.297f, 6.956f)
                curveTo(5.044f, 6.844f, 4.931f, 6.549f, 5.043f, 6.296f)
                close()
                moveTo(8.7f, 2.481f)
                curveTo(9.535f, 2.147f, 10.465f, 2.147f, 11.3f, 2.481f)
                lineTo(17.057f, 4.784f)
                curveTo(17.627f, 5.011f, 18.0f, 5.563f, 18.0f, 6.176f)
                verticalLineTo(12.035f)
                curveTo(17.837f, 12.012f, 17.67f, 11.999f, 17.5f, 11.999f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.176f)
                curveTo(17.0f, 5.972f, 16.875f, 5.788f, 16.686f, 5.712f)
                lineTo(10.929f, 3.409f)
                curveTo(10.332f, 3.171f, 9.668f, 3.171f, 9.072f, 3.409f)
                lineTo(3.314f, 5.712f)
                curveTo(3.124f, 5.788f, 3.0f, 5.972f, 3.0f, 6.176f)
                verticalLineTo(13.822f)
                curveTo(3.0f, 14.027f, 3.124f, 14.211f, 3.314f, 14.287f)
                lineTo(9.072f, 16.59f)
                curveTo(9.443f, 16.738f, 9.841f, 16.794f, 10.233f, 16.757f)
                curveTo(10.363f, 17.094f, 10.543f, 17.406f, 10.765f, 17.684f)
                curveTo(10.08f, 17.837f, 9.36f, 17.782f, 8.7f, 17.518f)
                lineTo(2.943f, 15.215f)
                curveTo(2.373f, 14.987f, 2.0f, 14.436f, 2.0f, 13.822f)
                verticalLineTo(6.176f)
                curveTo(2.0f, 5.563f, 2.373f, 5.011f, 2.943f, 4.784f)
                lineTo(8.7f, 2.481f)
                close()
                moveTo(13.5f, 12.999f)
                curveTo(12.119f, 12.999f, 11.0f, 14.119f, 11.0f, 15.499f)
                curveTo(11.0f, 16.88f, 12.119f, 17.999f, 13.5f, 17.999f)
                horizontalLineTo(14.0f)
                curveTo(14.276f, 17.999f, 14.5f, 17.775f, 14.5f, 17.499f)
                curveTo(14.5f, 17.223f, 14.276f, 16.999f, 14.0f, 16.999f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 16.999f, 12.0f, 16.328f, 12.0f, 15.499f)
                curveTo(12.0f, 14.671f, 12.672f, 13.999f, 13.5f, 13.999f)
                horizontalLineTo(14.0f)
                curveTo(14.276f, 13.999f, 14.5f, 13.776f, 14.5f, 13.499f)
                curveTo(14.5f, 13.223f, 14.276f, 12.999f, 14.0f, 12.999f)
                horizontalLineTo(13.5f)
                close()
                moveTo(17.0f, 12.999f)
                curveTo(16.724f, 12.999f, 16.5f, 13.223f, 16.5f, 13.499f)
                curveTo(16.5f, 13.776f, 16.724f, 13.999f, 17.0f, 13.999f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 13.999f, 19.0f, 14.671f, 19.0f, 15.499f)
                curveTo(19.0f, 16.328f, 18.328f, 16.999f, 17.5f, 16.999f)
                horizontalLineTo(17.0f)
                curveTo(16.724f, 16.999f, 16.5f, 17.223f, 16.5f, 17.499f)
                curveTo(16.5f, 17.775f, 16.724f, 17.999f, 17.0f, 17.999f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 17.999f, 20.0f, 16.88f, 20.0f, 15.499f)
                curveTo(20.0f, 14.119f, 18.881f, 12.999f, 17.5f, 12.999f)
                horizontalLineTo(17.0f)
                close()
                moveTo(13.5f, 14.999f)
                curveTo(13.224f, 14.999f, 13.0f, 15.223f, 13.0f, 15.499f)
                curveTo(13.0f, 15.776f, 13.224f, 15.999f, 13.5f, 15.999f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 15.999f, 18.0f, 15.776f, 18.0f, 15.499f)
                curveTo(18.0f, 15.223f, 17.776f, 14.999f, 17.5f, 14.999f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _cubeLink!!
    }

@Suppress("ObjectPropertyName")
private var _cubeLink: ImageVector? = null

@Preview
@Composable
private fun CubeLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CubeLink, contentDescription = null)
    }
}

