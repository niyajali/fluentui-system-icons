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

public val FluentUi.Regular.BatteryCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BatteryCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 6f)
            curveTo(18.657f, 6f, 20f, 7.343f, 20f, 9f)
            verticalLineTo(10f)
            horizontalLineTo(21.001f)
            curveTo(21.183f, 10f, 21.354f, 10.049f, 21.501f, 10.134f)
            curveTo(21.799f, 10.307f, 22.001f, 10.63f, 22.001f, 11f)
            verticalLineTo(13f)
            curveTo(22.001f, 13.37f, 21.799f, 13.693f, 21.501f, 13.866f)
            curveTo(21.354f, 13.951f, 21.183f, 14f, 21.001f, 14f)
            horizontalLineTo(20f)
            verticalLineTo(15f)
            curveTo(20f, 16.657f, 18.657f, 18f, 17f, 18f)
            horizontalLineTo(12.826f)
            curveTo(12.94f, 17.518f, 13f, 17.016f, 13f, 16.5f)
            horizontalLineTo(16.999f)
            curveTo(17.778f, 16.5f, 18.419f, 15.905f, 18.492f, 15.144f)
            lineTo(18.499f, 15f)
            verticalLineTo(9f)
            curveTo(18.499f, 8.22f, 17.904f, 7.58f, 17.143f, 7.507f)
            lineTo(16.999f, 7.5f)
            horizontalLineTo(5f)
            curveTo(4.22f, 7.5f, 3.58f, 8.095f, 3.507f, 8.856f)
            lineTo(3.5f, 9f)
            verticalLineTo(10.732f)
            curveTo(2.949f, 11.019f, 2.444f, 11.383f, 2f, 11.81f)
            verticalLineTo(9f)
            curveTo(2f, 7.343f, 3.343f, 6f, 5f, 6f)
            horizontalLineTo(17f)
            close()
            moveTo(12f, 16.5f)
            curveTo(12f, 19.538f, 9.538f, 22f, 6.5f, 22f)
            curveTo(3.462f, 22f, 1f, 19.538f, 1f, 16.5f)
            curveTo(1f, 13.462f, 3.462f, 11f, 6.5f, 11f)
            curveTo(9.538f, 11f, 12f, 13.462f, 12f, 16.5f)
            close()
            moveTo(9.854f, 14.146f)
            curveTo(9.658f, 13.951f, 9.342f, 13.951f, 9.146f, 14.146f)
            lineTo(5.5f, 17.793f)
            lineTo(3.854f, 16.146f)
            curveTo(3.658f, 15.951f, 3.342f, 15.951f, 3.146f, 16.146f)
            curveTo(2.951f, 16.342f, 2.951f, 16.658f, 3.146f, 16.854f)
            lineTo(5.146f, 18.854f)
            curveTo(5.342f, 19.049f, 5.658f, 19.049f, 5.854f, 18.854f)
            lineTo(9.854f, 14.854f)
            curveTo(10.049f, 14.658f, 10.049f, 14.342f, 9.854f, 14.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BatteryCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BatteryCheckmark, contentDescription = null)
    }
}
