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
 * ArrowJoin Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent the action of merging (code, design, or general). Also connected with Merge.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_join_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowJoin icon.
 */
public val FluentIcons.Filled.ArrowJoin: ImageVector
    get() {
        if (_arrowJoin != null) {
            return _arrowJoin!!
        }
        _arrowJoin = Builder(name = "ArrowJoin", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 2.0f)
                curveTo(4.776f, 2.0f, 5.0f, 2.224f, 5.0f, 2.5f)
                curveTo(5.0f, 6.124f, 7.876f, 9.0f, 11.5f, 9.0f)
                horizontalLineTo(12.293f)
                lineTo(11.146f, 7.854f)
                curveTo(10.951f, 7.658f, 10.951f, 7.342f, 11.146f, 7.146f)
                curveTo(11.342f, 6.951f, 11.658f, 6.951f, 11.854f, 7.146f)
                lineTo(13.854f, 9.146f)
                curveTo(14.049f, 9.342f, 14.049f, 9.658f, 13.854f, 9.854f)
                lineTo(11.854f, 11.854f)
                curveTo(11.658f, 12.049f, 11.342f, 12.049f, 11.146f, 11.854f)
                curveTo(10.951f, 11.658f, 10.951f, 11.342f, 11.146f, 11.146f)
                lineTo(12.293f, 10.0f)
                horizontalLineTo(11.5f)
                curveTo(7.876f, 10.0f, 5.0f, 12.876f, 5.0f, 16.5f)
                curveTo(5.0f, 16.776f, 4.776f, 17.0f, 4.5f, 17.0f)
                curveTo(4.224f, 17.0f, 4.0f, 16.776f, 4.0f, 16.5f)
                curveTo(4.0f, 13.287f, 5.968f, 10.578f, 8.777f, 9.5f)
                curveTo(5.968f, 8.422f, 4.0f, 5.713f, 4.0f, 2.5f)
                curveTo(4.0f, 2.224f, 4.224f, 2.0f, 4.5f, 2.0f)
                close()
                moveTo(10.032f, 11.193f)
                curveTo(8.783f, 11.529f, 7.72f, 12.287f, 7.0f, 13.309f)
                verticalLineTo(14.0f)
                curveTo(7.0f, 15.105f, 7.895f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 16.0f, 17.0f, 15.105f, 17.0f, 14.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.895f, 16.105f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(7.895f, 3.0f, 7.0f, 3.895f, 7.0f, 5.0f)
                verticalLineTo(5.691f)
                curveTo(7.72f, 6.713f, 8.783f, 7.471f, 10.032f, 7.807f)
                curveTo(9.932f, 7.329f, 10.068f, 6.811f, 10.439f, 6.439f)
                curveTo(11.025f, 5.854f, 11.975f, 5.854f, 12.561f, 6.439f)
                lineTo(14.561f, 8.439f)
                curveTo(15.146f, 9.025f, 15.146f, 9.975f, 14.561f, 10.561f)
                lineTo(12.561f, 12.561f)
                curveTo(11.975f, 13.146f, 11.025f, 13.146f, 10.439f, 12.561f)
                curveTo(10.068f, 12.189f, 9.932f, 11.671f, 10.032f, 11.193f)
                close()
            }
        }
        .build()
        return _arrowJoin!!
    }

@Suppress("ObjectPropertyName")
private var _arrowJoin: ImageVector? = null

@Preview
@Composable
private fun ArrowJoinPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowJoin, contentDescription = "ArrowJoin Icon")
    }
}

