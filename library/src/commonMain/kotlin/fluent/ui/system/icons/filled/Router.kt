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

public val FluentUi.Filled.Router: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Router",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3.5f)
            curveTo(7.858f, 3.5f, 4.5f, 6.858f, 4.5f, 11f)
            verticalLineTo(11.25f)
            curveTo(4.5f, 11.664f, 4.164f, 12f, 3.75f, 12f)
            curveTo(3.336f, 12f, 3f, 11.664f, 3f, 11.25f)
            verticalLineTo(11f)
            curveTo(3f, 6.029f, 7.029f, 2f, 12f, 2f)
            curveTo(16.971f, 2f, 21f, 6.029f, 21f, 11f)
            verticalLineTo(11.25f)
            curveTo(21f, 11.664f, 20.664f, 12f, 20.25f, 12f)
            curveTo(19.836f, 12f, 19.5f, 11.664f, 19.5f, 11.25f)
            verticalLineTo(11f)
            curveTo(19.5f, 6.858f, 16.142f, 3.5f, 12f, 3.5f)
            close()
            moveTo(12f, 6.5f)
            curveTo(9.515f, 6.5f, 7.5f, 8.515f, 7.5f, 11f)
            verticalLineTo(11.25f)
            curveTo(7.5f, 11.664f, 7.164f, 12f, 6.75f, 12f)
            curveTo(6.336f, 12f, 6f, 11.664f, 6f, 11.25f)
            verticalLineTo(11f)
            curveTo(6f, 7.686f, 8.686f, 5f, 12f, 5f)
            curveTo(15.314f, 5f, 18f, 7.686f, 18f, 11f)
            verticalLineTo(11.25f)
            curveTo(18f, 11.664f, 17.664f, 12f, 17.25f, 12f)
            curveTo(16.836f, 12f, 16.5f, 11.664f, 16.5f, 11.25f)
            verticalLineTo(11f)
            curveTo(16.5f, 8.515f, 14.485f, 6.5f, 12f, 6.5f)
            close()
            moveTo(9f, 11f)
            curveTo(9f, 9.343f, 10.343f, 8f, 12f, 8f)
            curveTo(13.657f, 8f, 15f, 9.343f, 15f, 11f)
            curveTo(15f, 12.398f, 14.044f, 13.573f, 12.75f, 13.906f)
            verticalLineTo(16f)
            horizontalLineTo(18f)
            curveTo(19.657f, 16f, 21f, 17.343f, 21f, 19f)
            curveTo(21f, 20.657f, 19.657f, 22f, 18f, 22f)
            horizontalLineTo(6f)
            curveTo(4.343f, 22f, 3f, 20.657f, 3f, 19f)
            curveTo(3f, 17.343f, 4.343f, 16f, 6f, 16f)
            horizontalLineTo(11.25f)
            verticalLineTo(13.906f)
            curveTo(9.956f, 13.573f, 9f, 12.398f, 9f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RouterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Router, contentDescription = null)
    }
}
