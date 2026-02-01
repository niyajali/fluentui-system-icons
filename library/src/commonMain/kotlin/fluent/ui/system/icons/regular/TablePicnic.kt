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
 * TablePicnic Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a picnic table.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_picnic_20_regular.svg)
 * 
 * @return The [ImageVector] for the TablePicnic icon.
 */
public val FluentIcons.Regular.TablePicnic: ImageVector
    get() {
        if (_tablePicnic != null) {
            return _tablePicnic!!
        }
        _tablePicnic = Builder(name = "TablePicnic", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.955f, 15.707f)
                curveTo(3.841f, 15.958f, 3.544f, 16.069f, 3.293f, 15.955f)
                curveTo(3.042f, 15.841f, 2.931f, 15.544f, 3.045f, 15.293f)
                lineTo(4.542f, 12.0f)
                horizontalLineTo(5.641f)
                lineTo(3.955f, 15.707f)
                close()
                moveTo(16.955f, 15.293f)
                curveTo(17.069f, 15.544f, 16.958f, 15.841f, 16.707f, 15.955f)
                curveTo(16.456f, 16.069f, 16.159f, 15.958f, 16.045f, 15.707f)
                lineTo(14.359f, 12.0f)
                horizontalLineTo(15.458f)
                lineTo(16.955f, 15.293f)
                close()
                moveTo(6.55f, 10.0f)
                horizontalLineTo(13.45f)
                lineTo(11.632f, 6.0f)
                horizontalLineTo(12.731f)
                lineTo(14.55f, 10.0f)
                horizontalLineTo(18.5f)
                curveTo(18.776f, 10.0f, 19.0f, 10.224f, 19.0f, 10.5f)
                curveTo(19.0f, 10.776f, 18.776f, 11.0f, 18.5f, 11.0f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 11.0f, 1.0f, 10.776f, 1.0f, 10.5f)
                curveTo(1.0f, 10.224f, 1.224f, 10.0f, 1.5f, 10.0f)
                horizontalLineTo(5.45f)
                lineTo(7.269f, 6.0f)
                horizontalLineTo(8.368f)
                lineTo(6.55f, 10.0f)
                close()
                moveTo(15.5f, 4.0f)
                curveTo(15.776f, 4.0f, 16.0f, 4.224f, 16.0f, 4.5f)
                curveTo(16.0f, 4.776f, 15.776f, 5.0f, 15.5f, 5.0f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 5.0f, 4.0f, 4.776f, 4.0f, 4.5f)
                curveTo(4.0f, 4.224f, 4.224f, 4.0f, 4.5f, 4.0f)
                horizontalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _tablePicnic!!
    }

@Suppress("ObjectPropertyName")
private var _tablePicnic: ImageVector? = null

@Preview
@Composable
private fun TablePicnicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TablePicnic, contentDescription = "TablePicnic Icon")
    }
}

