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
 * PanelTopExpand Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent the plethora of secondary, elevated panels in UI. Contains direction and action variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_panel_top_expand_20_filled.svg)
 * 
 * @return The [ImageVector] for the PanelTopExpand icon.
 */
public val FluentIcons.Filled.PanelTopExpand: ImageVector
    get() {
        if (_panelTopExpand != null) {
            return _panelTopExpand!!
        }
        _panelTopExpand = Builder(name = "PanelTopExpand", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 11.174f)
                lineTo(11.374f, 10.176f)
                curveTo(11.556f, 9.968f, 11.871f, 9.947f, 12.079f, 10.129f)
                curveTo(12.287f, 10.31f, 12.308f, 10.626f, 12.126f, 10.834f)
                lineTo(10.376f, 12.834f)
                curveTo(10.281f, 12.943f, 10.144f, 13.005f, 10.0f, 13.005f)
                curveTo(9.856f, 13.005f, 9.719f, 12.943f, 9.624f, 12.834f)
                lineTo(7.874f, 10.834f)
                curveTo(7.692f, 10.626f, 7.713f, 10.31f, 7.921f, 10.129f)
                curveTo(8.129f, 9.947f, 8.444f, 9.968f, 8.626f, 10.176f)
                lineTo(9.5f, 11.174f)
                lineTo(9.5f, 7.495f)
                curveTo(9.5f, 7.219f, 9.724f, 6.995f, 10.0f, 6.995f)
                curveTo(10.276f, 6.995f, 10.5f, 7.219f, 10.5f, 7.495f)
                lineTo(10.5f, 11.174f)
                close()
                moveTo(4.0f, 16.0f)
                curveTo(2.895f, 16.0f, 2.0f, 15.105f, 2.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.895f, 2.895f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 4.0f, 18.0f, 4.895f, 18.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 15.105f, 17.105f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(3.0f, 14.0f)
                curveTo(3.0f, 14.552f, 3.448f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 15.0f, 17.0f, 14.552f, 17.0f, 14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(7.495f)
                curveTo(11.5f, 6.667f, 10.828f, 5.995f, 10.0f, 5.995f)
                curveTo(9.172f, 5.995f, 8.5f, 6.667f, 8.5f, 7.495f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _panelTopExpand!!
    }

@Suppress("ObjectPropertyName")
private var _panelTopExpand: ImageVector? = null

@Preview
@Composable
private fun PanelTopExpandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PanelTopExpand, contentDescription = "PanelTopExpand Icon")
    }
}

