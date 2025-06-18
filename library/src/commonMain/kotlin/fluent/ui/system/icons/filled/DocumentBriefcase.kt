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

public val FluentUi.Filled.DocumentBriefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentBriefcase",
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
            verticalLineTo(16.5f)
            curveTo(13f, 15.291f, 12.141f, 14.282f, 11f, 14.05f)
            verticalLineTo(13.75f)
            curveTo(11f, 12.231f, 9.769f, 11f, 8.25f, 11f)
            horizontalLineTo(4.75f)
            curveTo(4.49f, 11f, 4.238f, 11.036f, 4f, 11.104f)
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
            moveTo(3f, 15f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 15f, 1f, 15.672f, 1f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(1f, 22.328f, 1.672f, 23f, 2.5f, 23f)
            horizontalLineTo(10.5f)
            curveTo(11.328f, 23f, 12f, 22.328f, 12f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(12f, 15.672f, 11.328f, 15f, 10.5f, 15f)
            horizontalLineTo(10f)
            verticalLineTo(13.75f)
            curveTo(10f, 12.783f, 9.217f, 12f, 8.25f, 12f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 12f, 3f, 12.783f, 3f, 13.75f)
            verticalLineTo(15f)
            close()
            moveTo(4.5f, 13.75f)
            curveTo(4.5f, 13.612f, 4.612f, 13.5f, 4.75f, 13.5f)
            horizontalLineTo(8.25f)
            curveTo(8.388f, 13.5f, 8.5f, 13.612f, 8.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(4.5f)
            verticalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentBriefcase, contentDescription = null)
    }
}
