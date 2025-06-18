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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.TextAlignDistributedEvenly: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextAlignDistributedEvenly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6f)
                curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
                horizontalLineTo(21f)
                curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
                curveTo(22f, 6.552f, 21.552f, 7f, 21f, 7f)
                horizontalLineTo(3f)
                curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
                close()
                moveTo(5.707f, 15.293f)
                curveTo(5.317f, 14.902f, 4.683f, 14.902f, 4.293f, 15.293f)
                lineTo(2.293f, 17.293f)
                curveTo(1.902f, 17.683f, 1.902f, 18.317f, 2.293f, 18.707f)
                lineTo(4.293f, 20.707f)
                curveTo(4.683f, 21.098f, 5.317f, 21.098f, 5.707f, 20.707f)
                curveTo(6.098f, 20.317f, 6.098f, 19.683f, 5.707f, 19.293f)
                lineTo(5.414f, 19f)
                horizontalLineTo(18.586f)
                lineTo(18.293f, 19.293f)
                curveTo(17.902f, 19.683f, 17.902f, 20.317f, 18.293f, 20.707f)
                curveTo(18.683f, 21.098f, 19.317f, 21.098f, 19.707f, 20.707f)
                lineTo(21.707f, 18.707f)
                curveTo(22.098f, 18.317f, 22.098f, 17.683f, 21.707f, 17.293f)
                lineTo(19.707f, 15.293f)
                curveTo(19.317f, 14.902f, 18.683f, 14.902f, 18.293f, 15.293f)
                curveTo(17.902f, 15.683f, 17.902f, 16.317f, 18.293f, 16.707f)
                lineTo(18.586f, 17f)
                horizontalLineTo(5.414f)
                lineTo(5.707f, 16.707f)
                curveTo(6.098f, 16.317f, 6.098f, 15.683f, 5.707f, 15.293f)
                close()
                moveTo(3f, 11f)
                curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
                curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
                horizontalLineTo(21f)
                curveTo(21.552f, 13f, 22f, 12.552f, 22f, 12f)
                curveTo(22f, 11.448f, 21.552f, 11f, 21f, 11f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextAlignDistributedEvenlyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextAlignDistributedEvenly, contentDescription = null)
    }
}
