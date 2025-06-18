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

public val FluentUi.Filled.Stack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Stack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineTo(13f)
            curveTo(2f, 14.105f, 2.895f, 15f, 4f, 15f)
            horizontalLineTo(15f)
            curveTo(16.105f, 15f, 17f, 14.105f, 17f, 13f)
            verticalLineTo(6f)
            curveTo(17f, 4.895f, 16.105f, 4f, 15f, 4f)
            horizontalLineTo(4f)
            close()
            moveTo(6.5f, 17.5f)
            curveTo(5.568f, 17.5f, 4.785f, 16.863f, 4.563f, 16f)
            horizontalLineTo(15.5f)
            curveTo(16.881f, 16f, 18f, 14.881f, 18f, 13.5f)
            verticalLineTo(6.563f)
            curveTo(18.863f, 6.785f, 19.5f, 7.568f, 19.5f, 8.5f)
            verticalLineTo(13.5f)
            curveTo(19.5f, 15.709f, 17.709f, 17.5f, 15.5f, 17.5f)
            horizontalLineTo(6.5f)
            close()
            moveTo(9f, 20f)
            curveTo(8.068f, 20f, 7.285f, 19.363f, 7.063f, 18.5f)
            horizontalLineTo(16.25f)
            curveTo(18.597f, 18.5f, 20.5f, 16.597f, 20.5f, 14.25f)
            verticalLineTo(9.063f)
            curveTo(21.363f, 9.285f, 22f, 10.068f, 22f, 11f)
            verticalLineTo(14.25f)
            curveTo(22f, 17.426f, 19.426f, 20f, 16.25f, 20f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Stack, contentDescription = null)
    }
}
