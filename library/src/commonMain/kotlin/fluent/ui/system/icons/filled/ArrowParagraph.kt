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

public val FluentIcons.Filled.ArrowParagraph: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowParagraph",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 2f)
            curveTo(21.552f, 2f, 22f, 2.448f, 22f, 3f)
            verticalLineTo(7f)
            curveTo(22f, 8.657f, 20.657f, 10f, 19f, 10f)
            horizontalLineTo(14.414f)
            lineTo(16.707f, 12.293f)
            curveTo(17.098f, 12.683f, 17.098f, 13.317f, 16.707f, 13.707f)
            curveTo(16.317f, 14.098f, 15.683f, 14.098f, 15.293f, 13.707f)
            lineTo(11.293f, 9.707f)
            curveTo(10.902f, 9.317f, 10.902f, 8.683f, 11.293f, 8.293f)
            lineTo(15.293f, 4.293f)
            curveTo(15.683f, 3.902f, 16.317f, 3.902f, 16.707f, 4.293f)
            curveTo(17.098f, 4.683f, 17.098f, 5.317f, 16.707f, 5.707f)
            lineTo(14.414f, 8f)
            horizontalLineTo(19f)
            curveTo(19.552f, 8f, 20f, 7.552f, 20f, 7f)
            verticalLineTo(3f)
            curveTo(20f, 2.448f, 20.448f, 2f, 21f, 2f)
            close()
            moveTo(7.293f, 11.293f)
            curveTo(6.902f, 11.683f, 6.902f, 12.317f, 7.293f, 12.707f)
            lineTo(9.586f, 15f)
            horizontalLineTo(3f)
            curveTo(2.448f, 15f, 2f, 15.448f, 2f, 16f)
            curveTo(2f, 16.552f, 2.448f, 17f, 3f, 17f)
            horizontalLineTo(9.586f)
            lineTo(7.293f, 19.293f)
            curveTo(6.902f, 19.683f, 6.902f, 20.317f, 7.293f, 20.707f)
            curveTo(7.683f, 21.098f, 8.317f, 21.098f, 8.707f, 20.707f)
            lineTo(12.707f, 16.707f)
            curveTo(12.804f, 16.611f, 12.877f, 16.499f, 12.925f, 16.38f)
            curveTo(12.973f, 16.264f, 13f, 16.136f, 13f, 16.003f)
            lineTo(13f, 16f)
            curveTo(13f, 15.734f, 12.896f, 15.492f, 12.727f, 15.313f)
            curveTo(12.719f, 15.305f, 12.712f, 15.298f, 12.705f, 15.29f)
            lineTo(8.707f, 11.293f)
            curveTo(8.317f, 10.902f, 7.683f, 10.902f, 7.293f, 11.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowParagraphPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowParagraph, contentDescription = null)
    }
}
