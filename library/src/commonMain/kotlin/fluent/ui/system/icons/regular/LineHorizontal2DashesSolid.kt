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

public val FluentIcons.Regular.LineHorizontal2DashesSolid: ImageVector
    get() {
        if (_LineHorizontal2DashesSolid != null) {
            return _LineHorizontal2DashesSolid!!
        }
        _LineHorizontal2DashesSolid = ImageVector.Builder(
            name = "Regular.LineHorizontal2DashesSolid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 7f)
                curveTo(2.336f, 7f, 2f, 7.336f, 2f, 7.75f)
                curveTo(2f, 8.164f, 2.336f, 8.5f, 2.75f, 8.5f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 8.5f, 7f, 8.164f, 7f, 7.75f)
                curveTo(7f, 7.336f, 6.664f, 7f, 6.25f, 7f)
                horizontalLineTo(2.75f)
                close()
                moveTo(10.25f, 7f)
                curveTo(9.836f, 7f, 9.5f, 7.336f, 9.5f, 7.75f)
                curveTo(9.5f, 8.164f, 9.836f, 8.5f, 10.25f, 8.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 8.5f, 14.5f, 8.164f, 14.5f, 7.75f)
                curveTo(14.5f, 7.336f, 14.164f, 7f, 13.75f, 7f)
                horizontalLineTo(10.25f)
                close()
                moveTo(17.75f, 7f)
                curveTo(17.336f, 7f, 17f, 7.336f, 17f, 7.75f)
                curveTo(17f, 8.164f, 17.336f, 8.5f, 17.75f, 8.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 8.5f, 22f, 8.164f, 22f, 7.75f)
                curveTo(22f, 7.336f, 21.664f, 7f, 21.25f, 7f)
                horizontalLineTo(17.75f)
                close()
                moveTo(2.75f, 15f)
                curveTo(2.336f, 15f, 2f, 15.336f, 2f, 15.75f)
                curveTo(2f, 16.164f, 2.336f, 16.5f, 2.75f, 16.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 16.5f, 22f, 16.164f, 22f, 15.75f)
                curveTo(22f, 15.336f, 21.664f, 15f, 21.25f, 15f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()

        return _LineHorizontal2DashesSolid!!
    }

@Suppress("ObjectPropertyName")
private var _LineHorizontal2DashesSolid: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal2DashesSolidPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LineHorizontal2DashesSolid, contentDescription = null)
    }
}
