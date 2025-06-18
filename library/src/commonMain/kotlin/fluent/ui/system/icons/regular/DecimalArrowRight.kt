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

public val FluentUi.Regular.DecimalArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DecimalArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 4f)
            curveTo(8.343f, 4f, 7f, 5.343f, 7f, 7f)
            verticalLineTo(11f)
            curveTo(7f, 12.657f, 8.343f, 14f, 10f, 14f)
            curveTo(11.657f, 14f, 13f, 12.657f, 13f, 11f)
            verticalLineTo(7f)
            curveTo(13f, 5.343f, 11.657f, 4f, 10f, 4f)
            close()
            moveTo(11.5f, 11f)
            curveTo(11.5f, 11.828f, 10.828f, 12.5f, 10f, 12.5f)
            curveTo(9.172f, 12.5f, 8.5f, 11.828f, 8.5f, 11f)
            verticalLineTo(7f)
            curveTo(8.5f, 6.172f, 9.172f, 5.5f, 10f, 5.5f)
            curveTo(10.828f, 5.5f, 11.5f, 6.172f, 11.5f, 7f)
            verticalLineTo(11f)
            close()
            moveTo(5f, 12.5f)
            curveTo(5f, 13.328f, 4.328f, 14f, 3.5f, 14f)
            curveTo(2.672f, 14f, 2f, 13.328f, 2f, 12.5f)
            curveTo(2f, 11.672f, 2.672f, 11f, 3.5f, 11f)
            curveTo(4.328f, 11f, 5f, 11.672f, 5f, 12.5f)
            close()
            moveTo(19.5f, 7f)
            verticalLineTo(11f)
            curveTo(19.5f, 11.104f, 19.489f, 11.206f, 19.469f, 11.304f)
            curveTo(19.958f, 11.459f, 20.422f, 11.67f, 20.853f, 11.93f)
            curveTo(20.948f, 11.637f, 21f, 11.325f, 21f, 11f)
            verticalLineTo(7f)
            curveTo(21f, 5.343f, 19.657f, 4f, 18f, 4f)
            curveTo(16.343f, 4f, 15f, 5.343f, 15f, 7f)
            verticalLineTo(11f)
            curveTo(15f, 11.164f, 15.013f, 11.325f, 15.039f, 11.482f)
            curveTo(15.502f, 11.292f, 15.992f, 11.155f, 16.502f, 11.076f)
            curveTo(16.501f, 11.051f, 16.5f, 11.026f, 16.5f, 11f)
            verticalLineTo(7f)
            curveTo(16.5f, 6.172f, 17.172f, 5.5f, 18f, 5.5f)
            curveTo(18.828f, 5.5f, 19.5f, 6.172f, 19.5f, 7f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(14.5f, 17f)
            curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
            curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
            horizontalLineTo(19.293f)
            lineTo(17.646f, 19.646f)
            curveTo(17.451f, 19.842f, 17.451f, 20.158f, 17.646f, 20.354f)
            curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
            lineTo(20.854f, 17.854f)
            curveTo(21.049f, 17.658f, 21.049f, 17.342f, 20.854f, 17.146f)
            lineTo(18.354f, 14.646f)
            curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
            curveTo(17.451f, 14.842f, 17.451f, 15.158f, 17.646f, 15.354f)
            lineTo(19.293f, 17f)
            horizontalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DecimalArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DecimalArrowRight, contentDescription = null)
    }
}
