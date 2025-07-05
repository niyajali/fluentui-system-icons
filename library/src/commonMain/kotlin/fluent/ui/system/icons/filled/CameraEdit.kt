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
 * CameraEdit Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in camera scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_camera_edit_20_filled.svg)
 * 
 * @return The [ImageVector] for the CameraEdit icon.
 */
public val FluentIcons.Filled.CameraEdit: ImageVector
    get() {
        if (_cameraEdit != null) {
            return _cameraEdit!!
        }
        _cameraEdit = Builder(name = "CameraEdit", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.123f, 2.0f)
                curveTo(7.556f, 2.0f, 7.038f, 2.32f, 6.783f, 2.826f)
                lineTo(6.193f, 3.999f)
                horizontalLineTo(4.504f)
                curveTo(3.123f, 3.999f, 2.004f, 5.119f, 2.004f, 6.499f)
                verticalLineTo(14.5f)
                curveTo(2.004f, 15.881f, 3.123f, 17.0f, 4.504f, 17.0f)
                horizontalLineTo(8.004f)
                curveTo(8.011f, 16.886f, 8.029f, 16.77f, 8.058f, 16.653f)
                lineTo(8.433f, 15.155f)
                curveTo(8.549f, 14.691f, 8.768f, 14.259f, 9.072f, 13.892f)
                curveTo(7.31f, 13.474f, 5.999f, 11.89f, 5.999f, 10.0f)
                curveTo(5.999f, 7.791f, 7.79f, 6.0f, 9.999f, 6.0f)
                curveTo(11.883f, 6.0f, 13.463f, 7.303f, 13.887f, 9.056f)
                lineTo(14.103f, 8.841f)
                curveTo(15.173f, 7.771f, 16.876f, 7.722f, 18.004f, 8.694f)
                verticalLineTo(6.499f)
                curveTo(18.004f, 5.119f, 16.885f, 3.999f, 15.504f, 3.999f)
                horizontalLineTo(13.814f)
                lineTo(13.229f, 2.829f)
                curveTo(12.975f, 2.321f, 12.456f, 2.0f, 11.887f, 2.0f)
                horizontalLineTo(8.123f)
                close()
                moveTo(12.999f, 9.945f)
                curveTo(12.969f, 8.313f, 11.638f, 7.0f, 9.999f, 7.0f)
                curveTo(8.342f, 7.0f, 6.999f, 8.343f, 6.999f, 10.0f)
                curveTo(6.999f, 11.639f, 8.313f, 12.97f, 9.944f, 13.0f)
                lineTo(12.999f, 9.945f)
                close()
                moveTo(14.809f, 9.548f)
                lineTo(9.98f, 14.377f)
                curveTo(9.698f, 14.659f, 9.498f, 15.012f, 9.402f, 15.398f)
                lineTo(9.027f, 16.896f)
                curveTo(8.865f, 17.547f, 9.455f, 18.137f, 10.106f, 17.974f)
                lineTo(11.604f, 17.6f)
                curveTo(11.99f, 17.503f, 12.343f, 17.304f, 12.625f, 17.022f)
                lineTo(17.454f, 12.193f)
                curveTo(18.184f, 11.462f, 18.184f, 10.278f, 17.454f, 9.548f)
                curveTo(16.724f, 8.817f, 15.54f, 8.817f, 14.809f, 9.548f)
                close()
            }
        }
        .build()
        return _cameraEdit!!
    }

@Suppress("ObjectPropertyName")
private var _cameraEdit: ImageVector? = null

@Preview
@Composable
private fun CameraEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CameraEdit, contentDescription = "CameraEdit Icon")
    }
}

