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
 * PanelRightAdd Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent the plethora of secondary, elevated panels in UI. Contains direction and action variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_panel_right_add_20_regular.svg)
 * 
 * @return The [ImageVector] for the PanelRightAdd icon.
 */
public val FluentIcons.Regular.PanelRightAdd: ImageVector
    get() {
        if (_panelRightAdd != null) {
            return _panelRightAdd!!
        }
        _panelRightAdd = Builder(name = "PanelRightAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                curveTo(18.0f, 4.896f, 17.104f, 3.981f, 15.999f, 4.0f)
                lineTo(4.001f, 4.0f)
                curveTo(2.896f, 4.0f, 2.0f, 4.896f, 2.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.105f, 2.896f, 16.0f, 4.001f, 16.0f)
                horizontalLineTo(9.207f)
                curveTo(9.116f, 15.678f, 9.053f, 15.344f, 9.022f, 15.0f)
                horizontalLineTo(4.001f)
                curveTo(3.448f, 15.0f, 3.0f, 14.553f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.448f, 3.448f, 5.0f, 4.001f, 5.0f)
                horizontalLineTo(12.005f)
                lineTo(12.005f, 9.597f)
                curveTo(12.322f, 9.436f, 12.657f, 9.304f, 13.005f, 9.205f)
                lineTo(13.005f, 5.0f)
                horizontalLineTo(15.999f)
                curveTo(16.552f, 5.0f, 17.0f, 5.448f, 17.0f, 6.0f)
                verticalLineTo(9.6f)
                curveTo(17.358f, 9.782f, 17.693f, 10.003f, 18.0f, 10.257f)
                verticalLineTo(6.0f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(14.5f, 12.0f)
                curveTo(14.776f, 12.0f, 15.0f, 12.224f, 15.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 14.0f, 17.0f, 14.224f, 17.0f, 14.5f)
                curveTo(17.0f, 14.776f, 16.776f, 15.0f, 16.5f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.5f)
                curveTo(15.0f, 16.776f, 14.776f, 17.0f, 14.5f, 17.0f)
                curveTo(14.224f, 17.0f, 14.0f, 16.776f, 14.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 15.0f, 12.0f, 14.776f, 12.0f, 14.5f)
                curveTo(12.0f, 14.224f, 12.224f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.5f)
                curveTo(14.0f, 12.224f, 14.224f, 12.0f, 14.5f, 12.0f)
                close()
            }
        }
        .build()
        return _panelRightAdd!!
    }

@Suppress("ObjectPropertyName")
private var _panelRightAdd: ImageVector? = null

@Preview
@Composable
private fun PanelRightAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PanelRightAdd, contentDescription = "PanelRightAdd Icon")
    }
}

