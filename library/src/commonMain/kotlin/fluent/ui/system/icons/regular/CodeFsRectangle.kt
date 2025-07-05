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
 * CodeFsRectangle Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent F# project node.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_fs_rectangle_16_regular.svg)
 * 
 * @return The [ImageVector] for the CodeFsRectangle icon.
 */
public val FluentIcons.Regular.CodeFsRectangle: ImageVector
    get() {
        if (_codeFsRectangle != null) {
            return _codeFsRectangle!!
        }
        _codeFsRectangle = Builder(name = "CodeFsRectangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.991f, 6.402f)
                curveTo(5.972f, 6.305f, 5.924f, 6.216f, 5.854f, 6.146f)
                curveTo(5.807f, 6.1f, 5.752f, 6.063f, 5.692f, 6.038f)
                curveTo(5.631f, 6.013f, 5.566f, 6.0f, 5.5f, 6.0f)
                horizontalLineTo(3.5f)
                curveTo(3.367f, 6.0f, 3.24f, 6.053f, 3.146f, 6.146f)
                curveTo(3.053f, 6.24f, 3.0f, 6.367f, 3.0f, 6.5f)
                verticalLineTo(10.5f)
                curveTo(3.0f, 10.633f, 3.053f, 10.76f, 3.146f, 10.854f)
                curveTo(3.24f, 10.947f, 3.367f, 11.0f, 3.5f, 11.0f)
                curveTo(3.633f, 11.0f, 3.76f, 10.947f, 3.854f, 10.854f)
                curveTo(3.947f, 10.76f, 4.0f, 10.633f, 4.0f, 10.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                curveTo(5.133f, 9.0f, 5.26f, 8.947f, 5.354f, 8.854f)
                curveTo(5.447f, 8.76f, 5.5f, 8.633f, 5.5f, 8.5f)
                curveTo(5.5f, 8.367f, 5.447f, 8.24f, 5.354f, 8.146f)
                curveTo(5.26f, 8.053f, 5.133f, 8.0f, 5.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.5f)
                curveTo(5.599f, 7.0f, 5.696f, 6.971f, 5.778f, 6.916f)
                curveTo(5.861f, 6.861f, 5.925f, 6.783f, 5.963f, 6.691f)
                curveTo(6.001f, 6.6f, 6.011f, 6.499f, 5.991f, 6.402f)
                close()
                moveTo(11.854f, 9.854f)
                curveTo(11.947f, 9.76f, 12.0f, 9.633f, 12.0f, 9.5f)
                curveTo(12.0f, 9.367f, 11.947f, 9.24f, 11.854f, 9.146f)
                curveTo(11.76f, 9.053f, 11.633f, 9.0f, 11.5f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.5f)
                curveTo(11.633f, 8.0f, 11.76f, 7.947f, 11.854f, 7.854f)
                curveTo(11.947f, 7.76f, 12.0f, 7.633f, 12.0f, 7.5f)
                curveTo(12.0f, 7.367f, 11.947f, 7.24f, 11.854f, 7.146f)
                curveTo(11.76f, 7.053f, 11.633f, 7.0f, 11.5f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 6.367f, 10.947f, 6.24f, 10.854f, 6.146f)
                curveTo(10.76f, 6.053f, 10.633f, 6.0f, 10.5f, 6.0f)
                curveTo(10.367f, 6.0f, 10.24f, 6.053f, 10.146f, 6.146f)
                curveTo(10.053f, 6.24f, 10.0f, 6.367f, 10.0f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.5f)
                curveTo(9.0f, 6.367f, 8.947f, 6.24f, 8.854f, 6.146f)
                curveTo(8.76f, 6.053f, 8.633f, 6.0f, 8.5f, 6.0f)
                curveTo(8.367f, 6.0f, 8.24f, 6.053f, 8.146f, 6.146f)
                curveTo(8.053f, 6.24f, 8.0f, 6.367f, 8.0f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.5f)
                curveTo(7.367f, 7.0f, 7.24f, 7.053f, 7.146f, 7.146f)
                curveTo(7.053f, 7.24f, 7.0f, 7.367f, 7.0f, 7.5f)
                curveTo(7.0f, 7.633f, 7.053f, 7.76f, 7.146f, 7.854f)
                curveTo(7.24f, 7.947f, 7.367f, 8.0f, 7.5f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                curveTo(7.367f, 9.0f, 7.24f, 9.053f, 7.146f, 9.146f)
                curveTo(7.053f, 9.24f, 7.0f, 9.367f, 7.0f, 9.5f)
                curveTo(7.0f, 9.633f, 7.053f, 9.76f, 7.146f, 9.854f)
                curveTo(7.24f, 9.947f, 7.367f, 10.0f, 7.5f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.5f)
                curveTo(8.0f, 10.633f, 8.053f, 10.76f, 8.146f, 10.854f)
                curveTo(8.24f, 10.947f, 8.367f, 11.0f, 8.5f, 11.0f)
                curveTo(8.633f, 11.0f, 8.76f, 10.947f, 8.854f, 10.854f)
                curveTo(8.947f, 10.76f, 9.0f, 10.633f, 9.0f, 10.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.5f)
                curveTo(10.0f, 10.633f, 10.053f, 10.76f, 10.146f, 10.854f)
                curveTo(10.24f, 10.947f, 10.367f, 11.0f, 10.5f, 11.0f)
                curveTo(10.633f, 11.0f, 10.76f, 10.947f, 10.854f, 10.854f)
                curveTo(10.947f, 10.76f, 11.0f, 10.633f, 11.0f, 10.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.5f)
                curveTo(11.633f, 10.0f, 11.76f, 9.947f, 11.854f, 9.854f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
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
        return _codeFsRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _codeFsRectangle: ImageVector? = null

@Preview
@Composable
private fun CodeFsRectanglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeFsRectangle, contentDescription = "CodeFsRectangle Icon")
    }
}

