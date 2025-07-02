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
 * NotebookArrowCurveDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: notebook, arrow, curve, down
 * - Source: ic_fluent_notebook_arrow_curve_down_20_filled.svg
 * 
 * @return The [ImageVector] for the NotebookArrowCurveDown icon.
 */
public val FluentIcons.Filled.NotebookArrowCurveDown: ImageVector
    get() {
        if (_notebookArrowCurveDown != null) {
            return _notebookArrowCurveDown!!
        }
        _notebookArrowCurveDown = Builder(name = "NotebookArrowCurveDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 5.5f)
                curveTo(1.0f, 3.015f, 3.015f, 1.0f, 5.502f, 1.0f)
                curveTo(7.988f, 1.0f, 10.003f, 3.015f, 10.003f, 5.5f)
                curveTo(10.003f, 7.985f, 7.988f, 10.0f, 5.502f, 10.0f)
                curveTo(3.015f, 10.0f, 1.0f, 7.985f, 1.0f, 5.5f)
                close()
                moveTo(7.399f, 6.396f)
                lineTo(6.502f, 7.293f)
                verticalLineTo(5.75f)
                curveTo(6.502f, 4.231f, 5.27f, 3.0f, 3.751f, 3.0f)
                horizontalLineTo(3.501f)
                curveTo(3.225f, 3.0f, 3.001f, 3.224f, 3.001f, 3.5f)
                curveTo(3.001f, 3.776f, 3.225f, 4.0f, 3.501f, 4.0f)
                horizontalLineTo(3.751f)
                curveTo(4.718f, 4.0f, 5.502f, 4.784f, 5.502f, 5.75f)
                verticalLineTo(7.293f)
                lineTo(4.605f, 6.396f)
                curveTo(4.41f, 6.201f, 4.093f, 6.201f, 3.898f, 6.396f)
                curveTo(3.702f, 6.592f, 3.702f, 6.908f, 3.898f, 7.104f)
                lineTo(5.65f, 8.856f)
                curveTo(5.698f, 8.903f, 5.752f, 8.938f, 5.81f, 8.962f)
                curveTo(5.869f, 8.987f, 5.934f, 9.0f, 6.002f, 9.0f)
                curveTo(6.07f, 9.0f, 6.134f, 8.987f, 6.193f, 8.962f)
                curveTo(6.252f, 8.938f, 6.308f, 8.901f, 6.356f, 8.854f)
                lineTo(8.106f, 7.104f)
                curveTo(8.301f, 6.908f, 8.301f, 6.592f, 8.106f, 6.396f)
                curveTo(7.911f, 6.201f, 7.594f, 6.201f, 7.399f, 6.396f)
                close()
                moveTo(11.001f, 5.5f)
                curveTo(11.001f, 8.538f, 8.537f, 11.0f, 5.499f, 11.0f)
                curveTo(4.597f, 11.0f, 3.746f, 10.783f, 2.995f, 10.399f)
                verticalLineTo(16.0f)
                curveTo(2.995f, 17.105f, 3.891f, 18.0f, 4.996f, 18.0f)
                horizontalLineTo(12.998f)
                curveTo(14.104f, 18.0f, 14.999f, 17.105f, 14.999f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(14.999f, 2.895f, 14.104f, 2.0f, 12.998f, 2.0f)
                horizontalLineTo(9.743f)
                curveTo(10.529f, 2.951f, 11.001f, 4.17f, 11.001f, 5.5f)
                close()
                moveTo(16.0f, 6.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 6.0f, 17.0f, 6.224f, 17.0f, 6.5f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 8.276f, 16.776f, 8.5f, 16.5f, 8.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(16.0f, 9.5f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 9.5f, 17.0f, 9.724f, 17.0f, 10.0f)
                verticalLineTo(11.5f)
                curveTo(17.0f, 11.776f, 16.776f, 12.0f, 16.5f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.5f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 13.0f, 17.0f, 13.224f, 17.0f, 13.5f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.276f, 16.776f, 15.5f, 16.5f, 15.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _notebookArrowCurveDown!!
    }

@Suppress("ObjectPropertyName")
private var _notebookArrowCurveDown: ImageVector? = null

@Preview
@Composable
private fun NotebookArrowCurveDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NotebookArrowCurveDown, contentDescription = null)
    }
}

