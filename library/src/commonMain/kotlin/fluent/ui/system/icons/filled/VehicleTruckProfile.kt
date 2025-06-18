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

public val FluentUi.Filled.VehicleTruckProfile: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleTruckProfile",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5.25f)
            curveTo(2f, 4.007f, 3.007f, 3f, 4.25f, 3f)
            horizontalLineTo(14.25f)
            curveTo(15.493f, 3f, 16.5f, 4.007f, 16.5f, 5.25f)
            verticalLineTo(6f)
            horizontalLineTo(18.051f)
            curveTo(18.92f, 6f, 19.712f, 6.501f, 20.084f, 7.287f)
            lineTo(21.783f, 10.874f)
            curveTo(21.926f, 11.175f, 22f, 11.504f, 22f, 11.837f)
            verticalLineTo(17.25f)
            curveTo(22f, 18.493f, 20.993f, 19.5f, 19.75f, 19.5f)
            horizontalLineTo(17.958f)
            curveTo(17.721f, 20.919f, 16.486f, 22f, 15f, 22f)
            curveTo(13.514f, 22f, 12.28f, 20.919f, 12.042f, 19.5f)
            horizontalLineTo(9.959f)
            curveTo(9.72f, 20.919f, 8.486f, 22f, 7f, 22f)
            curveTo(5.51f, 22f, 4.274f, 20.914f, 4.04f, 19.49f)
            curveTo(2.896f, 19.384f, 2f, 18.422f, 2f, 17.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(20.5f, 15.5f)
            horizontalLineTo(19.25f)
            curveTo(18.836f, 15.5f, 18.5f, 15.836f, 18.5f, 16.25f)
            curveTo(18.5f, 16.664f, 18.836f, 17f, 19.25f, 17f)
            horizontalLineTo(20.5f)
            verticalLineTo(15.5f)
            close()
            moveTo(20.183f, 11f)
            lineTo(18.729f, 7.929f)
            curveTo(18.604f, 7.667f, 18.341f, 7.5f, 18.051f, 7.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(11f)
            lineTo(20.183f, 11f)
            close()
            moveTo(7f, 20.5f)
            curveTo(7.828f, 20.5f, 8.5f, 19.828f, 8.5f, 19f)
            curveTo(8.5f, 18.172f, 7.828f, 17.5f, 7f, 17.5f)
            curveTo(6.172f, 17.5f, 5.5f, 18.172f, 5.5f, 19f)
            curveTo(5.5f, 19.828f, 6.172f, 20.5f, 7f, 20.5f)
            close()
            moveTo(16.5f, 19f)
            curveTo(16.5f, 18.172f, 15.828f, 17.5f, 15f, 17.5f)
            curveTo(14.172f, 17.5f, 13.5f, 18.172f, 13.5f, 19f)
            curveTo(13.5f, 19.828f, 14.172f, 20.5f, 15f, 20.5f)
            curveTo(15.828f, 20.5f, 16.5f, 19.828f, 16.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VehicleTruckProfilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VehicleTruckProfile, contentDescription = null)
    }
}
