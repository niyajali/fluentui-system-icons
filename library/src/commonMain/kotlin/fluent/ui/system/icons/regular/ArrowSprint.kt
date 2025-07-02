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
 * ArrowSprint icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, sprint
 * - Source: ic_fluent_arrow_sprint_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowSprint icon.
 */
public val FluentIcons.Regular.ArrowSprint: ImageVector
    get() {
        if (_arrowSprint != null) {
            return _arrowSprint!!
        }
        _arrowSprint = Builder(name = "ArrowSprint", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                curveTo(8.526f, 6.0f, 7.265f, 6.911f, 6.749f, 8.2f)
                curveTo(6.588f, 8.602f, 6.5f, 9.041f, 6.5f, 9.5f)
                curveTo(6.5f, 11.433f, 8.067f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(17.293f)
                lineTo(16.146f, 11.854f)
                curveTo(15.951f, 11.658f, 15.951f, 11.342f, 16.146f, 11.146f)
                curveTo(16.342f, 10.951f, 16.658f, 10.951f, 16.854f, 11.146f)
                lineTo(18.854f, 13.146f)
                curveTo(19.049f, 13.342f, 19.049f, 13.658f, 18.854f, 13.854f)
                lineTo(16.854f, 15.854f)
                curveTo(16.658f, 16.049f, 16.342f, 16.049f, 16.146f, 15.854f)
                curveTo(15.951f, 15.658f, 15.951f, 15.342f, 16.146f, 15.146f)
                lineTo(17.293f, 14.0f)
                horizontalLineTo(10.0f)
                curveTo(7.515f, 14.0f, 5.5f, 11.985f, 5.5f, 9.5f)
                curveTo(5.5f, 8.982f, 5.588f, 8.484f, 5.749f, 8.021f)
                curveTo(6.361f, 6.262f, 8.033f, 5.0f, 10.0f, 5.0f)
                curveTo(12.485f, 5.0f, 14.5f, 7.015f, 14.5f, 9.5f)
                curveTo(14.5f, 10.425f, 14.221f, 11.285f, 13.742f, 12.0f)
                horizontalLineTo(12.45f)
                curveTo(13.098f, 11.365f, 13.5f, 10.479f, 13.5f, 9.5f)
                curveTo(13.5f, 7.567f, 11.933f, 6.0f, 10.0f, 6.0f)
                close()
                moveTo(2.5f, 13.0f)
                horizontalLineTo(5.757f)
                curveTo(6.071f, 13.379f, 6.434f, 13.716f, 6.837f, 14.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 14.0f, 2.0f, 13.776f, 2.0f, 13.5f)
                curveTo(2.0f, 13.224f, 2.224f, 13.0f, 2.5f, 13.0f)
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
        Image(imageVector = FluentIcons.Regular.ArrowSprint, contentDescription = null)
    }
}

