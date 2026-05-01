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
 * VehicleTrailerArrowDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent vehicle trailer.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_trailer_arrow_down_20_filled.svg)
 * 
 * @return The [ImageVector] for the VehicleTrailerArrowDown icon.
 */
public val FluentIcons.Filled.VehicleTrailerArrowDown: ImageVector
    get() {
        if (_vehicleTrailerArrowDown != null) {
            return _vehicleTrailerArrowDown!!
        }
        _vehicleTrailerArrowDown = Builder(name = "VehicleTrailerArrowDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 12.0f)
                curveTo(6.776f, 12.0f, 7.0f, 12.224f, 7.0f, 12.5f)
                verticalLineTo(17.293f)
                lineTo(8.146f, 16.146f)
                curveTo(8.342f, 15.951f, 8.658f, 15.951f, 8.854f, 16.146f)
                curveTo(9.049f, 16.342f, 9.049f, 16.658f, 8.854f, 16.854f)
                lineTo(6.854f, 18.854f)
                curveTo(6.658f, 19.049f, 6.342f, 19.049f, 6.146f, 18.854f)
                lineTo(4.146f, 16.854f)
                curveTo(3.951f, 16.658f, 3.951f, 16.342f, 4.146f, 16.146f)
                curveTo(4.342f, 15.951f, 4.658f, 15.951f, 4.854f, 16.146f)
                lineTo(6.0f, 17.293f)
                verticalLineTo(12.5f)
                curveTo(6.0f, 12.224f, 6.224f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(13.154f, 3.004f)
                curveTo(14.739f, 3.084f, 16.0f, 4.395f, 16.0f, 6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.5f)
                curveTo(18.0f, 12.224f, 18.224f, 12.0f, 18.5f, 12.0f)
                curveTo(18.776f, 12.0f, 19.0f, 12.224f, 19.0f, 12.5f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 16.776f, 18.776f, 17.0f, 18.5f, 17.0f)
                curveTo(18.224f, 17.0f, 18.0f, 16.776f, 18.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.5f)
                curveTo(8.0f, 11.672f, 7.328f, 11.0f, 6.5f, 11.0f)
                curveTo(5.672f, 11.0f, 5.0f, 11.672f, 5.0f, 12.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                curveTo(2.343f, 15.0f, 1.0f, 13.657f, 1.0f, 12.0f)
                curveTo(1.0f, 7.029f, 5.029f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(13.0f)
                lineTo(13.154f, 3.004f)
                close()
                moveTo(10.0f, 6.0f)
                curveTo(9.448f, 6.0f, 9.0f, 6.448f, 9.0f, 7.0f)
                verticalLineTo(9.0f)
                lineTo(9.005f, 9.103f)
                curveTo(9.056f, 9.607f, 9.482f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(12.0f)
                curveTo(12.552f, 10.0f, 13.0f, 9.552f, 13.0f, 9.0f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 6.482f, 12.607f, 6.056f, 12.102f, 6.005f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _vehicleTrailerArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleTrailerArrowDown: ImageVector? = null

@Preview
@Composable
private fun VehicleTrailerArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VehicleTrailerArrowDown, contentDescription = "VehicleTrailerArrowDown Icon")
    }
}

