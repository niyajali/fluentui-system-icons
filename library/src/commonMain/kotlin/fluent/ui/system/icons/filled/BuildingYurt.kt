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
 * BuildingYurt Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a yurt or shared living space in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_building_yurt_20_filled.svg)
 * 
 * @return The [ImageVector] for the BuildingYurt icon.
 */
public val FluentIcons.Filled.BuildingYurt: ImageVector
    get() {
        if (_buildingYurt != null) {
            return _buildingYurt!!
        }
        _buildingYurt = Builder(name = "BuildingYurt", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                curveTo(18.0f, 16.104f, 17.104f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(12.5f)
                curveTo(11.672f, 17.0f, 11.0f, 16.328f, 11.0f, 15.5f)
                verticalLineTo(13.5f)
                curveTo(11.0f, 13.224f, 10.776f, 13.001f, 10.5f, 13.001f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 13.001f, 9.0f, 13.225f, 9.0f, 13.501f)
                verticalLineTo(15.5f)
                curveTo(9.0f, 16.328f, 8.328f, 17.0f, 7.5f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(2.896f, 17.0f, 2.0f, 16.104f, 2.0f, 15.0f)
                verticalLineTo(9.729f)
                curveTo(2.294f, 9.9f, 2.635f, 10.0f, 3.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.365f, 10.0f, 17.705f, 9.9f, 18.0f, 9.729f)
                verticalLineTo(15.0f)
                close()
                moveTo(9.02f, 3.259f)
                curveTo(9.628f, 2.916f, 10.372f, 2.916f, 10.981f, 3.259f)
                lineTo(16.98f, 6.635f)
                curveTo(17.545f, 6.952f, 17.915f, 7.52f, 17.986f, 8.154f)
                curveTo(17.912f, 8.633f, 17.5f, 9.0f, 17.0f, 9.0f)
                horizontalLineTo(3.0f)
                curveTo(2.5f, 9.0f, 2.087f, 8.633f, 2.013f, 8.154f)
                curveTo(2.084f, 7.52f, 2.455f, 6.952f, 3.02f, 6.635f)
                lineTo(9.02f, 3.259f)
                close()
            }
        }
        .build()
        return _buildingYurt!!
    }

@Suppress("ObjectPropertyName")
private var _buildingYurt: ImageVector? = null

@Preview
@Composable
private fun BuildingYurtPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BuildingYurt, contentDescription = "BuildingYurt Icon")
    }
}

