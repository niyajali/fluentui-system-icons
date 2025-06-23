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

public val FluentIcons.Regular.LeafOne: ImageVector
    get() {
        if (_LeafOne != null) {
            return _LeafOne!!
        }
        _LeafOne = ImageVector.Builder(
            name = "Regular.LeafOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.238f, 3.272f)
                curveTo(12.554f, 2.589f, 11.446f, 2.589f, 10.763f, 3.272f)
                lineTo(7.051f, 6.984f)
                curveTo(4.318f, 9.717f, 4.318f, 14.148f, 7.051f, 16.881f)
                curveTo(8.227f, 18.057f, 9.716f, 18.727f, 11.25f, 18.891f)
                verticalLineTo(21.25f)
                curveTo(11.25f, 21.664f, 11.586f, 22f, 12f, 22f)
                curveTo(12.414f, 22f, 12.75f, 21.664f, 12.75f, 21.25f)
                verticalLineTo(18.891f)
                curveTo(14.284f, 18.727f, 15.773f, 18.057f, 16.949f, 16.881f)
                curveTo(19.682f, 14.148f, 19.682f, 9.717f, 16.949f, 6.984f)
                lineTo(13.238f, 3.272f)
                close()
                moveTo(12.75f, 17.38f)
                verticalLineTo(11.75f)
                curveTo(12.75f, 11.335f, 12.414f, 11f, 12f, 11f)
                curveTo(11.586f, 11f, 11.25f, 11.335f, 11.25f, 11.75f)
                verticalLineTo(17.38f)
                curveTo(10.102f, 17.223f, 8.994f, 16.703f, 8.112f, 15.821f)
                curveTo(5.964f, 13.673f, 5.964f, 10.192f, 8.112f, 8.044f)
                lineTo(11.823f, 4.333f)
                curveTo(11.921f, 4.235f, 12.079f, 4.235f, 12.177f, 4.333f)
                lineTo(15.888f, 8.044f)
                curveTo(18.035f, 10.192f, 18.035f, 13.673f, 15.888f, 15.821f)
                curveTo(15.006f, 16.703f, 13.898f, 17.223f, 12.75f, 17.38f)
                close()
            }
        }.build()

        return _LeafOne!!
    }

@Suppress("ObjectPropertyName")
private var _LeafOne: ImageVector? = null

@Preview
@Composable
private fun LeafOnePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LeafOne, contentDescription = null)
    }
}
