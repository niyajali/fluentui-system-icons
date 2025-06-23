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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ReOrderDotsHorizontal: ImageVector
    get() {
        if (_ReOrderDotsHorizontal != null) {
            return _ReOrderDotsHorizontal!!
        }
        _ReOrderDotsHorizontal = ImageVector.Builder(
            name = "Regular.ReOrderDotsHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 15.5f)
                curveTo(7f, 16.328f, 6.328f, 17f, 5.5f, 17f)
                curveTo(4.672f, 17f, 4f, 16.328f, 4f, 15.5f)
                curveTo(4f, 14.672f, 4.672f, 14f, 5.5f, 14f)
                curveTo(6.328f, 14f, 7f, 14.672f, 7f, 15.5f)
                close()
                moveTo(7f, 8.5f)
                curveTo(7f, 9.328f, 6.328f, 10f, 5.5f, 10f)
                curveTo(4.672f, 10f, 4f, 9.328f, 4f, 8.5f)
                curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
                curveTo(6.328f, 7f, 7f, 7.672f, 7f, 8.5f)
                close()
                moveTo(14f, 15.5f)
                curveTo(14f, 16.328f, 13.328f, 17f, 12.5f, 17f)
                curveTo(11.672f, 17f, 11f, 16.328f, 11f, 15.5f)
                curveTo(11f, 14.672f, 11.672f, 14f, 12.5f, 14f)
                curveTo(13.328f, 14f, 14f, 14.672f, 14f, 15.5f)
                close()
                moveTo(14f, 8.5f)
                curveTo(14f, 9.328f, 13.328f, 10f, 12.5f, 10f)
                curveTo(11.672f, 10f, 11f, 9.328f, 11f, 8.5f)
                curveTo(11f, 7.672f, 11.672f, 7f, 12.5f, 7f)
                curveTo(13.328f, 7f, 14f, 7.672f, 14f, 8.5f)
                close()
                moveTo(21f, 15.5f)
                curveTo(21f, 16.328f, 20.328f, 17f, 19.5f, 17f)
                curveTo(18.672f, 17f, 18f, 16.328f, 18f, 15.5f)
                curveTo(18f, 14.672f, 18.672f, 14f, 19.5f, 14f)
                curveTo(20.328f, 14f, 21f, 14.672f, 21f, 15.5f)
                close()
                moveTo(21f, 8.5f)
                curveTo(21f, 9.328f, 20.328f, 10f, 19.5f, 10f)
                curveTo(18.672f, 10f, 18f, 9.328f, 18f, 8.5f)
                curveTo(18f, 7.672f, 18.672f, 7f, 19.5f, 7f)
                curveTo(20.328f, 7f, 21f, 7.672f, 21f, 8.5f)
                close()
            }
        }.build()

        return _ReOrderDotsHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ReOrderDotsHorizontal: ImageVector? = null

@Preview
@Composable
private fun ReOrderDotsHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ReOrderDotsHorizontal, contentDescription = null)
    }
}
