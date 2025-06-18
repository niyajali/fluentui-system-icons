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

public val FluentUi.Filled.BatteryWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BatteryWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.244f, 11.2f)
            curveTo(8.475f, 11.333f, 8.667f, 11.524f, 8.8f, 11.756f)
            lineTo(12.809f, 18.754f)
            curveTo(13.221f, 19.473f, 12.972f, 20.39f, 12.253f, 20.802f)
            curveTo(12.026f, 20.932f, 11.769f, 21f, 11.508f, 21f)
            horizontalLineTo(3.489f)
            curveTo(2.661f, 21f, 1.989f, 20.328f, 1.989f, 19.5f)
            curveTo(1.989f, 19.238f, 2.057f, 18.981f, 2.187f, 18.754f)
            lineTo(6.197f, 11.756f)
            curveTo(6.609f, 11.037f, 7.525f, 10.788f, 8.244f, 11.2f)
            close()
            moveTo(7.5f, 18f)
            curveTo(7.224f, 18f, 7f, 18.224f, 7f, 18.5f)
            curveTo(7f, 18.776f, 7.224f, 19f, 7.5f, 19f)
            curveTo(7.776f, 19f, 8f, 18.776f, 8f, 18.5f)
            curveTo(8f, 18.224f, 7.776f, 18f, 7.5f, 18f)
            close()
            moveTo(17f, 6f)
            curveTo(18.657f, 6f, 20f, 7.343f, 20f, 9f)
            verticalLineTo(10f)
            horizontalLineTo(21f)
            curveTo(21.183f, 10f, 21.353f, 10.049f, 21.5f, 10.134f)
            curveTo(21.799f, 10.307f, 22f, 10.63f, 22f, 11f)
            verticalLineTo(13f)
            curveTo(22f, 13.37f, 21.799f, 13.693f, 21.5f, 13.866f)
            curveTo(21.353f, 13.951f, 21.183f, 14f, 21f, 14f)
            horizontalLineTo(20f)
            verticalLineTo(15f)
            curveTo(20f, 16.657f, 18.657f, 18f, 17f, 18f)
            horizontalLineTo(13.529f)
            lineTo(9.668f, 11.259f)
            curveTo(9.447f, 10.873f, 9.127f, 10.553f, 8.741f, 10.332f)
            curveTo(7.543f, 9.646f, 6.015f, 10.061f, 5.329f, 11.259f)
            lineTo(2.364f, 16.435f)
            curveTo(2.132f, 16.008f, 2f, 15.52f, 2f, 15f)
            verticalLineTo(9f)
            curveTo(2f, 7.343f, 3.343f, 6f, 5f, 6f)
            horizontalLineTo(17f)
            close()
            moveTo(7.498f, 13f)
            curveTo(7.222f, 13f, 6.998f, 13.224f, 6.998f, 13.5f)
            verticalLineTo(16.5f)
            lineTo(7.006f, 16.59f)
            curveTo(7.049f, 16.823f, 7.253f, 17f, 7.498f, 17f)
            curveTo(7.774f, 17f, 7.998f, 16.776f, 7.998f, 16.5f)
            verticalLineTo(13.5f)
            lineTo(7.99f, 13.41f)
            curveTo(7.948f, 13.177f, 7.744f, 13f, 7.498f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BatteryWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BatteryWarning, contentDescription = null)
    }
}
