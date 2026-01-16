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
 * BuildingYurt Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a yurt or shared living space in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_building_yurt_20_regular.svg)
 * 
 * @return The [ImageVector] for the BuildingYurt icon.
 */
public val FluentIcons.Regular.BuildingYurt: ImageVector
    get() {
        if (_buildingYurt != null) {
            return _buildingYurt!!
        }
        _buildingYurt = Builder(name = "BuildingYurt", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.02f, 3.258f)
                curveTo(9.628f, 2.915f, 10.372f, 2.915f, 10.981f, 3.258f)
                lineTo(17.102f, 6.701f)
                curveTo(17.64f, 7.004f, 17.978f, 7.566f, 17.998f, 8.181f)
                curveTo(17.998f, 8.187f, 18.0f, 8.194f, 18.0f, 8.2f)
                verticalLineTo(15.0f)
                curveTo(18.0f, 16.104f, 17.104f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(12.5f)
                curveTo(11.672f, 17.0f, 11.0f, 16.328f, 11.0f, 15.5f)
                verticalLineTo(13.5f)
                curveTo(11.0f, 13.224f, 10.776f, 13.0f, 10.5f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 13.0f, 9.0f, 13.224f, 9.0f, 13.5f)
                verticalLineTo(15.5f)
                curveTo(9.0f, 16.328f, 8.328f, 17.0f, 7.5f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(2.896f, 17.0f, 2.0f, 16.104f, 2.0f, 15.0f)
                verticalLineTo(8.2f)
                curveTo(2.0f, 8.194f, 2.001f, 8.187f, 2.001f, 8.181f)
                curveTo(2.021f, 7.566f, 2.36f, 7.004f, 2.898f, 6.701f)
                lineTo(9.02f, 3.258f)
                close()
                moveTo(17.0f, 9.823f)
                curveTo(16.769f, 9.934f, 16.512f, 9.999f, 16.238f, 9.999f)
                horizontalLineTo(3.762f)
                curveTo(3.488f, 9.999f, 3.231f, 9.934f, 3.0f, 9.823f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 15.552f, 3.448f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 16.0f, 8.0f, 15.776f, 8.0f, 15.5f)
                verticalLineTo(13.5f)
                curveTo(8.0f, 12.672f, 8.672f, 12.0f, 9.5f, 12.0f)
                horizontalLineTo(10.5f)
                curveTo(11.328f, 12.0f, 12.0f, 12.672f, 12.0f, 13.5f)
                verticalLineTo(15.5f)
                curveTo(12.0f, 15.776f, 12.224f, 16.0f, 12.5f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 16.0f, 17.0f, 15.552f, 17.0f, 15.0f)
                verticalLineTo(9.823f)
                close()
                moveTo(10.49f, 4.129f)
                curveTo(10.186f, 3.958f, 9.814f, 3.958f, 9.51f, 4.129f)
                lineTo(3.389f, 7.573f)
                curveTo(3.149f, 7.708f, 3.0f, 7.962f, 3.0f, 8.237f)
                curveTo(3.0f, 8.658f, 3.341f, 8.999f, 3.762f, 8.999f)
                horizontalLineTo(16.238f)
                curveTo(16.659f, 8.999f, 17.0f, 8.658f, 17.0f, 8.237f)
                curveTo(17.0f, 7.962f, 16.851f, 7.708f, 16.611f, 7.573f)
                lineTo(10.49f, 4.129f)
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
        Image(imageVector = FluentIcons.Regular.BuildingYurt, contentDescription = "BuildingYurt Icon")
    }
}

