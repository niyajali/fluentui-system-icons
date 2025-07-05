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
 * CodeCs Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent C# language.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_cs_16_regular.svg)
 * 
 * @return The [ImageVector] for the CodeCs icon.
 */
public val FluentIcons.Regular.CodeCs: ImageVector
    get() {
        if (_codeCs != null) {
            return _codeCs!!
        }
        _codeCs = Builder(name = "CodeCs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 5.0f)
                curveTo(3.102f, 5.0f, 2.721f, 5.158f, 2.439f, 5.439f)
                curveTo(2.158f, 5.721f, 2.0f, 6.102f, 2.0f, 6.5f)
                verticalLineTo(9.5f)
                curveTo(2.0f, 9.898f, 2.158f, 10.279f, 2.439f, 10.561f)
                curveTo(2.721f, 10.842f, 3.102f, 11.0f, 3.5f, 11.0f)
                curveTo(3.898f, 11.0f, 4.279f, 10.842f, 4.561f, 10.561f)
                curveTo(4.842f, 10.279f, 5.0f, 9.898f, 5.0f, 9.5f)
                curveTo(5.0f, 9.224f, 5.224f, 9.0f, 5.5f, 9.0f)
                curveTo(5.776f, 9.0f, 6.0f, 9.224f, 6.0f, 9.5f)
                curveTo(6.0f, 10.163f, 5.737f, 10.799f, 5.268f, 11.268f)
                curveTo(4.799f, 11.737f, 4.163f, 12.0f, 3.5f, 12.0f)
                curveTo(2.837f, 12.0f, 2.201f, 11.737f, 1.732f, 11.268f)
                curveTo(1.263f, 10.799f, 1.0f, 10.163f, 1.0f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(1.0f, 5.837f, 1.263f, 5.201f, 1.732f, 4.732f)
                curveTo(2.201f, 4.263f, 2.837f, 4.0f, 3.5f, 4.0f)
                curveTo(4.163f, 4.0f, 4.799f, 4.263f, 5.268f, 4.732f)
                curveTo(5.737f, 5.201f, 6.0f, 5.837f, 6.0f, 6.5f)
                curveTo(6.0f, 6.776f, 5.776f, 7.0f, 5.5f, 7.0f)
                curveTo(5.224f, 7.0f, 5.0f, 6.776f, 5.0f, 6.5f)
                curveTo(5.0f, 6.102f, 4.842f, 5.721f, 4.561f, 5.439f)
                curveTo(4.279f, 5.158f, 3.898f, 5.0f, 3.5f, 5.0f)
                close()
                moveTo(9.5f, 4.5f)
                curveTo(9.776f, 4.5f, 10.0f, 4.724f, 10.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                curveTo(12.0f, 4.724f, 12.224f, 4.5f, 12.5f, 4.5f)
                curveTo(12.776f, 4.5f, 13.0f, 4.724f, 13.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.25f)
                curveTo(14.526f, 6.0f, 14.75f, 6.224f, 14.75f, 6.5f)
                curveTo(14.75f, 6.776f, 14.526f, 7.0f, 14.25f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.25f)
                curveTo(14.526f, 9.0f, 14.75f, 9.224f, 14.75f, 9.5f)
                curveTo(14.75f, 9.776f, 14.526f, 10.0f, 14.25f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 11.276f, 12.776f, 11.5f, 12.5f, 11.5f)
                curveTo(12.224f, 11.5f, 12.0f, 11.276f, 12.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                curveTo(10.0f, 11.276f, 9.776f, 11.5f, 9.5f, 11.5f)
                curveTo(9.224f, 11.5f, 9.0f, 11.276f, 9.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                curveTo(7.724f, 10.0f, 7.5f, 9.776f, 7.5f, 9.5f)
                curveTo(7.5f, 9.224f, 7.724f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                curveTo(7.724f, 7.0f, 7.5f, 6.776f, 7.5f, 6.5f)
                curveTo(7.5f, 6.224f, 7.724f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 4.724f, 9.224f, 4.5f, 9.5f, 4.5f)
                close()
                moveTo(10.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _codeCs!!
    }

@Suppress("ObjectPropertyName")
private var _codeCs: ImageVector? = null

@Preview
@Composable
private fun CodeCsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeCs, contentDescription = "CodeCs Icon")
    }
}

