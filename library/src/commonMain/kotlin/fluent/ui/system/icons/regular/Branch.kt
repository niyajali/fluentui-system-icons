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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Branch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Branch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.5f)
            curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
            curveTo(9.433f, 2f, 11f, 3.567f, 11f, 5.5f)
            curveTo(11f, 7.09f, 9.94f, 8.432f, 8.489f, 8.858f)
            curveTo(9.177f, 11.111f, 11.272f, 12.75f, 13.75f, 12.75f)
            horizontalLineTo(14.08f)
            curveTo(14.424f, 11.177f, 15.824f, 10f, 17.5f, 10f)
            curveTo(19.433f, 10f, 21f, 11.567f, 21f, 13.5f)
            curveTo(21f, 15.433f, 19.433f, 17f, 17.5f, 17f)
            curveTo(15.824f, 17f, 14.424f, 15.823f, 14.08f, 14.25f)
            horizontalLineTo(13.75f)
            curveTo(11.519f, 14.25f, 9.532f, 13.206f, 8.25f, 11.58f)
            lineTo(8.25f, 15.08f)
            curveTo(9.823f, 15.424f, 11f, 16.824f, 11f, 18.5f)
            curveTo(11f, 20.433f, 9.433f, 22f, 7.5f, 22f)
            curveTo(5.567f, 22f, 4f, 20.433f, 4f, 18.5f)
            curveTo(4f, 16.824f, 5.177f, 15.424f, 6.75f, 15.08f)
            lineTo(6.75f, 8.919f)
            curveTo(5.177f, 8.576f, 4f, 7.176f, 4f, 5.5f)
            close()
            moveTo(7.5f, 3.5f)
            curveTo(6.395f, 3.5f, 5.5f, 4.395f, 5.5f, 5.5f)
            curveTo(5.5f, 6.605f, 6.395f, 7.5f, 7.5f, 7.5f)
            curveTo(8.605f, 7.5f, 9.5f, 6.605f, 9.5f, 5.5f)
            curveTo(9.5f, 4.395f, 8.605f, 3.5f, 7.5f, 3.5f)
            close()
            moveTo(7.5f, 16.5f)
            curveTo(6.395f, 16.5f, 5.5f, 17.395f, 5.5f, 18.5f)
            curveTo(5.5f, 19.605f, 6.395f, 20.5f, 7.5f, 20.5f)
            curveTo(8.605f, 20.5f, 9.5f, 19.605f, 9.5f, 18.5f)
            curveTo(9.5f, 17.395f, 8.605f, 16.5f, 7.5f, 16.5f)
            close()
            moveTo(15.5f, 13.5f)
            curveTo(15.5f, 14.605f, 16.395f, 15.5f, 17.5f, 15.5f)
            curveTo(18.605f, 15.5f, 19.5f, 14.605f, 19.5f, 13.5f)
            curveTo(19.5f, 12.395f, 18.605f, 11.5f, 17.5f, 11.5f)
            curveTo(16.395f, 11.5f, 15.5f, 12.395f, 15.5f, 13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BranchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Branch, contentDescription = null)
    }
}
