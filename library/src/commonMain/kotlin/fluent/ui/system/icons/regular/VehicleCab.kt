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
 * VehicleCab Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent vehicle travel scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_vehicle_cab_24_regular.svg)
 * 
 * @return The [ImageVector] for the VehicleCab icon.
 */
public val FluentIcons.Regular.VehicleCab: ImageVector
    get() {
        if (_vehicleCab != null) {
            return _vehicleCab!!
        }
        _vehicleCab = Builder(name = "VehicleCab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.005f, 13.0f)
                curveTo(8.005f, 13.552f, 7.558f, 14.0f, 7.005f, 14.0f)
                curveTo(6.453f, 14.0f, 6.005f, 13.552f, 6.005f, 13.0f)
                curveTo(6.005f, 12.448f, 6.453f, 12.0f, 7.005f, 12.0f)
                curveTo(7.558f, 12.0f, 8.005f, 12.448f, 8.005f, 13.0f)
                close()
                moveTo(17.0f, 14.0f)
                curveTo(17.552f, 14.0f, 18.0f, 13.552f, 18.0f, 13.0f)
                curveTo(18.0f, 12.448f, 17.552f, 12.0f, 17.0f, 12.0f)
                curveTo(16.448f, 12.0f, 16.0f, 12.448f, 16.0f, 13.0f)
                curveTo(16.0f, 13.552f, 16.448f, 14.0f, 17.0f, 14.0f)
                close()
                moveTo(9.484f, 14.75f)
                curveTo(9.484f, 14.336f, 9.82f, 14.0f, 10.234f, 14.0f)
                horizontalLineTo(13.719f)
                curveTo(14.133f, 14.0f, 14.469f, 14.336f, 14.469f, 14.75f)
                curveTo(14.469f, 15.164f, 14.133f, 15.5f, 13.719f, 15.5f)
                horizontalLineTo(10.234f)
                curveTo(9.82f, 15.5f, 9.484f, 15.164f, 9.484f, 14.75f)
                close()
                moveTo(9.266f, 1.992f)
                curveTo(8.851f, 1.992f, 8.516f, 2.328f, 8.516f, 2.742f)
                verticalLineTo(4.5f)
                horizontalLineTo(7.852f)
                curveTo(6.422f, 4.5f, 5.16f, 5.435f, 4.743f, 6.802f)
                lineTo(4.683f, 7.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 7.0f, 3.0f, 7.336f, 3.0f, 7.75f)
                curveTo(3.0f, 8.164f, 3.336f, 8.5f, 3.75f, 8.5f)
                horizontalLineTo(4.283f)
                lineTo(4.081f, 9.327f)
                curveTo(3.433f, 9.722f, 3.0f, 10.435f, 3.0f, 11.25f)
                verticalLineTo(19.75f)
                curveTo(3.0f, 20.716f, 3.783f, 21.5f, 4.75f, 21.5f)
                horizontalLineTo(6.25f)
                curveTo(7.216f, 21.5f, 8.0f, 20.716f, 8.0f, 19.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.75f)
                curveTo(16.0f, 20.716f, 16.784f, 21.5f, 17.75f, 21.5f)
                horizontalLineTo(19.25f)
                curveTo(20.216f, 21.5f, 21.0f, 20.716f, 21.0f, 19.75f)
                verticalLineTo(11.25f)
                curveTo(21.0f, 10.435f, 20.566f, 9.721f, 19.917f, 9.326f)
                lineTo(19.711f, 8.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 8.5f, 21.0f, 8.164f, 21.0f, 7.75f)
                curveTo(21.0f, 7.336f, 20.664f, 7.0f, 20.25f, 7.0f)
                horizontalLineTo(19.308f)
                lineTo(19.253f, 6.816f)
                curveTo(18.84f, 5.441f, 17.575f, 4.5f, 16.14f, 4.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(2.742f)
                curveTo(15.5f, 2.328f, 15.164f, 1.992f, 14.75f, 1.992f)
                horizontalLineTo(9.266f)
                close()
                moveTo(14.0f, 4.5f)
                horizontalLineTo(10.016f)
                verticalLineTo(3.492f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(7.852f, 6.0f)
                horizontalLineTo(16.14f)
                curveTo(16.913f, 6.0f, 17.594f, 6.507f, 17.816f, 7.247f)
                lineTo(18.027f, 7.949f)
                lineTo(18.289f, 9.0f)
                horizontalLineTo(5.705f)
                lineTo(5.962f, 7.948f)
                lineTo(6.178f, 7.24f)
                curveTo(6.402f, 6.503f, 7.082f, 6.0f, 7.852f, 6.0f)
                close()
                moveTo(4.5f, 17.0f)
                verticalLineTo(11.25f)
                curveTo(4.5f, 10.836f, 4.836f, 10.5f, 5.25f, 10.5f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 10.5f, 19.5f, 10.836f, 19.5f, 11.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(4.5f, 19.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(19.75f)
                curveTo(6.5f, 19.888f, 6.388f, 20.0f, 6.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(4.612f, 20.0f, 4.5f, 19.888f, 4.5f, 19.75f)
                close()
                moveTo(19.5f, 18.5f)
                verticalLineTo(19.75f)
                curveTo(19.5f, 19.888f, 19.388f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(17.75f)
                curveTo(17.612f, 20.0f, 17.5f, 19.888f, 17.5f, 19.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _vehicleCab!!
    }

@Suppress("ObjectPropertyName")
private var _vehicleCab: ImageVector? = null

@Preview
@Composable
private fun VehicleCabPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VehicleCab, contentDescription = "VehicleCab Icon")
    }
}

