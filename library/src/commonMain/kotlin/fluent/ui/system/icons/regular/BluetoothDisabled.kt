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

public val FluentIcons.Regular.BluetoothDisabled: ImageVector
    get() {
        if (_BluetoothDisabled != null) {
            return _BluetoothDisabled!!
        }
        _BluetoothDisabled = ImageVector.Builder(
            name = "Regular.BluetoothDisabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.5f, 17.561f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(10.78f, 11.84f)
                lineTo(6.264f, 15.679f)
                curveTo(5.949f, 15.947f, 5.91f, 16.42f, 6.179f, 16.736f)
                curveTo(6.447f, 17.051f, 6.92f, 17.09f, 7.236f, 16.822f)
                lineTo(11f, 13.622f)
                verticalLineTo(21.25f)
                curveTo(11f, 21.553f, 11.183f, 21.827f, 11.463f, 21.943f)
                curveTo(11.743f, 22.059f, 12.066f, 21.995f, 12.28f, 21.78f)
                lineTo(16.5f, 17.561f)
                close()
                moveTo(12.906f, 13.967f)
                lineTo(15.439f, 16.5f)
                lineTo(12.5f, 19.439f)
                verticalLineTo(13.622f)
                lineTo(12.906f, 13.967f)
                close()
                moveTo(17.236f, 8.321f)
                lineTo(14.137f, 10.955f)
                lineTo(13.073f, 9.891f)
                lineTo(15.645f, 7.705f)
                lineTo(12.5f, 4.561f)
                verticalLineTo(9.318f)
                lineTo(11f, 7.818f)
                verticalLineTo(2.75f)
                curveTo(11f, 2.447f, 11.183f, 2.173f, 11.463f, 2.057f)
                curveTo(11.743f, 1.941f, 12.066f, 2.005f, 12.28f, 2.22f)
                lineTo(17.28f, 7.22f)
                curveTo(17.428f, 7.368f, 17.508f, 7.571f, 17.499f, 7.78f)
                curveTo(17.491f, 7.99f, 17.395f, 8.186f, 17.236f, 8.321f)
                close()
            }
        }.build()

        return _BluetoothDisabled!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothDisabled: ImageVector? = null

@Preview
@Composable
private fun BluetoothDisabledPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BluetoothDisabled, contentDescription = null)
    }
}
