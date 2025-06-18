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

public val FluentUi.Filled.PersonPill: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonPill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.683f, 21.997f)
            curveTo(10.785f, 20.509f, 10.979f, 18.547f, 12.263f, 17.262f)
            lineTo(15.526f, 13.999f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 13.999f, 4.004f, 15.006f, 4.004f, 16.248f)
            verticalLineTo(17.168f)
            curveTo(4.004f, 17.74f, 4.182f, 18.298f, 4.514f, 18.764f)
            curveTo(6.008f, 20.861f, 8.423f, 21.932f, 11.683f, 21.997f)
            close()
            moveTo(17f, 7.004f)
            curveTo(17f, 4.242f, 14.762f, 2.004f, 12f, 2.004f)
            curveTo(9.239f, 2.004f, 7f, 4.242f, 7f, 7.004f)
            curveTo(7f, 9.765f, 9.239f, 12.004f, 12f, 12.004f)
            curveTo(14.762f, 12.004f, 17f, 9.765f, 17f, 7.004f)
            close()
            moveTo(17.97f, 12.969f)
            curveTo(19.091f, 11.848f, 20.909f, 11.848f, 22.031f, 12.969f)
            curveTo(23.152f, 14.091f, 23.152f, 15.909f, 22.031f, 17.03f)
            lineTo(17.031f, 22.03f)
            curveTo(15.909f, 23.151f, 14.091f, 23.151f, 12.97f, 22.03f)
            curveTo(11.849f, 20.909f, 11.849f, 19.091f, 12.97f, 17.969f)
            lineTo(17.97f, 12.969f)
            close()
            moveTo(20.97f, 14.03f)
            curveTo(20.434f, 13.495f, 19.566f, 13.495f, 19.031f, 14.03f)
            lineTo(17.061f, 16f)
            lineTo(19f, 17.939f)
            lineTo(20.97f, 15.969f)
            curveTo(21.505f, 15.434f, 21.505f, 14.566f, 20.97f, 14.03f)
            close()
            moveTo(17.031f, 20.03f)
            curveTo(17.323f, 19.737f, 17.323f, 19.262f, 17.031f, 18.969f)
            curveTo(16.738f, 18.676f, 16.263f, 18.676f, 15.97f, 18.969f)
            lineTo(14.97f, 19.969f)
            curveTo(14.677f, 20.262f, 14.677f, 20.737f, 14.97f, 21.03f)
            curveTo(15.263f, 21.323f, 15.738f, 21.323f, 16.031f, 21.03f)
            lineTo(17.031f, 20.03f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonPillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonPill, contentDescription = null)
    }
}
