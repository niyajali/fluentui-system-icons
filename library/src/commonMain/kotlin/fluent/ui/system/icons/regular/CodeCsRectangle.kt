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
 * CodeCsRectangle Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent C# project node.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_cs_rectangle_16_regular.svg)
 * 
 * @return The [ImageVector] for the CodeCsRectangle icon.
 */
public val FluentIcons.Regular.CodeCsRectangle: ImageVector
    get() {
        if (_codeCsRectangle != null) {
            return _codeCsRectangle!!
        }
        _codeCsRectangle = Builder(name = "CodeCsRectangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 9.5f)
                verticalLineTo(7.5f)
                curveTo(4.0f, 7.367f, 4.053f, 7.24f, 4.146f, 7.146f)
                curveTo(4.24f, 7.053f, 4.367f, 7.0f, 4.5f, 7.0f)
                curveTo(4.633f, 7.0f, 4.76f, 7.053f, 4.854f, 7.146f)
                curveTo(4.947f, 7.24f, 5.0f, 7.367f, 5.0f, 7.5f)
                curveTo(5.0f, 7.633f, 5.053f, 7.76f, 5.146f, 7.854f)
                curveTo(5.24f, 7.947f, 5.367f, 8.0f, 5.5f, 8.0f)
                curveTo(5.633f, 8.0f, 5.76f, 7.947f, 5.854f, 7.854f)
                curveTo(5.947f, 7.76f, 6.0f, 7.633f, 6.0f, 7.5f)
                curveTo(6.0f, 7.102f, 5.842f, 6.721f, 5.561f, 6.439f)
                curveTo(5.279f, 6.158f, 4.898f, 6.0f, 4.5f, 6.0f)
                curveTo(4.102f, 6.0f, 3.721f, 6.158f, 3.439f, 6.439f)
                curveTo(3.158f, 6.721f, 3.0f, 7.102f, 3.0f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 9.898f, 3.158f, 10.279f, 3.439f, 10.561f)
                curveTo(3.721f, 10.842f, 4.102f, 11.0f, 4.5f, 11.0f)
                curveTo(4.898f, 11.0f, 5.279f, 10.842f, 5.561f, 10.561f)
                curveTo(5.842f, 10.279f, 6.0f, 9.898f, 6.0f, 9.5f)
                curveTo(6.0f, 9.367f, 5.947f, 9.24f, 5.854f, 9.146f)
                curveTo(5.76f, 9.053f, 5.633f, 9.0f, 5.5f, 9.0f)
                curveTo(5.367f, 9.0f, 5.24f, 9.053f, 5.146f, 9.146f)
                curveTo(5.053f, 9.24f, 5.0f, 9.367f, 5.0f, 9.5f)
                curveTo(5.0f, 9.633f, 4.947f, 9.76f, 4.854f, 9.854f)
                curveTo(4.76f, 9.947f, 4.633f, 10.0f, 4.5f, 10.0f)
                curveTo(4.367f, 10.0f, 4.24f, 9.947f, 4.146f, 9.854f)
                curveTo(4.053f, 9.76f, 4.0f, 9.633f, 4.0f, 9.5f)
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
        return _codeCsRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _codeCsRectangle: ImageVector? = null

@Preview
@Composable
private fun CodeCsRectanglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeCsRectangle, contentDescription = "CodeCsRectangle Icon")
    }
}

