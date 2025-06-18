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

public val FluentUi.Regular.BookOpen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookOpen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 19.138f)
            curveTo(11.499f, 19.669f, 10.788f, 20f, 10f, 20f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 20f, 2f, 19.216f, 2f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(2f, 4.784f, 2.783f, 4f, 3.75f, 4f)
            horizontalLineTo(10f)
            curveTo(10.788f, 4f, 11.499f, 4.331f, 12f, 4.863f)
            curveTo(12.501f, 4.331f, 13.212f, 4f, 14f, 4f)
            horizontalLineTo(20.25f)
            curveTo(21.216f, 4f, 22f, 4.784f, 22f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(22f, 19.216f, 21.216f, 20f, 20.25f, 20f)
            horizontalLineTo(14f)
            curveTo(13.212f, 20f, 12.501f, 19.669f, 12f, 19.138f)
            close()
            moveTo(3.5f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3.5f, 18.388f, 3.612f, 18.5f, 3.75f, 18.5f)
            horizontalLineTo(10f)
            curveTo(10.69f, 18.5f, 11.25f, 17.94f, 11.25f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(11.25f, 6.06f, 10.69f, 5.5f, 10f, 5.5f)
            horizontalLineTo(3.75f)
            curveTo(3.612f, 5.5f, 3.5f, 5.612f, 3.5f, 5.75f)
            close()
            moveTo(12.75f, 17.25f)
            curveTo(12.75f, 17.94f, 13.31f, 18.5f, 14f, 18.5f)
            horizontalLineTo(20.25f)
            curveTo(20.388f, 18.5f, 20.5f, 18.388f, 20.5f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(20.5f, 5.612f, 20.388f, 5.5f, 20.25f, 5.5f)
            horizontalLineTo(14f)
            curveTo(13.31f, 5.5f, 12.75f, 6.06f, 12.75f, 6.75f)
            verticalLineTo(17.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookOpen, contentDescription = null)
    }
}
