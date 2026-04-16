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
 * ArrowFlowSquareMultiple Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon, outlook
 * - Description: Used for scenarios involving connection points.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_flow_square_multiple_24_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowFlowSquareMultiple icon.
 */
public val FluentIcons.Filled.ArrowFlowSquareMultiple: ImageVector
    get() {
        if (_arrowFlowSquareMultiple != null) {
            return _arrowFlowSquareMultiple!!
        }
        _arrowFlowSquareMultiple = Builder(name = "ArrowFlowSquareMultiple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.998f, 6.01f)
                curveTo(20.676f, 6.138f, 21.997f, 7.54f, 21.997f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(21.997f, 19.202f, 19.199f, 22.0f, 15.747f, 22.0f)
                horizontalLineTo(9.247f)
                curveTo(7.536f, 22.0f, 6.136f, 20.678f, 6.008f, 19.0f)
                horizontalLineTo(14.748f)
                curveTo(17.095f, 19.0f, 18.998f, 17.097f, 18.998f, 14.75f)
                verticalLineTo(6.01f)
                close()
                moveTo(14.75f, 2.0f)
                curveTo(16.545f, 2.0f, 18.0f, 3.455f, 18.0f, 5.25f)
                verticalLineTo(14.75f)
                curveTo(18.0f, 16.545f, 16.545f, 18.0f, 14.75f, 18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18.0f, 2.0f, 16.545f, 2.0f, 14.75f)
                verticalLineTo(10.135f)
                curveTo(2.237f, 10.209f, 2.489f, 10.25f, 2.75f, 10.25f)
                curveTo(3.869f, 10.25f, 4.816f, 9.514f, 5.135f, 8.5f)
                horizontalLineTo(5.6f)
                curveTo(6.707f, 8.5f, 7.746f, 9.035f, 8.39f, 9.936f)
                curveTo(9.315f, 11.231f, 10.809f, 12.0f, 12.4f, 12.0f)
                horizontalLineTo(13.439f)
                lineTo(11.72f, 13.72f)
                curveTo(11.427f, 14.013f, 11.427f, 14.487f, 11.72f, 14.78f)
                curveTo(12.013f, 15.073f, 12.487f, 15.073f, 12.78f, 14.78f)
                lineTo(15.78f, 11.78f)
                curveTo(16.073f, 11.487f, 16.073f, 11.013f, 15.78f, 10.72f)
                lineTo(12.78f, 7.72f)
                curveTo(12.487f, 7.427f, 12.013f, 7.427f, 11.72f, 7.72f)
                curveTo(11.427f, 8.013f, 11.427f, 8.487f, 11.72f, 8.78f)
                lineTo(13.439f, 10.5f)
                horizontalLineTo(12.4f)
                curveTo(11.293f, 10.5f, 10.254f, 9.965f, 9.61f, 9.064f)
                curveTo(8.685f, 7.769f, 7.191f, 7.0f, 5.6f, 7.0f)
                horizontalLineTo(5.135f)
                curveTo(4.816f, 5.986f, 3.869f, 5.25f, 2.75f, 5.25f)
                curveTo(2.489f, 5.25f, 2.237f, 5.29f, 2.0f, 5.364f)
                verticalLineTo(5.25f)
                curveTo(2.0f, 3.455f, 3.455f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(14.75f)
                close()
                moveTo(2.75f, 6.75f)
                curveTo(3.302f, 6.75f, 3.75f, 7.198f, 3.75f, 7.75f)
                curveTo(3.75f, 8.302f, 3.302f, 8.75f, 2.75f, 8.75f)
                curveTo(2.198f, 8.75f, 1.75f, 8.302f, 1.75f, 7.75f)
                curveTo(1.75f, 7.198f, 2.198f, 6.75f, 2.75f, 6.75f)
                close()
            }
        }
        .build()
        return _arrowFlowSquareMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _arrowFlowSquareMultiple: ImageVector? = null

@Preview
@Composable
private fun ArrowFlowSquareMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowFlowSquareMultiple, contentDescription = "ArrowFlowSquareMultiple Icon")
    }
}

