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

public val FluentIcons.Filled.Receipt: ImageVector
    get() {
        if (_Receipt != null) {
            return _Receipt!!
        }
        _Receipt = ImageVector.Builder(
            name = "Filled.Receipt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.25f)
                curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
                horizontalLineTo(14.75f)
                curveTo(15.993f, 3f, 17f, 4.007f, 17f, 5.25f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(17f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(17f)
                verticalLineTo(19.5f)
                close()
                moveTo(6.5f, 7.75f)
                curveTo(6.5f, 8.164f, 6.836f, 8.5f, 7.25f, 8.5f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 8.5f, 13.5f, 8.164f, 13.5f, 7.75f)
                curveTo(13.5f, 7.336f, 13.164f, 7f, 12.75f, 7f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 7f, 6.5f, 7.336f, 6.5f, 7.75f)
                close()
                moveTo(7.25f, 11f)
                curveTo(6.836f, 11f, 6.5f, 11.336f, 6.5f, 11.75f)
                curveTo(6.5f, 12.164f, 6.836f, 12.5f, 7.25f, 12.5f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 12.5f, 13.5f, 12.164f, 13.5f, 11.75f)
                curveTo(13.5f, 11.336f, 13.164f, 11f, 12.75f, 11f)
                horizontalLineTo(7.25f)
                close()
                moveTo(6.5f, 15.75f)
                curveTo(6.5f, 16.164f, 6.836f, 16.5f, 7.25f, 16.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 16.5f, 11f, 16.164f, 11f, 15.75f)
                curveTo(11f, 15.336f, 10.664f, 15f, 10.25f, 15f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 15f, 6.5f, 15.336f, 6.5f, 15.75f)
                close()
            }
        }.build()

        return _Receipt!!
    }

@Suppress("ObjectPropertyName")
private var _Receipt: ImageVector? = null

@Preview
@Composable
private fun ReceiptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Receipt, contentDescription = null)
    }
}
