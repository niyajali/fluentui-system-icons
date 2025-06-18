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

public val FluentUi.Filled.WeatherSqualls: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherSqualls",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.747f, 6.19f)
            curveTo(8.398f, 4.562f, 9.987f, 3.5f, 11.732f, 3.5f)
            curveTo(14.073f, 3.5f, 16f, 5.396f, 16f, 7.75f)
            curveTo(16f, 10.097f, 14.097f, 12f, 11.75f, 12f)
            horizontalLineTo(3f)
            curveTo(2.448f, 12f, 2f, 11.552f, 2f, 11f)
            curveTo(2f, 10.448f, 2.448f, 10f, 3f, 10f)
            horizontalLineTo(11.75f)
            curveTo(12.993f, 10f, 14f, 8.993f, 14f, 7.75f)
            curveTo(14f, 6.514f, 12.982f, 5.5f, 11.732f, 5.5f)
            curveTo(10.796f, 5.5f, 9.948f, 6.071f, 9.604f, 6.933f)
            lineTo(9.428f, 7.371f)
            curveTo(9.223f, 7.884f, 8.641f, 8.134f, 8.129f, 7.928f)
            curveTo(7.616f, 7.723f, 7.366f, 7.141f, 7.572f, 6.629f)
            lineTo(7.747f, 6.19f)
            close()
            moveTo(15.801f, 11.684f)
            curveTo(16.232f, 10.391f, 17.447f, 9.5f, 18.821f, 9.5f)
            curveTo(20.576f, 9.5f, 22f, 10.923f, 22f, 12.679f)
            verticalLineTo(12.75f)
            curveTo(22f, 14.545f, 20.545f, 16f, 18.75f, 16f)
            horizontalLineTo(17.751f)
            curveTo(17.911f, 16.385f, 18f, 16.807f, 18f, 17.25f)
            verticalLineTo(17.321f)
            curveTo(18f, 19.077f, 16.576f, 20.5f, 14.821f, 20.5f)
            curveTo(13.447f, 20.5f, 12.232f, 19.609f, 11.801f, 18.316f)
            curveTo(11.627f, 17.792f, 11.91f, 17.226f, 12.434f, 17.051f)
            curveTo(12.958f, 16.877f, 13.524f, 17.16f, 13.699f, 17.684f)
            curveTo(13.861f, 18.171f, 14.319f, 18.5f, 14.821f, 18.5f)
            curveTo(15.472f, 18.5f, 16f, 17.972f, 16f, 17.321f)
            verticalLineTo(17.25f)
            curveTo(16f, 16.56f, 15.44f, 16f, 14.75f, 16f)
            horizontalLineTo(9f)
            curveTo(8.998f, 16f, 8.996f, 16f, 8.994f, 16f)
            horizontalLineTo(3f)
            curveTo(2.448f, 16f, 2f, 15.552f, 2f, 15f)
            curveTo(2f, 14.448f, 2.448f, 14f, 3f, 14f)
            horizontalLineTo(18.75f)
            curveTo(19.44f, 14f, 20f, 13.44f, 20f, 12.75f)
            verticalLineTo(12.679f)
            curveTo(20f, 12.028f, 19.472f, 11.5f, 18.821f, 11.5f)
            curveTo(18.319f, 11.5f, 17.861f, 11.829f, 17.699f, 12.316f)
            curveTo(17.524f, 12.84f, 16.958f, 13.123f, 16.434f, 12.949f)
            curveTo(15.91f, 12.774f, 15.627f, 12.208f, 15.801f, 11.684f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherSquallsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WeatherSqualls, contentDescription = null)
    }
}
