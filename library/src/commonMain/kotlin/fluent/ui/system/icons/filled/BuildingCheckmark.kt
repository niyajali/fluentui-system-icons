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
 * BuildingCheckmark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: building, checkmark
 * - Source: ic_fluent_building_checkmark_20_filled.svg
 * 
 * @return The [ImageVector] for the BuildingCheckmark icon.
 */
public val FluentIcons.Filled.BuildingCheckmark: ImageVector
    get() {
        if (_buildingCheckmark != null) {
            return _buildingCheckmark!!
        }
        _buildingCheckmark = Builder(name = "BuildingCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 2.0f)
                curveTo(4.672f, 2.0f, 4.0f, 2.672f, 4.0f, 3.5f)
                verticalLineTo(17.5f)
                curveTo(4.0f, 17.776f, 4.224f, 18.0f, 4.5f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.5f)
                curveTo(7.0f, 14.224f, 7.224f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(9.022f)
                curveTo(9.072f, 13.445f, 9.205f, 12.913f, 9.408f, 12.418f)
                curveTo(9.166f, 12.293f, 9.0f, 12.041f, 9.0f, 11.75f)
                curveTo(9.0f, 11.336f, 9.336f, 11.0f, 9.75f, 11.0f)
                curveTo(9.901f, 11.0f, 10.042f, 11.045f, 10.16f, 11.122f)
                curveTo(11.166f, 9.83f, 12.736f, 9.0f, 14.5f, 9.0f)
                curveTo(15.009f, 9.0f, 15.502f, 9.069f, 15.97f, 9.199f)
                curveTo(15.83f, 8.515f, 15.225f, 8.0f, 14.5f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                curveTo(13.0f, 2.672f, 12.328f, 2.0f, 11.5f, 2.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(7.5f, 5.75f)
                curveTo(7.5f, 6.164f, 7.164f, 6.5f, 6.75f, 6.5f)
                curveTo(6.336f, 6.5f, 6.0f, 6.164f, 6.0f, 5.75f)
                curveTo(6.0f, 5.336f, 6.336f, 5.0f, 6.75f, 5.0f)
                curveTo(7.164f, 5.0f, 7.5f, 5.336f, 7.5f, 5.75f)
                close()
                moveTo(6.75f, 8.0f)
                curveTo(7.164f, 8.0f, 7.5f, 8.336f, 7.5f, 8.75f)
                curveTo(7.5f, 9.164f, 7.164f, 9.5f, 6.75f, 9.5f)
                curveTo(6.336f, 9.5f, 6.0f, 9.164f, 6.0f, 8.75f)
                curveTo(6.0f, 8.336f, 6.336f, 8.0f, 6.75f, 8.0f)
                close()
                moveTo(7.5f, 11.75f)
                curveTo(7.5f, 12.164f, 7.164f, 12.5f, 6.75f, 12.5f)
                curveTo(6.336f, 12.5f, 6.0f, 12.164f, 6.0f, 11.75f)
                curveTo(6.0f, 11.336f, 6.336f, 11.0f, 6.75f, 11.0f)
                curveTo(7.164f, 11.0f, 7.5f, 11.336f, 7.5f, 11.75f)
                close()
                moveTo(9.75f, 5.0f)
                curveTo(10.164f, 5.0f, 10.5f, 5.336f, 10.5f, 5.75f)
                curveTo(10.5f, 6.164f, 10.164f, 6.5f, 9.75f, 6.5f)
                curveTo(9.336f, 6.5f, 9.0f, 6.164f, 9.0f, 5.75f)
                curveTo(9.0f, 5.336f, 9.336f, 5.0f, 9.75f, 5.0f)
                close()
                moveTo(10.5f, 8.75f)
                curveTo(10.5f, 9.164f, 10.164f, 9.5f, 9.75f, 9.5f)
                curveTo(9.336f, 9.5f, 9.0f, 9.164f, 9.0f, 8.75f)
                curveTo(9.0f, 8.336f, 9.336f, 8.0f, 9.75f, 8.0f)
                curveTo(10.164f, 8.0f, 10.5f, 8.336f, 10.5f, 8.75f)
                close()
                moveTo(9.022f, 15.0f)
                curveTo(9.125f, 16.135f, 9.571f, 17.17f, 10.257f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.022f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(16.854f, 12.646f)
                curveTo(16.658f, 12.451f, 16.342f, 12.451f, 16.146f, 12.646f)
                lineTo(13.5f, 15.293f)
                lineTo(12.854f, 14.646f)
                curveTo(12.658f, 14.451f, 12.342f, 14.451f, 12.146f, 14.646f)
                curveTo(11.951f, 14.842f, 11.951f, 15.158f, 12.146f, 15.354f)
                lineTo(13.146f, 16.354f)
                curveTo(13.342f, 16.549f, 13.658f, 16.549f, 13.854f, 16.354f)
                lineTo(16.854f, 13.354f)
                curveTo(17.049f, 13.158f, 17.049f, 12.842f, 16.854f, 12.646f)
                close()
            }
        }
        .build()
        return _buildingCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _buildingCheckmark: ImageVector? = null

@Preview
@Composable
private fun BuildingCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BuildingCheckmark, contentDescription = null)
    }
}

