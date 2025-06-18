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

public val FluentIcons.Filled.TextAddSpaceAfter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAddSpaceAfter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7f)
            curveTo(3f, 6.448f, 3.448f, 6f, 4f, 6f)
            horizontalLineTo(20f)
            curveTo(20.552f, 6f, 21f, 6.448f, 21f, 7f)
            curveTo(21f, 7.552f, 20.552f, 8f, 20f, 8f)
            horizontalLineTo(4f)
            curveTo(3.448f, 8f, 3f, 7.552f, 3f, 7f)
            close()
            moveTo(3f, 13f)
            curveTo(3f, 12.448f, 3.448f, 12f, 4f, 12f)
            horizontalLineTo(20f)
            curveTo(20.552f, 12f, 21f, 12.448f, 21f, 13f)
            curveTo(21f, 13.552f, 20.552f, 14f, 20f, 14f)
            horizontalLineTo(4f)
            curveTo(3.448f, 14f, 3f, 13.552f, 3f, 13f)
            close()
            moveTo(9.293f, 18.293f)
            curveTo(8.902f, 18.683f, 8.902f, 19.317f, 9.293f, 19.707f)
            curveTo(9.683f, 20.098f, 10.317f, 20.098f, 10.707f, 19.707f)
            lineTo(12f, 18.414f)
            lineTo(13.293f, 19.707f)
            curveTo(13.683f, 20.098f, 14.317f, 20.098f, 14.707f, 19.707f)
            curveTo(15.098f, 19.317f, 15.098f, 18.683f, 14.707f, 18.293f)
            lineTo(12.707f, 16.293f)
            curveTo(12.317f, 15.902f, 11.683f, 15.902f, 11.293f, 16.293f)
            lineTo(9.293f, 18.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextAddSpaceAfterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextAddSpaceAfter, contentDescription = null)
    }
}
