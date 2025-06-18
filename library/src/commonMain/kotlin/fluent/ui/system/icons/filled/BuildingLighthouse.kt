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

public val FluentUi.Filled.BuildingLighthouse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BuildingLighthouse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.694f, 2.21f)
            curveTo(10.275f, 1.93f, 9.728f, 1.93f, 9.309f, 2.21f)
            lineTo(5.56f, 4.706f)
            curveTo(4.53f, 5.392f, 5.016f, 6.997f, 6.253f, 6.997f)
            horizontalLineTo(6.5f)
            verticalLineTo(9.152f)
            curveTo(5.744f, 9.447f, 5.18f, 10.139f, 5.081f, 10.988f)
            lineTo(4.017f, 20.046f)
            curveTo(3.895f, 21.086f, 4.708f, 22f, 5.755f, 22f)
            horizontalLineTo(14.254f)
            curveTo(15.301f, 22f, 16.114f, 21.087f, 15.992f, 20.046f)
            lineTo(14.93f, 10.988f)
            curveTo(14.83f, 10.135f, 14.262f, 9.44f, 13.5f, 9.148f)
            verticalLineTo(6.997f)
            horizontalLineTo(13.75f)
            curveTo(14.987f, 6.997f, 15.473f, 5.392f, 14.443f, 4.706f)
            lineTo(10.694f, 2.21f)
            close()
            moveTo(12f, 9f)
            horizontalLineTo(8f)
            verticalLineTo(6.997f)
            horizontalLineTo(12f)
            verticalLineTo(9f)
            close()
            moveTo(13.952f, 15.531f)
            lineTo(5.769f, 17.986f)
            lineTo(6.126f, 14.945f)
            lineTo(13.62f, 12.697f)
            lineTo(13.952f, 15.531f)
            close()
            moveTo(16.22f, 4.22f)
            curveTo(15.927f, 4.513f, 15.927f, 4.987f, 16.22f, 5.28f)
            curveTo(16.513f, 5.573f, 16.988f, 5.573f, 17.281f, 5.28f)
            lineTo(18.781f, 3.78f)
            curveTo(19.073f, 3.487f, 19.073f, 3.013f, 18.781f, 2.72f)
            curveTo(18.488f, 2.427f, 18.013f, 2.427f, 17.72f, 2.72f)
            lineTo(16.22f, 4.22f)
            close()
            moveTo(16.22f, 10.22f)
            curveTo(15.927f, 10.513f, 15.927f, 10.988f, 16.22f, 11.28f)
            lineTo(17.72f, 12.78f)
            curveTo(18.013f, 13.073f, 18.488f, 13.073f, 18.781f, 12.78f)
            curveTo(19.073f, 12.488f, 19.073f, 12.013f, 18.781f, 11.72f)
            lineTo(17.281f, 10.22f)
            curveTo(16.988f, 9.927f, 16.513f, 9.927f, 16.22f, 10.22f)
            close()
            moveTo(20.25f, 7f)
            horizontalLineTo(16.75f)
            curveTo(16.336f, 7f, 16f, 7.336f, 16f, 7.75f)
            curveTo(16f, 8.164f, 16.336f, 8.5f, 16.75f, 8.5f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 8.5f, 21f, 8.164f, 21f, 7.75f)
            curveTo(21f, 7.336f, 20.664f, 7f, 20.25f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingLighthousePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BuildingLighthouse, contentDescription = null)
    }
}
