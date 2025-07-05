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
 * AlignSpaceAroundVertical Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to align content.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_align_space_around_vertical_20_regular.svg)
 * 
 * @return The [ImageVector] for the AlignSpaceAroundVertical icon.
 */
public val FluentIcons.Regular.AlignSpaceAroundVertical: ImageVector
    get() {
        if (_alignSpaceAroundVertical != null) {
            return _alignSpaceAroundVertical!!
        }
        _alignSpaceAroundVertical = Builder(name = "AlignSpaceAroundVertical", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(8.105f, 4.0f, 9.0f, 4.895f, 9.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(9.0f, 15.105f, 8.105f, 16.0f, 7.0f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 16.0f, 4.0f, 15.105f, 4.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 4.895f, 4.895f, 4.0f, 6.0f, 4.0f)
                close()
                moveTo(5.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(5.0f, 14.552f, 5.448f, 15.0f, 6.0f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(7.552f, 15.0f, 8.0f, 14.552f, 8.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 5.448f, 7.552f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 5.0f, 5.0f, 5.448f, 5.0f, 6.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(11.895f, 4.0f, 11.0f, 4.895f, 11.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(11.0f, 15.105f, 11.895f, 16.0f, 13.0f, 16.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 16.0f, 16.0f, 15.105f, 16.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 4.895f, 15.105f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(12.0f, 5.448f, 12.448f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 5.0f, 15.0f, 5.448f, 15.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 14.552f, 14.552f, 15.0f, 14.0f, 15.0f)
                horizontalLineTo(13.0f)
                curveTo(12.448f, 15.0f, 12.0f, 14.552f, 12.0f, 14.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _alignSpaceAroundVertical!!
    }

@Suppress("ObjectPropertyName")
private var _alignSpaceAroundVertical: ImageVector? = null

@Preview
@Composable
private fun AlignSpaceAroundVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlignSpaceAroundVertical, contentDescription = "AlignSpaceAroundVertical Icon")
    }
}

