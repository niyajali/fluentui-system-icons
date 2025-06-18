/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Bluetooth: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bluetooth",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.463f, 2.057f)
            curveTo(11.743f, 1.941f, 12.066f, 2.005f, 12.28f, 2.22f)
            lineTo(17.28f, 7.22f)
            curveTo(17.428f, 7.368f, 17.508f, 7.571f, 17.499f, 7.78f)
            curveTo(17.491f, 7.99f, 17.395f, 8.186f, 17.236f, 8.321f)
            lineTo(12.908f, 12f)
            lineTo(17.236f, 15.679f)
            curveTo(17.395f, 15.814f, 17.491f, 16.01f, 17.499f, 16.22f)
            curveTo(17.508f, 16.429f, 17.428f, 16.632f, 17.28f, 16.78f)
            lineTo(12.28f, 21.78f)
            curveTo(12.066f, 21.995f, 11.743f, 22.059f, 11.463f, 21.943f)
            curveTo(11.183f, 21.827f, 11f, 21.553f, 11f, 21.25f)
            verticalLineTo(13.622f)
            lineTo(7.236f, 16.822f)
            curveTo(6.92f, 17.09f, 6.447f, 17.051f, 6.179f, 16.736f)
            curveTo(5.91f, 16.42f, 5.949f, 15.947f, 6.264f, 15.679f)
            lineTo(10.592f, 12f)
            lineTo(6.264f, 8.321f)
            curveTo(5.949f, 8.053f, 5.91f, 7.58f, 6.179f, 7.264f)
            curveTo(6.447f, 6.949f, 6.92f, 6.91f, 7.236f, 7.179f)
            lineTo(11f, 10.378f)
            verticalLineTo(2.75f)
            curveTo(11f, 2.447f, 11.183f, 2.173f, 11.463f, 2.057f)
            close()
            moveTo(12.5f, 13.622f)
            verticalLineTo(19.439f)
            lineTo(15.645f, 16.295f)
            lineTo(12.5f, 13.622f)
            close()
            moveTo(12.5f, 10.378f)
            lineTo(15.645f, 7.705f)
            lineTo(12.5f, 4.561f)
            verticalLineTo(10.378f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BluetoothPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Bluetooth, contentDescription = null)
    }
}
