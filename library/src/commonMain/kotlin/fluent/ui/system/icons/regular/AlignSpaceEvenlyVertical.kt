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

public val FluentUi.Regular.AlignSpaceEvenlyVertical: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignSpaceEvenlyVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 3.5f)
            curveTo(5.948f, 3.5f, 5.5f, 3.948f, 5.5f, 4.5f)
            verticalLineTo(5.5f)
            curveTo(5.5f, 6.052f, 5.948f, 6.5f, 6.5f, 6.5f)
            horizontalLineTo(17.5f)
            curveTo(18.052f, 6.5f, 18.5f, 6.052f, 18.5f, 5.5f)
            verticalLineTo(4.5f)
            curveTo(18.5f, 3.948f, 18.052f, 3.5f, 17.5f, 3.5f)
            horizontalLineTo(6.5f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(17.5f)
            curveTo(18.881f, 2f, 20f, 3.119f, 20f, 4.5f)
            verticalLineTo(5.5f)
            curveTo(20f, 6.881f, 18.881f, 8f, 17.5f, 8f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 8f, 4f, 6.881f, 4f, 5.5f)
            verticalLineTo(4.5f)
            close()
            moveTo(6.5f, 10.5f)
            curveTo(5.948f, 10.5f, 5.5f, 10.948f, 5.5f, 11.5f)
            verticalLineTo(12.5f)
            curveTo(5.5f, 13.052f, 5.948f, 13.5f, 6.5f, 13.5f)
            horizontalLineTo(17.5f)
            curveTo(18.052f, 13.5f, 18.5f, 13.052f, 18.5f, 12.5f)
            verticalLineTo(11.5f)
            curveTo(18.5f, 10.948f, 18.052f, 10.5f, 17.5f, 10.5f)
            horizontalLineTo(6.5f)
            close()
            moveTo(4f, 11.5f)
            curveTo(4f, 10.119f, 5.119f, 9f, 6.5f, 9f)
            horizontalLineTo(17.5f)
            curveTo(18.881f, 9f, 20f, 10.119f, 20f, 11.5f)
            verticalLineTo(12.5f)
            curveTo(20f, 13.881f, 18.881f, 15f, 17.5f, 15f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 15f, 4f, 13.881f, 4f, 12.5f)
            verticalLineTo(11.5f)
            close()
            moveTo(5.5f, 18.5f)
            curveTo(5.5f, 17.948f, 5.948f, 17.5f, 6.5f, 17.5f)
            horizontalLineTo(17.5f)
            curveTo(18.052f, 17.5f, 18.5f, 17.948f, 18.5f, 18.5f)
            verticalLineTo(19.5f)
            curveTo(18.5f, 20.052f, 18.052f, 20.5f, 17.5f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
            verticalLineTo(18.5f)
            close()
            moveTo(6.5f, 16f)
            curveTo(5.119f, 16f, 4f, 17.119f, 4f, 18.5f)
            verticalLineTo(19.5f)
            curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
            horizontalLineTo(17.5f)
            curveTo(18.881f, 22f, 20f, 20.881f, 20f, 19.5f)
            verticalLineTo(18.5f)
            curveTo(20f, 17.119f, 18.881f, 16f, 17.5f, 16f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlignSpaceEvenlyVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AlignSpaceEvenlyVertical, contentDescription = null)
    }
}
