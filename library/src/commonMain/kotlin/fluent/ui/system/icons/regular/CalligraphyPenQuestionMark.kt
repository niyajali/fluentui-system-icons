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
 * CalligraphyPenQuestionMark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: calligraphy, pen, question, mark
 * - Source: ic_fluent_calligraphy_pen_question_mark_20_regular.svg
 * 
 * @return The [ImageVector] for the CalligraphyPenQuestionMark icon.
 */
public val FluentIcons.Regular.CalligraphyPenQuestionMark: ImageVector
    get() {
        if (_calligraphyPenQuestionMark != null) {
            return _calligraphyPenQuestionMark!!
        }
        _calligraphyPenQuestionMark = Builder(name = "CalligraphyPenQuestionMark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.5f)
                curveTo(19.0f, 3.015f, 16.985f, 1.0f, 14.5f, 1.0f)
                curveTo(12.015f, 1.0f, 10.0f, 3.015f, 10.0f, 5.5f)
                curveTo(10.0f, 7.985f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 7.985f, 19.0f, 5.5f)
                close()
                moveTo(14.5f, 7.38f)
                curveTo(14.845f, 7.38f, 15.124f, 7.66f, 15.124f, 8.005f)
                curveTo(15.124f, 8.35f, 14.845f, 8.629f, 14.5f, 8.629f)
                curveTo(14.155f, 8.629f, 13.875f, 8.35f, 13.875f, 8.005f)
                curveTo(13.875f, 7.66f, 14.155f, 7.38f, 14.5f, 7.38f)
                close()
                moveTo(14.5f, 2.503f)
                curveTo(15.531f, 2.503f, 16.353f, 3.349f, 16.353f, 4.453f)
                curveTo(16.353f, 5.039f, 16.139f, 5.361f, 15.626f, 5.772f)
                lineTo(15.349f, 5.986f)
                curveTo(15.103f, 6.18f, 15.02f, 6.286f, 15.003f, 6.434f)
                lineTo(14.992f, 6.59f)
                curveTo(14.95f, 6.823f, 14.745f, 7.0f, 14.5f, 7.0f)
                curveTo(14.224f, 7.0f, 14.0f, 6.776f, 14.0f, 6.5f)
                curveTo(14.0f, 5.929f, 14.21f, 5.616f, 14.716f, 5.212f)
                lineTo(14.994f, 4.997f)
                curveTo(15.282f, 4.768f, 15.353f, 4.655f, 15.353f, 4.453f)
                curveTo(15.353f, 3.895f, 14.972f, 3.503f, 14.5f, 3.503f)
                curveTo(14.006f, 3.503f, 13.641f, 3.869f, 13.646f, 4.448f)
                curveTo(13.649f, 4.724f, 13.427f, 4.95f, 13.151f, 4.953f)
                curveTo(12.875f, 4.956f, 12.649f, 4.734f, 12.647f, 4.458f)
                curveTo(12.636f, 3.321f, 13.452f, 2.503f, 14.5f, 2.503f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.845f, 10.989f)
                curveTo(14.731f, 10.996f, 14.616f, 11.0f, 14.5f, 11.0f)
                curveTo(14.249f, 11.0f, 14.002f, 10.983f, 13.76f, 10.951f)
                lineTo(10.5f, 16.511f)
                verticalLineTo(10.866f)
                curveTo(10.799f, 10.693f, 11.0f, 10.37f, 11.0f, 10.0f)
                curveTo(11.0f, 9.898f, 10.985f, 9.799f, 10.956f, 9.706f)
                curveTo(10.859f, 9.39f, 10.61f, 9.141f, 10.294f, 9.044f)
                curveTo(10.201f, 9.015f, 10.102f, 9.0f, 10.0f, 9.0f)
                curveTo(9.448f, 9.0f, 9.0f, 9.448f, 9.0f, 10.0f)
                curveTo(9.0f, 10.37f, 9.201f, 10.693f, 9.5f, 10.866f)
                verticalLineTo(16.511f)
                lineTo(6.216f, 10.909f)
                curveTo(5.965f, 10.481f, 5.942f, 9.957f, 6.154f, 9.509f)
                lineTo(7.816f, 6.0f)
                horizontalLineTo(9.022f)
                curveTo(9.008f, 5.835f, 9.0f, 5.669f, 9.0f, 5.5f)
                curveTo(9.0f, 5.331f, 9.008f, 5.165f, 9.022f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 5.0f, 6.0f, 4.776f, 6.0f, 4.5f)
                verticalLineTo(2.5f)
                curveTo(6.0f, 2.224f, 5.776f, 2.0f, 5.5f, 2.0f)
                curveTo(5.224f, 2.0f, 5.0f, 2.224f, 5.0f, 2.5f)
                verticalLineTo(4.5f)
                curveTo(5.0f, 5.328f, 5.672f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(6.71f)
                lineTo(5.251f, 9.08f)
                curveTo(4.897f, 9.828f, 4.935f, 10.702f, 5.353f, 11.415f)
                lineTo(8.816f, 17.322f)
                curveTo(9.062f, 17.742f, 9.513f, 18.0f, 10.0f, 18.0f)
                curveTo(10.487f, 18.0f, 10.938f, 17.742f, 11.184f, 17.322f)
                lineTo(14.647f, 11.415f)
                curveTo(14.727f, 11.278f, 14.793f, 11.136f, 14.845f, 10.989f)
                close()
            }
        }
        .build()
        return _calligraphyPenQuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _calligraphyPenQuestionMark: ImageVector? = null

@Preview
@Composable
private fun CalligraphyPenQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalligraphyPenQuestionMark, contentDescription = null)
    }
}

