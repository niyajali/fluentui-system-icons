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
 * PanelSeparateWindow Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent disconnecting the elevated panel in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_panel_separate_window_20_filled.svg)
 * 
 * @return The [ImageVector] for the PanelSeparateWindow icon.
 */
public val FluentIcons.Filled.PanelSeparateWindow: ImageVector
    get() {
        if (_panelSeparateWindow != null) {
            return _panelSeparateWindow!!
        }
        _panelSeparateWindow = Builder(name = "PanelSeparateWindow", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                curveTo(1.895f, 2.0f, 1.0f, 2.895f, 1.0f, 4.0f)
                verticalLineTo(8.0f)
                curveTo(1.0f, 9.105f, 1.895f, 10.0f, 3.0f, 10.0f)
                horizontalLineTo(11.0f)
                curveTo(12.105f, 10.0f, 13.0f, 9.105f, 13.0f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 2.895f, 12.105f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 14.552f, 4.448f, 15.0f, 5.0f, 15.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 15.0f, 18.0f, 14.552f, 18.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 5.448f, 17.552f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                curveTo(18.105f, 4.0f, 19.0f, 4.895f, 19.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 15.105f, 18.105f, 16.0f, 17.0f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 16.0f, 3.0f, 15.105f, 3.0f, 14.0f)
                close()
            }
        }
        .build()
        return _panelSeparateWindow!!
    }

@Suppress("ObjectPropertyName")
private var _panelSeparateWindow: ImageVector? = null

@Preview
@Composable
private fun PanelSeparateWindowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PanelSeparateWindow, contentDescription = "PanelSeparateWindow Icon")
    }
}

