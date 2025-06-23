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

public val FluentIcons.Filled.DocumentEndnote: ImageVector
    get() {
        if (_DocumentEndnote != null) {
            return _DocumentEndnote!!
        }
        _DocumentEndnote = ImageVector.Builder(
            name = "Filled.DocumentEndnote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(20.5f)
                curveTo(20f, 21.328f, 19.328f, 22f, 18.5f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                curveTo(13f, 12.895f, 12.105f, 12f, 11f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(3.5f)
                curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
                horizontalLineTo(12f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(7.25f, 17.5f)
                curveTo(7.25f, 17.086f, 6.914f, 16.75f, 6.5f, 16.75f)
                curveTo(6.086f, 16.75f, 5.75f, 17.086f, 5.75f, 17.5f)
                verticalLineTo(21f)
                curveTo(5.75f, 21.414f, 6.086f, 21.75f, 6.5f, 21.75f)
                curveTo(6.914f, 21.75f, 7.25f, 21.414f, 7.25f, 21f)
                verticalLineTo(17.5f)
                close()
                moveTo(7.25f, 15.25f)
                curveTo(7.25f, 15.664f, 6.914f, 16f, 6.5f, 16f)
                curveTo(6.086f, 16f, 5.75f, 15.664f, 5.75f, 15.25f)
                curveTo(5.75f, 14.836f, 6.086f, 14.5f, 6.5f, 14.5f)
                curveTo(6.914f, 14.5f, 7.25f, 14.836f, 7.25f, 15.25f)
                close()
                moveTo(4.5f, 13.75f)
                curveTo(4.5f, 14.164f, 4.164f, 14.5f, 3.75f, 14.5f)
                horizontalLineTo(2.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(3.75f)
                curveTo(4.164f, 21.5f, 4.5f, 21.836f, 4.5f, 22.25f)
                curveTo(4.5f, 22.664f, 4.164f, 23f, 3.75f, 23f)
                horizontalLineTo(2.5f)
                curveTo(1.672f, 23f, 1f, 22.328f, 1f, 21.5f)
                verticalLineTo(14.5f)
                curveTo(1f, 13.672f, 1.672f, 13f, 2.5f, 13f)
                horizontalLineTo(3.75f)
                curveTo(4.164f, 13f, 4.5f, 13.336f, 4.5f, 13.75f)
                close()
                moveTo(9.25f, 14.5f)
                curveTo(8.836f, 14.5f, 8.5f, 14.164f, 8.5f, 13.75f)
                curveTo(8.5f, 13.336f, 8.836f, 13f, 9.25f, 13f)
                horizontalLineTo(10.5f)
                curveTo(11.328f, 13f, 12f, 13.672f, 12f, 14.5f)
                verticalLineTo(21.5f)
                curveTo(12f, 22.328f, 11.328f, 23f, 10.5f, 23f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 23f, 8.5f, 22.664f, 8.5f, 22.25f)
                curveTo(8.5f, 21.836f, 8.836f, 21.5f, 9.25f, 21.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.25f)
                close()
            }
        }.build()

        return _DocumentEndnote!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentEndnote: ImageVector? = null

@Preview
@Composable
private fun DocumentEndnotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentEndnote, contentDescription = null)
    }
}
