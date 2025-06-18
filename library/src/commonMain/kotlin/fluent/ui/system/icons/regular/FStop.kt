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

public val FluentUi.Regular.FStop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FStop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.195f, 6.528f)
            curveTo(13.533f, 4.549f, 15.566f, 3.346f, 17.463f, 4.004f)
            lineTo(18.055f, 4.209f)
            curveTo(18.446f, 4.344f, 18.873f, 4.137f, 19.009f, 3.746f)
            curveTo(19.144f, 3.354f, 18.937f, 2.927f, 18.546f, 2.791f)
            lineTo(17.954f, 2.586f)
            curveTo(15.182f, 1.626f, 12.21f, 3.383f, 11.717f, 6.275f)
            lineTo(10.995f, 10.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 10.5f, 6f, 10.836f, 6f, 11.25f)
            curveTo(6f, 11.664f, 6.336f, 12f, 6.75f, 12f)
            horizontalLineTo(10.739f)
            lineTo(9.957f, 16.583f)
            curveTo(9.581f, 18.786f, 7.145f, 19.961f, 5.187f, 18.884f)
            lineTo(5.112f, 18.843f)
            curveTo(4.749f, 18.643f, 4.293f, 18.776f, 4.093f, 19.139f)
            curveTo(3.893f, 19.501f, 4.026f, 19.958f, 4.389f, 20.157f)
            lineTo(4.464f, 20.199f)
            curveTo(7.326f, 21.773f, 10.886f, 20.056f, 11.435f, 16.836f)
            lineTo(12.261f, 12f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 12f, 17f, 11.664f, 17f, 11.25f)
            curveTo(17f, 10.836f, 16.664f, 10.5f, 16.25f, 10.5f)
            horizontalLineTo(12.517f)
            lineTo(13.195f, 6.528f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FStopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FStop, contentDescription = null)
    }
}
