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

public val FluentUi.Filled.Presenter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Presenter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.245f, 12.997f)
            curveTo(20.954f, 12.997f, 21.267f, 13.889f, 20.714f, 14.332f)
            lineTo(15.996f, 18.11f)
            verticalLineTo(19.754f)
            curveTo(15.996f, 20.997f, 14.988f, 22.004f, 13.746f, 22.004f)
            horizontalLineTo(10.25f)
            curveTo(9.008f, 22.004f, 8f, 20.997f, 8f, 19.754f)
            verticalLineTo(18.11f)
            lineTo(3.281f, 14.332f)
            curveTo(2.727f, 13.889f, 3.041f, 12.997f, 3.75f, 12.997f)
            horizontalLineTo(20.245f)
            close()
            moveTo(8.75f, 9f)
            horizontalLineTo(15.245f)
            curveTo(16.163f, 9f, 16.916f, 9.707f, 16.989f, 10.606f)
            lineTo(16.995f, 10.75f)
            verticalLineTo(12f)
            horizontalLineTo(7f)
            verticalLineTo(10.75f)
            curveTo(7f, 9.831f, 7.708f, 9.078f, 8.607f, 9.005f)
            lineTo(8.75f, 9f)
            horizontalLineTo(15.245f)
            horizontalLineTo(8.75f)
            close()
            moveTo(12f, 2f)
            curveTo(13.657f, 2f, 15f, 3.343f, 15f, 5f)
            curveTo(15f, 6.657f, 13.657f, 8f, 12f, 8f)
            curveTo(10.344f, 8f, 9f, 6.657f, 9f, 5f)
            curveTo(9f, 3.343f, 10.344f, 2f, 12f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PresenterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Presenter, contentDescription = null)
    }
}
