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

public val FluentIcons.Filled.FolderArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 8f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
            lineTo(11.25f, 5.189f)
            lineTo(8.659f, 7.78f)
            curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
            horizontalLineTo(2f)
            close()
            moveTo(2f, 9.5f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
            curveTo(19.247f, 11f, 20.832f, 11.689f, 22f, 12.81f)
            verticalLineTo(8.75f)
            curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(13.061f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(2f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(17f, 20.5f)
            curveTo(17f, 20.776f, 17.224f, 21f, 17.5f, 21f)
            curveTo(17.776f, 21f, 18f, 20.776f, 18f, 20.5f)
            verticalLineTo(15.707f)
            lineTo(19.646f, 17.354f)
            curveTo(19.842f, 17.549f, 20.158f, 17.549f, 20.354f, 17.354f)
            curveTo(20.549f, 17.158f, 20.549f, 16.842f, 20.354f, 16.646f)
            lineTo(17.854f, 14.146f)
            curveTo(17.658f, 13.951f, 17.342f, 13.951f, 17.146f, 14.146f)
            lineTo(14.646f, 16.646f)
            curveTo(14.451f, 16.842f, 14.451f, 17.158f, 14.646f, 17.354f)
            curveTo(14.842f, 17.549f, 15.158f, 17.549f, 15.354f, 17.354f)
            lineTo(17f, 15.707f)
            verticalLineTo(20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FolderArrowUp, contentDescription = null)
    }
}
