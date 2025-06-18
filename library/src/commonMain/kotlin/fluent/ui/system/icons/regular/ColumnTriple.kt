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

public val FluentIcons.Regular.ColumnTriple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColumnTriple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 21f)
            curveTo(3.119f, 21f, 2f, 19.881f, 2f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(2f, 4.119f, 3.119f, 3f, 4.5f, 3f)
            horizontalLineTo(5.5f)
            curveTo(6.881f, 3f, 8f, 4.119f, 8f, 5.5f)
            lineTo(8f, 18.5f)
            curveTo(8f, 19.881f, 6.881f, 21f, 5.5f, 21f)
            horizontalLineTo(4.5f)
            close()
            moveTo(3.5f, 18.5f)
            curveTo(3.5f, 19.052f, 3.948f, 19.5f, 4.5f, 19.5f)
            horizontalLineTo(5.5f)
            curveTo(6.052f, 19.5f, 6.5f, 19.052f, 6.5f, 18.5f)
            lineTo(6.5f, 5.5f)
            curveTo(6.5f, 4.948f, 6.052f, 4.5f, 5.5f, 4.5f)
            horizontalLineTo(4.5f)
            curveTo(3.948f, 4.5f, 3.5f, 4.948f, 3.5f, 5.5f)
            lineTo(3.5f, 18.5f)
            close()
            moveTo(11.5f, 21f)
            curveTo(10.119f, 21f, 9f, 19.881f, 9f, 18.5f)
            lineTo(9f, 5.5f)
            curveTo(9f, 4.119f, 10.119f, 3f, 11.5f, 3f)
            horizontalLineTo(12.5f)
            curveTo(13.881f, 3f, 15f, 4.119f, 15f, 5.5f)
            verticalLineTo(18.5f)
            curveTo(15f, 19.881f, 13.881f, 21f, 12.5f, 21f)
            horizontalLineTo(11.5f)
            close()
            moveTo(10.5f, 18.5f)
            curveTo(10.5f, 19.052f, 10.948f, 19.5f, 11.5f, 19.5f)
            horizontalLineTo(12.5f)
            curveTo(13.052f, 19.5f, 13.5f, 19.052f, 13.5f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(13.5f, 4.948f, 13.052f, 4.5f, 12.5f, 4.5f)
            horizontalLineTo(11.5f)
            curveTo(10.948f, 4.5f, 10.5f, 4.948f, 10.5f, 5.5f)
            verticalLineTo(18.5f)
            close()
            moveTo(16f, 18.5f)
            curveTo(16f, 19.881f, 17.119f, 21f, 18.5f, 21f)
            horizontalLineTo(19.5f)
            curveTo(20.881f, 21f, 22f, 19.881f, 22f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(22f, 4.119f, 20.881f, 3f, 19.5f, 3f)
            horizontalLineTo(18.5f)
            curveTo(17.119f, 3f, 16f, 4.119f, 16f, 5.5f)
            lineTo(16f, 18.5f)
            close()
            moveTo(18.5f, 19.5f)
            curveTo(17.948f, 19.5f, 17.5f, 19.052f, 17.5f, 18.5f)
            lineTo(17.5f, 5.5f)
            curveTo(17.5f, 4.948f, 17.948f, 4.5f, 18.5f, 4.5f)
            horizontalLineTo(19.5f)
            curveTo(20.052f, 4.5f, 20.5f, 4.948f, 20.5f, 5.5f)
            verticalLineTo(18.5f)
            curveTo(20.5f, 19.052f, 20.052f, 19.5f, 19.5f, 19.5f)
            horizontalLineTo(18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColumnTriplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ColumnTriple, contentDescription = null)
    }
}
