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
 * ToggleRight Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent options, settings, etc. â ï¸ Should not be used as toggle UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_toggle_right_24_regular.svg)
 * 
 * @return The [ImageVector] for the ToggleRight icon.
 */
public val FluentIcons.Regular.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) {
            return _toggleRight!!
        }
        _toggleRight = Builder(name = "ToggleRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.75f, 14.5f)
                curveTo(18.131f, 14.5f, 19.25f, 13.381f, 19.25f, 12.0f)
                curveTo(19.25f, 10.619f, 18.131f, 9.5f, 16.75f, 9.5f)
                curveTo(15.369f, 9.5f, 14.25f, 10.619f, 14.25f, 12.0f)
                curveTo(14.25f, 13.381f, 15.369f, 14.5f, 16.75f, 14.5f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 9.239f, 4.239f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(19.761f, 7.0f, 22.0f, 9.239f, 22.0f, 12.0f)
                curveTo(22.0f, 14.761f, 19.761f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(4.239f, 17.0f, 2.0f, 14.761f, 2.0f, 12.0f)
                close()
                moveTo(7.0f, 8.5f)
                curveTo(5.067f, 8.5f, 3.5f, 10.067f, 3.5f, 12.0f)
                curveTo(3.5f, 13.933f, 5.067f, 15.5f, 7.0f, 15.5f)
                horizontalLineTo(17.0f)
                curveTo(18.933f, 15.5f, 20.5f, 13.933f, 20.5f, 12.0f)
                curveTo(20.5f, 10.067f, 18.933f, 8.5f, 17.0f, 8.5f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _toggleRight!!
    }

@Suppress("ObjectPropertyName")
private var _toggleRight: ImageVector? = null

@Preview
@Composable
private fun ToggleRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ToggleRight, contentDescription = "ToggleRight Icon")
    }
}

