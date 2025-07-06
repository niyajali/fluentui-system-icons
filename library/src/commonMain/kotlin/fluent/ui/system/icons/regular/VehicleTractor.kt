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
 * VehicleTractor Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent vehicle travel scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_tractor_24_regular.svg)
 * 
 * @return The [ImageVector] for the VehicleTractor icon.
 */
public val FluentIcons.Regular.VehicleTractor: ImageVector
    get() {
        if (_vehicleTractor != null) {
            return _vehicleTractor!!
        }
        _vehicleTractor = Builder(name = "VehicleTractor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.021f, 3.0f)
                curveTo(5.921f, 3.0f, 4.982f, 3.795f, 4.801f, 4.88f)
                lineTo(3.979f, 9.815f)
                curveTo(2.197f, 10.855f, 1.0f, 12.788f, 1.0f, 15.0f)
                curveTo(1.0f, 18.314f, 3.686f, 21.0f, 7.0f, 21.0f)
                curveTo(9.612f, 21.0f, 11.835f, 19.33f, 12.659f, 17.0f)
                horizontalLineTo(16.035f)
                curveTo(16.012f, 17.163f, 16.0f, 17.33f, 16.0f, 17.5f)
                curveTo(16.0f, 19.433f, 17.567f, 21.0f, 19.5f, 21.0f)
                curveTo(21.433f, 21.0f, 23.0f, 19.433f, 23.0f, 17.5f)
                curveTo(23.0f, 16.545f, 22.618f, 15.68f, 21.998f, 15.049f)
                verticalLineTo(12.25f)
                curveTo(21.998f, 10.455f, 20.543f, 9.0f, 18.748f, 9.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.75f)
                curveTo(17.5f, 6.336f, 17.164f, 6.0f, 16.75f, 6.0f)
                curveTo(16.336f, 6.0f, 16.0f, 6.336f, 16.0f, 6.75f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.885f)
                lineTo(13.199f, 4.88f)
                curveTo(13.018f, 3.795f, 12.079f, 3.0f, 10.979f, 3.0f)
                horizontalLineTo(7.021f)
                close()
                moveTo(12.979f, 15.5f)
                curveTo(12.993f, 15.335f, 13.0f, 15.168f, 13.0f, 15.0f)
                curveTo(13.0f, 13.208f, 12.214f, 11.599f, 10.969f, 10.5f)
                horizontalLineTo(13.236f)
                curveTo(13.245f, 10.5f, 13.253f, 10.5f, 13.262f, 10.5f)
                horizontalLineTo(18.748f)
                curveTo(19.715f, 10.5f, 20.498f, 11.283f, 20.498f, 12.25f)
                verticalLineTo(14.144f)
                curveTo(20.182f, 14.05f, 19.847f, 14.0f, 19.5f, 14.0f)
                curveTo(18.311f, 14.0f, 17.26f, 14.593f, 16.627f, 15.5f)
                horizontalLineTo(12.979f)
                close()
                moveTo(7.037f, 9.0f)
                curveTo(7.024f, 9.0f, 7.012f, 9.0f, 7.0f, 9.0f)
                curveTo(6.521f, 9.0f, 6.055f, 9.056f, 5.608f, 9.162f)
                lineTo(6.281f, 5.127f)
                curveTo(6.341f, 4.765f, 6.654f, 4.5f, 7.021f, 4.5f)
                horizontalLineTo(10.979f)
                curveTo(11.346f, 4.5f, 11.659f, 4.765f, 11.719f, 5.127f)
                lineTo(12.365f, 9.0f)
                horizontalLineTo(7.063f)
                curveTo(7.054f, 9.0f, 7.045f, 9.0f, 7.037f, 9.0f)
                close()
                moveTo(19.5f, 15.5f)
                curveTo(20.605f, 15.5f, 21.5f, 16.395f, 21.5f, 17.5f)
                curveTo(21.5f, 18.605f, 20.605f, 19.5f, 19.5f, 19.5f)
                curveTo(18.395f, 19.5f, 17.5f, 18.605f, 17.5f, 17.5f)
                curveTo(17.5f, 16.395f, 18.395f, 15.5f, 19.5f, 15.5f)
                close()
                moveTo(2.5f, 15.0f)
                curveTo(2.5f, 12.515f, 4.515f, 10.5f, 7.0f, 10.5f)
                curveTo(9.485f, 10.5f, 11.5f, 12.515f, 11.5f, 15.0f)
                curveTo(11.5f, 17.485f, 9.485f, 19.5f, 7.0f, 19.5f)
                curveTo(4.515f, 19.5f, 2.5f, 17.485f, 2.5f, 15.0f)
                close()
            }
        }
        .build()
        return _vehicleTractor!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleTractor: ImageVector? = null

@Preview
@Composable
private fun VehicleTractorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleTractor, contentDescription = "VehicleTractor Icon")
    }
}

