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

public val FluentIcons.Filled.Info: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Info",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.002f, 1.999f)
            curveTo(17.525f, 1.999f, 22.003f, 6.477f, 22.003f, 12.001f)
            curveTo(22.003f, 17.524f, 17.525f, 22.002f, 12.002f, 22.002f)
            curveTo(6.478f, 22.002f, 2f, 17.524f, 2f, 12.001f)
            curveTo(2f, 6.477f, 6.478f, 1.999f, 12.002f, 1.999f)
            close()
            moveTo(12f, 10.5f)
            curveTo(11.586f, 10.5f, 11.25f, 10.836f, 11.25f, 11.25f)
            verticalLineTo(16.25f)
            curveTo(11.25f, 16.664f, 11.586f, 17f, 12f, 17f)
            curveTo(12.414f, 17f, 12.75f, 16.664f, 12.75f, 16.25f)
            verticalLineTo(11.25f)
            curveTo(12.75f, 10.836f, 12.414f, 10.5f, 12f, 10.5f)
            close()
            moveTo(12f, 9f)
            curveTo(12.552f, 9f, 13f, 8.552f, 13f, 8f)
            curveTo(13f, 7.448f, 12.552f, 7f, 12f, 7f)
            curveTo(11.448f, 7f, 11f, 7.448f, 11f, 8f)
            curveTo(11f, 8.552f, 11.448f, 9f, 12f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun InfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Info, contentDescription = null)
    }
}
