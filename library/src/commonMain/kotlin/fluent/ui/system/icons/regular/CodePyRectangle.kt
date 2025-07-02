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
 * CodePyRectangle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: code, py, rectangle
 * - Source: ic_fluent_code_py_rectangle_16_regular.svg
 * 
 * @return The [ImageVector] for the CodePyRectangle icon.
 */
public val FluentIcons.Regular.CodePyRectangle: ImageVector
    get() {
        if (_codePyRectangle != null) {
            return _codePyRectangle!!
        }
        _codePyRectangle = Builder(name = "CodePyRectangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 6.0f)
                horizontalLineTo(5.5f)
                curveTo(5.898f, 6.0f, 6.279f, 6.158f, 6.561f, 6.439f)
                curveTo(6.842f, 6.721f, 7.0f, 7.102f, 7.0f, 7.5f)
                curveTo(7.0f, 7.898f, 6.842f, 8.279f, 6.561f, 8.561f)
                curveTo(6.279f, 8.842f, 5.898f, 9.0f, 5.5f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 10.633f, 4.947f, 10.76f, 4.854f, 10.854f)
                curveTo(4.76f, 10.947f, 4.633f, 11.0f, 4.5f, 11.0f)
                curveTo(4.367f, 11.0f, 4.24f, 10.947f, 4.146f, 10.854f)
                curveTo(4.053f, 10.76f, 4.0f, 10.633f, 4.0f, 10.5f)
                verticalLineTo(6.5f)
                curveTo(4.0f, 6.367f, 4.053f, 6.24f, 4.146f, 6.146f)
                curveTo(4.24f, 6.053f, 4.367f, 6.0f, 4.5f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineTo(5.5f)
                curveTo(5.633f, 8.0f, 5.76f, 7.947f, 5.854f, 7.854f)
                curveTo(5.947f, 7.76f, 6.0f, 7.633f, 6.0f, 7.5f)
                curveTo(6.0f, 7.367f, 5.947f, 7.24f, 5.854f, 7.146f)
                curveTo(5.76f, 7.053f, 5.633f, 7.0f, 5.5f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(10.0f, 8.666f)
                lineTo(11.4f, 6.8f)
                curveTo(11.48f, 6.694f, 11.514f, 6.561f, 11.495f, 6.429f)
                curveTo(11.476f, 6.298f, 11.406f, 6.18f, 11.3f, 6.1f)
                curveTo(11.194f, 6.02f, 11.061f, 5.986f, 10.929f, 6.005f)
                curveTo(10.798f, 6.024f, 10.68f, 6.094f, 10.6f, 6.2f)
                lineTo(9.5f, 7.667f)
                lineTo(8.4f, 6.2f)
                curveTo(8.32f, 6.094f, 8.202f, 6.024f, 8.071f, 6.005f)
                curveTo(7.939f, 5.986f, 7.806f, 6.02f, 7.7f, 6.1f)
                curveTo(7.647f, 6.139f, 7.603f, 6.189f, 7.57f, 6.245f)
                curveTo(7.536f, 6.302f, 7.514f, 6.364f, 7.505f, 6.429f)
                curveTo(7.496f, 6.494f, 7.499f, 6.56f, 7.516f, 6.624f)
                curveTo(7.532f, 6.688f, 7.561f, 6.747f, 7.6f, 6.8f)
                lineTo(9.0f, 8.666f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 10.633f, 9.053f, 10.76f, 9.146f, 10.854f)
                curveTo(9.24f, 10.947f, 9.367f, 11.0f, 9.5f, 11.0f)
                curveTo(9.633f, 11.0f, 9.76f, 10.947f, 9.854f, 10.854f)
                curveTo(9.947f, 10.76f, 10.0f, 10.633f, 10.0f, 10.5f)
                verticalLineTo(8.666f)
                close()
                moveTo(2.75f, 3.0f)
                curveTo(1.783f, 3.0f, 1.0f, 3.783f, 1.0f, 4.75f)
                verticalLineTo(12.25f)
                curveTo(1.0f, 13.217f, 1.783f, 14.0f, 2.75f, 14.0f)
                horizontalLineTo(12.25f)
                curveTo(13.217f, 14.0f, 14.0f, 13.217f, 14.0f, 12.25f)
                verticalLineTo(4.75f)
                curveTo(14.0f, 3.783f, 13.217f, 3.0f, 12.25f, 3.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 4.75f)
                curveTo(2.0f, 4.336f, 2.336f, 4.0f, 2.75f, 4.0f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 4.0f, 13.0f, 4.336f, 13.0f, 4.75f)
                verticalLineTo(12.25f)
                curveTo(13.0f, 12.664f, 12.664f, 13.0f, 12.25f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.0f, 2.0f, 12.664f, 2.0f, 12.25f)
                verticalLineTo(4.75f)
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
        Image(imageVector = FluentIcons.Regular.CodePyRectangle, contentDescription = null)
    }
}

