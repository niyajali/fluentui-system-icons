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

public val FluentIcons.Filled.SerialPort: ImageVector
    get() {
        if (_SerialPort != null) {
            return _SerialPort!!
        }
        _SerialPort = ImageVector.Builder(
            name = "Filled.SerialPort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.231f, 10.386f)
                curveTo(1.82f, 8.658f, 3.13f, 6.999f, 4.907f, 6.999f)
                horizontalLineTo(19.091f)
                curveTo(20.868f, 6.999f, 22.178f, 8.659f, 21.766f, 10.387f)
                lineTo(20.692f, 14.889f)
                curveTo(20.396f, 16.127f, 19.29f, 17f, 18.017f, 17f)
                horizontalLineTo(5.978f)
                curveTo(4.705f, 17f, 3.598f, 16.126f, 3.303f, 14.887f)
                lineTo(2.231f, 10.386f)
                close()
                moveTo(7f, 11.5f)
                curveTo(7.414f, 11.5f, 7.75f, 11.164f, 7.75f, 10.75f)
                curveTo(7.75f, 10.335f, 7.414f, 10f, 7f, 10f)
                curveTo(6.585f, 10f, 6.25f, 10.335f, 6.25f, 10.75f)
                curveTo(6.25f, 11.164f, 6.585f, 11.5f, 7f, 11.5f)
                close()
                moveTo(10.25f, 10.75f)
                curveTo(10.25f, 10.335f, 9.914f, 10f, 9.5f, 10f)
                curveTo(9.085f, 10f, 8.75f, 10.335f, 8.75f, 10.75f)
                curveTo(8.75f, 11.164f, 9.085f, 11.5f, 9.5f, 11.5f)
                curveTo(9.914f, 11.5f, 10.25f, 11.164f, 10.25f, 10.75f)
                close()
                moveTo(8.25f, 14f)
                curveTo(8.664f, 14f, 9f, 13.664f, 9f, 13.25f)
                curveTo(9f, 12.835f, 8.664f, 12.5f, 8.25f, 12.5f)
                curveTo(7.835f, 12.5f, 7.5f, 12.835f, 7.5f, 13.25f)
                curveTo(7.5f, 13.664f, 7.835f, 14f, 8.25f, 14f)
                close()
                moveTo(11.5f, 13.25f)
                curveTo(11.5f, 12.835f, 11.164f, 12.5f, 10.75f, 12.5f)
                curveTo(10.335f, 12.5f, 10f, 12.835f, 10f, 13.25f)
                curveTo(10f, 13.664f, 10.335f, 14f, 10.75f, 14f)
                curveTo(11.164f, 14f, 11.5f, 13.664f, 11.5f, 13.25f)
                close()
                moveTo(13.25f, 14f)
                curveTo(13.664f, 14f, 14f, 13.664f, 14f, 13.25f)
                curveTo(14f, 12.835f, 13.664f, 12.5f, 13.25f, 12.5f)
                curveTo(12.835f, 12.5f, 12.5f, 12.835f, 12.5f, 13.25f)
                curveTo(12.5f, 13.664f, 12.835f, 14f, 13.25f, 14f)
                close()
                moveTo(16.5f, 13.25f)
                curveTo(16.5f, 12.835f, 16.164f, 12.5f, 15.75f, 12.5f)
                curveTo(15.335f, 12.5f, 15f, 12.835f, 15f, 13.25f)
                curveTo(15f, 13.664f, 15.335f, 14f, 15.75f, 14f)
                curveTo(16.164f, 14f, 16.5f, 13.664f, 16.5f, 13.25f)
                close()
                moveTo(12f, 11.5f)
                curveTo(12.414f, 11.5f, 12.75f, 11.164f, 12.75f, 10.75f)
                curveTo(12.75f, 10.335f, 12.414f, 10f, 12f, 10f)
                curveTo(11.585f, 10f, 11.25f, 10.335f, 11.25f, 10.75f)
                curveTo(11.25f, 11.164f, 11.585f, 11.5f, 12f, 11.5f)
                close()
                moveTo(15.25f, 10.75f)
                curveTo(15.25f, 10.335f, 14.914f, 10f, 14.5f, 10f)
                curveTo(14.085f, 10f, 13.75f, 10.335f, 13.75f, 10.75f)
                curveTo(13.75f, 11.164f, 14.085f, 11.5f, 14.5f, 11.5f)
                curveTo(14.914f, 11.5f, 15.25f, 11.164f, 15.25f, 10.75f)
                close()
                moveTo(17f, 11.5f)
                curveTo(17.414f, 11.5f, 17.75f, 11.164f, 17.75f, 10.75f)
                curveTo(17.75f, 10.335f, 17.414f, 10f, 17f, 10f)
                curveTo(16.585f, 10f, 16.25f, 10.335f, 16.25f, 10.75f)
                curveTo(16.25f, 11.164f, 16.585f, 11.5f, 17f, 11.5f)
                close()
            }
        }.build()

        return _SerialPort!!
    }

@Suppress("ObjectPropertyName")
private var _SerialPort: ImageVector? = null

@Preview
@Composable
private fun SerialPortPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SerialPort, contentDescription = null)
    }
}
