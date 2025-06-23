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

public val FluentIcons.Regular.DataScatter: ImageVector
    get() {
        if (_DataScatter != null) {
            return _DataScatter!!
        }
        _DataScatter = ImageVector.Builder(
            name = "Regular.DataScatter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 3f)
                curveTo(4.164f, 3f, 4.5f, 3.336f, 4.5f, 3.75f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 19.5f, 21f, 19.836f, 21f, 20.25f)
                curveTo(21f, 20.664f, 20.664f, 21f, 20.25f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(3.75f)
                curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
                close()
                moveTo(14f, 7f)
                curveTo(14f, 5.343f, 15.343f, 4f, 17f, 4f)
                curveTo(18.657f, 4f, 20f, 5.343f, 20f, 7f)
                curveTo(20f, 8.657f, 18.657f, 10f, 17f, 10f)
                curveTo(15.343f, 10f, 14f, 8.657f, 14f, 7f)
                close()
                moveTo(17f, 5.5f)
                curveTo(16.172f, 5.5f, 15.5f, 6.172f, 15.5f, 7f)
                curveTo(15.5f, 7.828f, 16.172f, 8.5f, 17f, 8.5f)
                curveTo(17.828f, 8.5f, 18.5f, 7.828f, 18.5f, 7f)
                curveTo(18.5f, 6.172f, 17.828f, 5.5f, 17f, 5.5f)
                close()
                moveTo(9f, 6f)
                curveTo(7.343f, 6f, 6f, 7.343f, 6f, 9f)
                curveTo(6f, 10.657f, 7.343f, 12f, 9f, 12f)
                curveTo(10.657f, 12f, 12f, 10.657f, 12f, 9f)
                curveTo(12f, 7.343f, 10.657f, 6f, 9f, 6f)
                close()
                moveTo(7.5f, 9f)
                curveTo(7.5f, 8.172f, 8.172f, 7.5f, 9f, 7.5f)
                curveTo(9.828f, 7.5f, 10.5f, 8.172f, 10.5f, 9f)
                curveTo(10.5f, 9.828f, 9.828f, 10.5f, 9f, 10.5f)
                curveTo(8.172f, 10.5f, 7.5f, 9.828f, 7.5f, 9f)
                close()
                moveTo(12f, 15f)
                curveTo(12f, 13.343f, 13.343f, 12f, 15f, 12f)
                curveTo(16.657f, 12f, 18f, 13.343f, 18f, 15f)
                curveTo(18f, 16.657f, 16.657f, 18f, 15f, 18f)
                curveTo(13.343f, 18f, 12f, 16.657f, 12f, 15f)
                close()
                moveTo(15f, 13.5f)
                curveTo(14.172f, 13.5f, 13.5f, 14.172f, 13.5f, 15f)
                curveTo(13.5f, 15.828f, 14.172f, 16.5f, 15f, 16.5f)
                curveTo(15.828f, 16.5f, 16.5f, 15.828f, 16.5f, 15f)
                curveTo(16.5f, 14.172f, 15.828f, 13.5f, 15f, 13.5f)
                close()
            }
        }.build()

        return _DataScatter!!
    }

@Suppress("ObjectPropertyName")
private var _DataScatter: ImageVector? = null

@Preview
@Composable
private fun DataScatterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DataScatter, contentDescription = null)
    }
}
