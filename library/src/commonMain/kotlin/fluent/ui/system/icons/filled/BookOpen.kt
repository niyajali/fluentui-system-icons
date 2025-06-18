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

public val FluentUi.Filled.BookOpen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookOpen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineTo(18f)
            curveTo(2f, 19.105f, 2.895f, 20f, 4f, 20f)
            horizontalLineTo(10f)
            curveTo(10.768f, 20f, 11.469f, 19.711f, 12f, 19.236f)
            curveTo(12.531f, 19.711f, 13.232f, 20f, 14f, 20f)
            horizontalLineTo(20f)
            curveTo(21.105f, 20f, 22f, 19.105f, 22f, 18f)
            verticalLineTo(6f)
            curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
            horizontalLineTo(14f)
            curveTo(13.232f, 4f, 12.531f, 4.289f, 12f, 4.764f)
            curveTo(11.469f, 4.289f, 10.768f, 4f, 10f, 4f)
            horizontalLineTo(4f)
            close()
            moveTo(11f, 7f)
            verticalLineTo(17f)
            curveTo(11f, 17.552f, 10.552f, 18f, 10f, 18f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            horizontalLineTo(10f)
            curveTo(10.552f, 6f, 11f, 6.448f, 11f, 7f)
            close()
            moveTo(13f, 17f)
            verticalLineTo(7f)
            curveTo(13f, 6.448f, 13.448f, 6f, 14f, 6f)
            horizontalLineTo(20f)
            verticalLineTo(18f)
            horizontalLineTo(14f)
            curveTo(13.448f, 18f, 13f, 17.552f, 13f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BookOpen, contentDescription = null)
    }
}
