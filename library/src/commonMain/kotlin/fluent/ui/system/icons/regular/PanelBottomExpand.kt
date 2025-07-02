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
 * PanelBottomExpand icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: panel, bottom, expand
 * - Source: ic_fluent_panel_bottom_expand_20_regular.svg
 * 
 * @return The [ImageVector] for the PanelBottomExpand icon.
 */
public val FluentIcons.Regular.PanelBottomExpand: ImageVector
    get() {
        if (_panelBottomExpand != null) {
            return _panelBottomExpand!!
        }
        _panelBottomExpand = Builder(name = "PanelBottomExpand", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 8.826f)
                lineTo(11.374f, 9.824f)
                curveTo(11.556f, 10.032f, 11.871f, 10.053f, 12.079f, 9.871f)
                curveTo(12.287f, 9.69f, 12.308f, 9.374f, 12.126f, 9.166f)
                lineTo(10.376f, 7.166f)
                curveTo(10.281f, 7.057f, 10.144f, 6.995f, 10.0f, 6.995f)
                curveTo(9.856f, 6.995f, 9.719f, 7.057f, 9.624f, 7.166f)
                lineTo(7.874f, 9.166f)
                curveTo(7.692f, 9.374f, 7.713f, 9.69f, 7.921f, 9.871f)
                curveTo(8.129f, 10.053f, 8.444f, 10.032f, 8.626f, 9.824f)
                lineTo(9.5f, 8.826f)
                lineTo(9.5f, 12.505f)
                curveTo(9.5f, 12.781f, 9.724f, 13.005f, 10.0f, 13.005f)
                curveTo(10.276f, 13.005f, 10.5f, 12.781f, 10.5f, 12.505f)
                lineTo(10.5f, 8.826f)
                close()
                moveTo(4.0f, 4.0f)
                curveTo(2.895f, 4.0f, 2.0f, 4.895f, 2.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.105f, 2.895f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 16.0f, 18.0f, 15.105f, 18.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 4.895f, 17.105f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 5.448f, 3.448f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 5.0f, 17.0f, 5.448f, 17.0f, 6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 14.552f, 16.552f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 15.0f, 3.0f, 14.552f, 3.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _panelBottomExpand!!
    }

@Suppress("ObjectPropertyName")
private var _panelBottomExpand: ImageVector? = null

@Preview
@Composable
private fun PanelBottomExpandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PanelBottomExpand, contentDescription = null)
    }
}

