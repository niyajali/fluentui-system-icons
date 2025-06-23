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

public val FluentIcons.Regular.ResizeSmall: ImageVector
    get() {
        if (_ResizeSmall != null) {
            return _ResizeSmall!!
        }
        _ResizeSmall = ImageVector.Builder(
            name = "Regular.ResizeSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(4.5f, 8.164f, 4.164f, 8.5f, 3.75f, 8.5f)
                curveTo(3.336f, 8.5f, 3f, 8.164f, 3f, 7.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 3f, 8.5f, 3.336f, 8.5f, 3.75f)
                curveTo(8.5f, 4.164f, 8.164f, 4.5f, 7.75f, 4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(7.95f, 10.25f)
                curveTo(7.95f, 9.007f, 8.957f, 8f, 10.2f, 8f)
                horizontalLineTo(13.7f)
                curveTo(14.943f, 8f, 15.95f, 9.007f, 15.95f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(15.95f, 14.993f, 14.943f, 16f, 13.7f, 16f)
                horizontalLineTo(10.2f)
                curveTo(8.957f, 16f, 7.95f, 14.993f, 7.95f, 13.75f)
                verticalLineTo(10.25f)
                close()
                moveTo(10.2f, 9.5f)
                curveTo(9.786f, 9.5f, 9.45f, 9.836f, 9.45f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(9.45f, 14.164f, 9.786f, 14.5f, 10.2f, 14.5f)
                horizontalLineTo(13.7f)
                curveTo(14.114f, 14.5f, 14.45f, 14.164f, 14.45f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(14.45f, 9.836f, 14.114f, 9.5f, 13.7f, 9.5f)
                horizontalLineTo(10.2f)
                close()
                moveTo(17.75f, 4.5f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(19.5f, 8.164f, 19.836f, 8.5f, 20.25f, 8.5f)
                curveTo(20.664f, 8.5f, 21f, 8.164f, 21f, 7.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 3f, 15.5f, 3.336f, 15.5f, 3.75f)
                curveTo(15.5f, 4.164f, 15.836f, 4.5f, 16.25f, 4.5f)
                lineTo(17.75f, 4.5f)
                close()
                moveTo(17.75f, 19.5f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(19.5f, 15.836f, 19.836f, 15.5f, 20.25f, 15.5f)
                curveTo(20.664f, 15.5f, 21f, 15.836f, 21f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 21f, 15.5f, 20.664f, 15.5f, 20.25f)
                curveTo(15.5f, 19.836f, 15.836f, 19.5f, 16.25f, 19.5f)
                horizontalLineTo(17.75f)
                close()
                moveTo(6.25f, 19.5f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                lineTo(4.5f, 16.25f)
                curveTo(4.5f, 15.836f, 4.164f, 15.5f, 3.75f, 15.5f)
                curveTo(3.336f, 15.5f, 3f, 15.836f, 3f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 21f, 8.5f, 20.664f, 8.5f, 20.25f)
                curveTo(8.5f, 19.836f, 8.164f, 19.5f, 7.75f, 19.5f)
                horizontalLineTo(6.25f)
                close()
            }
        }.build()

        return _ResizeSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ResizeSmall: ImageVector? = null

@Preview
@Composable
private fun ResizeSmallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ResizeSmall, contentDescription = null)
    }
}
