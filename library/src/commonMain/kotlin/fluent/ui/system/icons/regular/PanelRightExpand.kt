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
 * PanelRightExpand icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: panel, right, expand
 * - Source: ic_fluent_panel_right_expand_20_regular.svg
 * 
 * @return The [ImageVector] for the PanelRightExpand icon.
 */
public val FluentIcons.Regular.PanelRightExpand: ImageVector
    get() {
        if (_panelRightExpand != null) {
            return _panelRightExpand!!
        }
        _panelRightExpand = Builder(name = "PanelRightExpand", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.821f, 10.5f)
                lineTo(7.819f, 11.374f)
                curveTo(8.027f, 11.556f, 8.048f, 11.871f, 7.867f, 12.079f)
                curveTo(7.685f, 12.287f, 7.369f, 12.308f, 7.161f, 12.126f)
                lineTo(5.161f, 10.376f)
                curveTo(5.052f, 10.281f, 4.99f, 10.144f, 4.99f, 10.0f)
                curveTo(4.99f, 9.856f, 5.052f, 9.719f, 5.161f, 9.624f)
                lineTo(7.161f, 7.874f)
                curveTo(7.369f, 7.692f, 7.685f, 7.713f, 7.867f, 7.921f)
                curveTo(8.048f, 8.129f, 8.027f, 8.444f, 7.819f, 8.626f)
                lineTo(6.821f, 9.5f)
                lineTo(10.5f, 9.5f)
                curveTo(10.776f, 9.5f, 11.0f, 9.724f, 11.0f, 10.0f)
                curveTo(11.0f, 10.276f, 10.776f, 10.5f, 10.5f, 10.5f)
                lineTo(6.821f, 10.5f)
                close()
                moveTo(18.0f, 14.0f)
                curveTo(18.0f, 15.105f, 17.105f, 16.0f, 16.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                curveTo(2.895f, 16.0f, 2.0f, 15.105f, 2.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.895f, 2.895f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 4.0f, 18.0f, 4.895f, 18.0f, 6.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(16.552f, 15.0f, 17.0f, 14.552f, 17.0f, 14.0f)
                lineTo(17.0f, 6.0f)
                curveTo(17.0f, 5.448f, 16.552f, 5.0f, 16.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 15.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(12.0f, 15.0f)
                lineTo(12.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                curveTo(3.448f, 5.0f, 3.0f, 5.448f, 3.0f, 6.0f)
                lineTo(3.0f, 14.0f)
                curveTo(3.0f, 14.552f, 3.448f, 15.0f, 4.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _panelRightExpand!!
    }

@Suppress("ObjectPropertyName")
private var _panelRightExpand: ImageVector? = null

@Preview
@Composable
private fun PanelRightExpandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PanelRightExpand, contentDescription = null)
    }
}

