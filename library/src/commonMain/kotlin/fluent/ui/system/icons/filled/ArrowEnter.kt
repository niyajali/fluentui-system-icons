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
 * ArrowEnter icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, enter
 * - Source: ic_fluent_arrow_enter_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowEnter icon.
 */
public val FluentIcons.Filled.ArrowEnter: ImageVector
    get() {
        if (_arrowEnter != null) {
            return _arrowEnter!!
        }
        _arrowEnter = Builder(name = "ArrowEnter", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.75f, 17.5f)
                curveTo(7.336f, 17.5f, 7.0f, 17.164f, 7.0f, 16.75f)
                curveTo(7.0f, 16.336f, 7.336f, 16.0f, 7.75f, 16.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 16.0f, 16.0f, 15.105f, 16.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 4.895f, 15.105f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 4.0f, 7.0f, 3.664f, 7.0f, 3.25f)
                curveTo(7.0f, 2.836f, 7.336f, 2.5f, 7.75f, 2.5f)
                horizontalLineTo(14.0f)
                curveTo(15.933f, 2.5f, 17.5f, 4.067f, 17.5f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(17.5f, 15.933f, 15.933f, 17.5f, 14.0f, 17.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(7.741f, 6.199f)
                curveTo(8.046f, 5.918f, 8.52f, 5.937f, 8.801f, 6.241f)
                lineTo(11.801f, 9.491f)
                curveTo(12.066f, 9.779f, 12.066f, 10.221f, 11.801f, 10.509f)
                lineTo(8.801f, 13.759f)
                curveTo(8.52f, 14.063f, 8.046f, 14.082f, 7.741f, 13.801f)
                curveTo(7.437f, 13.52f, 7.418f, 13.046f, 7.699f, 12.741f)
                lineTo(9.537f, 10.75f)
                horizontalLineTo(1.75f)
                curveTo(1.336f, 10.75f, 1.0f, 10.414f, 1.0f, 10.0f)
                curveTo(1.0f, 9.586f, 1.336f, 9.25f, 1.75f, 9.25f)
                horizontalLineTo(9.537f)
                lineTo(7.699f, 7.259f)
                curveTo(7.418f, 6.954f, 7.437f, 6.48f, 7.741f, 6.199f)
                close()
            }
        }
        .build()
        return _arrowEnter!!
    }

@Suppress("ObjectPropertyName")
private var _arrowEnter: ImageVector? = null

@Preview
@Composable
private fun ArrowEnterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowEnter, contentDescription = null)
    }
}

