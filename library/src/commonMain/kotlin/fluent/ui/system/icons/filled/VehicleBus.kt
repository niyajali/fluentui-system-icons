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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.VehicleBus: ImageVector
    get() {
        if (_VehicleBus != null) {
            return _VehicleBus!!
        }
        _VehicleBus = ImageVector.Builder(
            name = "Filled.VehicleBus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.75f, 5f)
                curveTo(10.336f, 5f, 10f, 5.336f, 10f, 5.75f)
                curveTo(10f, 6.164f, 10.336f, 6.5f, 10.75f, 6.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 6.5f, 14f, 6.164f, 14f, 5.75f)
                curveTo(14f, 5.336f, 13.664f, 5f, 13.25f, 5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(4f, 5.75f)
                curveTo(4f, 3.679f, 5.679f, 2f, 7.75f, 2f)
                horizontalLineTo(16.25f)
                curveTo(18.321f, 2f, 20f, 3.679f, 20f, 5.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(21.227f)
                curveTo(21.641f, 9.5f, 21.977f, 9.836f, 21.977f, 10.25f)
                curveTo(21.977f, 10.664f, 21.641f, 11f, 21.227f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.716f, 19.216f, 21.5f, 18.25f, 21.5f)
                horizontalLineTo(16.75f)
                curveTo(15.783f, 21.5f, 15f, 20.716f, 15f, 19.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(9f)
                verticalLineTo(19.75f)
                curveTo(9f, 20.716f, 8.216f, 21.5f, 7.25f, 21.5f)
                horizontalLineTo(5.75f)
                curveTo(4.783f, 21.5f, 4f, 20.716f, 4f, 19.75f)
                verticalLineTo(11f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 11f, 2f, 10.664f, 2f, 10.25f)
                curveTo(2f, 9.836f, 2.336f, 9.5f, 2.75f, 9.5f)
                horizontalLineTo(4f)
                verticalLineTo(5.75f)
                close()
                moveTo(16.5f, 18.5f)
                verticalLineTo(19.75f)
                curveTo(16.5f, 19.888f, 16.612f, 20f, 16.75f, 20f)
                horizontalLineTo(18.25f)
                curveTo(18.388f, 20f, 18.5f, 19.888f, 18.5f, 19.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(16.5f)
                close()
                moveTo(5.5f, 18.5f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 19.888f, 5.612f, 20f, 5.75f, 20f)
                horizontalLineTo(7.25f)
                curveTo(7.388f, 20f, 7.5f, 19.888f, 7.5f, 19.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(5.5f)
                close()
                moveTo(7.75f, 3.5f)
                curveTo(6.507f, 3.5f, 5.5f, 4.507f, 5.5f, 5.75f)
                verticalLineTo(12f)
                horizontalLineTo(18.5f)
                verticalLineTo(5.75f)
                curveTo(18.5f, 4.507f, 17.493f, 3.5f, 16.25f, 3.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(9f, 15f)
                curveTo(9f, 14.448f, 8.552f, 14f, 8f, 14f)
                curveTo(7.448f, 14f, 7f, 14.448f, 7f, 15f)
                curveTo(7f, 15.552f, 7.448f, 16f, 8f, 16f)
                curveTo(8.552f, 16f, 9f, 15.552f, 9f, 15f)
                close()
                moveTo(16f, 16f)
                curveTo(16.552f, 16f, 17f, 15.552f, 17f, 15f)
                curveTo(17f, 14.448f, 16.552f, 14f, 16f, 14f)
                curveTo(15.448f, 14f, 15f, 14.448f, 15f, 15f)
                curveTo(15f, 15.552f, 15.448f, 16f, 16f, 16f)
                close()
            }
        }.build()

        return _VehicleBus!!
    }

@Suppress("ObjectPropertyName")
private var _VehicleBus: ImageVector? = null

@Preview
@Composable
private fun VehicleBusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VehicleBus, contentDescription = null)
    }
}
