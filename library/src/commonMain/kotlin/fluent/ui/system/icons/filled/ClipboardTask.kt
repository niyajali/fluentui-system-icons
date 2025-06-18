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

public val FluentUi.Filled.ClipboardTask: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardTask",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
            lineTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            lineTo(15.986f, 3.999f)
            curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
            close()
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
            moveTo(17.03f, 11.03f)
            lineTo(11.53f, 16.53f)
            curveTo(11.237f, 16.823f, 10.763f, 16.823f, 10.47f, 16.53f)
            lineTo(7.97f, 14.03f)
            curveTo(7.677f, 13.737f, 7.677f, 13.263f, 7.97f, 12.97f)
            curveTo(8.263f, 12.677f, 8.737f, 12.677f, 9.03f, 12.97f)
            lineTo(11f, 14.939f)
            lineTo(15.97f, 9.97f)
            curveTo(16.263f, 9.677f, 16.737f, 9.677f, 17.03f, 9.97f)
            curveTo(17.323f, 10.263f, 17.323f, 10.737f, 17.03f, 11.03f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardTaskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardTask, contentDescription = null)
    }
}
