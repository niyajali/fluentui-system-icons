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

public val FluentIcons.Filled.CommentArrowLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentArrowLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
            curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
            curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
            curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
            close()
            moveTo(20.5f, 7f)
            curveTo(20.776f, 7f, 21f, 6.776f, 21f, 6.5f)
            curveTo(21f, 6.224f, 20.776f, 6f, 20.5f, 6f)
            horizontalLineTo(15.707f)
            lineTo(17.354f, 4.354f)
            curveTo(17.549f, 4.158f, 17.549f, 3.842f, 17.354f, 3.646f)
            curveTo(17.158f, 3.451f, 16.842f, 3.451f, 16.646f, 3.646f)
            lineTo(14.146f, 6.146f)
            curveTo(13.951f, 6.342f, 13.951f, 6.658f, 14.146f, 6.854f)
            lineTo(16.646f, 9.354f)
            curveTo(16.842f, 9.549f, 17.158f, 9.549f, 17.354f, 9.354f)
            curveTo(17.549f, 9.158f, 17.549f, 8.842f, 17.354f, 8.646f)
            lineTo(15.707f, 7f)
            horizontalLineTo(20.5f)
            close()
            moveTo(17.5f, 13f)
            curveTo(19.247f, 13f, 20.832f, 12.311f, 22f, 11.19f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
            horizontalLineTo(13f)
            lineTo(8f, 21.75f)
            curveTo(7.176f, 22.368f, 6f, 21.78f, 6f, 20.75f)
            verticalLineTo(18f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 4.01f, 11f, 5.211f, 11f, 6.5f)
            curveTo(11f, 10.09f, 13.91f, 13f, 17.5f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommentArrowLeft, contentDescription = null)
    }
}
