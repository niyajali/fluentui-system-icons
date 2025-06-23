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

public val FluentIcons.Filled.PaddingLeft: ImageVector
    get() {
        if (_PaddingLeft != null) {
            return _PaddingLeft!!
        }
        _PaddingLeft = ImageVector.Builder(
            name = "Filled.PaddingLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 4f)
                curveTo(2.448f, 4f, 2f, 4.448f, 2f, 5f)
                verticalLineTo(6.75f)
                curveTo(2f, 7.302f, 2.448f, 7.75f, 3f, 7.75f)
                curveTo(3.552f, 7.75f, 4f, 7.302f, 4f, 6.75f)
                lineTo(4f, 5f)
                curveTo(4f, 4.448f, 3.552f, 4f, 3f, 4f)
                close()
                moveTo(3f, 9.25f)
                curveTo(2.448f, 9.25f, 2f, 9.698f, 2f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(2f, 14.302f, 2.448f, 14.75f, 3f, 14.75f)
                curveTo(3.552f, 14.75f, 4f, 14.302f, 4f, 13.75f)
                lineTo(4f, 10.25f)
                curveTo(4f, 9.698f, 3.552f, 9.25f, 3f, 9.25f)
                close()
                moveTo(3f, 16.25f)
                curveTo(2.448f, 16.25f, 2f, 16.698f, 2f, 17.25f)
                verticalLineTo(19f)
                curveTo(2f, 19.552f, 2.448f, 20f, 3f, 20f)
                curveTo(3.552f, 20f, 4f, 19.552f, 4f, 19f)
                lineTo(4f, 17.25f)
                curveTo(4f, 16.698f, 3.552f, 16.25f, 3f, 16.25f)
                close()
                moveTo(21f, 4f)
                curveTo(20.448f, 4f, 20f, 4.448f, 20f, 5f)
                verticalLineTo(19f)
                curveTo(20f, 19.552f, 20.448f, 20f, 21f, 20f)
                curveTo(21.552f, 20f, 22f, 19.552f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 4.448f, 21.552f, 4f, 21f, 4f)
                close()
                moveTo(5.293f, 12.707f)
                curveTo(4.902f, 12.317f, 4.902f, 11.683f, 5.293f, 11.293f)
                lineTo(10.293f, 6.293f)
                curveTo(10.683f, 5.902f, 11.317f, 5.902f, 11.707f, 6.293f)
                curveTo(12.098f, 6.683f, 12.098f, 7.317f, 11.707f, 7.707f)
                lineTo(8.414f, 11f)
                lineTo(18f, 11f)
                curveTo(18.552f, 11f, 19f, 11.448f, 19f, 12f)
                curveTo(19f, 12.552f, 18.552f, 13f, 18f, 13f)
                lineTo(8.414f, 13f)
                lineTo(11.707f, 16.293f)
                curveTo(12.098f, 16.683f, 12.098f, 17.317f, 11.707f, 17.707f)
                curveTo(11.317f, 18.098f, 10.683f, 18.098f, 10.293f, 17.707f)
                lineTo(5.293f, 12.707f)
                close()
            }
        }.build()

        return _PaddingLeft!!
    }

@Suppress("ObjectPropertyName")
private var _PaddingLeft: ImageVector? = null

@Preview
@Composable
private fun PaddingLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PaddingLeft, contentDescription = null)
    }
}
