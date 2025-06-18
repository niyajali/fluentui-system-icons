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
package fluent.ui.system.icons.light

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

public val FluentUi.Light.ClipboardPaste: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ClipboardPaste",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.05f, 4f)
            curveTo(9.282f, 2.859f, 10.29f, 2f, 11.5f, 2f)
            horizontalLineTo(18.5f)
            curveTo(19.709f, 2f, 20.718f, 2.859f, 20.95f, 4f)
            horizontalLineTo(22.75f)
            curveTo(24.545f, 4f, 26f, 5.455f, 26f, 7.25f)
            verticalLineTo(8.506f)
            curveTo(25.917f, 8.502f, 25.834f, 8.5f, 25.75f, 8.5f)
            horizontalLineTo(25f)
            verticalLineTo(7.25f)
            curveTo(25f, 6.007f, 23.993f, 5f, 22.75f, 5f)
            horizontalLineTo(20.95f)
            lineTo(20.949f, 5.004f)
            curveTo(20.716f, 6.143f, 19.708f, 7f, 18.5f, 7f)
            horizontalLineTo(11.5f)
            curveTo(10.29f, 7f, 9.282f, 6.141f, 9.05f, 5f)
            horizontalLineTo(7.25f)
            curveTo(6.007f, 5f, 5f, 6.007f, 5f, 7.25f)
            verticalLineTo(26.75f)
            curveTo(5f, 27.993f, 6.007f, 29f, 7.25f, 29f)
            horizontalLineTo(13.066f)
            curveTo(13.262f, 29.365f, 13.505f, 29.701f, 13.786f, 30f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 30f, 4f, 28.545f, 4f, 26.75f)
            verticalLineTo(7.25f)
            curveTo(4f, 5.455f, 5.455f, 4f, 7.25f, 4f)
            horizontalLineTo(9.05f)
            close()
            moveTo(20f, 4.5f)
            curveTo(20f, 3.672f, 19.328f, 3f, 18.5f, 3f)
            horizontalLineTo(11.5f)
            curveTo(10.672f, 3f, 10f, 3.672f, 10f, 4.5f)
            curveTo(10f, 5.328f, 10.672f, 6f, 11.5f, 6f)
            horizontalLineTo(18.5f)
            curveTo(19.328f, 6f, 20f, 5.328f, 20f, 4.5f)
            close()
            moveTo(14f, 13.25f)
            curveTo(14f, 11.455f, 15.455f, 10f, 17.25f, 10f)
            horizontalLineTo(25.75f)
            curveTo(27.545f, 10f, 29f, 11.455f, 29f, 13.25f)
            verticalLineTo(26.75f)
            curveTo(29f, 28.545f, 27.545f, 30f, 25.75f, 30f)
            horizontalLineTo(17.25f)
            curveTo(15.455f, 30f, 14f, 28.545f, 14f, 26.75f)
            verticalLineTo(13.25f)
            close()
            moveTo(17.25f, 11f)
            curveTo(16.007f, 11f, 15f, 12.007f, 15f, 13.25f)
            verticalLineTo(26.75f)
            curveTo(15f, 27.993f, 16.007f, 29f, 17.25f, 29f)
            horizontalLineTo(25.75f)
            curveTo(26.993f, 29f, 28f, 27.993f, 28f, 26.75f)
            verticalLineTo(13.25f)
            curveTo(28f, 12.007f, 26.993f, 11f, 25.75f, 11f)
            horizontalLineTo(17.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardPastePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ClipboardPaste, contentDescription = null)
    }
}
