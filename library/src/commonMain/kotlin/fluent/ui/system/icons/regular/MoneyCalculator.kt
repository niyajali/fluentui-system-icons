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

public val FluentUi.Regular.MoneyCalculator: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoneyCalculator",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 7f)
            curveTo(8.843f, 7f, 7.5f, 8.343f, 7.5f, 10f)
            curveTo(7.5f, 11.657f, 8.843f, 13f, 10.5f, 13f)
            curveTo(12.157f, 13f, 13.5f, 11.657f, 13.5f, 10f)
            curveTo(13.5f, 8.343f, 12.157f, 7f, 10.5f, 7f)
            close()
            moveTo(9f, 10f)
            curveTo(9f, 9.172f, 9.672f, 8.5f, 10.5f, 8.5f)
            curveTo(11.328f, 8.5f, 12f, 9.172f, 12f, 10f)
            curveTo(12f, 10.828f, 11.328f, 11.5f, 10.5f, 11.5f)
            curveTo(9.672f, 11.5f, 9f, 10.828f, 9f, 10f)
            close()
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(16.75f)
            curveTo(17.993f, 4f, 19f, 5.007f, 19f, 6.25f)
            verticalLineTo(11f)
            horizontalLineTo(17.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(16.75f)
            curveTo(15.507f, 8.5f, 14.5f, 7.493f, 14.5f, 6.25f)
            verticalLineTo(5.5f)
            horizontalLineTo(6.5f)
            verticalLineTo(6.25f)
            curveTo(6.5f, 7.493f, 5.493f, 8.5f, 4.25f, 8.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(11.5f)
            horizontalLineTo(4.25f)
            curveTo(5.493f, 11.5f, 6.5f, 12.507f, 6.5f, 13.75f)
            verticalLineTo(14.5f)
            horizontalLineTo(14f)
            verticalLineTo(16f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 16f, 2f, 14.993f, 2f, 13.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(4.25f, 5.5f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(4.25f)
            curveTo(4.664f, 7f, 5f, 6.664f, 5f, 6.25f)
            verticalLineTo(5.5f)
            horizontalLineTo(4.25f)
            close()
            moveTo(17.5f, 7f)
            verticalLineTo(6.25f)
            curveTo(17.5f, 5.836f, 17.164f, 5.5f, 16.75f, 5.5f)
            horizontalLineTo(16f)
            verticalLineTo(6.25f)
            curveTo(16f, 6.664f, 16.336f, 7f, 16.75f, 7f)
            horizontalLineTo(17.5f)
            close()
            moveTo(3.5f, 13.75f)
            curveTo(3.5f, 14.164f, 3.836f, 14.5f, 4.25f, 14.5f)
            horizontalLineTo(5f)
            verticalLineTo(13.75f)
            curveTo(5f, 13.336f, 4.664f, 13f, 4.25f, 13f)
            horizontalLineTo(3.5f)
            verticalLineTo(13.75f)
            close()
            moveTo(4.401f, 17.5f)
            horizontalLineTo(14f)
            verticalLineTo(19f)
            horizontalLineTo(7f)
            curveTo(5.89f, 19f, 4.92f, 18.397f, 4.401f, 17.5f)
            close()
            moveTo(22f, 11f)
            verticalLineTo(9f)
            curveTo(22f, 7.89f, 21.397f, 6.92f, 20.5f, 6.401f)
            verticalLineTo(11f)
            horizontalLineTo(22f)
            close()
            moveTo(16.5f, 12f)
            curveTo(15.672f, 12f, 15f, 12.672f, 15f, 13.5f)
            verticalLineTo(21.5f)
            curveTo(15f, 22.328f, 15.672f, 23f, 16.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(13.5f)
            curveTo(23f, 12.672f, 22.328f, 12f, 21.5f, 12f)
            horizontalLineTo(16.5f)
            close()
            moveTo(17f, 16.5f)
            horizontalLineTo(18f)
            curveTo(18.276f, 16.5f, 18.5f, 16.724f, 18.5f, 17f)
            curveTo(18.5f, 17.276f, 18.276f, 17.5f, 18f, 17.5f)
            horizontalLineTo(17f)
            curveTo(16.724f, 17.5f, 16.5f, 17.276f, 16.5f, 17f)
            curveTo(16.5f, 16.724f, 16.724f, 16.5f, 17f, 16.5f)
            close()
            moveTo(20f, 16.5f)
            horizontalLineTo(21f)
            curveTo(21.276f, 16.5f, 21.5f, 16.724f, 21.5f, 17f)
            curveTo(21.5f, 17.276f, 21.276f, 17.5f, 21f, 17.5f)
            horizontalLineTo(20f)
            curveTo(19.724f, 17.5f, 19.5f, 17.276f, 19.5f, 17f)
            curveTo(19.5f, 16.724f, 19.724f, 16.5f, 20f, 16.5f)
            close()
            moveTo(17f, 18.5f)
            horizontalLineTo(18f)
            curveTo(18.276f, 18.5f, 18.5f, 18.724f, 18.5f, 19f)
            curveTo(18.5f, 19.276f, 18.276f, 19.5f, 18f, 19.5f)
            horizontalLineTo(17f)
            curveTo(16.724f, 19.5f, 16.5f, 19.276f, 16.5f, 19f)
            curveTo(16.5f, 18.724f, 16.724f, 18.5f, 17f, 18.5f)
            close()
            moveTo(20f, 18.5f)
            horizontalLineTo(21f)
            curveTo(21.276f, 18.5f, 21.5f, 18.724f, 21.5f, 19f)
            curveTo(21.5f, 19.276f, 21.276f, 19.5f, 21f, 19.5f)
            horizontalLineTo(20f)
            curveTo(19.724f, 19.5f, 19.5f, 19.276f, 19.5f, 19f)
            curveTo(19.5f, 18.724f, 19.724f, 18.5f, 20f, 18.5f)
            close()
            moveTo(17f, 20.5f)
            horizontalLineTo(18f)
            curveTo(18.276f, 20.5f, 18.5f, 20.724f, 18.5f, 21f)
            curveTo(18.5f, 21.276f, 18.276f, 21.5f, 18f, 21.5f)
            horizontalLineTo(17f)
            curveTo(16.724f, 21.5f, 16.5f, 21.276f, 16.5f, 21f)
            curveTo(16.5f, 20.724f, 16.724f, 20.5f, 17f, 20.5f)
            close()
            moveTo(20f, 20.5f)
            horizontalLineTo(21f)
            curveTo(21.276f, 20.5f, 21.5f, 20.724f, 21.5f, 21f)
            curveTo(21.5f, 21.276f, 21.276f, 21.5f, 21f, 21.5f)
            horizontalLineTo(20f)
            curveTo(19.724f, 21.5f, 19.5f, 21.276f, 19.5f, 21f)
            curveTo(19.5f, 20.724f, 19.724f, 20.5f, 20f, 20.5f)
            close()
            moveTo(16.5f, 14f)
            curveTo(16.5f, 13.724f, 16.724f, 13.5f, 17f, 13.5f)
            horizontalLineTo(21f)
            curveTo(21.276f, 13.5f, 21.5f, 13.724f, 21.5f, 14f)
            verticalLineTo(15f)
            curveTo(21.5f, 15.276f, 21.276f, 15.5f, 21f, 15.5f)
            horizontalLineTo(17f)
            curveTo(16.724f, 15.5f, 16.5f, 15.276f, 16.5f, 15f)
            verticalLineTo(14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoneyCalculatorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MoneyCalculator, contentDescription = null)
    }
}
