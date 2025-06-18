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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.EqualCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EqualCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            close()
            moveTo(16.252f, 10.5f)
            horizontalLineTo(7.753f)
            curveTo(7.339f, 10.5f, 7.003f, 10.164f, 7.003f, 9.75f)
            curveTo(7.003f, 9.336f, 7.339f, 9f, 7.753f, 9f)
            lineTo(16.252f, 9f)
            curveTo(16.666f, 9f, 17.002f, 9.336f, 17.002f, 9.75f)
            curveTo(17.002f, 10.164f, 16.666f, 10.5f, 16.252f, 10.5f)
            close()
            moveTo(16.252f, 15f)
            horizontalLineTo(7.753f)
            curveTo(7.339f, 15f, 7.003f, 14.664f, 7.003f, 14.25f)
            curveTo(7.003f, 13.836f, 7.339f, 13.5f, 7.753f, 13.5f)
            horizontalLineTo(16.252f)
            curveTo(16.666f, 13.5f, 17.002f, 13.836f, 17.002f, 14.25f)
            curveTo(17.002f, 14.664f, 16.666f, 15f, 16.252f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EqualCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EqualCircle, contentDescription = null)
    }
}
