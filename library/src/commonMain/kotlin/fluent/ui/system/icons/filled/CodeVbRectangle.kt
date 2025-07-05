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
 * CodeVbRectangle Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent Visual Basic project node.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_vb_rectangle_16_filled.svg)
 * 
 * @return The [ImageVector] for the CodeVbRectangle icon.
 */
public val FluentIcons.Filled.CodeVbRectangle: ImageVector
    get() {
        if (_codeVbRectangle != null) {
            return _codeVbRectangle!!
        }
        _codeVbRectangle = Builder(name = "CodeVbRectangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.25f, 3.0f)
                horizontalLineTo(2.75f)
                curveTo(1.785f, 3.0f, 1.0f, 3.785f, 1.0f, 4.75f)
                verticalLineTo(12.25f)
                curveTo(1.0f, 13.215f, 1.785f, 14.0f, 2.75f, 14.0f)
                horizontalLineTo(12.25f)
                curveTo(13.215f, 14.0f, 14.0f, 13.215f, 14.0f, 12.25f)
                verticalLineTo(4.75f)
                curveTo(14.0f, 3.785f, 13.215f, 3.0f, 12.25f, 3.0f)
                close()
                moveTo(7.468f, 6.676f)
                lineTo(5.968f, 10.676f)
                curveTo(5.932f, 10.771f, 5.868f, 10.853f, 5.785f, 10.911f)
                curveTo(5.701f, 10.969f, 5.602f, 11.0f, 5.5f, 11.0f)
                curveTo(5.398f, 11.0f, 5.299f, 10.969f, 5.215f, 10.911f)
                curveTo(5.131f, 10.853f, 5.067f, 10.771f, 5.032f, 10.676f)
                lineTo(3.532f, 6.676f)
                curveTo(3.509f, 6.615f, 3.498f, 6.549f, 3.5f, 6.484f)
                curveTo(3.502f, 6.418f, 3.517f, 6.354f, 3.544f, 6.294f)
                curveTo(3.599f, 6.173f, 3.699f, 6.079f, 3.823f, 6.032f)
                curveTo(3.947f, 5.985f, 4.085f, 5.99f, 4.206f, 6.045f)
                curveTo(4.327f, 6.1f, 4.421f, 6.2f, 4.468f, 6.324f)
                lineTo(5.5f, 9.076f)
                lineTo(6.532f, 6.324f)
                curveTo(6.579f, 6.2f, 6.673f, 6.099f, 6.794f, 6.045f)
                curveTo(6.915f, 5.991f, 7.052f, 5.986f, 7.177f, 6.032f)
                curveTo(7.301f, 6.079f, 7.402f, 6.173f, 7.456f, 6.294f)
                curveTo(7.51f, 6.415f, 7.515f, 6.552f, 7.469f, 6.676f)
                horizontalLineTo(7.468f)
                close()
                moveTo(11.156f, 10.021f)
                curveTo(11.05f, 10.308f, 10.858f, 10.556f, 10.606f, 10.731f)
                curveTo(10.354f, 10.906f, 10.056f, 11.0f, 9.749f, 11.0f)
                horizontalLineTo(8.499f)
                curveTo(8.366f, 11.0f, 8.239f, 10.947f, 8.145f, 10.854f)
                curveTo(8.051f, 10.76f, 7.999f, 10.633f, 7.999f, 10.5f)
                verticalLineTo(6.5f)
                curveTo(7.999f, 6.367f, 8.052f, 6.24f, 8.145f, 6.146f)
                curveTo(8.239f, 6.052f, 8.366f, 6.0f, 8.499f, 6.0f)
                horizontalLineTo(9.499f)
                curveTo(9.774f, 6.0f, 10.043f, 6.076f, 10.277f, 6.218f)
                curveTo(10.512f, 6.361f, 10.703f, 6.565f, 10.829f, 6.808f)
                curveTo(10.956f, 7.052f, 11.013f, 7.325f, 10.995f, 7.599f)
                curveTo(10.977f, 7.873f, 10.884f, 8.137f, 10.726f, 8.361f)
                curveTo(10.958f, 8.561f, 11.124f, 8.827f, 11.201f, 9.123f)
                curveTo(11.278f, 9.42f, 11.262f, 9.733f, 11.155f, 10.02f)
                lineTo(11.156f, 10.021f)
                close()
                moveTo(9.75f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.75f)
                curveTo(9.883f, 10.0f, 10.01f, 9.947f, 10.104f, 9.854f)
                curveTo(10.198f, 9.76f, 10.25f, 9.633f, 10.25f, 9.5f)
                curveTo(10.25f, 9.367f, 10.197f, 9.24f, 10.104f, 9.146f)
                curveTo(10.011f, 9.052f, 9.883f, 9.0f, 9.75f, 9.0f)
                close()
                moveTo(9.854f, 7.854f)
                curveTo(9.948f, 7.76f, 10.0f, 7.633f, 10.0f, 7.5f)
                curveTo(10.0f, 7.367f, 9.947f, 7.24f, 9.854f, 7.146f)
                curveTo(9.76f, 7.052f, 9.633f, 7.0f, 9.5f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.5f)
                curveTo(9.633f, 8.0f, 9.76f, 7.947f, 9.854f, 7.854f)
                close()
            }
        }
        .build()
        return _codeVbRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _codeVbRectangle: ImageVector? = null

@Preview
@Composable
private fun CodeVbRectanglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodeVbRectangle, contentDescription = "CodeVbRectangle Icon")
    }
}

