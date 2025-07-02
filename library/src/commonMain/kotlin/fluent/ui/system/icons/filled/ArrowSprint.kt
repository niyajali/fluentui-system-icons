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
 * ArrowSprint icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, sprint
 * - Source: ic_fluent_arrow_sprint_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowSprint icon.
 */
public val FluentIcons.Filled.ArrowSprint: ImageVector
    get() {
        if (_arrowSprint != null) {
            return _arrowSprint!!
        }
        _arrowSprint = Builder(name = "ArrowSprint", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 6.5f)
                curveTo(8.839f, 6.5f, 7.831f, 7.16f, 7.333f, 8.125f)
                curveTo(7.12f, 8.537f, 7.0f, 9.004f, 7.0f, 9.5f)
                curveTo(7.0f, 11.157f, 8.343f, 12.5f, 10.0f, 12.5f)
                horizontalLineTo(16.439f)
                lineTo(15.72f, 11.78f)
                curveTo(15.427f, 11.487f, 15.427f, 11.013f, 15.72f, 10.72f)
                curveTo(16.013f, 10.427f, 16.487f, 10.427f, 16.78f, 10.72f)
                lineTo(18.78f, 12.72f)
                curveTo(19.073f, 13.013f, 19.073f, 13.487f, 18.78f, 13.78f)
                lineTo(16.78f, 15.78f)
                curveTo(16.487f, 16.073f, 16.013f, 16.073f, 15.72f, 15.78f)
                curveTo(15.427f, 15.487f, 15.427f, 15.013f, 15.72f, 14.72f)
                lineTo(16.439f, 14.0f)
                horizontalLineTo(10.0f)
                curveTo(7.515f, 14.0f, 5.5f, 11.985f, 5.5f, 9.5f)
                curveTo(5.5f, 8.899f, 5.618f, 8.325f, 5.832f, 7.8f)
                curveTo(6.503f, 6.158f, 8.116f, 5.0f, 10.0f, 5.0f)
                curveTo(12.485f, 5.0f, 14.5f, 7.015f, 14.5f, 9.5f)
                curveTo(14.5f, 10.218f, 14.332f, 10.898f, 14.032f, 11.5f)
                horizontalLineTo(12.236f)
                curveTo(12.711f, 10.969f, 13.0f, 10.268f, 13.0f, 9.5f)
                curveTo(13.0f, 7.843f, 11.657f, 6.5f, 10.0f, 6.5f)
                close()
                moveTo(2.75f, 12.5f)
                horizontalLineTo(5.389f)
                curveTo(5.772f, 13.087f, 6.264f, 13.597f, 6.837f, 14.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 14.0f, 2.0f, 13.664f, 2.0f, 13.25f)
                curveTo(2.0f, 12.836f, 2.336f, 12.5f, 2.75f, 12.5f)
                close()
            }
        }
        .build()
        return _arrowSprint!!
    }

@Suppress("ObjectPropertyName")
private var _arrowSprint: ImageVector? = null

@Preview
@Composable
private fun ArrowSprintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowSprint, contentDescription = null)
    }
}

