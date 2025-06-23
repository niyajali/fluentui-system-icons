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

public val FluentIcons.Filled.VehicleSubway: ImageVector
    get() {
        if (_VehicleSubway != null) {
            return _VehicleSubway!!
        }
        _VehicleSubway = ImageVector.Builder(
            name = "Filled.VehicleSubway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.25f, 3f)
                curveTo(18.321f, 3f, 20f, 4.679f, 20f, 6.75f)
                verticalLineTo(15.75f)
                curveTo(20f, 17.525f, 18.766f, 19.012f, 17.11f, 19.401f)
                lineTo(19.572f, 20.573f)
                curveTo(19.946f, 20.751f, 20.105f, 21.198f, 19.927f, 21.573f)
                curveTo(19.764f, 21.915f, 19.374f, 22.077f, 19.022f, 21.965f)
                lineTo(18.927f, 21.927f)
                lineTo(13.83f, 19.5f)
                horizontalLineTo(10.169f)
                lineTo(5.072f, 21.927f)
                curveTo(4.698f, 22.105f, 4.251f, 21.946f, 4.073f, 21.573f)
                curveTo(3.895f, 21.198f, 4.054f, 20.751f, 4.427f, 20.573f)
                lineTo(6.89f, 19.401f)
                curveTo(5.233f, 19.012f, 4f, 17.525f, 4f, 15.75f)
                verticalLineTo(6.75f)
                curveTo(4f, 4.679f, 5.679f, 3f, 7.75f, 3f)
                horizontalLineTo(16.25f)
                close()
                moveTo(8f, 15f)
                curveTo(7.448f, 15f, 7f, 15.448f, 7f, 16f)
                curveTo(7f, 16.552f, 7.448f, 17f, 8f, 17f)
                curveTo(8.552f, 17f, 9f, 16.552f, 9f, 16f)
                curveTo(9f, 15.448f, 8.552f, 15f, 8f, 15f)
                close()
                moveTo(16f, 15f)
                curveTo(15.448f, 15f, 15f, 15.448f, 15f, 16f)
                curveTo(15f, 16.552f, 15.448f, 17f, 16f, 17f)
                curveTo(16.552f, 17f, 17f, 16.552f, 17f, 16f)
                curveTo(17f, 15.448f, 16.552f, 15f, 16f, 15f)
                close()
                moveTo(16.25f, 4.5f)
                horizontalLineTo(7.75f)
                curveTo(6.507f, 4.5f, 5.5f, 5.507f, 5.5f, 6.75f)
                lineTo(5.5f, 12.5f)
                horizontalLineTo(18.5f)
                lineTo(18.5f, 6.75f)
                curveTo(18.5f, 5.507f, 17.493f, 4.5f, 16.25f, 4.5f)
                close()
                moveTo(13.25f, 6f)
                curveTo(13.664f, 6f, 14f, 6.336f, 14f, 6.75f)
                curveTo(14f, 7.164f, 13.664f, 7.5f, 13.25f, 7.5f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 7.5f, 10f, 7.164f, 10f, 6.75f)
                curveTo(10f, 6.336f, 10.336f, 6f, 10.75f, 6f)
                horizontalLineTo(13.25f)
                close()
            }
        }.build()

        return _VehicleSubway!!
    }

@Suppress("ObjectPropertyName")
private var _VehicleSubway: ImageVector? = null

@Preview
@Composable
private fun VehicleSubwayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VehicleSubway, contentDescription = null)
    }
}
