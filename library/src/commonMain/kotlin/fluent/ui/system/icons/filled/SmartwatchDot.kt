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

public val FluentUi.Filled.SmartwatchDot: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SmartwatchDot",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.5f, 2f)
            curveTo(15.283f, 2f, 15.961f, 2.45f, 16.289f, 3.105f)
            curveTo(16.103f, 3.532f, 16f, 4.004f, 16f, 4.5f)
            curveTo(16f, 4.719f, 16.02f, 4.934f, 16.059f, 5.142f)
            curveTo(15.722f, 5.049f, 15.366f, 5f, 15f, 5f)
            horizontalLineTo(9f)
            curveTo(8.47f, 5f, 7.963f, 5.103f, 7.5f, 5.291f)
            verticalLineTo(4f)
            curveTo(7.5f, 2.895f, 8.395f, 2f, 9.5f, 2f)
            horizontalLineTo(14.5f)
            close()
            moveTo(15f, 6f)
            curveTo(15.589f, 6f, 16.138f, 6.17f, 16.602f, 6.463f)
            curveTo(16.851f, 6.831f, 17.169f, 7.149f, 17.537f, 7.398f)
            curveTo(17.83f, 7.862f, 18f, 8.411f, 18f, 9f)
            verticalLineTo(10f)
            curveTo(18.552f, 10f, 19f, 10.448f, 19f, 11f)
            verticalLineTo(12f)
            curveTo(19f, 12.552f, 18.552f, 13f, 18f, 13f)
            verticalLineTo(15f)
            curveTo(18f, 16.657f, 16.657f, 18f, 15f, 18f)
            horizontalLineTo(9f)
            curveTo(7.343f, 18f, 6f, 16.657f, 6f, 15f)
            verticalLineTo(9f)
            curveTo(6f, 7.343f, 7.343f, 6f, 9f, 6f)
            horizontalLineTo(15f)
            close()
            moveTo(9f, 19f)
            curveTo(8.47f, 19f, 7.963f, 18.897f, 7.5f, 18.709f)
            verticalLineTo(20f)
            curveTo(7.5f, 21.105f, 8.395f, 22f, 9.5f, 22f)
            horizontalLineTo(14.5f)
            curveTo(15.605f, 22f, 16.5f, 21.105f, 16.5f, 20f)
            verticalLineTo(18.709f)
            curveTo(16.037f, 18.897f, 15.531f, 19f, 15f, 19f)
            horizontalLineTo(9f)
            close()
            moveTo(22f, 4.5f)
            curveTo(22f, 3.119f, 20.881f, 2f, 19.5f, 2f)
            curveTo(18.119f, 2f, 17f, 3.119f, 17f, 4.5f)
            curveTo(17f, 5.881f, 18.119f, 7f, 19.5f, 7f)
            curveTo(20.881f, 7f, 22f, 5.881f, 22f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SmartwatchDotPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SmartwatchDot, contentDescription = null)
    }
}
