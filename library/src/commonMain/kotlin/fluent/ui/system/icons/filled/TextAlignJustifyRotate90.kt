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

public val FluentIcons.Filled.TextAlignJustifyRotate90: ImageVector
    get() {
        if (_TextAlignJustifyRotate90 != null) {
            return _TextAlignJustifyRotate90!!
        }
        _TextAlignJustifyRotate90 = ImageVector.Builder(
            name = "Filled.TextAlignJustifyRotate90",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 2f)
                curveTo(18.552f, 2f, 19f, 2.448f, 19f, 3f)
                verticalLineTo(21f)
                curveTo(19f, 21.552f, 18.552f, 22f, 18f, 22f)
                curveTo(17.448f, 22f, 17f, 21.552f, 17f, 21f)
                verticalLineTo(3f)
                curveTo(17f, 2.448f, 17.448f, 2f, 18f, 2f)
                close()
                moveTo(6f, 2f)
                curveTo(6.552f, 2f, 7f, 2.448f, 7f, 3f)
                verticalLineTo(21f)
                curveTo(7f, 21.552f, 6.552f, 22f, 6f, 22f)
                curveTo(5.448f, 22f, 5f, 21.552f, 5f, 21f)
                verticalLineTo(3f)
                curveTo(5f, 2.448f, 5.448f, 2f, 6f, 2f)
                close()
                moveTo(13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(21f)
                curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _TextAlignJustifyRotate90!!
    }

@Suppress("ObjectPropertyName")
private var _TextAlignJustifyRotate90: ImageVector? = null

@Preview
@Composable
private fun TextAlignJustifyRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextAlignJustifyRotate90, contentDescription = null)
    }
}
