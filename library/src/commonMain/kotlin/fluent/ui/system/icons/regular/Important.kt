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

public val FluentUi.Regular.Important: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Important",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2.002f)
            curveTo(9.86f, 2.002f, 8.125f, 3.737f, 8.125f, 5.877f)
            curveTo(8.125f, 8.796f, 9.332f, 12.429f, 9.938f, 14.076f)
            curveTo(10.261f, 14.954f, 11.097f, 15.5f, 12.002f, 15.5f)
            curveTo(12.906f, 15.5f, 13.741f, 14.957f, 14.065f, 14.081f)
            curveTo(14.67f, 12.441f, 15.876f, 8.827f, 15.876f, 5.877f)
            curveTo(15.876f, 3.737f, 14.141f, 2.002f, 12f, 2.002f)
            close()
            moveTo(9.625f, 5.877f)
            curveTo(9.625f, 4.565f, 10.689f, 3.502f, 12f, 3.502f)
            curveTo(13.312f, 3.502f, 14.376f, 4.565f, 14.376f, 5.877f)
            curveTo(14.376f, 8.532f, 13.264f, 11.92f, 12.658f, 13.561f)
            curveTo(12.562f, 13.819f, 12.309f, 14f, 12.002f, 14f)
            curveTo(11.695f, 14f, 11.441f, 13.818f, 11.346f, 13.559f)
            curveTo(10.739f, 11.907f, 9.625f, 8.501f, 9.625f, 5.877f)
            close()
            moveTo(12.001f, 17.001f)
            curveTo(10.62f, 17.001f, 9.5f, 18.121f, 9.5f, 19.502f)
            curveTo(9.5f, 20.883f, 10.62f, 22.003f, 12.001f, 22.003f)
            curveTo(13.382f, 22.003f, 14.502f, 20.883f, 14.502f, 19.502f)
            curveTo(14.502f, 18.121f, 13.382f, 17.001f, 12.001f, 17.001f)
            close()
            moveTo(11f, 19.502f)
            curveTo(11f, 18.949f, 11.448f, 18.501f, 12.001f, 18.501f)
            curveTo(12.554f, 18.501f, 13.002f, 18.949f, 13.002f, 19.502f)
            curveTo(13.002f, 20.055f, 12.554f, 20.503f, 12.001f, 20.503f)
            curveTo(11.448f, 20.503f, 11f, 20.055f, 11f, 19.502f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImportantPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Important, contentDescription = null)
    }
}
