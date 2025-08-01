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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.EmojiSurprise: ImageVector
    get() {
        if (_EmojiSurprise != null) {
            return _EmojiSurprise!!
        }
        _EmojiSurprise = ImageVector.Builder(
            name = "Filled.EmojiSurprise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2.004f)
                curveTo(17.523f, 2.004f, 22f, 6.481f, 22f, 12.004f)
                curveTo(22f, 17.527f, 17.523f, 22.004f, 12f, 22.004f)
                curveTo(6.477f, 22.004f, 2f, 17.527f, 2f, 12.004f)
                curveTo(2f, 6.481f, 6.477f, 2.004f, 12f, 2.004f)
                close()
                moveTo(12f, 12.999f)
                curveTo(10.757f, 12.999f, 9.75f, 14.007f, 9.75f, 15.249f)
                curveTo(9.75f, 16.492f, 10.757f, 17.499f, 12f, 17.499f)
                curveTo(13.243f, 17.499f, 14.25f, 16.492f, 14.25f, 15.249f)
                curveTo(14.25f, 14.007f, 13.243f, 12.999f, 12f, 12.999f)
                close()
                moveTo(9f, 8.75f)
                curveTo(8.31f, 8.75f, 7.751f, 9.31f, 7.751f, 10f)
                curveTo(7.751f, 10.69f, 8.31f, 11.249f, 9f, 11.249f)
                curveTo(9.69f, 11.249f, 10.25f, 10.69f, 10.25f, 10f)
                curveTo(10.25f, 9.31f, 9.69f, 8.75f, 9f, 8.75f)
                close()
                moveTo(15f, 8.75f)
                curveTo(14.311f, 8.75f, 13.751f, 9.31f, 13.751f, 10f)
                curveTo(13.751f, 10.69f, 14.311f, 11.249f, 15f, 11.249f)
                curveTo(15.69f, 11.249f, 16.25f, 10.69f, 16.25f, 10f)
                curveTo(16.25f, 9.31f, 15.69f, 8.75f, 15f, 8.75f)
                close()
            }
        }.build()

        return _EmojiSurprise!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiSurprise: ImageVector? = null

@Preview
@Composable
private fun EmojiSurprisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EmojiSurprise, contentDescription = null)
    }
}
