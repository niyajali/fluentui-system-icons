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
 * CubeAdd Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in 3D experience scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_cube_add_20_filled.svg)
 * 
 * @return The [ImageVector] for the CubeAdd icon.
 */
public val FluentIcons.Filled.CubeAdd: ImageVector
    get() {
        if (_cubeAdd != null) {
            return _cubeAdd!!
        }
        _cubeAdd = Builder(name = "CubeAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.7f, 2.481f)
                curveTo(9.535f, 2.147f, 10.465f, 2.147f, 11.3f, 2.481f)
                lineTo(17.057f, 4.784f)
                curveTo(17.627f, 5.011f, 18.0f, 5.563f, 18.0f, 6.176f)
                verticalLineTo(10.256f)
                curveTo(17.049f, 9.471f, 15.83f, 8.999f, 14.5f, 8.999f)
                curveTo(12.924f, 8.999f, 11.502f, 9.662f, 10.5f, 10.724f)
                verticalLineTo(8.824f)
                lineTo(14.703f, 6.956f)
                curveTo(14.955f, 6.844f, 15.069f, 6.549f, 14.957f, 6.296f)
                curveTo(14.845f, 6.044f, 14.549f, 5.93f, 14.297f, 6.042f)
                lineTo(10.0f, 7.952f)
                lineTo(5.703f, 6.042f)
                curveTo(5.451f, 5.93f, 5.155f, 6.044f, 5.043f, 6.296f)
                curveTo(4.931f, 6.549f, 5.044f, 6.844f, 5.297f, 6.956f)
                lineTo(9.5f, 8.824f)
                verticalLineTo(12.205f)
                curveTo(9.179f, 12.903f, 9.0f, 13.68f, 9.0f, 14.499f)
                curveTo(9.0f, 15.723f, 9.4f, 16.854f, 10.076f, 17.767f)
                curveTo(9.609f, 17.778f, 9.141f, 17.694f, 8.7f, 17.518f)
                lineTo(2.943f, 15.215f)
                curveTo(2.373f, 14.987f, 2.0f, 14.436f, 2.0f, 13.822f)
                verticalLineTo(6.176f)
                curveTo(2.0f, 5.563f, 2.373f, 5.011f, 2.943f, 4.784f)
                lineTo(8.7f, 2.481f)
                close()
                moveTo(17.0f, 18.241f)
                curveTo(16.26f, 18.735f, 15.39f, 18.999f, 14.5f, 18.999f)
                curveTo(13.307f, 18.999f, 12.162f, 18.525f, 11.318f, 17.681f)
                curveTo(10.474f, 16.837f, 10.0f, 15.693f, 10.0f, 14.499f)
                curveTo(10.0f, 13.609f, 10.264f, 12.739f, 10.758f, 11.999f)
                curveTo(11.253f, 11.259f, 11.956f, 10.682f, 12.778f, 10.342f)
                curveTo(13.6f, 10.001f, 14.505f, 9.912f, 15.378f, 10.085f)
                curveTo(16.251f, 10.259f, 17.053f, 10.688f, 17.682f, 11.317f)
                curveTo(18.311f, 11.946f, 18.74f, 12.748f, 18.913f, 13.621f)
                curveTo(19.087f, 14.494f, 18.998f, 15.399f, 18.657f, 16.221f)
                curveTo(18.317f, 17.043f, 17.74f, 17.746f, 17.0f, 18.241f)
                close()
                moveTo(14.854f, 12.146f)
                curveTo(14.76f, 12.052f, 14.633f, 11.999f, 14.5f, 11.999f)
                curveTo(14.367f, 11.999f, 14.24f, 12.052f, 14.146f, 12.146f)
                curveTo(14.053f, 12.239f, 14.0f, 12.366f, 14.0f, 12.499f)
                verticalLineTo(13.999f)
                horizontalLineTo(12.5f)
                curveTo(12.367f, 13.999f, 12.24f, 14.052f, 12.146f, 14.146f)
                curveTo(12.053f, 14.239f, 12.0f, 14.366f, 12.0f, 14.499f)
                curveTo(12.0f, 14.632f, 12.053f, 14.759f, 12.146f, 14.853f)
                curveTo(12.24f, 14.946f, 12.367f, 14.999f, 12.5f, 14.999f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.499f)
                curveTo(14.0f, 16.632f, 14.053f, 16.759f, 14.146f, 16.853f)
                curveTo(14.24f, 16.946f, 14.367f, 16.999f, 14.5f, 16.999f)
                curveTo(14.633f, 16.999f, 14.76f, 16.946f, 14.854f, 16.853f)
                curveTo(14.947f, 16.759f, 15.0f, 16.632f, 15.0f, 16.499f)
                verticalLineTo(14.999f)
                horizontalLineTo(16.5f)
                curveTo(16.633f, 14.999f, 16.76f, 14.946f, 16.854f, 14.853f)
                curveTo(16.947f, 14.759f, 17.0f, 14.632f, 17.0f, 14.499f)
                curveTo(17.0f, 14.366f, 16.947f, 14.239f, 16.854f, 14.146f)
                curveTo(16.76f, 14.052f, 16.633f, 13.999f, 16.5f, 13.999f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.499f)
                curveTo(15.0f, 12.366f, 14.947f, 12.239f, 14.854f, 12.146f)
                close()
            }
        }
        .build()
        return _cubeAdd!!
    }

@Suppress("ObjectPropertyName")
private var _cubeAdd: ImageVector? = null

@Preview
@Composable
private fun CubeAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CubeAdd, contentDescription = "CubeAdd Icon")
    }
}

