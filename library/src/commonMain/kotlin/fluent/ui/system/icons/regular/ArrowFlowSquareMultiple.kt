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
 * ArrowFlowSquareMultiple Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, outlook
 * - Description: Used for scenarios involving connection points.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_flow_square_multiple_24_regular.svg)
 * 
 * @return The [ImageVector] for the ArrowFlowSquareMultiple icon.
 */
public val FluentIcons.Regular.ArrowFlowSquareMultiple: ImageVector
    get() {
        if (_arrowFlowSquareMultiple != null) {
            return _arrowFlowSquareMultiple!!
        }
        _arrowFlowSquareMultiple = Builder(name = "ArrowFlowSquareMultiple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.001f, 6.01f)
                curveTo(20.679f, 6.137f, 22.001f, 7.539f, 22.001f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(22.001f, 19.202f, 19.203f, 22.0f, 15.751f, 22.0f)
                horizontalLineTo(9.251f)
                curveTo(7.54f, 22.0f, 6.139f, 20.678f, 6.012f, 19.0f)
                horizontalLineTo(7.521f)
                curveTo(7.642f, 19.848f, 8.369f, 20.5f, 9.251f, 20.5f)
                horizontalLineTo(15.751f)
                curveTo(18.374f, 20.5f, 20.501f, 18.373f, 20.501f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(20.501f, 8.368f, 19.849f, 7.641f, 19.001f, 7.52f)
                verticalLineTo(6.01f)
                close()
                moveTo(14.75f, 2.0f)
                curveTo(16.545f, 2.0f, 18.0f, 3.455f, 18.0f, 5.25f)
                verticalLineTo(14.75f)
                curveTo(18.0f, 16.545f, 16.545f, 18.0f, 14.75f, 18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18.0f, 2.0f, 16.545f, 2.0f, 14.75f)
                verticalLineTo(9.868f)
                curveTo(2.235f, 9.951f, 2.487f, 10.0f, 2.75f, 10.0f)
                curveTo(3.013f, 10.0f, 3.265f, 9.951f, 3.5f, 9.868f)
                verticalLineTo(14.75f)
                curveTo(3.5f, 15.717f, 4.284f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(14.75f)
                curveTo(15.717f, 16.5f, 16.5f, 15.717f, 16.5f, 14.75f)
                verticalLineTo(5.25f)
                curveTo(16.5f, 4.284f, 15.717f, 3.5f, 14.75f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(5.631f)
                curveTo(3.265f, 5.548f, 3.013f, 5.5f, 2.75f, 5.5f)
                curveTo(2.487f, 5.5f, 2.235f, 5.548f, 2.0f, 5.631f)
                verticalLineTo(5.25f)
                curveTo(2.0f, 3.455f, 3.455f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(14.75f)
                close()
                moveTo(2.75f, 6.5f)
                curveTo(3.159f, 6.5f, 3.52f, 6.697f, 3.748f, 7.0f)
                horizontalLineTo(4.6f)
                curveTo(6.191f, 7.0f, 7.685f, 7.769f, 8.61f, 9.064f)
                curveTo(9.254f, 9.965f, 10.293f, 10.5f, 11.4f, 10.5f)
                horizontalLineTo(12.439f)
                lineTo(10.72f, 8.78f)
                curveTo(10.427f, 8.487f, 10.427f, 8.013f, 10.72f, 7.72f)
                curveTo(11.013f, 7.427f, 11.487f, 7.427f, 11.78f, 7.72f)
                lineTo(14.78f, 10.72f)
                curveTo(15.073f, 11.013f, 15.073f, 11.487f, 14.78f, 11.78f)
                lineTo(11.78f, 14.78f)
                curveTo(11.487f, 15.073f, 11.013f, 15.073f, 10.72f, 14.78f)
                curveTo(10.427f, 14.487f, 10.427f, 14.013f, 10.72f, 13.72f)
                lineTo(12.439f, 12.0f)
                horizontalLineTo(11.4f)
                curveTo(9.809f, 12.0f, 8.315f, 11.231f, 7.39f, 9.936f)
                curveTo(6.746f, 9.035f, 5.707f, 8.5f, 4.6f, 8.5f)
                horizontalLineTo(3.748f)
                curveTo(3.52f, 8.803f, 3.159f, 9.0f, 2.75f, 9.0f)
                curveTo(2.06f, 9.0f, 1.5f, 8.44f, 1.5f, 7.75f)
                curveTo(1.5f, 7.06f, 2.06f, 6.5f, 2.75f, 6.5f)
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
        Image(imageVector = FluentIcons.Regular.ArrowFlowSquareMultiple, contentDescription = "ArrowFlowSquareMultiple Icon")
    }
}

