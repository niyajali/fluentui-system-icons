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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.HourglassThreeQuarter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HourglassThreeQuarter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.92f, 8f)
            curveTo(7.535f, 7.738f, 7.211f, 7.397f, 6.97f, 7f)
            horizontalLineTo(17.03f)
            curveTo(16.789f, 7.397f, 16.465f, 7.738f, 16.08f, 8f)
            lineTo(14f, 9.48f)
            curveTo(13.58f, 9.758f, 13.23f, 10.131f, 12.98f, 10.569f)
            curveTo(12.456f, 11.485f, 12.456f, 12.515f, 12.98f, 13.431f)
            curveTo(13.23f, 13.869f, 13.58f, 14.242f, 14f, 14.52f)
            lineTo(16.08f, 16f)
            curveTo(16.513f, 16.294f, 16.869f, 16.689f, 17.116f, 17.15f)
            curveTo(17.363f, 17.612f, 17.495f, 18.126f, 17.5f, 18.65f)
            verticalLineTo(19.25f)
            curveTo(17.5f, 19.316f, 17.474f, 19.38f, 17.427f, 19.427f)
            curveTo(17.38f, 19.474f, 17.316f, 19.5f, 17.25f, 19.5f)
            horizontalLineTo(6.75f)
            curveTo(6.684f, 19.5f, 6.62f, 19.474f, 6.573f, 19.427f)
            curveTo(6.526f, 19.38f, 6.5f, 19.316f, 6.5f, 19.25f)
            verticalLineTo(18.65f)
            curveTo(6.505f, 18.126f, 6.637f, 17.612f, 6.884f, 17.15f)
            curveTo(7.131f, 16.689f, 7.487f, 16.294f, 7.92f, 16f)
            lineTo(10f, 14.52f)
            curveTo(10.42f, 14.242f, 10.77f, 13.869f, 11.02f, 13.431f)
            curveTo(11.544f, 12.515f, 11.544f, 11.485f, 11.02f, 10.569f)
            curveTo(10.77f, 10.131f, 10.42f, 9.758f, 10f, 9.48f)
            lineTo(7.92f, 8f)
            close()
            moveTo(6.75f, 2f)
            curveTo(5.231f, 2f, 4f, 3.231f, 4f, 4.75f)
            verticalLineTo(5.169f)
            curveTo(4f, 7.189f, 5.06f, 9.06f, 6.792f, 10.1f)
            lineTo(8.602f, 11.186f)
            curveTo(9.072f, 11.468f, 9.091f, 12.141f, 8.638f, 12.449f)
            lineTo(6.517f, 13.892f)
            curveTo(4.942f, 14.962f, 4f, 16.743f, 4f, 18.646f)
            verticalLineTo(19.25f)
            curveTo(4f, 20.769f, 5.231f, 22f, 6.75f, 22f)
            horizontalLineTo(17.25f)
            curveTo(18.769f, 22f, 20f, 20.769f, 20f, 19.25f)
            verticalLineTo(18.646f)
            curveTo(20f, 16.743f, 19.058f, 14.962f, 17.483f, 13.892f)
            lineTo(15.362f, 12.449f)
            curveTo(14.909f, 12.141f, 14.928f, 11.468f, 15.398f, 11.186f)
            lineTo(17.208f, 10.1f)
            curveTo(18.94f, 9.06f, 20f, 7.189f, 20f, 5.169f)
            verticalLineTo(4.75f)
            curveTo(20f, 3.231f, 18.769f, 2f, 17.25f, 2f)
            horizontalLineTo(6.75f)
            close()
            moveTo(5.5f, 4.75f)
            curveTo(5.5f, 4.06f, 6.06f, 3.5f, 6.75f, 3.5f)
            horizontalLineTo(17.25f)
            curveTo(17.94f, 3.5f, 18.5f, 4.06f, 18.5f, 4.75f)
            verticalLineTo(5.169f)
            curveTo(18.5f, 6.662f, 17.717f, 8.045f, 16.437f, 8.813f)
            lineTo(14.626f, 9.9f)
            curveTo(13.217f, 10.745f, 13.16f, 12.766f, 14.519f, 13.69f)
            lineTo(16.64f, 15.132f)
            curveTo(17.803f, 15.923f, 18.5f, 17.239f, 18.5f, 18.646f)
            verticalLineTo(19.25f)
            curveTo(18.5f, 19.94f, 17.94f, 20.5f, 17.25f, 20.5f)
            horizontalLineTo(6.75f)
            curveTo(6.06f, 20.5f, 5.5f, 19.94f, 5.5f, 19.25f)
            verticalLineTo(18.646f)
            curveTo(5.5f, 17.239f, 6.197f, 15.923f, 7.36f, 15.132f)
            lineTo(9.481f, 13.69f)
            curveTo(10.84f, 12.766f, 10.783f, 10.745f, 9.374f, 9.9f)
            lineTo(7.563f, 8.813f)
            curveTo(6.283f, 8.045f, 5.5f, 6.662f, 5.5f, 5.169f)
            verticalLineTo(4.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HourglassThreeQuarterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HourglassThreeQuarter, contentDescription = null)
    }
}
