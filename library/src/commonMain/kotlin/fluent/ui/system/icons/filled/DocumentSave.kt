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

public val FluentIcons.Filled.DocumentSave: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSave",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(12.95f)
            curveTo(12.983f, 21.838f, 13f, 21.671f, 13f, 21.5f)
            verticalLineTo(14.621f)
            curveTo(13f, 13.958f, 12.737f, 13.322f, 12.268f, 12.854f)
            lineTo(11.146f, 11.732f)
            curveTo(10.678f, 11.263f, 10.042f, 11f, 9.379f, 11f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(5f, 12f)
            horizontalLineTo(8f)
            verticalLineTo(14f)
            horizontalLineTo(5f)
            verticalLineTo(12f)
            close()
            moveTo(2.5f, 12f)
            horizontalLineTo(4f)
            verticalLineTo(14.5f)
            curveTo(4f, 14.776f, 4.224f, 15f, 4.5f, 15f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 15f, 9f, 14.776f, 9f, 14.5f)
            verticalLineTo(12f)
            horizontalLineTo(9.379f)
            curveTo(9.776f, 12f, 10.158f, 12.158f, 10.439f, 12.439f)
            lineTo(11.561f, 13.561f)
            curveTo(11.842f, 13.842f, 12f, 14.224f, 12f, 14.621f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.328f, 11.328f, 23f, 10.5f, 23f)
            horizontalLineTo(10f)
            verticalLineTo(17.5f)
            curveTo(10f, 17.224f, 9.776f, 17f, 9.5f, 17f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 17f, 3f, 17.224f, 3f, 17.5f)
            verticalLineTo(23f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 23f, 1f, 22.328f, 1f, 21.5f)
            verticalLineTo(13.5f)
            curveTo(1f, 12.672f, 1.672f, 12f, 2.5f, 12f)
            close()
            moveTo(9f, 18f)
            verticalLineTo(23f)
            horizontalLineTo(4f)
            verticalLineTo(18f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentSavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentSave, contentDescription = null)
    }
}
