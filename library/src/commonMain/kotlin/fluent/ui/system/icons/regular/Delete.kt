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

public val FluentUi.Regular.Delete: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Delete",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 5f)
            horizontalLineTo(14f)
            curveTo(14f, 3.895f, 13.105f, 3f, 12f, 3f)
            curveTo(10.895f, 3f, 10f, 3.895f, 10f, 5f)
            close()
            moveTo(8.5f, 5f)
            curveTo(8.5f, 3.067f, 10.067f, 1.5f, 12f, 1.5f)
            curveTo(13.933f, 1.5f, 15.5f, 3.067f, 15.5f, 5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 5f, 22f, 5.336f, 22f, 5.75f)
            curveTo(22f, 6.164f, 21.664f, 6.5f, 21.25f, 6.5f)
            horizontalLineTo(19.931f)
            lineTo(18.759f, 18.611f)
            curveTo(18.573f, 20.533f, 16.958f, 22f, 15.026f, 22f)
            horizontalLineTo(8.974f)
            curveTo(7.043f, 22f, 5.427f, 20.533f, 5.241f, 18.611f)
            lineTo(4.069f, 6.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
            curveTo(2f, 5.336f, 2.336f, 5f, 2.75f, 5f)
            horizontalLineTo(8.5f)
            close()
            moveTo(10.5f, 9.75f)
            curveTo(10.5f, 9.336f, 10.164f, 9f, 9.75f, 9f)
            curveTo(9.336f, 9f, 9f, 9.336f, 9f, 9.75f)
            verticalLineTo(17.25f)
            curveTo(9f, 17.664f, 9.336f, 18f, 9.75f, 18f)
            curveTo(10.164f, 18f, 10.5f, 17.664f, 10.5f, 17.25f)
            verticalLineTo(9.75f)
            close()
            moveTo(14.25f, 9f)
            curveTo(14.664f, 9f, 15f, 9.336f, 15f, 9.75f)
            verticalLineTo(17.25f)
            curveTo(15f, 17.664f, 14.664f, 18f, 14.25f, 18f)
            curveTo(13.836f, 18f, 13.5f, 17.664f, 13.5f, 17.25f)
            verticalLineTo(9.75f)
            curveTo(13.5f, 9.336f, 13.836f, 9f, 14.25f, 9f)
            close()
            moveTo(6.734f, 18.467f)
            curveTo(6.846f, 19.62f, 7.815f, 20.5f, 8.974f, 20.5f)
            horizontalLineTo(15.026f)
            curveTo(16.185f, 20.5f, 17.154f, 19.62f, 17.266f, 18.467f)
            lineTo(18.424f, 6.5f)
            horizontalLineTo(5.576f)
            lineTo(6.734f, 18.467f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DeletePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Delete, contentDescription = null)
    }
}
