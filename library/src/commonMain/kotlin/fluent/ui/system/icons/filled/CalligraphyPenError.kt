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
 * CalligraphyPenError Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in drawing modes.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_calligraphy_pen_error_20_filled.svg)
 * 
 * @return The [ImageVector] for the CalligraphyPenError icon.
 */
public val FluentIcons.Filled.CalligraphyPenError: ImageVector
    get() {
        if (_calligraphyPenError != null) {
            return _calligraphyPenError!!
        }
        _calligraphyPenError = Builder(name = "CalligraphyPenError", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.5f)
                curveTo(19.0f, 7.985f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 7.985f, 10.0f, 5.5f)
                curveTo(10.0f, 3.015f, 12.015f, 1.0f, 14.5f, 1.0f)
                curveTo(16.985f, 1.0f, 19.0f, 3.015f, 19.0f, 5.5f)
                close()
                moveTo(14.5f, 3.0f)
                curveTo(14.224f, 3.0f, 14.0f, 3.224f, 14.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(14.0f, 5.776f, 14.224f, 6.0f, 14.5f, 6.0f)
                curveTo(14.776f, 6.0f, 15.0f, 5.776f, 15.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(15.0f, 3.224f, 14.776f, 3.0f, 14.5f, 3.0f)
                close()
                moveTo(14.5f, 8.125f)
                curveTo(14.845f, 8.125f, 15.125f, 7.845f, 15.125f, 7.5f)
                curveTo(15.125f, 7.155f, 14.845f, 6.875f, 14.5f, 6.875f)
                curveTo(14.155f, 6.875f, 13.875f, 7.155f, 13.875f, 7.5f)
                curveTo(13.875f, 7.845f, 14.155f, 8.125f, 14.5f, 8.125f)
                close()
                moveTo(14.5f, 11.0f)
                curveTo(14.616f, 11.0f, 14.731f, 10.996f, 14.845f, 10.989f)
                curveTo(14.793f, 11.136f, 14.727f, 11.278f, 14.647f, 11.415f)
                lineTo(11.184f, 17.322f)
                curveTo(11.026f, 17.592f, 10.783f, 17.795f, 10.5f, 17.906f)
                verticalLineTo(10.866f)
                curveTo(10.799f, 10.693f, 11.0f, 10.37f, 11.0f, 10.0f)
                curveTo(11.0f, 9.898f, 10.985f, 9.799f, 10.956f, 9.706f)
                curveTo(11.913f, 10.514f, 13.15f, 11.0f, 14.5f, 11.0f)
                close()
                moveTo(9.0f, 5.5f)
                curveTo(9.0f, 6.85f, 9.486f, 8.087f, 10.294f, 9.044f)
                curveTo(10.201f, 9.015f, 10.102f, 9.0f, 10.0f, 9.0f)
                curveTo(9.448f, 9.0f, 9.0f, 9.448f, 9.0f, 10.0f)
                curveTo(9.0f, 10.37f, 9.201f, 10.693f, 9.5f, 10.866f)
                verticalLineTo(17.906f)
                curveTo(9.217f, 17.795f, 8.974f, 17.592f, 8.816f, 17.322f)
                lineTo(5.353f, 11.415f)
                curveTo(4.935f, 10.702f, 4.897f, 9.828f, 5.251f, 9.08f)
                lineTo(6.483f, 6.48f)
                curveTo(5.643f, 6.351f, 5.0f, 5.626f, 5.0f, 4.75f)
                verticalLineTo(2.75f)
                curveTo(5.0f, 2.336f, 5.336f, 2.0f, 5.75f, 2.0f)
                curveTo(6.164f, 2.0f, 6.5f, 2.336f, 6.5f, 2.75f)
                verticalLineTo(4.75f)
                curveTo(6.5f, 4.888f, 6.612f, 5.0f, 6.75f, 5.0f)
                horizontalLineTo(9.022f)
                curveTo(9.008f, 5.165f, 9.0f, 5.331f, 9.0f, 5.5f)
                close()
            }
        }
        .build()
        return _calligraphyPenError!!
    }

@Suppress("ObjectPropertyName")
private var _calligraphyPenError: ImageVector? = null

@Preview
@Composable
private fun CalligraphyPenErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalligraphyPenError, contentDescription = "CalligraphyPenError Icon")
    }
}

