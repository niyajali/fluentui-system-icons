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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.WeatherDrizzle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherDrizzle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3.001f)
            curveTo(15.168f, 3.001f, 16.966f, 5.098f, 17.227f, 7.631f)
            lineTo(17.307f, 7.631f)
            curveTo(19.346f, 7.631f, 20.999f, 9.28f, 20.999f, 11.314f)
            curveTo(20.999f, 13.347f, 19.346f, 14.996f, 17.307f, 14.996f)
            lineTo(16.725f, 14.996f)
            lineTo(16.722f, 15f)
            horizontalLineTo(16.458f)
            curveTo(16.438f, 15.058f, 16.41f, 15.114f, 16.375f, 15.167f)
            lineTo(15.375f, 16.667f)
            curveTo(15.146f, 17.011f, 14.68f, 17.104f, 14.335f, 16.875f)
            curveTo(13.991f, 16.645f, 13.897f, 16.179f, 14.127f, 15.835f)
            lineTo(14.686f, 14.996f)
            horizontalLineTo(12.856f)
            lineTo(12.854f, 15f)
            horizontalLineTo(12.457f)
            curveTo(12.437f, 15.058f, 12.41f, 15.113f, 12.374f, 15.167f)
            lineTo(11.375f, 16.667f)
            curveTo(11.145f, 17.011f, 10.679f, 17.104f, 10.335f, 16.875f)
            curveTo(9.99f, 16.645f, 9.897f, 16.179f, 10.126f, 15.835f)
            lineTo(10.685f, 14.996f)
            horizontalLineTo(8.987f)
            lineTo(8.985f, 15f)
            horizontalLineTo(8.458f)
            curveTo(8.437f, 15.058f, 8.41f, 15.114f, 8.374f, 15.167f)
            lineTo(7.375f, 16.667f)
            curveTo(7.145f, 17.011f, 6.679f, 17.104f, 6.335f, 16.875f)
            curveTo(5.99f, 16.645f, 5.897f, 16.179f, 6.126f, 15.835f)
            lineTo(6.685f, 14.996f)
            curveTo(4.65f, 14.992f, 3f, 13.345f, 3f, 11.314f)
            curveTo(3f, 9.28f, 4.653f, 7.631f, 6.693f, 7.631f)
            lineTo(6.773f, 7.631f)
            curveTo(7.035f, 5.082f, 8.831f, 3.001f, 12f, 3.001f)
            close()
            moveTo(7.126f, 18.834f)
            curveTo(6.896f, 19.179f, 6.99f, 19.645f, 7.334f, 19.875f)
            curveTo(7.679f, 20.104f, 8.145f, 20.011f, 8.374f, 19.666f)
            lineTo(9.374f, 18.166f)
            curveTo(9.604f, 17.822f, 9.51f, 17.356f, 9.166f, 17.126f)
            curveTo(8.821f, 16.897f, 8.355f, 16.99f, 8.126f, 17.334f)
            lineTo(7.126f, 18.834f)
            close()
            moveTo(11.334f, 19.874f)
            curveTo(10.99f, 19.645f, 10.896f, 19.179f, 11.126f, 18.834f)
            lineTo(12.126f, 17.334f)
            curveTo(12.355f, 16.99f, 12.821f, 16.896f, 13.166f, 17.126f)
            curveTo(13.51f, 17.356f, 13.604f, 17.821f, 13.374f, 18.166f)
            lineTo(12.374f, 19.666f)
            curveTo(12.145f, 20.011f, 11.679f, 20.104f, 11.334f, 19.874f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherDrizzlePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WeatherDrizzle, contentDescription = null)
    }
}
