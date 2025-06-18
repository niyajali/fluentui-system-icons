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

public val FluentUi.Regular.PeopleStar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PeopleStar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.5f, 7f)
            curveTo(5.5f, 5.619f, 6.619f, 4.5f, 8f, 4.5f)
            curveTo(9.381f, 4.5f, 10.5f, 5.619f, 10.5f, 7f)
            curveTo(10.5f, 8.381f, 9.381f, 9.5f, 8f, 9.5f)
            curveTo(6.619f, 9.5f, 5.5f, 8.381f, 5.5f, 7f)
            close()
            moveTo(8f, 3f)
            curveTo(5.791f, 3f, 4f, 4.791f, 4f, 7f)
            curveTo(4f, 9.209f, 5.791f, 11f, 8f, 11f)
            curveTo(10.209f, 11f, 12f, 9.209f, 12f, 7f)
            curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
            close()
            moveTo(15.5f, 8f)
            curveTo(15.5f, 7.172f, 16.172f, 6.5f, 17f, 6.5f)
            curveTo(17.828f, 6.5f, 18.5f, 7.172f, 18.5f, 8f)
            curveTo(18.5f, 8.828f, 17.828f, 9.5f, 17f, 9.5f)
            curveTo(16.172f, 9.5f, 15.5f, 8.828f, 15.5f, 8f)
            close()
            moveTo(17f, 5f)
            curveTo(15.343f, 5f, 14f, 6.343f, 14f, 8f)
            curveTo(14f, 9.657f, 15.343f, 11f, 17f, 11f)
            curveTo(18.657f, 11f, 20f, 9.657f, 20f, 8f)
            curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
            close()
            moveTo(4.25f, 13f)
            curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
            verticalLineTo(15.501f)
            lineTo(2f, 15.502f)
            lineTo(2f, 15.505f)
            lineTo(2f, 15.511f)
            lineTo(2f, 15.528f)
            curveTo(2.001f, 15.541f, 2.001f, 15.557f, 2.002f, 15.577f)
            curveTo(2.004f, 15.617f, 2.007f, 15.67f, 2.014f, 15.736f)
            curveTo(2.027f, 15.866f, 2.052f, 16.045f, 2.102f, 16.256f)
            curveTo(2.2f, 16.678f, 2.397f, 17.24f, 2.792f, 17.805f)
            curveTo(3.611f, 18.975f, 5.172f, 20f, 8f, 20f)
            curveTo(9.369f, 20f, 10.441f, 19.76f, 11.276f, 19.379f)
            curveTo(11.127f, 18.885f, 11.035f, 18.366f, 11.008f, 17.83f)
            curveTo(10.363f, 18.211f, 9.413f, 18.5f, 8f, 18.5f)
            curveTo(5.578f, 18.5f, 4.514f, 17.65f, 4.021f, 16.945f)
            curveTo(3.76f, 16.572f, 3.628f, 16.197f, 3.562f, 15.915f)
            curveTo(3.53f, 15.775f, 3.514f, 15.661f, 3.507f, 15.587f)
            curveTo(3.503f, 15.549f, 3.501f, 15.522f, 3.5f, 15.507f)
            lineTo(3.5f, 15.495f)
            verticalLineTo(15.25f)
            curveTo(3.5f, 14.836f, 3.836f, 14.5f, 4.25f, 14.5f)
            horizontalLineTo(11.732f)
            curveTo(11.981f, 14.023f, 12.286f, 13.581f, 12.641f, 13.183f)
            curveTo(12.367f, 13.065f, 12.066f, 13f, 11.75f, 13f)
            horizontalLineTo(4.25f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(18.055f, 14.421f)
            curveTo(17.881f, 13.86f, 17.119f, 13.86f, 16.945f, 14.421f)
            lineTo(16.388f, 16.208f)
            horizontalLineTo(14.585f)
            curveTo(14.019f, 16.208f, 13.784f, 16.962f, 14.242f, 17.309f)
            lineTo(15.7f, 18.413f)
            lineTo(15.143f, 20.2f)
            curveTo(14.968f, 20.761f, 15.584f, 21.228f, 16.042f, 20.881f)
            lineTo(17.5f, 19.777f)
            lineTo(18.958f, 20.881f)
            curveTo(19.416f, 21.228f, 20.032f, 20.761f, 19.857f, 20.2f)
            lineTo(19.3f, 18.413f)
            lineTo(20.758f, 17.309f)
            curveTo(21.216f, 16.962f, 20.981f, 16.208f, 20.415f, 16.208f)
            horizontalLineTo(18.612f)
            lineTo(18.055f, 14.421f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PeopleStar, contentDescription = null)
    }
}
