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

public val FluentIcons.Regular.CommentMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.006f, 5.007f)
            curveTo(5.087f, 5.002f, 5.168f, 5f, 5.25f, 5f)
            horizontalLineTo(15.75f)
            curveTo(18.097f, 5f, 20f, 6.903f, 20f, 9.25f)
            verticalLineTo(15.75f)
            curveTo(20f, 15.832f, 19.998f, 15.913f, 19.993f, 15.993f)
            curveTo(20.899f, 15.417f, 21.5f, 14.403f, 21.5f, 13.25f)
            verticalLineTo(9.25f)
            curveTo(21.5f, 6.074f, 18.926f, 3.5f, 15.75f, 3.5f)
            horizontalLineTo(7.75f)
            curveTo(6.596f, 3.5f, 5.583f, 4.101f, 5.006f, 5.007f)
            close()
            moveTo(5.25f, 6f)
            curveTo(3.455f, 6f, 2f, 7.455f, 2f, 9.25f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.461f, 3.322f, 18.863f, 5f, 18.99f)
            verticalLineTo(20.752f)
            curveTo(5f, 21.776f, 6.164f, 22.366f, 6.99f, 21.76f)
            lineTo(10.748f, 19f)
            horizontalLineTo(15.75f)
            curveTo(17.545f, 19f, 19f, 17.545f, 19f, 15.75f)
            verticalLineTo(9.25f)
            curveTo(19f, 7.455f, 17.545f, 6f, 15.75f, 6f)
            horizontalLineTo(5.25f)
            close()
            moveTo(3.5f, 9.25f)
            curveTo(3.5f, 8.283f, 4.284f, 7.5f, 5.25f, 7.5f)
            horizontalLineTo(15.75f)
            curveTo(16.716f, 7.5f, 17.5f, 8.283f, 17.5f, 9.25f)
            verticalLineTo(15.75f)
            curveTo(17.5f, 16.716f, 16.716f, 17.5f, 15.75f, 17.5f)
            horizontalLineTo(10.256f)
            lineTo(6.5f, 20.258f)
            verticalLineTo(17.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
            verticalLineTo(9.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CommentMultiple, contentDescription = null)
    }
}
