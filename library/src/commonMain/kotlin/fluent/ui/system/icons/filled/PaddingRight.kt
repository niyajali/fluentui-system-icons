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

public val FluentIcons.Filled.PaddingRight: ImageVector
    get() {
        if (_PaddingRight != null) {
            return _PaddingRight!!
        }
        _PaddingRight = ImageVector.Builder(
            name = "Filled.PaddingRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 4f)
                curveTo(3.552f, 4f, 4f, 4.448f, 4f, 5f)
                lineTo(4f, 19f)
                curveTo(4f, 19.552f, 3.552f, 20f, 3f, 20f)
                curveTo(2.448f, 20f, 2f, 19.552f, 2f, 19f)
                verticalLineTo(5f)
                curveTo(2f, 4.448f, 2.448f, 4f, 3f, 4f)
                close()
                moveTo(21f, 4f)
                curveTo(21.552f, 4f, 22f, 4.448f, 22f, 5f)
                verticalLineTo(6.75f)
                curveTo(22f, 7.302f, 21.552f, 7.75f, 21f, 7.75f)
                curveTo(20.448f, 7.75f, 20f, 7.302f, 20f, 6.75f)
                verticalLineTo(5f)
                curveTo(20f, 4.448f, 20.448f, 4f, 21f, 4f)
                close()
                moveTo(21f, 9.25f)
                curveTo(21.552f, 9.25f, 22f, 9.698f, 22f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(22f, 14.302f, 21.552f, 14.75f, 21f, 14.75f)
                curveTo(20.448f, 14.75f, 20f, 14.302f, 20f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(20f, 9.698f, 20.448f, 9.25f, 21f, 9.25f)
                close()
                moveTo(21f, 16.25f)
                curveTo(21.552f, 16.25f, 22f, 16.698f, 22f, 17.25f)
                verticalLineTo(19f)
                curveTo(22f, 19.552f, 21.552f, 20f, 21f, 20f)
                curveTo(20.448f, 20f, 20f, 19.552f, 20f, 19f)
                verticalLineTo(17.25f)
                curveTo(20f, 16.698f, 20.448f, 16.25f, 21f, 16.25f)
                close()
                moveTo(18.707f, 12.707f)
                curveTo(19.098f, 12.317f, 19.098f, 11.683f, 18.707f, 11.293f)
                lineTo(13.707f, 6.293f)
                curveTo(13.317f, 5.902f, 12.683f, 5.902f, 12.293f, 6.293f)
                curveTo(11.902f, 6.683f, 11.902f, 7.317f, 12.293f, 7.707f)
                lineTo(15.586f, 11f)
                lineTo(6f, 11f)
                curveTo(5.448f, 11f, 5f, 11.448f, 5f, 12f)
                curveTo(5f, 12.552f, 5.448f, 13f, 6f, 13f)
                lineTo(15.586f, 13f)
                lineTo(12.293f, 16.293f)
                curveTo(11.902f, 16.683f, 11.902f, 17.317f, 12.293f, 17.707f)
                curveTo(12.683f, 18.098f, 13.317f, 18.098f, 13.707f, 17.707f)
                lineTo(18.707f, 12.707f)
                close()
            }
        }.build()

        return _PaddingRight!!
    }

@Suppress("ObjectPropertyName")
private var _PaddingRight: ImageVector? = null

@Preview
@Composable
private fun PaddingRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PaddingRight, contentDescription = null)
    }
}
