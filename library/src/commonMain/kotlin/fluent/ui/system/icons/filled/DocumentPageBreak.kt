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

public val FluentIcons.Filled.DocumentPageBreak: ImageVector
    get() {
        if (_DocumentPageBreak != null) {
            return _DocumentPageBreak!!
        }
        _DocumentPageBreak = ImageVector.Builder(
            name = "Filled.DocumentPageBreak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.5f, 12f)
                curveTo(2.5f, 11.586f, 2.836f, 11.25f, 3.25f, 11.25f)
                horizontalLineTo(4.75f)
                curveTo(5.164f, 11.25f, 5.5f, 11.586f, 5.5f, 12f)
                curveTo(5.5f, 12.414f, 5.164f, 12.75f, 4.75f, 12.75f)
                horizontalLineTo(3.25f)
                curveTo(2.836f, 12.75f, 2.5f, 12.414f, 2.5f, 12f)
                close()
                moveTo(6.5f, 12f)
                curveTo(6.5f, 11.586f, 6.836f, 11.25f, 7.25f, 11.25f)
                horizontalLineTo(8.75f)
                curveTo(9.164f, 11.25f, 9.5f, 11.586f, 9.5f, 12f)
                curveTo(9.5f, 12.414f, 9.164f, 12.75f, 8.75f, 12.75f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 12.75f, 6.5f, 12.414f, 6.5f, 12f)
                close()
                moveTo(10.5f, 12f)
                curveTo(10.5f, 11.586f, 10.836f, 11.25f, 11.25f, 11.25f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 11.25f, 13.5f, 11.586f, 13.5f, 12f)
                curveTo(13.5f, 12.414f, 13.164f, 12.75f, 12.75f, 12.75f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 12.75f, 10.5f, 12.414f, 10.5f, 12f)
                close()
                moveTo(14.5f, 12f)
                curveTo(14.5f, 11.586f, 14.836f, 11.25f, 15.25f, 11.25f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 11.25f, 17.5f, 11.586f, 17.5f, 12f)
                curveTo(17.5f, 12.414f, 17.164f, 12.75f, 16.75f, 12.75f)
                horizontalLineTo(15.25f)
                curveTo(14.836f, 12.75f, 14.5f, 12.414f, 14.5f, 12f)
                close()
                moveTo(18.5f, 12f)
                curveTo(18.5f, 11.586f, 18.836f, 11.25f, 19.25f, 11.25f)
                horizontalLineTo(20.75f)
                curveTo(21.164f, 11.25f, 21.5f, 11.586f, 21.5f, 12f)
                curveTo(21.5f, 12.414f, 21.164f, 12.75f, 20.75f, 12.75f)
                horizontalLineTo(19.25f)
                curveTo(18.836f, 12.75f, 18.5f, 12.414f, 18.5f, 12f)
                close()
                moveTo(5f, 2f)
                curveTo(4.448f, 2f, 4f, 2.448f, 4f, 3f)
                verticalLineTo(7f)
                curveTo(4f, 8.104f, 4.896f, 9f, 6f, 9f)
                horizontalLineTo(18f)
                curveTo(19.104f, 9f, 20f, 8.104f, 20f, 7f)
                verticalLineTo(3f)
                curveTo(20f, 2.448f, 19.552f, 2f, 19f, 2f)
                horizontalLineTo(5f)
                close()
                moveTo(19f, 22f)
                curveTo(19.552f, 22f, 20f, 21.552f, 20f, 21f)
                verticalLineTo(17f)
                curveTo(20f, 15.896f, 19.104f, 15f, 18f, 15f)
                lineTo(6f, 15f)
                curveTo(4.896f, 15f, 4f, 15.896f, 4f, 17f)
                lineTo(4f, 21f)
                curveTo(4f, 21.552f, 4.448f, 22f, 5f, 22f)
                lineTo(19f, 22f)
                close()
            }
        }.build()

        return _DocumentPageBreak!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentPageBreak: ImageVector? = null

@Preview
@Composable
private fun DocumentPageBreakPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentPageBreak, contentDescription = null)
    }
}
