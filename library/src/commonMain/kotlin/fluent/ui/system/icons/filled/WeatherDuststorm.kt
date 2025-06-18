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

public val FluentUi.Filled.WeatherDuststorm: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherDuststorm",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 4.5f)
            curveTo(5.25f, 4.086f, 4.914f, 3.75f, 4.5f, 3.75f)
            curveTo(4.086f, 3.75f, 3.75f, 4.086f, 3.75f, 4.5f)
            curveTo(3.75f, 4.914f, 4.086f, 5.25f, 4.5f, 5.25f)
            curveTo(4.914f, 5.25f, 5.25f, 4.914f, 5.25f, 4.5f)
            close()
            moveTo(7f, 4.5f)
            curveTo(7f, 5.881f, 5.881f, 7f, 4.5f, 7f)
            curveTo(3.119f, 7f, 2f, 5.881f, 2f, 4.5f)
            curveTo(2f, 3.119f, 3.119f, 2f, 4.5f, 2f)
            curveTo(5.881f, 2f, 7f, 3.119f, 7f, 4.5f)
            close()
            moveTo(11.55f, 3.5f)
            curveTo(9.59f, 3.5f, 7.904f, 4.883f, 7.519f, 6.804f)
            curveTo(7.411f, 7.345f, 7.762f, 7.872f, 8.304f, 7.981f)
            curveTo(8.845f, 8.089f, 9.372f, 7.738f, 9.481f, 7.196f)
            curveTo(9.678f, 6.21f, 10.544f, 5.5f, 11.55f, 5.5f)
            horizontalLineTo(11.75f)
            curveTo(12.993f, 5.5f, 14f, 6.507f, 14f, 7.75f)
            curveTo(14f, 8.993f, 12.993f, 10f, 11.75f, 10f)
            horizontalLineTo(3f)
            curveTo(2.448f, 10f, 2f, 10.448f, 2f, 11f)
            curveTo(2f, 11.552f, 2.448f, 12f, 3f, 12f)
            horizontalLineTo(11.75f)
            curveTo(14.097f, 12f, 16f, 10.097f, 16f, 7.75f)
            curveTo(16f, 5.403f, 14.097f, 3.5f, 11.75f, 3.5f)
            horizontalLineTo(11.55f)
            close()
            moveTo(18.821f, 9.5f)
            curveTo(17.447f, 9.5f, 16.232f, 10.391f, 15.801f, 11.684f)
            curveTo(15.627f, 12.208f, 15.91f, 12.774f, 16.434f, 12.949f)
            curveTo(16.958f, 13.123f, 17.524f, 12.84f, 17.699f, 12.316f)
            curveTo(17.861f, 11.829f, 18.319f, 11.5f, 18.821f, 11.5f)
            curveTo(19.472f, 11.5f, 20f, 12.028f, 20f, 12.679f)
            verticalLineTo(12.75f)
            curveTo(20f, 13.44f, 19.44f, 14f, 18.75f, 14f)
            horizontalLineTo(3f)
            curveTo(2.448f, 14f, 2f, 14.448f, 2f, 15f)
            curveTo(2f, 15.552f, 2.448f, 16f, 3f, 16f)
            horizontalLineTo(8.994f)
            lineTo(9f, 16f)
            horizontalLineTo(14.75f)
            curveTo(15.44f, 16f, 16f, 16.56f, 16f, 17.25f)
            verticalLineTo(17.321f)
            curveTo(16f, 17.972f, 15.472f, 18.5f, 14.821f, 18.5f)
            curveTo(14.319f, 18.5f, 13.861f, 18.171f, 13.699f, 17.684f)
            curveTo(13.524f, 17.16f, 12.958f, 16.877f, 12.434f, 17.051f)
            curveTo(11.91f, 17.226f, 11.627f, 17.792f, 11.801f, 18.316f)
            curveTo(12.232f, 19.609f, 13.447f, 20.5f, 14.821f, 20.5f)
            curveTo(16.576f, 20.5f, 18f, 19.077f, 18f, 17.321f)
            verticalLineTo(17.25f)
            curveTo(18f, 16.807f, 17.911f, 16.385f, 17.751f, 16f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 16f, 22f, 14.545f, 22f, 12.75f)
            verticalLineTo(12.679f)
            curveTo(22f, 10.923f, 20.576f, 9.5f, 18.821f, 9.5f)
            close()
            moveTo(7.5f, 20.25f)
            curveTo(7.086f, 20.25f, 6.75f, 19.914f, 6.75f, 19.5f)
            curveTo(6.75f, 19.086f, 7.086f, 18.75f, 7.5f, 18.75f)
            curveTo(7.914f, 18.75f, 8.25f, 19.086f, 8.25f, 19.5f)
            curveTo(8.25f, 19.914f, 7.914f, 20.25f, 7.5f, 20.25f)
            close()
            moveTo(7.5f, 22f)
            curveTo(8.881f, 22f, 10f, 20.881f, 10f, 19.5f)
            curveTo(10f, 18.119f, 8.881f, 17f, 7.5f, 17f)
            curveTo(6.119f, 17f, 5f, 18.119f, 5f, 19.5f)
            curveTo(5f, 20.881f, 6.119f, 22f, 7.5f, 22f)
            close()
            moveTo(20.25f, 5.5f)
            curveTo(20.25f, 5.086f, 19.914f, 4.75f, 19.5f, 4.75f)
            curveTo(19.086f, 4.75f, 18.75f, 5.086f, 18.75f, 5.5f)
            curveTo(18.75f, 5.914f, 19.086f, 6.25f, 19.5f, 6.25f)
            curveTo(19.914f, 6.25f, 20.25f, 5.914f, 20.25f, 5.5f)
            close()
            moveTo(22f, 5.5f)
            curveTo(22f, 6.881f, 20.881f, 8f, 19.5f, 8f)
            curveTo(18.119f, 8f, 17f, 6.881f, 17f, 5.5f)
            curveTo(17f, 4.119f, 18.119f, 3f, 19.5f, 3f)
            curveTo(20.881f, 3f, 22f, 4.119f, 22f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WeatherDuststormPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WeatherDuststorm, contentDescription = null)
    }
}
