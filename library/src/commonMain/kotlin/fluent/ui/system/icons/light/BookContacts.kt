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

package fluent.ui.system.icons.light

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * BookContacts Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used as a contact collection.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_book_contacts_32_light.svg)
 * 
 * @return The [ImageVector] for the BookContacts icon.
 */
public val FluentIcons.Light.BookContacts: ImageVector
    get() {
        if (_bookContacts != null) {
            return _bookContacts!!
        }
        _bookContacts = Builder(name = "BookContacts", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 2.0f)
                curveTo(25.209f, 2.0f, 27.0f, 3.791f, 27.0f, 6.0f)
                verticalLineTo(24.0f)
                curveTo(27.0f, 25.105f, 26.105f, 26.0f, 25.0f, 26.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 27.657f, 7.343f, 29.0f, 9.0f, 29.0f)
                horizontalLineTo(26.5f)
                curveTo(26.776f, 29.0f, 27.0f, 29.224f, 27.0f, 29.5f)
                curveTo(27.0f, 29.776f, 26.776f, 30.0f, 26.5f, 30.0f)
                horizontalLineTo(9.0f)
                curveTo(6.791f, 30.0f, 5.0f, 28.209f, 5.0f, 26.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 3.791f, 6.791f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(23.0f)
                close()
                moveTo(9.0f, 3.0f)
                curveTo(7.343f, 3.0f, 6.0f, 4.343f, 6.0f, 6.0f)
                verticalLineTo(25.0f)
                horizontalLineTo(25.0f)
                curveTo(25.552f, 25.0f, 26.0f, 24.552f, 26.0f, 24.0f)
                verticalLineTo(6.0f)
                curveTo(26.0f, 4.343f, 24.657f, 3.0f, 23.0f, 3.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(19.454f, 15.0f)
                curveTo(20.584f, 15.0f, 21.5f, 15.915f, 21.5f, 17.045f)
                verticalLineTo(17.25f)
                curveTo(21.5f, 19.118f, 19.929f, 21.0f, 16.0f, 21.0f)
                curveTo(12.071f, 21.0f, 10.5f, 19.125f, 10.5f, 17.25f)
                verticalLineTo(17.045f)
                curveTo(10.5f, 15.915f, 11.416f, 15.0f, 12.546f, 15.0f)
                horizontalLineTo(19.454f)
                close()
                moveTo(16.0f, 7.5f)
                curveTo(17.657f, 7.5f, 19.0f, 8.843f, 19.0f, 10.5f)
                curveTo(19.0f, 12.157f, 17.657f, 13.5f, 16.0f, 13.5f)
                curveTo(14.343f, 13.5f, 13.0f, 12.157f, 13.0f, 10.5f)
                curveTo(13.0f, 8.843f, 14.343f, 7.5f, 16.0f, 7.5f)
                close()
            }
        }
        .build()
        return _bookContacts!!
    }

@Suppress("ObjectPropertyName")
private var _bookContacts: ImageVector? = null

@Preview
@Composable
private fun BookContactsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.BookContacts, contentDescription = "BookContacts Icon")
    }
}

