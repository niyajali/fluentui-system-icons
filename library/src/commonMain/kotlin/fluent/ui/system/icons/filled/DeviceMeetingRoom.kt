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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.DeviceMeetingRoom: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceMeetingRoom",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.093f, 5.346f)
            curveTo(4.424f, 3.97f, 5.655f, 3f, 7.071f, 3f)
            horizontalLineTo(16.929f)
            curveTo(18.345f, 3f, 19.576f, 3.97f, 19.907f, 5.346f)
            lineTo(21.9f, 13.619f)
            curveTo(22.437f, 15.852f, 20.745f, 18f, 18.448f, 18f)
            horizontalLineTo(5.553f)
            curveTo(3.255f, 18f, 1.563f, 15.852f, 2.1f, 13.619f)
            lineTo(4.093f, 5.346f)
            close()
            moveTo(6.749f, 19f)
            curveTo(6.334f, 19f, 5.999f, 19.336f, 5.999f, 19.75f)
            curveTo(5.999f, 20.164f, 6.334f, 20.5f, 6.749f, 20.5f)
            horizontalLineTo(17.251f)
            curveTo(17.666f, 20.5f, 18.001f, 20.164f, 18.001f, 19.75f)
            curveTo(18.001f, 19.336f, 17.666f, 19f, 17.251f, 19f)
            horizontalLineTo(6.749f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DeviceMeetingRoomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DeviceMeetingRoom, contentDescription = null)
    }
}
