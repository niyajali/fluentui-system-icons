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
 * TablePicnic Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a picnic table.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_picnic_20_filled.svg)
 * 
 * @return The [ImageVector] for the TablePicnic icon.
 */
public val FluentIcons.Filled.TablePicnic: ImageVector
    get() {
        if (_tablePicnic != null) {
            return _tablePicnic!!
        }
        _tablePicnic = Builder(name = "TablePicnic", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.441f, 16.042f)
                curveTo(4.28f, 16.423f, 3.84f, 16.603f, 3.458f, 16.441f)
                curveTo(3.077f, 16.28f, 2.898f, 15.839f, 3.059f, 15.458f)
                lineTo(4.308f, 12.5f)
                horizontalLineTo(5.937f)
                lineTo(4.441f, 16.042f)
                close()
                moveTo(16.941f, 15.458f)
                curveTo(17.103f, 15.84f, 16.924f, 16.28f, 16.542f, 16.441f)
                curveTo(16.16f, 16.602f, 15.72f, 16.423f, 15.559f, 16.042f)
                lineTo(14.064f, 12.5f)
                horizontalLineTo(15.692f)
                lineTo(16.941f, 15.458f)
                close()
                moveTo(6.993f, 10.0f)
                horizontalLineTo(13.007f)
                lineTo(11.318f, 6.0f)
                horizontalLineTo(12.948f)
                lineTo(14.637f, 10.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 10.0f, 19.0f, 10.336f, 19.0f, 10.75f)
                curveTo(19.0f, 11.164f, 18.664f, 11.5f, 18.25f, 11.5f)
                horizontalLineTo(1.75f)
                curveTo(1.336f, 11.5f, 1.0f, 11.164f, 1.0f, 10.75f)
                curveTo(1.0f, 10.336f, 1.336f, 10.0f, 1.75f, 10.0f)
                horizontalLineTo(5.363f)
                lineTo(7.052f, 6.0f)
                horizontalLineTo(8.682f)
                lineTo(6.993f, 10.0f)
                close()
                moveTo(15.25f, 3.5f)
                curveTo(15.664f, 3.5f, 16.0f, 3.836f, 16.0f, 4.25f)
                curveTo(16.0f, 4.664f, 15.664f, 5.0f, 15.25f, 5.0f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 5.0f, 4.0f, 4.664f, 4.0f, 4.25f)
                curveTo(4.0f, 3.836f, 4.336f, 3.5f, 4.75f, 3.5f)
                horizontalLineTo(15.25f)
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
        Image(imageVector = FluentIcons.Filled.TablePicnic, contentDescription = "TablePicnic Icon")
    }
}

