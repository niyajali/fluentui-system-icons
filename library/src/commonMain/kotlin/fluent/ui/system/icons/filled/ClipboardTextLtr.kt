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

public val FluentUi.Filled.ClipboardTextLtr: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardTextLtr",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 3.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            close()
            moveTo(13.75f, 2f)
            curveTo(14.889f, 2f, 15.83f, 2.846f, 15.979f, 3.945f)
            lineTo(15.993f, 4.08f)
            lineTo(15.986f, 3.999f)
            lineTo(17.75f, 4f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            lineTo(8.014f, 3.999f)
            lineTo(8.006f, 4.08f)
            lineTo(8.021f, 3.945f)
            curveTo(8.17f, 2.846f, 9.111f, 2f, 10.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(14f, 17f)
            horizontalLineTo(8f)
            curveTo(7.586f, 17f, 7.25f, 17.336f, 7.25f, 17.75f)
            curveTo(7.25f, 18.164f, 7.586f, 18.5f, 8f, 18.5f)
            horizontalLineTo(14f)
            curveTo(14.414f, 18.5f, 14.75f, 18.164f, 14.75f, 17.75f)
            curveTo(14.75f, 17.336f, 14.414f, 17f, 14f, 17f)
            close()
            moveTo(12f, 13f)
            horizontalLineTo(8f)
            curveTo(7.586f, 13f, 7.25f, 13.336f, 7.25f, 13.75f)
            curveTo(7.25f, 14.164f, 7.586f, 14.5f, 8f, 14.5f)
            horizontalLineTo(12f)
            curveTo(12.414f, 14.5f, 12.75f, 14.164f, 12.75f, 13.75f)
            curveTo(12.75f, 13.336f, 12.414f, 13f, 12f, 13f)
            close()
            moveTo(16f, 9f)
            horizontalLineTo(8f)
            curveTo(7.586f, 9f, 7.25f, 9.336f, 7.25f, 9.75f)
            curveTo(7.25f, 10.164f, 7.586f, 10.5f, 8f, 10.5f)
            horizontalLineTo(16f)
            curveTo(16.414f, 10.5f, 16.75f, 10.164f, 16.75f, 9.75f)
            curveTo(16.75f, 9.336f, 16.414f, 9f, 16f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardTextLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardTextLtr, contentDescription = null)
    }
}
