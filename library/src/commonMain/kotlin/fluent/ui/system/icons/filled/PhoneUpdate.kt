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

public val FluentUi.Filled.PhoneUpdate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneUpdate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
            moveTo(12f, 7.031f)
            lineTo(11.898f, 7.038f)
            lineTo(11.801f, 7.058f)
            curveTo(11.519f, 7.135f, 11.303f, 7.374f, 11.258f, 7.668f)
            lineTo(11.25f, 7.781f)
            lineTo(11.249f, 14.492f)
            lineTo(10.289f, 13.531f)
            lineTo(10.205f, 13.458f)
            curveTo(9.911f, 13.24f, 9.494f, 13.264f, 9.228f, 13.531f)
            curveTo(8.962f, 13.797f, 8.938f, 14.214f, 9.155f, 14.507f)
            lineTo(9.228f, 14.592f)
            lineTo(11.47f, 16.833f)
            lineTo(11.522f, 16.881f)
            lineTo(11.577f, 16.922f)
            lineTo(11.653f, 16.968f)
            lineTo(11.765f, 17.015f)
            lineTo(11.861f, 17.04f)
            lineTo(11.953f, 17.051f)
            horizontalLineTo(12.047f)
            lineTo(12.139f, 17.04f)
            lineTo(12.202f, 17.025f)
            lineTo(12.303f, 16.989f)
            lineTo(12.363f, 16.959f)
            lineTo(12.43f, 16.918f)
            lineTo(12.492f, 16.869f)
            lineTo(12.53f, 16.833f)
            lineTo(14.772f, 14.592f)
            lineTo(14.845f, 14.507f)
            curveTo(15.038f, 14.246f, 15.041f, 13.888f, 14.852f, 13.625f)
            lineTo(14.772f, 13.531f)
            lineTo(14.688f, 13.458f)
            curveTo(14.427f, 13.264f, 14.069f, 13.262f, 13.805f, 13.451f)
            lineTo(13.711f, 13.531f)
            lineTo(12.749f, 14.492f)
            lineTo(12.75f, 7.781f)
            lineTo(12.743f, 7.679f)
            curveTo(12.698f, 7.346f, 12.435f, 7.083f, 12.102f, 7.038f)
            lineTo(12f, 7.031f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneUpdatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneUpdate, contentDescription = null)
    }
}
