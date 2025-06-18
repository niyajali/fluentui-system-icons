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
package fluent.ui.system.icons.regular

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

public val FluentUi.Regular.PresenceDnd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceDnd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 0f)
            curveTo(5.373f, 0f, 0f, 5.373f, 0f, 12f)
            curveTo(0f, 18.627f, 5.373f, 24f, 12f, 24f)
            curveTo(18.627f, 24f, 24f, 18.627f, 24f, 12f)
            curveTo(24f, 5.373f, 18.627f, 0f, 12f, 0f)
            close()
            moveTo(3f, 12f)
            curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
            curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
            curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
            curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
            close()
            moveTo(6f, 12f)
            curveTo(6f, 11.172f, 6.672f, 10.5f, 7.5f, 10.5f)
            horizontalLineTo(16.5f)
            curveTo(17.328f, 10.5f, 18f, 11.172f, 18f, 12f)
            curveTo(18f, 12.828f, 17.328f, 13.5f, 16.5f, 13.5f)
            horizontalLineTo(7.5f)
            curveTo(6.672f, 13.5f, 6f, 12.828f, 6f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PresenceDndPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PresenceDnd, contentDescription = null)
    }
}
