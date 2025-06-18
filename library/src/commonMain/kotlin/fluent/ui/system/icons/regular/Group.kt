/**
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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Group: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Group",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5f, 7f)
            curveTo(6.105f, 7f, 7f, 6.105f, 7f, 5f)
            curveTo(7f, 3.895f, 6.105f, 3f, 5f, 3f)
            curveTo(3.895f, 3f, 3f, 3.895f, 3f, 5f)
            curveTo(3f, 6.105f, 3.895f, 7f, 5f, 7f)
            close()
            moveTo(19f, 7f)
            curveTo(20.105f, 7f, 21f, 6.105f, 21f, 5f)
            curveTo(21f, 3.895f, 20.105f, 3f, 19f, 3f)
            curveTo(17.895f, 3f, 17f, 3.895f, 17f, 5f)
            curveTo(17f, 6.105f, 17.895f, 7f, 19f, 7f)
            close()
            moveTo(21f, 19f)
            curveTo(21f, 20.105f, 20.105f, 21f, 19f, 21f)
            curveTo(17.895f, 21f, 17f, 20.105f, 17f, 19f)
            curveTo(17f, 17.895f, 17.895f, 17f, 19f, 17f)
            curveTo(20.105f, 17f, 21f, 17.895f, 21f, 19f)
            close()
            moveTo(5f, 21f)
            curveTo(6.105f, 21f, 7f, 20.105f, 7f, 19f)
            curveTo(7f, 17.895f, 6.105f, 17f, 5f, 17f)
            curveTo(3.895f, 17f, 3f, 17.895f, 3f, 19f)
            curveTo(3f, 20.105f, 3.895f, 21f, 5f, 21f)
            close()
            moveTo(7.959f, 5.5f)
            curveTo(7.986f, 5.337f, 8f, 5.17f, 8f, 5f)
            curveTo(8f, 4.649f, 7.94f, 4.313f, 7.829f, 4f)
            horizontalLineTo(12.5f)
            curveTo(13.881f, 4f, 15f, 5.119f, 15f, 6.5f)
            verticalLineTo(9f)
            horizontalLineTo(17.5f)
            curveTo(18.881f, 9f, 20f, 10.119f, 20f, 11.5f)
            verticalLineTo(16.171f)
            curveTo(19.687f, 16.06f, 19.351f, 16f, 19f, 16f)
            curveTo(18.83f, 16f, 18.663f, 16.014f, 18.5f, 16.042f)
            verticalLineTo(11.5f)
            curveTo(18.5f, 10.948f, 18.052f, 10.5f, 17.5f, 10.5f)
            horizontalLineTo(15f)
            verticalLineTo(12.5f)
            curveTo(15f, 13.881f, 13.881f, 15f, 12.5f, 15f)
            horizontalLineTo(10.5f)
            verticalLineTo(17.5f)
            curveTo(10.5f, 18.052f, 10.948f, 18.5f, 11.5f, 18.5f)
            horizontalLineTo(16.042f)
            curveTo(16.014f, 18.663f, 16f, 18.83f, 16f, 19f)
            curveTo(16f, 19.351f, 16.06f, 19.687f, 16.171f, 20f)
            horizontalLineTo(11.5f)
            curveTo(10.119f, 20f, 9f, 18.881f, 9f, 17.5f)
            verticalLineTo(15f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 15f, 4f, 13.881f, 4f, 12.5f)
            verticalLineTo(7.829f)
            curveTo(4.313f, 7.94f, 4.649f, 8f, 5f, 8f)
            curveTo(5.17f, 8f, 5.337f, 7.986f, 5.5f, 7.959f)
            verticalLineTo(12.5f)
            curveTo(5.5f, 13.052f, 5.948f, 13.5f, 6.5f, 13.5f)
            horizontalLineTo(9f)
            verticalLineTo(11.5f)
            curveTo(9f, 10.119f, 10.119f, 9f, 11.5f, 9f)
            horizontalLineTo(13.5f)
            verticalLineTo(6.5f)
            curveTo(13.5f, 5.948f, 13.052f, 5.5f, 12.5f, 5.5f)
            horizontalLineTo(7.959f)
            close()
            moveTo(12.5f, 13.5f)
            curveTo(13.052f, 13.5f, 13.5f, 13.052f, 13.5f, 12.5f)
            verticalLineTo(10.5f)
            horizontalLineTo(11.5f)
            curveTo(10.948f, 10.5f, 10.5f, 10.948f, 10.5f, 11.5f)
            verticalLineTo(13.5f)
            horizontalLineTo(12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Group, contentDescription = null)
    }
}
