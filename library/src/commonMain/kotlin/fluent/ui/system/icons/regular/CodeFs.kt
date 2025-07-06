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
 * CodeFs Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent F# language.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_fs_16_regular.svg)
 * 
 * @return The [ImageVector] for the CodeFs icon.
 */
public val FluentIcons.Regular.CodeFs: ImageVector
    get() {
        if (_codeFs != null) {
            return _codeFs!!
        }
        _codeFs = Builder(name = "CodeFs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.25f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.25f)
                curveTo(14.383f, 7.0f, 14.51f, 6.947f, 14.604f, 6.854f)
                curveTo(14.697f, 6.76f, 14.75f, 6.633f, 14.75f, 6.5f)
                curveTo(14.75f, 6.367f, 14.697f, 6.24f, 14.604f, 6.146f)
                curveTo(14.51f, 6.053f, 14.383f, 6.0f, 14.25f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 4.867f, 12.947f, 4.74f, 12.854f, 4.646f)
                curveTo(12.76f, 4.553f, 12.633f, 4.5f, 12.5f, 4.5f)
                curveTo(12.367f, 4.5f, 12.24f, 4.553f, 12.146f, 4.646f)
                curveTo(12.053f, 4.74f, 12.0f, 4.867f, 12.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                curveTo(10.0f, 4.867f, 9.947f, 4.74f, 9.854f, 4.646f)
                curveTo(9.76f, 4.553f, 9.633f, 4.5f, 9.5f, 4.5f)
                curveTo(9.367f, 4.5f, 9.24f, 4.553f, 9.146f, 4.646f)
                curveTo(9.053f, 4.74f, 9.0f, 4.867f, 9.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.867f, 6.0f, 7.74f, 6.053f, 7.646f, 6.146f)
                curveTo(7.553f, 6.24f, 7.5f, 6.367f, 7.5f, 6.5f)
                curveTo(7.5f, 6.633f, 7.553f, 6.76f, 7.646f, 6.854f)
                curveTo(7.74f, 6.947f, 7.867f, 7.0f, 8.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.867f, 9.0f, 7.74f, 9.053f, 7.646f, 9.146f)
                curveTo(7.553f, 9.24f, 7.5f, 9.367f, 7.5f, 9.5f)
                curveTo(7.5f, 9.633f, 7.553f, 9.76f, 7.646f, 9.854f)
                curveTo(7.74f, 9.947f, 7.867f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 11.133f, 9.053f, 11.26f, 9.146f, 11.354f)
                curveTo(9.24f, 11.447f, 9.367f, 11.5f, 9.5f, 11.5f)
                curveTo(9.633f, 11.5f, 9.76f, 11.447f, 9.854f, 11.354f)
                curveTo(9.947f, 11.26f, 10.0f, 11.133f, 10.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                curveTo(12.0f, 11.133f, 12.053f, 11.26f, 12.146f, 11.354f)
                curveTo(12.24f, 11.447f, 12.367f, 11.5f, 12.5f, 11.5f)
                curveTo(12.633f, 11.5f, 12.76f, 11.447f, 12.854f, 11.354f)
                curveTo(12.947f, 11.26f, 13.0f, 11.133f, 13.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.25f)
                curveTo(14.383f, 10.0f, 14.51f, 9.947f, 14.604f, 9.854f)
                curveTo(14.697f, 9.76f, 14.75f, 9.633f, 14.75f, 9.5f)
                curveTo(14.75f, 9.367f, 14.697f, 9.24f, 14.604f, 9.146f)
                curveTo(14.51f, 9.053f, 14.383f, 9.0f, 14.25f, 9.0f)
                close()
                moveTo(10.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(6.5f, 4.5f)
                curveTo(6.5f, 4.633f, 6.447f, 4.76f, 6.354f, 4.854f)
                curveTo(6.26f, 4.947f, 6.133f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(5.5f)
                curveTo(5.633f, 7.5f, 5.76f, 7.553f, 5.854f, 7.646f)
                curveTo(5.947f, 7.74f, 6.0f, 7.867f, 6.0f, 8.0f)
                curveTo(6.0f, 8.133f, 5.947f, 8.26f, 5.854f, 8.354f)
                curveTo(5.76f, 8.447f, 5.633f, 8.5f, 5.5f, 8.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.5f)
                curveTo(3.0f, 11.633f, 2.947f, 11.76f, 2.854f, 11.854f)
                curveTo(2.76f, 11.947f, 2.633f, 12.0f, 2.5f, 12.0f)
                curveTo(2.367f, 12.0f, 2.24f, 11.947f, 2.146f, 11.854f)
                curveTo(2.053f, 11.76f, 2.0f, 11.633f, 2.0f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(2.0f, 4.367f, 2.053f, 4.24f, 2.146f, 4.146f)
                curveTo(2.24f, 4.053f, 2.367f, 4.0f, 2.5f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(6.133f, 4.0f, 6.26f, 4.053f, 6.354f, 4.146f)
                curveTo(6.447f, 4.24f, 6.5f, 4.367f, 6.5f, 4.5f)
                close()
            }
        }
        .build()
        return _codeFs!!
    }

@Suppress("ObjectPropertyName")
private var _codeFs: ImageVector? = null

@Preview
@Composable
private fun CodeFsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeFs, contentDescription = "CodeFs Icon")
    }
}

