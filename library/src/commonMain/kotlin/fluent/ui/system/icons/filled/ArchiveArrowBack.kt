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

public val FluentIcons.Filled.ArchiveArrowBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArchiveArrowBack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(19.5f)
            curveTo(20.328f, 3f, 21f, 3.672f, 21f, 4.5f)
            verticalLineTo(6f)
            curveTo(21f, 6.828f, 20.328f, 7.5f, 19.5f, 7.5f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 7.5f, 3f, 6.828f, 3f, 6f)
            verticalLineTo(4.5f)
            close()
            moveTo(4f, 9f)
            horizontalLineTo(20f)
            verticalLineTo(11.498f)
            curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
            curveTo(16.418f, 11f, 15.397f, 11.264f, 14.5f, 11.732f)
            curveTo(14.49f, 11.326f, 14.158f, 11f, 13.75f, 11f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 11f, 9.5f, 11.336f, 9.5f, 11.75f)
            curveTo(9.5f, 12.164f, 9.836f, 12.5f, 10.25f, 12.5f)
            horizontalLineTo(13.346f)
            curveTo(11.913f, 13.692f, 11f, 15.49f, 11f, 17.5f)
            curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
            horizontalLineTo(7.75f)
            curveTo(5.679f, 21f, 4f, 19.321f, 4f, 17.25f)
            verticalLineTo(9f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(16.354f, 15.354f)
            curveTo(16.549f, 15.158f, 16.549f, 14.842f, 16.354f, 14.646f)
            curveTo(16.158f, 14.451f, 15.842f, 14.451f, 15.646f, 14.646f)
            lineTo(14.146f, 16.146f)
            curveTo(13.951f, 16.342f, 13.951f, 16.658f, 14.146f, 16.854f)
            lineTo(15.646f, 18.354f)
            curveTo(15.842f, 18.549f, 16.158f, 18.549f, 16.354f, 18.354f)
            curveTo(16.549f, 18.158f, 16.549f, 17.842f, 16.354f, 17.646f)
            lineTo(15.707f, 17f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 17f, 20f, 18.007f, 20f, 19.25f)
            verticalLineTo(19.5f)
            curveTo(20f, 19.776f, 20.224f, 20f, 20.5f, 20f)
            curveTo(20.776f, 20f, 21f, 19.776f, 21f, 19.5f)
            verticalLineTo(19.25f)
            curveTo(21f, 17.455f, 19.545f, 16f, 17.75f, 16f)
            horizontalLineTo(15.707f)
            lineTo(16.354f, 15.354f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArchiveArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArchiveArrowBack, contentDescription = null)
    }
}
