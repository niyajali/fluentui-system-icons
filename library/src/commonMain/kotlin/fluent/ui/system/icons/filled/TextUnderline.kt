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

public val FluentUi.Filled.TextUnderline: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextUnderline",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 5f)
            curveTo(17f, 4.735f, 16.895f, 4.48f, 16.707f, 4.293f)
            curveTo(16.52f, 4.105f, 16.265f, 4f, 16f, 4f)
            horizontalLineTo(8f)
            curveTo(7.735f, 4f, 7.48f, 4.105f, 7.293f, 4.293f)
            curveTo(7.105f, 4.48f, 7f, 4.735f, 7f, 5f)
            lineTo(7f, 15.5f)
            curveTo(7f, 16.052f, 7.448f, 16.5f, 8f, 16.5f)
            curveTo(8.552f, 16.5f, 9f, 16.052f, 9f, 15.5f)
            lineTo(9f, 6f)
            lineTo(15f, 6f)
            verticalLineTo(15.5f)
            curveTo(15f, 16.052f, 15.448f, 16.5f, 16f, 16.5f)
            curveTo(16.552f, 16.5f, 17f, 16.052f, 17f, 15.5f)
            verticalLineTo(5f)
            close()
            moveTo(7f, 18f)
            curveTo(6.448f, 18f, 6f, 18.448f, 6f, 19f)
            curveTo(6f, 19.552f, 6.448f, 20f, 7f, 20f)
            horizontalLineTo(17f)
            curveTo(17.552f, 20f, 18f, 19.552f, 18f, 19f)
            curveTo(18f, 18.448f, 17.552f, 18f, 17f, 18f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextUnderlinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextUnderline, contentDescription = null)
    }
}
