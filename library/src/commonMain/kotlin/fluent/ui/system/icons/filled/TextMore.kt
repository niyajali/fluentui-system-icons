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

public val FluentIcons.Filled.TextMore: ImageVector
    get() {
        if (_TextMore != null) {
            return _TextMore!!
        }
        _TextMore = ImageVector.Builder(
            name = "Filled.TextMore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.672f, 2.611f)
                curveTo(10.515f, 2.241f, 10.152f, 2f, 9.75f, 2f)
                curveTo(9.348f, 2f, 8.985f, 2.241f, 8.829f, 2.611f)
                lineTo(2.079f, 18.611f)
                curveTo(1.864f, 19.12f, 2.103f, 19.707f, 2.612f, 19.921f)
                curveTo(3.12f, 20.136f, 3.707f, 19.898f, 3.922f, 19.389f)
                lineTo(5.773f, 15f)
                horizontalLineTo(13.727f)
                lineTo(15.013f, 18.047f)
                curveTo(15.171f, 18.016f, 15.333f, 18f, 15.5f, 18f)
                curveTo(16.318f, 18f, 17.044f, 18.393f, 17.5f, 19f)
                curveTo(17.501f, 18.87f, 17.475f, 18.738f, 17.422f, 18.611f)
                lineTo(10.672f, 2.611f)
                close()
                moveTo(12.884f, 13f)
                horizontalLineTo(6.617f)
                lineTo(9.75f, 5.573f)
                lineTo(12.884f, 13f)
                close()
                moveTo(10.5f, 22f)
                curveTo(11.328f, 22f, 12f, 21.328f, 12f, 20.5f)
                curveTo(12f, 19.672f, 11.328f, 19f, 10.5f, 19f)
                curveTo(9.672f, 19f, 9f, 19.672f, 9f, 20.5f)
                curveTo(9f, 21.328f, 9.672f, 22f, 10.5f, 22f)
                close()
                moveTo(17f, 20.5f)
                curveTo(17f, 21.328f, 16.328f, 22f, 15.5f, 22f)
                curveTo(14.672f, 22f, 14f, 21.328f, 14f, 20.5f)
                curveTo(14f, 19.672f, 14.672f, 19f, 15.5f, 19f)
                curveTo(16.328f, 19f, 17f, 19.672f, 17f, 20.5f)
                close()
                moveTo(22f, 20.5f)
                curveTo(22f, 21.328f, 21.328f, 22f, 20.5f, 22f)
                curveTo(19.672f, 22f, 19f, 21.328f, 19f, 20.5f)
                curveTo(19f, 19.672f, 19.672f, 19f, 20.5f, 19f)
                curveTo(21.328f, 19f, 22f, 19.672f, 22f, 20.5f)
                close()
            }
        }.build()

        return _TextMore!!
    }

@Suppress("ObjectPropertyName")
private var _TextMore: ImageVector? = null

@Preview
@Composable
private fun TextMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextMore, contentDescription = null)
    }
}
