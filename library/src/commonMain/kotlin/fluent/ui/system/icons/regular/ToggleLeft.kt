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
 * ToggleLeft icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: toggle, left
 * - Source: ic_fluent_toggle_left_24_regular.svg
 * 
 * @return The [ImageVector] for the ToggleLeft icon.
 */
public val FluentIcons.Regular.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) {
            return _toggleLeft!!
        }
        _toggleLeft = Builder(name = "ToggleLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.25f, 14.5f)
                curveTo(5.869f, 14.5f, 4.75f, 13.381f, 4.75f, 12.0f)
                curveTo(4.75f, 10.619f, 5.869f, 9.5f, 7.25f, 9.5f)
                curveTo(8.631f, 9.5f, 9.75f, 10.619f, 9.75f, 12.0f)
                curveTo(9.75f, 13.381f, 8.631f, 14.5f, 7.25f, 14.5f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 9.239f, 19.761f, 7.0f, 17.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(4.239f, 7.0f, 2.0f, 9.239f, 2.0f, 12.0f)
                curveTo(2.0f, 14.761f, 4.239f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(19.761f, 17.0f, 22.0f, 14.761f, 22.0f, 12.0f)
                close()
                moveTo(17.0f, 8.5f)
                curveTo(18.933f, 8.5f, 20.5f, 10.067f, 20.5f, 12.0f)
                curveTo(20.5f, 13.933f, 18.933f, 15.5f, 17.0f, 15.5f)
                horizontalLineTo(7.0f)
                curveTo(5.067f, 15.5f, 3.5f, 13.933f, 3.5f, 12.0f)
                curveTo(3.5f, 10.067f, 5.067f, 8.5f, 7.0f, 8.5f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _toggleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _toggleLeft: ImageVector? = null

@Preview
@Composable
private fun ToggleLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ToggleLeft, contentDescription = null)
    }
}

