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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DeviceMeetingRoomRemote: ImageVector
    get() {
        if (_DeviceMeetingRoomRemote != null) {
            return _DeviceMeetingRoomRemote!!
        }
        _DeviceMeetingRoomRemote = ImageVector.Builder(
            name = "Regular.DeviceMeetingRoomRemote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.094f, 5.346f)
                curveTo(4.425f, 3.97f, 5.657f, 3f, 7.072f, 3f)
                horizontalLineTo(16.93f)
                curveTo(18.345f, 3f, 19.576f, 3.97f, 19.908f, 5.346f)
                lineTo(21.9f, 13.619f)
                curveTo(22.437f, 15.852f, 20.745f, 18f, 18.448f, 18f)
                horizontalLineTo(10.501f)
                verticalLineTo(16.5f)
                horizontalLineTo(18.448f)
                curveTo(19.774f, 16.5f, 20.752f, 15.26f, 20.441f, 13.97f)
                lineTo(18.449f, 5.697f)
                curveTo(18.28f, 4.995f, 17.652f, 4.5f, 16.93f, 4.5f)
                horizontalLineTo(7.072f)
                curveTo(6.35f, 4.5f, 5.722f, 4.995f, 5.553f, 5.697f)
                lineTo(4.878f, 8.5f)
                horizontalLineTo(3.75f)
                curveTo(3.606f, 8.5f, 3.465f, 8.511f, 3.327f, 8.532f)
                lineTo(4.094f, 5.346f)
                close()
                moveTo(10.49f, 20.5f)
                horizontalLineTo(17.252f)
                curveTo(17.666f, 20.5f, 18.002f, 20.164f, 18.002f, 19.75f)
                curveTo(18.002f, 19.336f, 17.666f, 19f, 17.252f, 19f)
                horizontalLineTo(10.501f)
                verticalLineTo(20.25f)
                curveTo(10.501f, 20.334f, 10.497f, 20.418f, 10.49f, 20.5f)
                close()
                moveTo(5.751f, 14.5f)
                curveTo(6.441f, 14.5f, 7.001f, 13.94f, 7.001f, 13.25f)
                curveTo(7.001f, 12.56f, 6.441f, 12f, 5.751f, 12f)
                curveTo(5.06f, 12f, 4.5f, 12.56f, 4.5f, 13.25f)
                curveTo(4.5f, 13.94f, 5.06f, 14.5f, 5.751f, 14.5f)
                close()
                moveTo(2f, 11.25f)
                curveTo(2f, 10.283f, 2.784f, 9.5f, 3.75f, 9.5f)
                horizontalLineTo(7.751f)
                curveTo(8.718f, 9.5f, 9.501f, 10.283f, 9.501f, 11.25f)
                verticalLineTo(20.25f)
                curveTo(9.501f, 21.216f, 8.718f, 22f, 7.751f, 22f)
                horizontalLineTo(3.75f)
                curveTo(2.784f, 22f, 2f, 21.216f, 2f, 20.25f)
                verticalLineTo(11.25f)
                close()
                moveTo(3.75f, 11f)
                curveTo(3.612f, 11f, 3.5f, 11.112f, 3.5f, 11.25f)
                verticalLineTo(20.25f)
                curveTo(3.5f, 20.388f, 3.612f, 20.5f, 3.75f, 20.5f)
                horizontalLineTo(7.751f)
                curveTo(7.889f, 20.5f, 8.001f, 20.388f, 8.001f, 20.25f)
                verticalLineTo(11.25f)
                curveTo(8.001f, 11.112f, 7.889f, 11f, 7.751f, 11f)
                horizontalLineTo(3.75f)
                close()
            }
        }.build()

        return _DeviceMeetingRoomRemote!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMeetingRoomRemote: ImageVector? = null

@Preview
@Composable
private fun DeviceMeetingRoomRemotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DeviceMeetingRoomRemote, contentDescription = null)
    }
}
