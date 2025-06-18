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

public val FluentUi.Filled.ClipboardError: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardError",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 3.999f)
            lineTo(17.75f, 4f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(11.498f)
            curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 19.247f, 11.689f, 20.832f, 12.81f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            lineTo(8.014f, 3.999f)
            curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
            close()
            moveTo(13.75f, 3.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
            verticalLineTo(18.5f)
            curveTo(17f, 18.776f, 17.224f, 19f, 17.5f, 19f)
            curveTo(17.776f, 19f, 18f, 18.776f, 18f, 18.5f)
            verticalLineTo(14.5f)
            curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
            close()
            moveTo(17.5f, 21.125f)
            curveTo(17.845f, 21.125f, 18.125f, 20.845f, 18.125f, 20.5f)
            curveTo(18.125f, 20.155f, 17.845f, 19.875f, 17.5f, 19.875f)
            curveTo(17.155f, 19.875f, 16.875f, 20.155f, 16.875f, 20.5f)
            curveTo(16.875f, 20.845f, 17.155f, 21.125f, 17.5f, 21.125f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardError, contentDescription = null)
    }
}
