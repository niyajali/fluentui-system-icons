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
 * CodePyRectangle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: code, py, rectangle
 * - Source: ic_fluent_code_py_rectangle_16_filled.svg
 * 
 * @return The [ImageVector] for the CodePyRectangle icon.
 */
public val FluentIcons.Filled.CodePyRectangle: ImageVector
    get() {
        if (_codePyRectangle != null) {
            return _codePyRectangle!!
        }
        _codePyRectangle = Builder(name = "CodePyRectangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.5f)
                curveTo(5.633f, 8.0f, 5.76f, 7.947f, 5.854f, 7.854f)
                curveTo(5.948f, 7.761f, 6.0f, 7.633f, 6.0f, 7.5f)
                curveTo(6.0f, 7.367f, 5.947f, 7.24f, 5.854f, 7.146f)
                curveTo(5.76f, 7.052f, 5.633f, 7.0f, 5.5f, 7.0f)
                close()
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
                moveTo(6.561f, 8.561f)
                curveTo(6.28f, 8.842f, 5.898f, 9.0f, 5.5f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 10.633f, 4.947f, 10.76f, 4.854f, 10.854f)
                curveTo(4.76f, 10.948f, 4.633f, 11.0f, 4.5f, 11.0f)
                curveTo(4.367f, 11.0f, 4.24f, 10.947f, 4.146f, 10.854f)
                curveTo(4.052f, 10.76f, 4.0f, 10.633f, 4.0f, 10.5f)
                verticalLineTo(6.5f)
                curveTo(4.0f, 6.367f, 4.053f, 6.24f, 4.146f, 6.146f)
                curveTo(4.24f, 6.052f, 4.367f, 6.0f, 4.5f, 6.0f)
                horizontalLineTo(5.5f)
                curveTo(5.898f, 6.0f, 6.279f, 6.158f, 6.561f, 6.439f)
                curveTo(6.843f, 6.72f, 7.0f, 7.102f, 7.0f, 7.5f)
                curveTo(7.0f, 7.898f, 6.842f, 8.279f, 6.561f, 8.561f)
                close()
                moveTo(11.4f, 6.8f)
                lineTo(10.0f, 8.666f)
                verticalLineTo(10.5f)
                curveTo(10.0f, 10.633f, 9.947f, 10.76f, 9.854f, 10.854f)
                curveTo(9.76f, 10.948f, 9.633f, 11.0f, 9.5f, 11.0f)
                curveTo(9.367f, 11.0f, 9.24f, 10.947f, 9.146f, 10.854f)
                curveTo(9.052f, 10.76f, 9.0f, 10.633f, 9.0f, 10.5f)
                verticalLineTo(8.666f)
                lineTo(7.6f, 6.8f)
                curveTo(7.561f, 6.747f, 7.532f, 6.688f, 7.516f, 6.624f)
                curveTo(7.5f, 6.56f, 7.496f, 6.494f, 7.505f, 6.429f)
                curveTo(7.514f, 6.364f, 7.536f, 6.301f, 7.57f, 6.245f)
                curveTo(7.604f, 6.189f, 7.648f, 6.139f, 7.7f, 6.1f)
                curveTo(7.806f, 6.02f, 7.939f, 5.986f, 8.071f, 6.005f)
                curveTo(8.202f, 6.024f, 8.321f, 6.094f, 8.4f, 6.2f)
                lineTo(9.5f, 7.667f)
                lineTo(10.6f, 6.2f)
                curveTo(10.68f, 6.094f, 10.798f, 6.024f, 10.929f, 6.005f)
                curveTo(11.06f, 5.986f, 11.194f, 6.02f, 11.3f, 6.1f)
                curveTo(11.406f, 6.18f, 11.476f, 6.298f, 11.495f, 6.429f)
                curveTo(11.514f, 6.56f, 11.48f, 6.694f, 11.4f, 6.8f)
                verticalLineTo(6.8f)
                close()
            }
        }
        .build()
        return _codePyRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _codePyRectangle: ImageVector? = null

@Preview
@Composable
private fun CodePyRectanglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodePyRectangle, contentDescription = null)
    }
}

