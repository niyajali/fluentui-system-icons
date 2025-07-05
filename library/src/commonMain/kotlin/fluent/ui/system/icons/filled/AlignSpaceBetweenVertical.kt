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
 * AlignSpaceBetweenVertical Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to align content.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_align_space_between_vertical_20_filled.svg)
 * 
 * @return The [ImageVector] for the AlignSpaceBetweenVertical icon.
 */
public val FluentIcons.Filled.AlignSpaceBetweenVertical: ImageVector
    get() {
        if (_alignSpaceBetweenVertical != null) {
            return _alignSpaceBetweenVertical!!
        }
        _alignSpaceBetweenVertical = Builder(name = "AlignSpaceBetweenVertical", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveTo(1.895f, 4.0f, 1.0f, 4.895f, 1.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(1.0f, 15.105f, 1.895f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(4.0f)
                curveTo(5.105f, 16.0f, 6.0f, 15.105f, 6.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(6.0f, 4.895f, 5.105f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(14.895f, 4.0f, 14.0f, 4.895f, 14.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 15.105f, 14.895f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(17.0f)
                curveTo(18.105f, 16.0f, 19.0f, 15.105f, 19.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(19.0f, 4.895f, 18.105f, 4.0f, 17.0f, 4.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _alignSpaceBetweenVertical!!
    }

@Suppress("ObjectPropertyName")
private var _alignSpaceBetweenVertical: ImageVector? = null

@Preview
@Composable
private fun AlignSpaceBetweenVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AlignSpaceBetweenVertical, contentDescription = "AlignSpaceBetweenVertical Icon")
    }
}

