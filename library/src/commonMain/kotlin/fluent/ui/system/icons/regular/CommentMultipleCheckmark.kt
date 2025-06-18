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

public val FluentUi.Regular.CommentMultipleCheckmark: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.CommentMultipleCheckmark",
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
                verticalLineTo(11.498f)
                curveTo(20.541f, 11.724f, 21.045f, 12.02f, 21.5f, 12.376f)
                verticalLineTo(9.25f)
                curveTo(21.5f, 6.074f, 18.926f, 3.5f, 15.75f, 3.5f)
                horizontalLineTo(7.75f)
                curveTo(6.596f, 3.5f, 5.583f, 4.101f, 5.006f, 5.007f)
                close()
                moveTo(19f, 9.25f)
                verticalLineTo(11.174f)
                curveTo(18.518f, 11.06f, 18.016f, 11f, 17.5f, 11f)
                verticalLineTo(9.25f)
                curveTo(17.5f, 8.283f, 16.716f, 7.5f, 15.75f, 7.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 7.5f, 3.5f, 8.283f, 3.5f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 16.716f, 4.284f, 17.5f, 5.25f, 17.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(20.258f)
                lineTo(10.256f, 17.5f)
                horizontalLineTo(11f)
                curveTo(11f, 18.016f, 11.06f, 18.518f, 11.174f, 19f)
                horizontalLineTo(10.748f)
                lineTo(6.99f, 21.76f)
                curveTo(6.164f, 22.366f, 5f, 21.776f, 5f, 20.752f)
                verticalLineTo(18.99f)
                curveTo(3.322f, 18.863f, 2f, 17.461f, 2f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(2f, 7.455f, 3.455f, 6f, 5.25f, 6f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 6f, 19f, 7.455f, 19f, 9.25f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(20.854f, 15.146f)
                curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.146f)
                curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
                curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
                lineTo(16.146f, 19.854f)
                curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun CommentMultipleCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CommentMultipleCheckmark, contentDescription = null)
    }
}
