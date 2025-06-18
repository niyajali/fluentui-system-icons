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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ArchiveMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArchiveMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 2f)
            curveTo(3.783f, 2f, 3f, 2.783f, 3f, 3.75f)
            verticalLineTo(5.25f)
            curveTo(3f, 6.216f, 3.783f, 7f, 4.75f, 7f)
            horizontalLineTo(18.25f)
            curveTo(19.216f, 7f, 20f, 6.216f, 20f, 5.25f)
            verticalLineTo(3.75f)
            curveTo(20f, 2.783f, 19.216f, 2f, 18.25f, 2f)
            horizontalLineTo(4.75f)
            close()
            moveTo(19f, 8f)
            horizontalLineTo(4f)
            verticalLineTo(15.75f)
            curveTo(4f, 17.821f, 5.679f, 19.5f, 7.75f, 19.5f)
            horizontalLineTo(15.25f)
            curveTo(17.321f, 19.5f, 19f, 17.821f, 19f, 15.75f)
            verticalLineTo(8f)
            close()
            moveTo(9f, 11.25f)
            curveTo(9f, 10.836f, 9.336f, 10.5f, 9.75f, 10.5f)
            horizontalLineTo(13.227f)
            curveTo(13.641f, 10.5f, 13.977f, 10.836f, 13.977f, 11.25f)
            curveTo(13.977f, 11.664f, 13.641f, 12f, 13.227f, 12f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 12f, 9f, 11.664f, 9f, 11.25f)
            close()
            moveTo(21.5f, 11.75f)
            curveTo(21.5f, 10.523f, 20.911f, 9.434f, 20f, 8.75f)
            verticalLineTo(16.25f)
            curveTo(20f, 18.597f, 18.097f, 20.5f, 15.75f, 20.5f)
            horizontalLineTo(10.25f)
            lineTo(10.243f, 20.5f)
            horizontalLineTo(7.25f)
            curveTo(7.934f, 21.411f, 9.023f, 22f, 10.25f, 22f)
            horizontalLineTo(15.75f)
            curveTo(18.926f, 22f, 21.5f, 19.426f, 21.5f, 16.25f)
            verticalLineTo(11.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArchiveMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArchiveMultiple, contentDescription = null)
    }
}
